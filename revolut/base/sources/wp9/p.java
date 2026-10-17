package wp9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f299193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f299194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f299195c;

    public p(g0 parcel, String input, boolean z) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f299193a = parcel;
        this.f299194b = input;
        this.f299195c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f299193a, pVar.f299193a) && Intrinsics.f(this.f299194b, pVar.f299194b) && this.f299195c == pVar.f299195c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f299195c) + p.a.c(this.f299193a.hashCode() * 31, 31, this.f299194b);
    }
}
