package com.revolut.retail.feature.esim.impl.service;

import android.os.PersistableBundle;
import android.service.carrier.CarrierIdentifier;
import android.service.carrier.CarrierService;
import cam.q;
import dfj.j;
import elm.f;
import java.util.concurrent.CopyOnWriteArrayList;
import kej.b;
import kej.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import pej.a;
import rd0.d;
import skm.c2;
import skm.e0;
import skm.p0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/service/EsimApnUpdateService;", "Landroid/service/carrier/CarrierService;", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "()V", "Companion", "a", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimApnUpdateService extends CarrierService implements CoroutineScope {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f100596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bej.a f100597b;

    public static final class a {
        private a() {
        }
    }

    public EsimApnUpdateService() {
        c2 c2VarE = e0.e();
        p0 p0Var = p0.f264001a;
        this.f100596a = e.d(c2VarE, f.f127540b);
    }

    public static final void a(EsimApnUpdateService esimApnUpdateService, c cVar) {
        if (cVar instanceof b) {
            RuntimeException runtimeException = ((b) cVar).f183091a;
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, "EsimApnUpdateService", "Failed to update APN settings in onLoadConfig", runtimeException, h0Var);
            return;
        }
        if (!(cVar instanceof c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
        d.b(rd0.c.DEBUG, "EsimApnUpdateService", "Successfully updated APN settings in onLoadConfig", null, null, 16);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF100596a() {
        return this.f100596a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            phm.a aVar = (phm.a) ue0.e.j(this).a().get(afj.b.class);
            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
            if (aVar2 != null) {
                this.f100597b = (bej.a) ((afj.b) aVar2.b()).G0.get();
                return;
            }
            throw new IllegalStateException("Api " + afj.b.class + " is not found");
        } catch (Throwable th10) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, "EsimApnUpdateService", "Unable to initialise dependencies", th10, h0Var);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        e0.j(this.f100596a, null);
        super.onDestroy();
    }

    @Override // android.service.carrier.CarrierService
    public final PersistableBundle onLoadConfig(CarrierIdentifier id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return null;
    }

    @Override // android.service.carrier.CarrierService
    public final PersistableBundle onLoadConfig(int i, CarrierIdentifier carrierIdentifier) {
        int iHashCode;
        bej.a aVar = this.f100597b;
        if (aVar != null) {
            j jVar = (j) aVar;
            if (((oej.b) jVar.e).a().equals(a.C1306a.f235381a) && ((efj.c) jVar.f114004b).a() && jVar.f114003a.d()) {
                String spn = carrierIdentifier != null ? carrierIdentifier.getSpn() : null;
                if (spn != null && ((iHashCode = spn.hashCode()) == -1651683564 ? spn.equals("1GLOBAL") : !(iHashCode != 633268201 || !spn.equals("BetterRoaming")))) {
                    e0.C(this, null, null, new q(i, 11, this, null), 3);
                }
            }
        }
        return null;
    }
}
