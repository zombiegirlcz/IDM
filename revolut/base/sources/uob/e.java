package uob;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncd.d f281594a;

    public e(ncd.d interestAliasVariant) {
        Intrinsics.checkNotNullParameter(interestAliasVariant, "interestAliasVariant");
        this.f281594a = interestAliasVariant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f281594a == ((e) obj2).f281594a;
    }

    public final int hashCode() {
        return this.f281594a.hashCode();
    }
}
