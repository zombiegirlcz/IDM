package pg5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f235804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f235805c;

    public /* synthetic */ h(long j2, long j3, int i, String str) {
        if (7 != (i & 7)) {
            j1.f(f.f235802a.getDescriptor(), i, 7);
            throw null;
        }
        this.f235803a = str;
        this.f235804b = j2;
        this.f235805c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f235803a, hVar.f235803a) && this.f235804b == hVar.f235804b && this.f235805c == hVar.f235805c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f235805c) + a0.d.c(this.f235803a.hashCode() * 31, 31, this.f235804b);
    }

    public h(String currency, long j2, long j3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f235803a = currency;
        this.f235804b = j2;
        this.f235805c = j3;
    }
}
