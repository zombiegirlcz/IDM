package sc7;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import jq9.k;
import jq9.p;
import jq9.t;
import jq9.y;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qz9.n;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f261641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f261642c;

    public /* synthetic */ a(f fVar, String str, int i) {
        this.f261640a = i;
        this.f261641b = fVar;
        this.f261642c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261640a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                t tVar = (t) pair.f186385a;
                Integer num = (Integer) pair.f186386b;
                boolean z = tVar instanceof y;
                f fVar = this.f261641b;
                String str = this.f261642c;
                if (z) {
                    zm3.a aVar = ((y) tVar).f177526a;
                    if (aVar instanceof zm3.j) {
                        return ((n) fVar.e).h(new ChatTransferRecipient.ContactRecipient(aVar)).map(new sa6.a(new b(fVar, str, tVar, num, 0), 27));
                    }
                }
                gc7.c cVar = fVar.d;
                Intrinsics.h(num);
                return w.h(cVar.b(str, tVar, num.intValue(), true));
            default:
                k payee = (k) obj2;
                Intrinsics.checkNotNullParameter(payee, "payee");
                boolean z3 = payee instanceof p;
                f fVar2 = this.f261641b;
                String str2 = this.f261642c;
                if (z3) {
                    zm3.a aVar2 = ((p) payee).f177514b;
                    if (aVar2 instanceof zm3.j) {
                        return ((n) fVar2.e).h(new ChatTransferRecipient.ContactRecipient(aVar2)).map(new sa6.a(new s06.e(fVar2, 9, str2, payee), 23));
                    }
                }
                return w.h(fVar2.d.a(str2, payee, true));
        }
    }
}
