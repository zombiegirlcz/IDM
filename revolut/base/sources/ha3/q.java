package ha3;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v6l.a0;
import v6l.b0;
import v6l.b1;
import v6l.c0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f150422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f150423c;

    public /* synthetic */ q(x xVar, String str, int i) {
        this.f150421a = i;
        this.f150422b = xVar;
        this.f150423c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150421a) {
            case 0:
                String encryptedNewPin = (String) obj2;
                Intrinsics.checkNotNullParameter(encryptedNewPin, "encryptedNewPin");
                b1 b1Var = (b1) this.f150422b.f150432a;
                String cardId = this.f150423c;
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(encryptedNewPin, "encryptedNewPin");
                pfm.t tVarL = te0.w.g0(b1Var.f286424a.changePin("GCM", cardId, new q6l.f(encryptedNewPin))).l(new c0(b1Var, cardId, 1));
                Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                return tVarL;
            case 1:
                io3.d baseCurrencyInrPocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(baseCurrencyInrPocket, "baseCurrencyInrPocket");
                return new pfm.h(this.f150422b.K(this.f150423c, i93.d.POCKETS, zhm.u.c(baseCurrencyInrPocket.f163145a)), 4);
            default:
                String encryptedPan = (String) obj2;
                Intrinsics.checkNotNullParameter(encryptedPan, "pan");
                b1 b1Var2 = (b1) this.f150422b.f150432a;
                String id10 = this.f150423c;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(encryptedPan, "encryptedPan");
                d0<p6l.q> d0VarConfirmWithPan = b1Var2.f286424a.confirmWithPan("GCM", id10, new q6l.a(encryptedPan));
                a0 a0Var = new a0(19, new b0(6));
                d0VarConfirmWithPan.getClass();
                ufm.i iVar = new ufm.i(new ufm.i(d0VarConfirmWithPan, a0Var, 1), new a0(20, new v6l.d0(b1Var2, 3)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return te0.w.i0(iVar);
        }
    }
}
