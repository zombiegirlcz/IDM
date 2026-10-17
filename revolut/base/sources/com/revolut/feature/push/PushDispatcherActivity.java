package com.revolut.feature.push;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.IntentCompat;
import androidx.core.content.IntentSanitizer;
import androidx.core.content.a;
import b0.m;
import com.revolut.rxdata.core.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/push/PushDispatcherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "a", "feature_push_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PushDispatcherActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.push.PushDispatcherActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static Intent a(ContextThemeWrapper context, PushDispatcherContract$Configuration config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intent intent = new Intent(context, (Class<?>) PushDispatcherActivity.class);
            intent.putExtra("CONFIGURATION_ARG", config);
            return intent;
        }
    }

    public static Intent t(Intent intent) {
        Set<String> setKeySet;
        IntentSanitizer.Builder builderAllowPackage = new IntentSanitizer.Builder().allowAnyComponent().allowAction(new a(10)).allowData(new a(11)).allowType(new a(10)).allowCategory(new a(10)).allowPackage(new a(10));
        Bundle extras = intent.getExtras();
        if (extras != null && (setKeySet = extras.keySet()) != null) {
            Iterator<T> it8 = setKeySet.iterator();
            while (it8.hasNext()) {
                builderAllowPackage.allowExtra((String) it8.next(), new a(12));
            }
        }
        IntentSanitizer intentSanitizerBuild = builderAllowPackage.build();
        Intrinsics.checkNotNullExpressionValue(intentSanitizerBuild, "build(...)");
        Intent intentSanitize = intentSanitizerBuild.sanitize(intent, new m(1));
        Intrinsics.checkNotNullExpressionValue(intentSanitize, "sanitize(...)");
        return intentSanitize;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.b(c.WARNING, "PushDispatcher", "Dispatcher intent is null", null, null, 16);
            finish();
            return;
        }
        PushDispatcherContract$Configuration pushDispatcherContract$Configuration = (PushDispatcherContract$Configuration) IntentCompat.getParcelableExtra(intent, "CONFIGURATION_ARG", PushDispatcherContract$Configuration.class);
        if (pushDispatcherContract$Configuration == null) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.b(c.WARNING, "PushDispatcher", "Configuration is null", null, null, 16);
            finish();
            return;
        }
        Intent intent2 = pushDispatcherContract$Configuration.f81480b;
        List list = pushDispatcherContract$Configuration.f81479a;
        Iterator it8 = d0.F0(intent2, list).iterator();
        while (it8.hasNext()) {
            ((Intent) it8.next()).setExtrasClassLoader(PushDispatcherContract$Configuration.class.getClassLoader());
        }
        try {
            startService(t(intent2));
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = d.f253311a;
            d.a(c.ERROR, null, null, e, h0Var);
        }
        try {
            u(list);
        } catch (ActivityNotFoundException e2) {
            PushEventAnalytics pushEventAnalytics = (PushEventAnalytics) IntentCompat.getParcelableExtra(intent2, "CONFIGURATION_ARG", PushEventAnalytics.class);
            ArrayList arrayList = new ArrayList();
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                Uri data = ((Intent) it9.next()).getData();
                if (data != null) {
                    illegalArgumentException = new IllegalArgumentException("Wrong deeplink. templateId = " + (pushEventAnalytics != null ? pushEventAnalytics.d : null) + ", uri = " + data);
                } else {
                    illegalArgumentException = null;
                }
                if (illegalArgumentException != null) {
                    arrayList.add(illegalArgumentException);
                }
            }
            if (arrayList.isEmpty()) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = d.f253311a;
                d.a(c.ERROR, null, null, e2, h0Var2);
            } else {
                CompositeException compositeException = new CompositeException(arrayList);
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = d.f253311a;
                d.a(c.ERROR, null, null, compositeException, h0Var3);
            }
        }
        finish();
    }

    public final void u(List list) {
        if (list.isEmpty()) {
            return;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(t((Intent) it8.next()));
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        Intent intentAddFlags = intentArr[0].addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        intentArr[0] = intentAddFlags;
        startActivities(intentArr);
    }
}
