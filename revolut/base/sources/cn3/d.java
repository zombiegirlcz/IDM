package cn3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f25346a;

    public d(f groupRecipient) {
        Intrinsics.checkNotNullParameter(groupRecipient, "groupRecipient");
        this.f25346a = groupRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f25346a, ((d) obj2).f25346a);
    }

    public final int hashCode() {
        return this.f25346a.f25348a.hashCode();
    }
}
