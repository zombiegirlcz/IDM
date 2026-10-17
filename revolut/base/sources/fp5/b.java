package fp5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wk5.m;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CryptoAddress f137050b;

    public /* synthetic */ b(CryptoAddress cryptoAddress, int i) {
        this.f137049a = i;
        this.f137050b = cryptoAddress;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f137049a) {
            case 0:
                pd5.g it8 = (pd5.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = it8.d;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList.add(m.a((wk5.a) it9.next()));
                }
                return Boolean.valueOf(d0.i1(arrayList).contains(m.a(this.f137050b.f71063h)));
            case 1:
                CryptoAddress it10 = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                String f71061c = it10.getF71061c();
                CryptoAddress cryptoAddress = this.f137050b;
                return Boolean.valueOf(Intrinsics.f(f71061c, cryptoAddress.getF71061c()) && it10.getF71063h() == cryptoAddress.getF71063h() && Intrinsics.f(com.revolut.feature.crypto.withdraw.api.models.b.a(it10), com.revolut.feature.crypto.withdraw.api.models.b.a(cryptoAddress)));
            case 2:
                CryptoAddress it11 = (CryptoAddress) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                String f71061c2 = it11.getF71061c();
                CryptoAddress cryptoAddress2 = this.f137050b;
                return Boolean.valueOf(Intrinsics.f(f71061c2, cryptoAddress2.getF71061c()) && m.a(it11.getF71063h()) == m.a(cryptoAddress2.getF71063h()) && Intrinsics.f(com.revolut.feature.crypto.withdraw.api.models.b.a(it11), com.revolut.feature.crypto.withdraw.api.models.b.a(cryptoAddress2)));
            default:
                nqi.c switchedMoneyInputState = (nqi.c) obj2;
                Intrinsics.checkNotNullParameter(switchedMoneyInputState, "switchedMoneyInputState");
                return new Pair(switchedMoneyInputState, this.f137050b.f71060b);
        }
    }
}
