package om4;

import com.revolut.feature.credit.card.models.CreditCard;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class z1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yw4.p f226766b;

    public /* synthetic */ z1(yw4.p pVar, int i) {
        this.f226765a = i;
        this.f226766b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f226765a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new c2(this.f226766b, (yw4.b) pair.f186385a, (el4.a) pair.f186386b);
            default:
                CreditCard creditCard = (CreditCard) obj2;
                Intrinsics.checkNotNullParameter(creditCard, "creditCard");
                return new wt4.d(creditCard.f69795g, this.f226766b.f317325a);
        }
    }
}
