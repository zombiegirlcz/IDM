package yb2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.payto.api.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import nii.z;
import skm.e0;
import skm.p0;
import xg6.b0;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f312167w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f312167w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f312167w, continuation, 0);
            default:
                return new m(this.f312167w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        Object objJ2;
        int i = 8;
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                r rVar = this.f312167w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    b0 b0Var = rVar.f312173s;
                    String str = rVar.o.f312162a;
                    this.v = 1;
                    b0Var.getClass();
                    wo2.l lVar = new wo2.l(b0Var, str, continuation, i);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, lVar, this);
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                dj0.d dVar = (dj0.d) objJ;
                if (dVar == null) {
                    return Unit.f186387a;
                }
                xb4.g gVar = new xb4.g(rVar, dVar, null, 25);
                this.v = 2;
                if (u0.b0(rVar.X(), "BUTTON_TAG_GOT_IT", gVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                r rVar2 = this.f312167w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    b0 b0Var2 = rVar2.f312173s;
                    String str2 = rVar2.o.f312162a;
                    this.v = 1;
                    b0Var2.getClass();
                    wo2.l lVar2 = new wo2.l(b0Var2, str2, continuation, i);
                    p0 p0Var2 = p0.f264001a;
                    objJ2 = e0.J(elm.f.f127540b, lVar2, this);
                    if (objJ2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ2 = obj2;
                }
                if (((dj0.d) objJ2) == null) {
                    return Unit.f186387a;
                }
                yji.l.a1(rVar2, rVar2.X1(new y0("DIALOG_ID_TOP_UP_REJECTED", new z(new TextLocalisedClause(R$string.topup_linked_account_rejected_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, new n(rVar2, null, 0), 3);
                return Unit.f186387a;
        }
    }
}
