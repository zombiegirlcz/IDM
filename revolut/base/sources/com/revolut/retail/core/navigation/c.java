package com.revolut.retail.core.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import org.jetbrains.annotations.NotNull;
import sri.f;
import sri.l;
import sri.m;
import sri.t;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements m {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f98677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f98678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f98679c;

    public c(Context context, f fragmentProvider) {
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98677a = fragmentProvider;
        this.f98678b = context;
        this.f98679c = new LinkedHashSet();
        String str = "SampleAppNavigator created; navigator=" + System.identityHashCode(this);
    }

    @Override // sri.m
    public final f a() {
        return this.f98677a;
    }

    @Override // sri.m
    public final boolean b(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if ((command instanceof FeatureCommand) || (command instanceof DeeplinkNavigateCommand) || (command instanceof IntentCommand) || (command instanceof FinishCommand)) {
            return true;
        }
        if (!(command instanceof CompositeCommand)) {
            String str = "Unsupported command type: " + o0.f186429a.b(command.getClass()).m();
            return false;
        }
        List list = ((CompositeCommand) command).f98629a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!b((NaviCommand) it8.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // sri.m
    public final void c(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        Iterator it8 = this.f98679c.iterator();
        while (it8.hasNext()) {
            ((l) it8.next()).c(command);
        }
        boolean z = command instanceof FeatureCommand;
        Context context = this.f98678b;
        if (z) {
            FeatureConfig featureConfig = ((FeatureCommand) command).f98638a;
            int iIdentityHashCode = System.identityHashCode(this);
            Class<?> cls = featureConfig.getClass();
            p0 p0Var = o0.f186429a;
            String str = "Handling FeatureCommand; navigator=" + iIdentityHashCode + " hasHandler=false config=" + p0Var.b(cls).m();
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtra("CONFIGURATION_ARG", featureConfig).addFlags(603979776);
                g(launchIntentForPackage);
                return;
            } else {
                String str2 = "Cannot launch sample app for FeatureCommand: " + p0Var.b(featureConfig.getClass()).m();
                return;
            }
        }
        if (command instanceof DeeplinkNavigateCommand) {
            DeeplinkNavigateCommand deeplinkNavigateCommand = (DeeplinkNavigateCommand) command;
            Intent intent = new Intent(context, (Class<?>) deeplinkNavigateCommand.f98630a.f98636a);
            intent.setAction(deeplinkNavigateCommand.d);
            Iterator it9 = deeplinkNavigateCommand.e.iterator();
            while (it9.hasNext()) {
                intent.addCategory((String) it9.next());
            }
            intent.setData(deeplinkNavigateCommand.f);
            intent.setFlags(deeplinkNavigateCommand.f98633g);
            intent.putExtra("CONFIGURATION_ARG", deeplinkNavigateCommand.f98631b);
            g(intent);
            return;
        }
        if (command instanceof IntentCommand) {
            g(((IntentCommand) command).f98660a);
            return;
        }
        if (!(command instanceof FinishCommand)) {
            if (command instanceof CompositeCommand) {
                Iterator it10 = ((CompositeCommand) command).f98629a.iterator();
                while (it10.hasNext()) {
                    c((NaviCommand) it10.next());
                }
                return;
            } else {
                String str3 = "Cannot navigate with unsupported command: " + o0.f186429a.b(command.getClass()).m();
                return;
            }
        }
        FinishCommand finishCommand = (FinishCommand) command;
        Activity activityF = f();
        if (activityF == null) {
            return;
        }
        Integer num = finishCommand.f98642a;
        if (num != null) {
            int iIntValue = num.intValue();
            Intent intent2 = new Intent();
            nim.a.F(intent2, finishCommand.f98643b);
            activityF.setResult(iIntValue, intent2);
        }
        FinishCommand.Mode mode = finishCommand.f98644c;
        if (Intrinsics.f(mode, FinishCommand.Mode.FinishAffinity.f98645a)) {
            activityF.finishAffinity();
        } else if (Intrinsics.f(mode, FinishCommand.Mode.FinishAfterTransition.f98646a)) {
            activityF.finishAfterTransition();
        } else {
            if (mode != null) {
                throw new NoWhenBranchMatchedException();
            }
            activityF.finish();
        }
    }

    @Override // sri.m
    public final void d(l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f98679c.add(listener);
    }

    @Override // sri.m
    public final void e(l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f98679c.remove(listener);
    }

    public final Activity f() {
        Activity activityC = h80.c.c();
        if (activityC != null) {
            if (activityC.isFinishing()) {
                activityC = null;
            }
            if (activityC != null) {
                return activityC;
            }
        }
        Context context = this.f98678b;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public final void g(Intent intent) {
        Intent intent2 = new Intent(intent);
        if (f() == null) {
            intent2.addFlags(268435456);
        }
        Context contextF = f();
        if (contextF == null) {
            contextF = this.f98678b;
        }
        contextF.startActivity(intent2);
    }
}
