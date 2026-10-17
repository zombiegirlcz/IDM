package nx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f220053a;

    public a() {
        this((Integer) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f220053a, ((a) obj2).f220053a);
    }

    public final int hashCode() {
        Integer num = this.f220053a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public /* synthetic */ a(int i) {
        this((Integer) null);
    }

    public a(Integer num) {
        this.f220053a = num;
    }
}
