package q2j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f241687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f241688b;

    public m(List all2, List creditCards) {
        Intrinsics.checkNotNullParameter(all2, "all");
        Intrinsics.checkNotNullParameter(creditCards, "creditCards");
        this.f241687a = all2;
        this.f241688b = creditCards;
    }

    @Override // q2j.o
    public final List a() {
        return this.f241688b;
    }
}
