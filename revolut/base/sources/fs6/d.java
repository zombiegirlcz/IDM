package fs6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137602b;

    public d(String vatReminderId, boolean z) {
        Intrinsics.checkNotNullParameter(vatReminderId, "vatReminderId");
        this.f137601a = vatReminderId;
        this.f137602b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f137601a, dVar.f137601a) && this.f137602b == dVar.f137602b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137602b) + (this.f137601a.hashCode() * 31);
    }
}
