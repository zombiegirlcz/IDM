package mn1;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t1;
import nii.u1;
import vkm.j2;
import xo1.f;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f207327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ BillSearchBoletoResult f207328x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, BillSearchBoletoResult billSearchBoletoResult, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207327w = b0Var;
        this.f207328x = billSearchBoletoResult;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f207327w, this.f207328x, continuation, 0);
            default:
                return new a0(this.f207327w, this.f207328x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                final b0 b0Var = this.f207327w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    final int i2 = 0;
                    nii.b bVar = new nii.b() { // from class: mn1.x
                        @Override // nii.p1
                        public final m0 a(Object obj3) {
                            Throwable th10 = (Throwable) obj3;
                            switch (i2) {
                            }
                            return b0Var.f207332s.a(th10);
                        }
                    };
                    final BillSearchBoletoResult billSearchBoletoResult = this.f207328x;
                    t1 t1Var = new t1() { // from class: mn1.y
                        @Override // nii.p1
                        public final m0 a(Object obj3) {
                            switch (i2) {
                                case 0:
                                    r rVar = b0Var.f207332s;
                                    BillSearchBoletoResult billSearchBoletoResult2 = billSearchBoletoResult;
                                    dj0.d amount = billSearchBoletoResult2.f61429b;
                                    String beneficiaryName = billSearchBoletoResult2.d;
                                    if (beneficiaryName == null) {
                                        beneficiaryName = "";
                                    }
                                    rVar.getClass();
                                    Intrinsics.checkNotNullParameter(amount, "amount");
                                    Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
                                    return new j0((Clause) new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_summary_title, zhm.v.k(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), beneficiaryName), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
                                default:
                                    b0 b0Var2 = b0Var;
                                    r rVar2 = b0Var2.f207332s;
                                    BillSearchBoletoResult billSearchBoletoResult3 = billSearchBoletoResult;
                                    dj0.d amount2 = billSearchBoletoResult3.f61429b;
                                    String beneficiaryName2 = billSearchBoletoResult3.d;
                                    if (beneficiaryName2 == null) {
                                        beneficiaryName2 = "";
                                    }
                                    long j2 = ((h) ((j2) b0Var2.f207334w.f22677a).getValue()).f207336b.f104285a;
                                    rVar2.getClass();
                                    Intrinsics.checkNotNullParameter(amount2, "amount");
                                    Intrinsics.checkNotNullParameter(beneficiaryName2, "beneficiaryName");
                                    return new j0((Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.pay_bills_taxes_country_br_review_summary_schedule_title, zhm.v.k(new MoneyClause(amount2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), beneficiaryName2), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.pay_bills_taxes_country_br_review_summary_schedule_subtitle, zhm.u.c(new TimeClause(j2, TimeClause.Format.PrettyDayOfWeek.f57975b, null, null, 12)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
                            }
                        }
                    };
                    z zVar = new z(b0Var, billSearchBoletoResult, null, 1);
                    this.v = 1;
                    obj2 = n14.k.P(b0Var.X(), null, bVar, t1Var, zVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.d) {
                    xo1.f fVar = (xo1.f) ((nii.d) eVar).f216133a;
                    if (!(fVar instanceof xo1.e)) {
                        if (fVar instanceof f.a) {
                            throw new IllegalStateException("Boleto Transfers do not support StandingOrder");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    b0Var.C2(new n(((xo1.e) fVar).f307568a));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                final b0 b0Var2 = this.f207327w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    final int i5 = 1;
                    nii.b bVar2 = new nii.b() { // from class: mn1.x
                        @Override // nii.p1
                        public final m0 a(Object obj3) {
                            Throwable th10 = (Throwable) obj3;
                            switch (i5) {
                            }
                            return b0Var2.f207332s.a(th10);
                        }
                    };
                    final BillSearchBoletoResult billSearchBoletoResult2 = this.f207328x;
                    t1 t1Var2 = new t1() { // from class: mn1.y
                        @Override // nii.p1
                        public final m0 a(Object obj3) {
                            switch (i5) {
                                case 0:
                                    r rVar = b0Var2.f207332s;
                                    BillSearchBoletoResult billSearchBoletoResult22 = billSearchBoletoResult2;
                                    dj0.d amount = billSearchBoletoResult22.f61429b;
                                    String beneficiaryName = billSearchBoletoResult22.d;
                                    if (beneficiaryName == null) {
                                        beneficiaryName = "";
                                    }
                                    rVar.getClass();
                                    Intrinsics.checkNotNullParameter(amount, "amount");
                                    Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
                                    return new j0((Clause) new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_summary_title, zhm.v.k(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), beneficiaryName), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094);
                                default:
                                    b0 b0Var22 = b0Var2;
                                    r rVar2 = b0Var22.f207332s;
                                    BillSearchBoletoResult billSearchBoletoResult3 = billSearchBoletoResult2;
                                    dj0.d amount2 = billSearchBoletoResult3.f61429b;
                                    String beneficiaryName2 = billSearchBoletoResult3.d;
                                    if (beneficiaryName2 == null) {
                                        beneficiaryName2 = "";
                                    }
                                    long j2 = ((h) ((j2) b0Var22.f207334w.f22677a).getValue()).f207336b.f104285a;
                                    rVar2.getClass();
                                    Intrinsics.checkNotNullParameter(amount2, "amount");
                                    Intrinsics.checkNotNullParameter(beneficiaryName2, "beneficiaryName");
                                    return new j0((Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.pay_bills_taxes_country_br_review_summary_schedule_title, zhm.v.k(new MoneyClause(amount2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), beneficiaryName2), null, 12), (Clause) new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.pay_bills_taxes_country_br_review_summary_schedule_subtitle, zhm.u.c(new TimeClause(j2, TimeClause.Format.PrettyDayOfWeek.f57975b, null, null, 12)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
                            }
                        }
                    };
                    z zVar2 = new z(b0Var2, billSearchBoletoResult2, null, 4);
                    this.v = 1;
                    obj2 = n14.k.P(b0Var2.X(), null, bVar2, t1Var2, zVar2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((nii.e) obj2) instanceof nii.d) {
                    b0Var2.C2(m.f207345a);
                }
                return Unit.f186387a;
        }
    }
}
