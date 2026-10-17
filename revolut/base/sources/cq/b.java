package cq;

import a08.q;
import a08.s;
import android.content.Intent;
import android.os.Bundle;
import com.revolut.core.extensions.rx.BreadcrumbException;
import cp7.k;
import e7l.g;
import efm.r;
import ihm.j;
import java.time.Clock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q97.h2;
import q97.q2;
import rp0.k1;
import sri.m;
import te0.w;
import zp.e;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends fsi.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qbb.a f107971h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nbb.c f107972j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ue0.c f107973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Clock f107974m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qbb.a configurationProvider, g inAppUpdater, nbb.c inAppUpdaterGlobalToggle, m navigator, k1 shotDisplayer, ue0.c storage) {
        super(new fsi.b("IMMEDIATE_IN_APP_UPDATE_DELEGATE"));
        Clock clock = Clock.systemUTC();
        Intrinsics.checkNotNullExpressionValue(clock, "systemUTC(...)");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(inAppUpdater, "inAppUpdater");
        Intrinsics.checkNotNullParameter(inAppUpdaterGlobalToggle, "inAppUpdaterGlobalToggle");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(shotDisplayer, "shotDisplayer");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f107971h = configurationProvider;
        this.i = inAppUpdater;
        this.f107972j = inAppUpdaterGlobalToggle;
        this.k = navigator;
        this.f107973l = storage;
        this.f107974m = clock;
    }

    @Override // fsi.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        j jVar = this.i.d;
        if (i == 1933 && i2 != -1) {
            if (i2 != 0) {
                jVar.onNext(new zp.f("Update can not be started"));
            } else {
                jVar.onNext(e.a.f324091a);
            }
        }
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        this.f107972j.getClass();
    }

    @Override // fsi.a
    public final void onStart() {
        od0.a aVar = od0.a.f224253a;
        if (od0.a.i()) {
            return;
        }
        this.f107972j.getClass();
        qbb.a aVar2 = this.f107971h;
        int i = 16;
        r rVarFilter = ((ik3.g) aVar2.f244171a).a(g.a.f123406a, false).filter(new h2(i, new qb5.a(2)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r map = m70.a.g(rVarFilter, null, new q2(24), 1).map(new h2(17, new qa9.r(aVar2, 9)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarFilter2 = rd0.e.c(rd0.e.b(map), kotlin.coroutines.g.f186406a).filter(new com.onfido.android.sdk.capture.ui.userconsent.c(new com.revolut.feature.alipay_plus.mpm.webcontainer.a(20), i));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        k kVar = new k(this, 11);
        Function1 function1M = M();
        Function0 function0L = L();
        r rVarOnErrorResumeNext = rVarFilter2.onErrorResumeNext(new o7.d(new c0d.j(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new s(7, kVar), new s(7, function1M), new q(19, function0L));
        w.j0(this.f137706c, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
