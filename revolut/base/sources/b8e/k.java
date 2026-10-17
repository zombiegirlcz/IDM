package b8e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import do3.n;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Subaccount f13217b;

    public /* synthetic */ k(Subaccount subaccount, int i) {
        this.f13216a = i;
        this.f13217b = subaccount;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f13216a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                n nVar = (n) pair.f186385a;
                d dVar = (d) pair.f186386b;
                Subaccount subaccount = this.f13217b;
                return new h(subaccount, x8e.a.c(subaccount, nVar), nVar.f116408a, dVar);
            case 1:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f13217b, it8);
            default:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new Pair(this.f13217b, transactions);
        }
    }
}
