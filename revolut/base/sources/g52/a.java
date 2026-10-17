package g52;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140606a;

    public a(String moneyRequestId) {
        Intrinsics.checkNotNullParameter(moneyRequestId, "moneyRequestId");
        this.f140606a = moneyRequestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f140606a, ((a) obj2).f140606a);
    }

    public final int hashCode() {
        return this.f140606a.hashCode();
    }
}
