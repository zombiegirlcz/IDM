package jm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f175892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f175894c;

    public b(boolean z, String characterSet, char c2) {
        Intrinsics.j(characterSet, "characterSet");
        this.f175892a = c2;
        this.f175893b = characterSet;
        this.f175894c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f175892a == bVar.f175892a && Intrinsics.f(this.f175893b, bVar.f175893b) && this.f175894c == bVar.f175894c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int i = this.f175892a * 31;
        String str = this.f175893b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f175894c;
        ?? r110 = z;
        if (z) {
            r110 = 1;
        }
        return iHashCode + r110;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Notation(character=");
        sb6.append(this.f175892a);
        sb6.append(", characterSet=");
        sb6.append(this.f175893b);
        sb6.append(", isOptional=");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, this.f175894c, ")");
    }
}
