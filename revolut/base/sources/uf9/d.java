package uf9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.apm.bills.core.api.model.BillInput;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import u7k.w;
import ud3.n;
import vkm.j2;
import vkm.q;
import vkm.z1;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends g {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f279629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wo1.b f279630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f279631n;
    public final j2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f279632p;

    public d(e mapper, wo1.b billsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f279629l = mapper;
        this.f279630m = billsInteractor;
        this.f279631n = featureToggleInteractor;
        this.o = q.c(new f(0));
        this.f279632p = q.b(0, 6, null);
    }

    @Override // xf9.a
    public final boolean Z2(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return Intrinsics.f(countryCode, wi0.b.f297734c);
    }

    @Override // xf9.a
    public final boolean b3() {
        j2 j2Var = this.o;
        if (((f) j2Var.getValue()).f279633a == null) {
            return false;
        }
        f fVar = new f(0);
        j2Var.getClass();
        j2Var.g(null, fVar);
        N2(o2(new dm1.a(new BillerSearchNavigation$InputData(xo1.g.UAE_BILLS, null))), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a, new n(this, 17));
        return true;
    }

    @Override // xf9.a
    public final Flow c3() {
        return this.f279632p;
    }

    @Override // xf9.a
    public final Flow e3() {
        return new tse.c(this.o, this.f279629l, 16);
    }

    @Override // xf9.a
    public final Unit f3() {
        String str;
        j2 j2Var = this.o;
        Biller biller = ((f) j2Var.getValue()).f279633a;
        if (biller == null || (str = biller.f61145a) == null) {
            return Unit.f186387a;
        }
        T2(new c(this, v.k(new BillInput("BILLER", str, null), new BillInput("ACCOUNT_NUMBER", ((f) j2Var.getValue()).f279634b, null)), null), new yi5.b(27));
        return Unit.f186387a;
    }

    @Override // xf9.a
    public final void g3(String listId, String extractedValue, String str) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        i2b.a.P(listId, extractedValue, str, new w(this, 16));
    }

    @Override // xf9.a
    public final void m3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        N2(o2(new dm1.a(new BillerSearchNavigation$InputData(xo1.g.UAE_BILLS, null))), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a, new n(this, 17));
    }

    @Override // xf9.a
    public final void n3(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        f fVar = new f(0);
        j2 j2Var = this.o;
        j2Var.getClass();
        j2Var.g(null, fVar);
    }
}
