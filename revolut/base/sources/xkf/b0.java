package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f306681b;

    public b0(String note, String gifUrl) {
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        this.f306680a = note;
        this.f306681b = gifUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f306680a, b0Var.f306680a) && Intrinsics.f(this.f306681b, b0Var.f306681b);
    }

    public final int hashCode() {
        return this.f306681b.hashCode() + (this.f306680a.hashCode() * 31);
    }
}
