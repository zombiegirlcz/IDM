package gl3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f144552b;

    public h(String str, String str2) {
        this.f144551a = str;
        this.f144552b = str2;
    }

    public final String a() {
        return this.f144551a;
    }

    public final String b() {
        return this.f144552b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f144551a, hVar.f144551a) && Intrinsics.f(this.f144552b, hVar.f144552b);
    }

    public final int hashCode() {
        String str = this.f144551a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f144552b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
