package com.revolut;

import akl.w;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.Configuration;
import aoi.g;
import az0.r1;
import com.onfido.android.sdk.capture.Onfido;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.network.AppHeaderVersionProvider;
import com.revolut.network.NetworkConfigurationProvider;
import com.revolut.retail.analytics.tracking.impl.AnalyticsFeatureToggles;
import i41.b;
import ie.b0;
import io.a;
import io.c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import jo0.l;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ljd.e;
import lkf.f0;
import lm.d;
import lm.f;
import mm0.m;
import mm0.n;
import mm0.o;
import mm0.p;
import no.n1;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import voi.h;
import voi.i;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/RevolutApplication;", "Lvoi/i;", "Llp/q1;", "Landroidx/work/Configuration$Provider;", "<init>", "()V", "Companion", "a", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutApplication extends i implements Configuration.Provider {
    public static RevolutApplication A;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b f50282x = new b(new d(this, 0));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Lazy f50283y = j.b(new ite.d(this, 9));
    public final n1 z = new n1(new d(this, 1));

    /* JADX INFO: renamed from: com.revolut.RevolutApplication$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        try {
            c.Companion.getClass();
            a.f162980b.set(true);
            af0.a block = new af0.a(22);
            Intrinsics.checkNotNullParameter(block, "block");
            dim.a aVar = new dim.a(block);
            aVar.setPriority(10);
            aVar.start();
            a.a("appStaticInit");
        } catch (Exception e) {
            String str = "AppStartupTracker failed: " + e;
        }
    }

    @Override // voi.i
    public final boolean a() {
        return Onfido.INSTANCE.isOnfidoProcess(this);
    }

    @Override // voi.i, android.content.ContextWrapper
    public final void attachBaseContext(Context baseContext) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        c.Companion.getClass();
        a.a("appAttachBaseContextStarted");
        super.attachBaseContext(baseContext);
        uh0.a.f280049a.a(this);
        qp.a.Companion.getClass();
        qp.a.f248226a = new qp.a();
        a.a("appAttachBaseContextFinished");
    }

    @Override // voi.i
    public final boolean g() {
        return true;
    }

    @Override // androidx.work.Configuration.Provider
    public final Configuration getWorkManagerConfiguration() {
        return new Configuration.Builder().setWorkerFactory(new f(this)).build();
    }

    @Override // voi.i
    public final boolean h() {
        return true;
    }

    @Override // voi.i
    public final void i() {
        g.a().c("APP_TO_LOGIN_STARTUP_TIME_COLD_START");
        g.a().c("APP_TO_LOGIN_STARTUP_TIME_COLD_START_NO_PARALLEL");
        g.a().c("APP_TO_LOGIN_STARTUP_TIME_COLD_START_PARALLEL");
    }

    @Override // voi.i
    public final ip.a j() {
        return new ip.a(new lm.c(this, 0), new lm.c(this, 1), new ip.b(j.b(new lm.c(this, 2)), j.b(new lm.c(this, 3)), j.b(new lm.c(this, 4)), j.b(new lm.c(this, 6)), j.b(new lm.c(this, 5)), j.b(new f0(2))), b(), this.k);
    }

    @Override // voi.i
    public final h k() {
        e eVar = new e(new AppHeaderVersionProvider(new lm.c(this, 7)), 4);
        h21.a aVarProvideNetworkConfiguration = new NetworkConfigurationProvider(new lm.c(this, 8), eVar).provideNetworkConfiguration();
        kn0.a aVar = new kn0.a(new androidx.lifecycle.b(new yf.c(eVar, aVarProvideNetworkConfiguration), 28));
        l lVar = l.V2;
        fni.a aVar2 = new fni.a(new af0.a(23), new af0.a(24));
        sg0.b bVar = sg0.c.Companion;
        Long l2 = BuildConfig.VERSION_CODE_V2_THRESHOLD;
        Long l3 = BuildConfig.VERSION_CODE_V2_OFFSET;
        bVar.getClass();
        return new h(aVarProvideNetworkConfiguration, aVar, lVar, aVar2, sg0.b.a(l2, l3));
    }

    @Override // voi.i
    public final void l() throws Throwable {
        CoroutineScope coroutineScopeC = i.c();
        p0 p0Var = p0.f264001a;
        Continuation continuation = null;
        e0.C(coroutineScopeC, elm.f.f127540b, null, new w(this, continuation, 3), 2);
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(this.f50282x);
        super.l();
        int i = 0;
        registerActivityLifecycleCallbacks(new t9i.a(new lm.e(this, i), new lm.e(this, 1), new lm.e(this, 2)));
        ((cn0.g) i.f().i()).init();
        qzl.a delegate = new qzl.a();
        ArrayList arrayList = v01.c.f284712a;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        v01.c.f284712a.add(delegate);
        o oVarD = ((cn0.g) i.f().i()).d();
        if ((oVarD instanceof o.a) || (oVarD instanceof n)) {
            phm.a aVar = (phm.a) j6.a.j(hf0.b.d, o81.a.class);
            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
            if (aVar2 == null) {
                throw new IllegalStateException(a0.d.q("Api ", o81.a.class, " is not found"));
            }
            ((q81.d) ((m81.a) ((o81.a) aVar2.b()).f222899h.get()).f203417a).a();
            e0.E(kotlin.coroutines.g.f186406a, new r1(this, continuation, 7));
        } else if (!(oVarD instanceof m) && !(oVarD instanceof p)) {
            throw new NoWhenBranchMatchedException();
        }
        hf0.b bVar = hf0.b.d;
        phm.a aVar3 = (phm.a) j6.a.j(bVar, ckg.a.class);
        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
        if (aVar4 == null) {
            throw new IllegalStateException(a0.d.q("Api ", ckg.a.class, " is not found"));
        }
        wjg.a.a(((ckg.a) aVar4.b()).b());
        pfm.h hVar = new pfm.h(new lm.a(this, i), 2);
        phm.a aVar5 = (phm.a) j6.a.j(bVar, sd0.c.class);
        b60.a aVar6 = aVar5 != null ? (b60.a) aVar5.get() : null;
        if (aVar6 == null) {
            throw new IllegalStateException(a0.d.q("Api ", sd0.c.class, " is not found"));
        }
        pfm.a aVarE = hVar.e(((vd0.e) ((sd0.c) aVar6.b())).b().a(sd0.f.CACHE)).e(pd.b.n(p0.f264003c, new afe.a(this, continuation, 9)));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        pfm.a aVar7 = new pfm.a(te0.w.g0(aVarE), new a31.a(new bo.c(new BreadcrumbException(), 16), (short) 0), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        aVar7.w(new b0(new jli.f(8), 6), new lm.b(0));
    }

    @Override // voi.i, android.app.Application
    public final void onCreate() {
        c.Companion.getClass();
        a.a("appCreateStarted");
        coi.b bVar = (coi.b) this.f50283y.getValue();
        bVar.f25550a.registerActivityLifecycleCallbacks(new coi.a(bVar));
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            new Handler(looperMyLooper).post(new androidx.view.d(bVar, 5));
        }
        super.onCreate();
        if (Intrinsics.f((zi2.c) this.f290977b.getValue(), zi2.a.f322495a)) {
            A = this;
            io.f fVar = (io.f) i.e().d();
            fVar.getClass();
            Intrinsics.checkNotNullParameter(this, "application");
            AtomicBoolean atomicBoolean = a.f162980b;
            if (atomicBoolean.get()) {
                if (((jte.d) fVar.f162984a.f98545a).c(AnalyticsFeatureToggles.AppStartupPerformanceTracking.f98542c)) {
                    registerActivityLifecycleCallbacks(fVar);
                    fVar.e = this;
                } else {
                    atomicBoolean.compareAndSet(true, false);
                }
            }
            ((i41.c) ((l41.a) ((ip.a) hf0.b.d.g()).b().f197975u3.get()).f192032c.get()).a();
            fVar.a("16.1.87", "protectionVersion");
            a.a("appCreateFinished");
        }
    }
}
