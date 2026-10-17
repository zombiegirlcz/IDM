package ljc;

import chj.h0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lfg.z;
import nii.c0;
import nii.l1;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egc.a f195632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LocalDate f195633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RentAndBillsLinkedPayments.Category.LinkedPayment.Payment f195634y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, egc.a aVar, LocalDate localDate, RentAndBillsLinkedPayments.Category.LinkedPayment.Payment payment, Continuation continuation) {
        super(1, continuation);
        this.v = rVar;
        this.f195632w = aVar;
        this.f195633x = localDate;
        this.f195634y = payment;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.v, this.f195632w, this.f195633x, this.f195634y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        r rVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            rVar.f195645s.getClass();
            egc.a categoryType = this.f195632w;
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            c0 c0Var = new c0(new TextLocalisedClause(mra.d.E(categoryType, R$string.rent_and_bills_link_payment_loading_rent_title, R$string.rent_and_bills_link_payment_loading_bills_title), null, null, 14), null, null, false, null, false, false, null, 1918);
            lic.a aVar2 = new lic.a(rVar, 1);
            h0 h0Var = new h0(rVar, categoryType, this.f195633x, 2);
            m mVar = new m(rVar, categoryType, this.f195634y, null);
            this.u = 1;
            objP = n14.k.P(rVar.X(), c0Var, aVar2, h0Var, mVar, this);
            if (objP == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objP = obj2;
        }
        nii.e eVar = (nii.e) objP;
        if (eVar instanceof nii.d) {
            nii.d dVar = (nii.d) eVar;
            if (dVar.f216133a instanceof bgc.b) {
                rVar.H2(rVar.v, new z(28));
                rVar.u.a();
                if (dVar.f216134b instanceof l1) {
                    rVar.C2(i.f195626a);
                }
            }
        }
        return Unit.f186387a;
    }
}
