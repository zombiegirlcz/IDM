package e0f;

import com.revolut.data.model.Data;
import com.revolut.domain.models.externalcards.AddCardParams;
import com.revolut.feature.topup_screen.common.CardDetails;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r10.r f121580b;

    public /* synthetic */ a(r10.r rVar, int i) {
        this.f121579a = i;
        this.f121580b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.r rVarG;
        switch (this.f121579a) {
            case 0:
                r10.r rVar = this.f121580b;
                p71.a aVar = (p71.a) rVar.f250851a;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                sfm.b bVarG = ((u21.k) aVar).c().g(((u21.k) aVar).b());
                Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
                return ue0.e.H(nim.a.w(bVarG, new dz7.k(14)), zhm.h0.f322473a, c.f).flatMapCompletable(new dz7.l(new dz7.k(rVar, 15), 23));
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                CardDetails cardDetails = (CardDetails) pair.f186385a;
                Data data = (Data) pair.f186386b;
                cue.d dVar = (cue.d) data.getContent();
                return dVar == null ? efm.d0.m(data) : (!dVar.d() || dVar.b()) ? efm.d0.m(data) : new pfm.z(new ufm.i(((exh.b) ((wwh.a) this.f121580b.f250853c)).b(dVar, cardDetails), new a31.o(11, d.f121589a), 1), 1, new dug.e(2), null);
            default:
                r10.r rVar2 = this.f121580b;
                p71.a aVar2 = (p71.a) rVar2.f250851a;
                AddCardParams params = (AddCardParams) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                dj0.d amount = params.f60308c;
                CardDetails cardDetails2 = params.f60307b;
                if (amount == null) {
                    rVarG = ((u21.k) aVar2).d(kotlin.text.f0.U0(9, cardDetails2.f90566a), cardDetails2.d, params.f60306a);
                } else {
                    wsg.n nVar = (wsg.n) rVar2.f250852b;
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    rVarG = nVar.o0(amount.f115082a, amount.f115083b.f306286a).g(((u21.k) aVar2).e(params));
                }
                return rVarG.map(new dz7.l(new b(params, 0), 25));
        }
    }
}
