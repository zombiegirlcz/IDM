package tne;

import com.revolut.feature.tax_residency.api.exemption.model.PartnerInformation;
import com.revolut.feature.tax_residency.api.exemption.model.TaxExemptionAggregate;
import com.revolut.feature.tax_residency.api.exemption.model.ValidityPeriod;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n14.k;
import o9a.v;
import sbb.w;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f272433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f272434x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, dj0.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f272433w = gVar;
        this.f272434x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f272433w, this.f272434x, continuation, 0);
            default:
                return new f(this.f272433w, this.f272434x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        g gVar;
        Object objV;
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    g gVar2 = this.f272433w;
                    nne.b bVar = gVar2.f272436q;
                    TaxExemptionAggregate taxExemptionAggregate = gVar2.o.f89997a;
                    long j2 = taxExemptionAggregate.f89970a;
                    String taxYear = taxExemptionAggregate.f89971b;
                    dj0.d utilisedAmount = taxExemptionAggregate.f89972c;
                    dj0.d maxLimit = taxExemptionAggregate.e;
                    ValidityPeriod validityPeriod = taxExemptionAggregate.f;
                    String str = taxExemptionAggregate.f89973g;
                    PartnerInformation partnerInformation = taxExemptionAggregate.f89974h;
                    String code = taxExemptionAggregate.i;
                    Intrinsics.checkNotNullParameter(taxYear, "taxYear");
                    Intrinsics.checkNotNullParameter(utilisedAmount, "utilisedAmount");
                    Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
                    Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
                    Intrinsics.checkNotNullParameter(code, "code");
                    TaxExemptionAggregate taxExemptionAggregate2 = new TaxExemptionAggregate(j2, taxYear, utilisedAmount, this.f272434x, maxLimit, validityPeriod, str, partnerInformation, code);
                    this.v = 1;
                    sne.g gVar3 = bVar.f217614a;
                    gVar3.getClass();
                    w wVar = new w(gVar3, taxExemptionAggregate2, continuation, 18);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, wVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                g gVar4 = this.f272433w;
                if (i2 == 0) {
                    o.b(obj2);
                    v vVar = new v(10);
                    ku1.v vVar2 = new ku1.v(24);
                    f fVar = new f(gVar4, this.f272434x, continuation, 0);
                    this.v = 1;
                    gVar = gVar4;
                    objV = k.V(gVar, null, vVar, vVar2, fVar, this, 1);
                    if (objV == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objV = obj2;
                    gVar = gVar4;
                }
                nii.h hVar = (nii.h) objV;
                if (hVar instanceof nii.g) {
                    gVar.B2();
                } else if (!(hVar instanceof nii.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
