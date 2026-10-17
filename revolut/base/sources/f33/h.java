package f33;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsScreenContract$InputData;
import ffk.t;
import h93.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import vkm.j2;
import zhm.a0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends oki.h implements i {

    @NotNull
    public static final f Companion = new f();
    public final DeliveryMethodsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f131884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c23.b f131885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q89.e f131886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sh3.a f131887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f131888t;

    public h(cli.n stateMapper, DeliveryMethodsScreenContract$InputData inputData, t pricingPlansInteractor, c23.b checkoutParamsProvider, q89.e onboardingInteractor, sh3.a checkoutInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlansInteractor, "pricingPlansInteractor");
        Intrinsics.checkNotNullParameter(checkoutParamsProvider, "checkoutParamsProvider");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        this.o = inputData;
        this.f131884p = pricingPlansInteractor;
        this.f131885q = checkoutParamsProvider;
        this.f131886r = onboardingInteractor;
        this.f131887s = checkoutInteractor;
        Address address = inputData.f65185a;
        c93.j jVar = inputData.e;
        AccountId accountId = inputData.i;
        d93.d dVar = inputData.f65186b;
        dj0.d.Companion.getClass();
        this.f131888t = mra.d.b(this, new j(address, jVar, accountId, null, dVar, null, true, false, dj0.d.e, true), stateMapper, null, false, 12);
    }

    public static void I2(long j2, ArrayList arrayList) {
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            d93.b bVar = (d93.b) obj2;
            Long l2 = bVar.f112339g;
            if (l2 != null) {
                Long lValueOf = Long.valueOf(l2.longValue() - j2);
                String name = bVar.f112336a;
                LocalDate estimatedDeliveryTime = bVar.f112337b;
                s trackingChannel = bVar.f112338c;
                h93.f fVar = bVar.d;
                c93.j pricing = bVar.e;
                dj0.d dVar = bVar.f;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(estimatedDeliveryTime, "estimatedDeliveryTime");
                Intrinsics.checkNotNullParameter(trackingChannel, "trackingChannel");
                Intrinsics.checkNotNullParameter(pricing, "pricing");
                arrayList.set(i, new d93.b(name, estimatedDeliveryTime, trackingChannel, fVar, pricing, dVar, lValueOf));
            }
            i = i2;
        }
        a0.E(arrayList, new f0d.k(21));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new ewa.d(this, continuation, 6), new yi5.b(26));
        List list = ((j) ((j2) this.f131888t.f22677a).getValue()).e.f112340a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((d93.b) it8.next()).f112339g != null) {
                l2(new eh1.g(this, continuation, 1), new yi5.b(26));
                return;
            }
        }
    }

    public final void J2() {
        d93.b bVar;
        y yVar = this.f131888t;
        d93.b bVar2 = (d93.b) d0.d0(((j) ((j2) yVar.f22677a).getValue()).e.f112341b);
        if (bVar2 == null || (bVar = ((j) ((j2) yVar.f22677a).getValue()).d) == null) {
            return;
        }
        l2(new etj.l(this, bVar, bVar2, null, 9), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f131888t;
    }
}
