package i36;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f158106c;
    public final int d;
    public final String e;
    public final String f;

    public c(int i, int i2, String externalAssetId, String genericLocalizedName, String ticker, String str) {
        Intrinsics.checkNotNullParameter(externalAssetId, "externalAssetId");
        Intrinsics.checkNotNullParameter(genericLocalizedName, "genericLocalizedName");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f158104a = externalAssetId;
        this.f158105b = genericLocalizedName;
        this.f158106c = i;
        this.d = i2;
        this.e = ticker;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f158104a, cVar.f158104a) && Intrinsics.f(this.f158105b, cVar.f158105b) && this.f158106c == cVar.f158106c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.b(this.d, j6.a.b(this.f158106c, p.a.c(this.f158104a.hashCode() * 31, 31, this.f158105b), 31), 31), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ c(int i, String str, String str2, int i2, int i3, String str3, String str4) {
        if (63 != (i & 63)) {
            j1.f(a.f158103a.getDescriptor(), i, 63);
            throw null;
        }
        this.f158104a = str;
        this.f158105b = str2;
        this.f158106c = i2;
        this.d = i3;
        this.e = str3;
        this.f = str4;
    }
}
