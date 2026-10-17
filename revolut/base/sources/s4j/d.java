package s4j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259895c;
    public final boolean d;

    public d(String listId, String rawValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f259893a = listId;
        this.f259894b = rawValue;
        this.f259895c = formattedValue;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f259893a, dVar.f259893a) && Intrinsics.f(this.f259894b, dVar.f259894b) && Intrinsics.f(this.f259895c, dVar.f259895c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f259893a.hashCode() * 31, 31, this.f259894b), 31, this.f259895c);
    }
}
