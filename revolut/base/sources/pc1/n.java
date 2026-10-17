package pc1;

import com.revolut.feature.acquiring.lite_pos.api.model.LitePosReceiptState;
import com.revolut.feature.acquiring.lite_pos.api.model.ReceiptInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.l1;
import nii.m1;
import nii.n1;
import pc1.c;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f234794w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f234795x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, String str, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
        this.f234794w = str;
        this.f234795x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, this.f234794w, this.f234795x, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = this.v;
        qVar.v.d.onNext(xc1.d.f);
        if (n1Var instanceof l1) {
            ea1.b.a("Button click: ".concat("Try again"), fa1.k.INFO);
            qVar.A2();
        } else if (n1Var instanceof m1) {
            ea1.b.a("Button click: ".concat("Cancel"), fa1.k.INFO);
            qVar.v2(c.b.f234782a);
        } else if (!(n1Var instanceof j1) || (str = this.f234794w) == null) {
            qVar.v2(c.a.f234781a);
        } else {
            qVar.v2(new d(new ReceiptInfo(str, qVar.f234799s.a(), this.f234795x, LitePosReceiptState.DECLINED)));
        }
        return Unit.f186387a;
    }
}
