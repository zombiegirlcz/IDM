package m6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f203053a;

    public a(p assetSection) {
        Intrinsics.checkNotNullParameter(assetSection, "assetSection");
        this.f203053a = assetSection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f203053a, ((a) obj2).f203053a);
    }

    public final int hashCode() {
        return this.f203053a.hashCode();
    }
}
