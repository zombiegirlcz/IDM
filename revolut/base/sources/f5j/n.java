package f5j;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements q {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f132356b;

    public n(String beneficiaryId, l context) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f132355a = beneficiaryId;
        this.f132356b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f132355a, nVar.f132355a) && this.f132356b == nVar.f132356b;
    }

    @Override // f5j.q
    public final l getContext() {
        return this.f132356b;
    }

    public final int hashCode() {
        return this.f132356b.hashCode() + (this.f132355a.hashCode() * 31);
    }
}
