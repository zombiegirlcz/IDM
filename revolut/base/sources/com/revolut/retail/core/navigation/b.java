package com.revolut.retail.core.navigation;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.TypedValue;
import android.widget.Toast;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import sri.f;
import sri.j;
import sri.k;
import sri.l;
import sri.m;
import sri.n;
import sri.p;
import sri.q;
import sri.r;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements m {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f98671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.c f98672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f98673c;
    public final n d;
    public final wri.b e;
    public final sri.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f98674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f98675h;
    public final jpf.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f98676j;
    public final LinkedHashSet k;

    public b(Context context, Integer num, LinkedHashMap launchers, sri.c fragmentManagerProvider, f fragmentProvider, n activityManagerDelegate, wri.b singleActivityStateChecker, k navigationContextResolution, w70.a androidVersion, int i) {
        sri.b contentTransitionOptions = new sri.b();
        navigationContextResolution = (i & 256) != 0 ? k.DEFAULT : navigationContextResolution;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchers, "launchers");
        Intrinsics.checkNotNullParameter(fragmentManagerProvider, "fragmentManagerProvider");
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        Intrinsics.checkNotNullParameter(activityManagerDelegate, "activityManagerDelegate");
        Intrinsics.checkNotNullParameter(singleActivityStateChecker, "singleActivityStateChecker");
        Intrinsics.checkNotNullParameter(contentTransitionOptions, "contentTransitionOptions");
        Intrinsics.checkNotNullParameter(navigationContextResolution, "navigationContextResolution");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f98671a = launchers;
        this.f98672b = fragmentManagerProvider;
        this.f98673c = fragmentProvider;
        this.d = activityManagerDelegate;
        this.e = singleActivityStateChecker;
        this.f = contentTransitionOptions;
        this.f98674g = navigationContextResolution;
        this.f98675h = new j(androidVersion);
        Intrinsics.checkNotNullParameter(fragmentManagerProvider, "fragmentManagerProvider");
        Intrinsics.checkNotNullParameter(fragmentProvider, "fragmentProvider");
        jpf.a aVar = new jpf.a();
        aVar.f177267a = num;
        aVar.f177268b = fragmentManagerProvider;
        aVar.f177269c = fragmentProvider;
        this.i = aVar;
        this.f98676j = new WeakReference(context);
        this.k = new LinkedHashSet();
    }

    public static Intent l(ImplicitActivityDestination implicitActivityDestination) {
        Intent intent = new Intent(implicitActivityDestination.getF98657a());
        List categories = implicitActivityDestination.getF98658b();
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Iterator it8 = categories.iterator();
        while (it8.hasNext()) {
            intent.addCategory((String) it8.next());
        }
        Uri e = implicitActivityDestination.getE();
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (e != null) {
            intent.setData(e);
        }
        String f98659c = implicitActivityDestination.getF98659c();
        String d = implicitActivityDestination.getD();
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (f98659c != null && d != null) {
            intent.setClassName(f98659c, d);
        }
        return intent;
    }

    public static void m(Context context, ActivityNavigateCommand activityNavigateCommand, ChooserActivityDestination chooserActivityDestination) {
        Intent intent = new Intent(chooserActivityDestination.getF98625a());
        List categories = chooserActivityDestination.getF98627c();
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Iterator it8 = categories.iterator();
        while (it8.hasNext()) {
            intent.addCategory((String) it8.next());
        }
        nim.a.G(intent, chooserActivityDestination.getF98626b());
        Uri d = chooserActivityDestination.getD();
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (d != null) {
            intent.setData(d);
        }
        int i = activityNavigateCommand.e;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.setFlags(i);
        Intent intentP = p(intent, activityNavigateCommand.f98619b);
        nim.a.F(intentP, activityNavigateCommand.f98620c);
        nim.a.G(intentP, activityNavigateCommand.f);
        context.startActivity(Intent.createChooser(intentP, chooserActivityDestination.getE()));
    }

    public static void n(Context context, ActivityNavigateCommand activityNavigateCommand, ImplicitActivityDestination implicitActivityDestination) {
        int i = activityNavigateCommand.e;
        Intent intentL = l(implicitActivityDestination);
        if (context instanceof Application) {
            i |= 268435456;
        }
        Intrinsics.checkNotNullParameter(intentL, "<this>");
        intentL.setFlags(i);
        Intent intentP = p(intentL, activityNavigateCommand.f98619b);
        nim.a.F(intentP, activityNavigateCommand.f98620c);
        nim.a.G(intentP, activityNavigateCommand.f);
        String f98659c = implicitActivityDestination.getF98659c();
        Intrinsics.checkNotNullParameter(intentP, "<this>");
        if (f98659c != null) {
            intentP.setPackage(f98659c);
        }
        context.startActivity(intentP);
    }

    public static void o(Context context, FileOpenActivityDestination fileOpenActivityDestination) {
        Intent intent = new Intent(fileOpenActivityDestination.getF98639a());
        intent.setDataAndType(fileOpenActivityDestination.getF98640b(), fileOpenActivityDestination.getF98641c());
        Iterator it8 = fileOpenActivityDestination.getD().iterator();
        while (it8.hasNext()) {
            intent.addFlags(((Number) it8.next()).intValue());
        }
        context.startActivity(intent);
    }

    public static Intent p(Intent intent, Parcelable parcelable) {
        Intent intentPutExtra = intent.putExtra("CONFIGURATION_ARG", parcelable);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // sri.m
    public final f a() {
        return this.f98673c;
    }

    @Override // sri.m
    public final boolean b(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (!(command instanceof ActivityNavigateCommand)) {
            return true;
        }
        ActivityDestination activityDestination = ((ActivityNavigateCommand) command).f98618a;
        if (!(activityDestination instanceof SelectorActivityDestination)) {
            return true;
        }
        SelectorActivityDestination selectorActivityDestination = (SelectorActivityDestination) activityDestination;
        Intent intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity(selectorActivityDestination.getF98668a(), selectorActivityDestination.getF98669b());
        Intrinsics.checkNotNullExpressionValue(intentMakeMainSelectorActivity, "makeMainSelectorActivity(...)");
        Context context = (Context) this.f98676j.get();
        if (context != null) {
            return xam.a.f(context, intentMakeMainSelectorActivity);
        }
        return true;
    }

    @Override // sri.m
    public final void c(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        Context context = (Context) this.f98676j.get();
        if (context != null) {
            g(context, command);
        }
    }

    @Override // sri.m
    public final void d(l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.k.add(listener);
    }

    @Override // sri.m
    public final void e(l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.k.remove(listener);
    }

    public final void f(LinkedHashMap linkedHashMap, FeatureConfig featureConfig, Function1 function1) {
        if (linkedHashMap.size() <= 1) {
            if (!linkedHashMap.isEmpty()) {
                Object obj2 = ((phm.a) ((Map.Entry) d0.a0(linkedHashMap.entrySet())).getValue()).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                function1.invoke(obj2);
                return;
            } else {
                Context context = (Context) this.f98676j.get();
                if (context != null) {
                    Toast.makeText(context, "Can't find launcher for feature config " + featureConfig, 1).show();
                    return;
                }
                return;
            }
        }
        int size = linkedHashMap.size();
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            arrayList.add(((Map.Entry) it8.next()).getValue().toString());
        }
        throw new IllegalStateException("Found " + size + " (" + d0.k0(arrayList, null, null, null, 0, null, 63) + ") for config " + featureConfig);
    }

    public final void g(Context context, NaviCommand naviCommand) {
        Object next;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        rd0.c cVar = rd0.c.DEBUG;
        d.b(cVar, "Navigator", j6.a.q("Navigator: ", a.g(naviCommand)), null, null, 16);
        if (!(naviCommand instanceof DummyCommand)) {
            d.b(cVar, "Navigator", j6.a.q("NAVIGATION TO ", o0.f186429a.b(naviCommand.getClass()).m()), null, null, 16);
            if (naviCommand instanceof FinishCommand) {
            }
        }
        int i = r.f265242a[this.f98674g.ordinal()];
        n nVar = this.d;
        if (i == 1) {
            nri.b bVar = context instanceof nri.b ? (nri.b) context : null;
            if (bVar == null) {
                nVar.getClass();
                Activity activityC = h80.c.c();
                if (activityC instanceof nri.b) {
                    activity = (nri.b) activityC;
                }
            } else {
                activity = bVar;
            }
            if (activity != null) {
                activity.runOnUiThread(new ag.n(this, 5, naviCommand, activity));
                return;
            } else {
                h(context, naviCommand);
                return;
            }
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Context applicationContext = context.getApplicationContext();
        WeakReference weakReference = new WeakReference(context);
        if ((naviCommand instanceof ActivityNavigateCommand) && (((ActivityNavigateCommand) naviCommand).i instanceof ActivityAnimation.ContentTransition)) {
            nVar.getClass();
            Iterator it8 = h80.c.f149931a.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                Activity activity = (Activity) next;
                Intrinsics.checkNotNullParameter(activity, "<this>");
                TypedValue typedValue = new TypedValue();
                if (activity.getTheme().resolveAttribute(R.attr.windowIsTranslucent, typedValue, true) && typedValue.type == 18 && typedValue.data != 0) {
                    break;
                }
            }
            if (next != null || h80.c.b()) {
                p listener = new p(new WeakReference(this), naviCommand, weakReference, applicationContext);
                Intrinsics.checkNotNullParameter(listener, "listener");
                h80.b bVar2 = h80.c.f149931a;
                Intrinsics.checkNotNullParameter(listener, "listener");
                WeakReference weakReference2 = h80.c.d;
                activity = weakReference2 != null ? (Activity) weakReference2.get() : null;
                if (activity != null) {
                    listener.invoke(activity);
                    return;
                } else {
                    h80.c.f149933c.add(listener);
                    return;
                }
            }
        }
        Intrinsics.h(applicationContext);
        i(weakReference, naviCommand, applicationContext);
    }

    public final void h(Context context, NaviCommand naviCommand) throws IllegalAccessException {
        Iterator it8 = this.k.iterator();
        while (it8.hasNext()) {
            ((l) it8.next()).c(naviCommand);
        }
        if (!(naviCommand instanceof ActivityNavigateCommand)) {
            if ((naviCommand instanceof FragmentNavigateCommand) || (naviCommand instanceof FinishFragmentNavigateCommand)) {
                throw new IllegalArgumentException("Can't navigate to fragment from application context");
            }
            if (naviCommand instanceof CompositeCommand) {
                Iterator it9 = ((CompositeCommand) naviCommand).f98629a.iterator();
                while (it9.hasNext()) {
                    g(context, (NaviCommand) it9.next());
                }
                return;
            }
            if (naviCommand instanceof FeatureCommand) {
                k((FeatureCommand) naviCommand);
                return;
            }
            if (naviCommand instanceof BrowserCommand) {
                Intent intent = new Intent("android.intent.action.VIEW", ((BrowserCommand) naviCommand).getF98624a());
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return;
            }
            if (naviCommand instanceof IntentCommand) {
                IntentCommand intentCommand = (IntentCommand) naviCommand;
                Integer f98661b = intentCommand.getF98661b();
                Intent f98660a = intentCommand.getF98660a();
                if (f98661b == null || !(context instanceof nri.b)) {
                    context.startActivity(f98660a);
                    return;
                } else {
                    ((nri.b) context).startActivityForResult(f98660a, f98661b.intValue());
                    return;
                }
            }
            if (naviCommand instanceof DummyCommand) {
                return;
            }
            if (!(naviCommand instanceof DeeplinkNavigateCommand)) {
                if (naviCommand instanceof FinishCommand) {
                    hx7.q.a0(new pd0.d(new sq5.j(5)));
                    return;
                } else if (naviCommand instanceof FinishFlowCommand) {
                    hx7.q.a0(new pd0.d(new sq5.j(6)));
                    return;
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    d.b(rd0.c.WARNING, "Navigator", j6.a.q("command class is not supported: ", o0.f186429a.b(naviCommand.getClass()).m()), null, null, 16);
                    return;
                }
            }
            DeeplinkNavigateCommand deeplinkNavigateCommand = (DeeplinkNavigateCommand) naviCommand;
            ExplicitActivityDestination explicitActivityDestination = deeplinkNavigateCommand.f98630a;
            int i = deeplinkNavigateCommand.f98633g;
            if ((268435456 & i) == 0) {
                throw new IllegalArgumentException("DeeplinkNavigateCommand requires FLAG_ACTIVITY_NEW_TASK when executed from Application context. Destination: ".concat(explicitActivityDestination.f98636a.getName()).toString());
            }
            Intent intent2 = new Intent(context, (Class<?>) explicitActivityDestination.f98636a);
            intent2.setAction(deeplinkNavigateCommand.d);
            Iterator it10 = deeplinkNavigateCommand.e.iterator();
            while (it10.hasNext()) {
                intent2.addCategory((String) it10.next());
            }
            intent2.setData(deeplinkNavigateCommand.f);
            nim.a.F(intent2, deeplinkNavigateCommand.f98632c);
            Intent intentP = p(intent2, deeplinkNavigateCommand.f98631b);
            Intrinsics.checkNotNullParameter(intentP, "<this>");
            intentP.setFlags(i);
            context.startActivity(intentP);
            return;
        }
        ActivityNavigateCommand activityNavigateCommand = (ActivityNavigateCommand) naviCommand;
        String str = activityNavigateCommand.f;
        Map map = activityNavigateCommand.f98620c;
        Parcelable parcelable = activityNavigateCommand.f98619b;
        int i2 = activityNavigateCommand.e;
        ActivityDestination activityDestination = activityNavigateCommand.f98618a;
        if (activityDestination instanceof ExplicitActivityDestination) {
            Intent intent3 = new Intent(context, (Class<?>) ((ExplicitActivityDestination) activityDestination).f98636a);
            if (context instanceof Application) {
                i2 |= 268435456;
            }
            Intrinsics.checkNotNullParameter(intent3, "<this>");
            intent3.setFlags(i2);
            Intent intentP2 = p(intent3, parcelable);
            nim.a.F(intentP2, map);
            nim.a.G(intentP2, str);
            context.startActivity(intentP2);
            return;
        }
        if (activityDestination instanceof ImplicitActivityDestination) {
            n(context, activityNavigateCommand, (ImplicitActivityDestination) activityDestination);
            return;
        }
        if (activityDestination instanceof ChooserActivityDestination) {
            m(context, activityNavigateCommand, (ChooserActivityDestination) activityDestination);
            return;
        }
        if (activityDestination instanceof SelectorActivityDestination) {
            SelectorActivityDestination selectorActivityDestination = (SelectorActivityDestination) activityDestination;
            try {
                Intent intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity(selectorActivityDestination.getF98668a(), selectorActivityDestination.getF98669b());
                Intrinsics.checkNotNullExpressionValue(intentMakeMainSelectorActivity, "makeMainSelectorActivity(...)");
                Intrinsics.checkNotNullParameter(intentMakeMainSelectorActivity, "<this>");
                intentMakeMainSelectorActivity.setFlags(i2);
                context.startActivity(intentMakeMainSelectorActivity);
                return;
            } catch (ActivityNotFoundException e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                d.a(rd0.c.ERROR, null, null, e, h0Var);
                return;
            }
        }
        if (activityDestination instanceof FileOpenActivityDestination) {
            o(context, (FileOpenActivityDestination) activityDestination);
            return;
        }
        if (!(activityDestination instanceof ExternalAppDestination)) {
            if (!(activityDestination instanceof SettingsDestination)) {
                throw new NoWhenBranchMatchedException();
            }
            String f98670a = ((SettingsDestination) activityDestination).getF98670a();
            Context context2 = (Context) this.f98676j.get();
            Uri uriFromParts = Uri.fromParts("package", context2 != null ? context2.getPackageName() : null, null);
            Intrinsics.checkNotNullExpressionValue(uriFromParts, "fromParts(...)");
            n(context, activityNavigateCommand, new ImplicitActivityDestination(f98670a, null, null, null, uriFromParts, 14));
            return;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(((ExternalAppDestination) activityDestination).getF98637a());
        if (launchIntentForPackage != null) {
            Intrinsics.checkNotNullParameter(launchIntentForPackage, "<this>");
            launchIntentForPackage.setFlags(i2);
            Intent intentP3 = p(launchIntentForPackage, parcelable);
            nim.a.F(intentP3, map);
            nim.a.G(intentP3, str);
            context.startActivity(launchIntentForPackage);
        }
    }

    public final void i(WeakReference weakReference, NaviCommand naviCommand, Context context) throws IllegalAccessException {
        this.d.getClass();
        Activity activityC = h80.c.c();
        nri.b bVar = null;
        if (activityC == null || activityC.isFinishing()) {
            activityC = null;
        }
        nri.b bVar2 = activityC instanceof nri.b ? (nri.b) activityC : null;
        if (bVar2 == null) {
            Object obj2 = weakReference.get();
            if (obj2 instanceof nri.b) {
                bVar = (nri.b) obj2;
            }
        } else {
            bVar = bVar2;
        }
        if (bVar != null) {
            bVar.runOnUiThread(new ag.n(this, 5, naviCommand, bVar));
        } else {
            h(context, naviCommand);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(com.revolut.retail.core.navigation.ActivityNavigateCommand r10, nri.b r11, android.content.Intent r12) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.core.navigation.b.j(com.revolut.retail.core.navigation.ActivityNavigateCommand, nri.b, android.content.Intent):void");
    }

    public final void k(FeatureCommand featureCommand) {
        FeatureConfig featureConfig = featureCommand.f98638a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f98671a.entrySet()) {
            if (((Class) entry.getKey()).isInstance(featureConfig)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        f(linkedHashMap, featureConfig, new bsi.b(this, featureConfig, 8));
    }
}
