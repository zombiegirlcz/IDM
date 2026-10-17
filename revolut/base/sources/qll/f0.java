package qll;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.combined_authentication.unified.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f247586w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.revolut.sso.impl.ui.combined_authentication.unified.a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f247586w = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, this.f247586w, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        List listL;
        Data data2 = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.sso.impl.ui.combined_authentication.unified.a aVar2 = this.v;
        try {
            Object content = data2.getContent();
            if (content != null) {
                gkl.o oVar = (gkl.o) content;
                gkl.p bankIdProvider = oVar.getBankIdProvider();
                if (!aVar2.o.n()) {
                    bankIdProvider = null;
                }
                gkl.w webAuthnProvider = oVar.getWebAuthnProvider();
                if (!((col.i) aVar2.B).b3(webAuthnProvider)) {
                    webAuthnProvider = null;
                }
                gkl.r googleProvider = oVar.getGoogleProvider();
                if (!this.f247586w) {
                    googleProvider = null;
                }
                gkl.t qrDelegatedProvider = oVar.getQrDelegatedProvider();
                gkl.q dapProvider = oVar.getDapProvider();
                if (!aVar2.f106434p.s()) {
                    dapProvider = null;
                }
                gkl.v uaePassProvider = oVar.getUaePassProvider();
                if (!aVar2.f106435q.a()) {
                    uaePassProvider = null;
                }
                gkl.x[] elements = {bankIdProvider, webAuthnProvider, googleProvider, qrDelegatedProvider, dapProvider, uaePassProvider};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL = kotlin.collections.d.L(elements);
            } else {
                listL = null;
            }
            data = new Data(listL, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        aVar2.H2(aVar2.D, new q65.l(data, 26));
        return Unit.f186387a;
    }
}
