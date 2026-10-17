package vnl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290819a;

    public a(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f290819a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f290819a, ((a) obj2).f290819a);
    }

    public final int hashCode() {
        return this.f290819a.hashCode();
    }
}
