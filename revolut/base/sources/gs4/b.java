package gs4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ql4.t;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f146308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f146310c;
    public final List d;
    public final k71.q e;

    public b(t state, int i, int i2, List transactions, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f146308a = state;
        this.f146309b = i;
        this.f146310c = i2;
        this.d = transactions;
        this.e = transactionsExtraData;
    }

    @Override // gs4.d
    public final int a() {
        return this.f146309b;
    }

    @Override // gs4.d
    public final int b() {
        return this.f146310c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f146308a == bVar.f146308a && this.f146309b == bVar.f146309b && this.f146310c == bVar.f146310c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    @Override // gs4.d
    public final t getState() {
        return this.f146308a;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(j6.a.b(this.f146310c, j6.a.b(this.f146309b, this.f146308a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
