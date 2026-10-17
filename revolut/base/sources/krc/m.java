package krc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.salary_switch.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.g0;
import nii.y0;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b f188855w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f188855w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f188855w, continuation, 0);
            default:
                return new m(this.f188855w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objF0;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar = this.f188855w;
                if (i == 0) {
                    o.b(obj2);
                    l lVar = new l(bVar, null);
                    this.v = 1;
                    objF0 = ue8.c.f0(bVar, lVar, this);
                    if (objF0 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objF0 = obj2;
                }
                yji.l.a1(bVar, bVar.X1(new y0(null, new g0(new TextLocalisedClause(R$string.salary_switch_mx_review_bank_account_in_progress_title, null, null, 14), new TextLocalisedClause(R$string.salary_switch_mx_review_bank_account_in_progress_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, null, new h(bVar, (String) objF0, continuation, 1), 3);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar2 = this.f188855w;
                    m mVar = new m(bVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(bVar2.X(), "SUBMIT_REQUEST_LOADING_TAG", mVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
