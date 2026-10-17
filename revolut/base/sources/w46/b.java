package w46;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294516c;
    public final String d;

    public b(String assetId, String toCurrency, String rate, String str) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f294514a = assetId;
        this.f294515b = toCurrency;
        this.f294516c = rate;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f294514a, bVar.f294514a) && Intrinsics.f(this.f294515b, bVar.f294515b) && Intrinsics.f(this.f294516c, bVar.f294516c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f294514a.hashCode() * 31, 31, this.f294515b), 31, this.f294516c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
