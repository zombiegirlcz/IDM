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
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f234792w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f234793x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, String str, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
        this.f234792w = str;
        this.f234793x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, this.f234792w, this.f234793x, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = this.v;
        qVar.v.d.onNext(xc1.d.f);
        if (n1Var instanceof l1) {
            ea1.b.a("Button click: ".concat("New payment"), fa1.k.INFO);
            qVar.v2(c.C1301c.f234783a);
        } else if (n1Var instanceof m1) {
            ea1.b.a("Button click: ".concat("Done"), fa1.k.INFO);
            qVar.v2(c.b.f234782a);
        } else if (n1Var instanceof j1) {
            String str = this.f234792w;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            qVar.v2(new d(new ReceiptInfo(str, qVar.f234799s.a(), this.f234793x, LitePosReceiptState.APPROVED)));
        } else {
            qVar.v2(c.a.f234781a);
        }
        return Unit.f186387a;
    }
}
