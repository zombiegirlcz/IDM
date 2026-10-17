package com.revolut.ui.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.appcompat.view.ContextThemeWrapper;
import cn0.g;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.push.PushEventAnalytics;
import efm.d0;
import ifm.b;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oma.r;
import org.jetbrains.annotations.NotNull;
import phm.a;
import qp5.x;
import qwd.o;
import rd0.c;
import rd0.d;
import rfm.f0;
import te0.w;
import ufm.i;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/ui/push/PushEventTrackerService;", "Landroid/app/Service;", "<init>", "()V", "Companion", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PushEventTrackerService extends Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f107081a = new b();

    /* JADX INFO: renamed from: com.revolut.ui.push.PushEventTrackerService$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static Intent a(ContextThemeWrapper context, PushEventAnalytics config) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intent intent = new Intent(context, (Class<?>) PushEventTrackerService.class);
            intent.putExtra("CONFIGURATION_ARG", config);
            return intent;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f107081a.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        PushEventAnalytics pushEventAnalytics;
        if (intent != null) {
            try {
                pushEventAnalytics = (PushEventAnalytics) intent.getParcelableExtra("CONFIGURATION_ARG");
            } catch (Throwable th10) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(c.ERROR, "PushEventTrackerService", "Can't create PushEventAnalytics from intent bundle", th10, h0Var);
            }
        } else {
            pushEventAnalytics = null;
        }
        if (pushEventAnalytics == null) {
            pushEventAnalytics = null;
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        Context applicationContext = getApplicationContext();
        Intrinsics.i(applicationContext, "null cannot be cast to non-null type com.revolut.retail.arch.container.RetailContainerApplication<*>");
        a aVar = (a) j6.a.j(hf0.b.d, an0.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", an0.c.class, " is not found"));
        }
        d0 d0VarFirstOrError = ((g) ((an0.c) aVar2.b()).j()).g().filter(new qsa.a(16, new o(17))).firstOrError();
        r rVar = new r(this, 18);
        d0VarFirstOrError.getClass();
        f0 f0Var = new f0(d0VarFirstOrError, rVar, 3);
        Intrinsics.checkNotNullExpressionValue(f0Var, "doAfterTerminate(...)");
        qpb.a aVar3 = new qpb.a(pushEventAnalytics, this, 23);
        i iVar = new i(f0Var, new qr0.i(new x(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new m3l.d(21, aVar3), new m3l.d(21, qwl.a.f249962a), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        w.j0(this.f107081a, iVar2);
        return 2;
    }
}
