package d26;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110727c;
    public final Integer d;
    public final String e;
    public final String f;

    public f(int i, Integer num, String externalAssetId, String genericLocalizedName, String ticker, String str) {
        Intrinsics.checkNotNullParameter(externalAssetId, "externalAssetId");
        Intrinsics.checkNotNullParameter(genericLocalizedName, "genericLocalizedName");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f110725a = externalAssetId;
        this.f110726b = genericLocalizedName;
        this.f110727c = i;
        this.d = num;
        this.e = ticker;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f110725a, fVar.f110725a) && Intrinsics.f(this.f110726b, fVar.f110726b) && this.f110727c == fVar.f110727c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f110727c, p.a.c(this.f110725a.hashCode() * 31, 31, this.f110726b), 31);
        Integer num = this.d;
        int iC = p.a.c((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ f(int i, String str, String str2, int i2, Integer num, String str3, String str4) {
        if (55 != (i & 55)) {
            j1.f(d.f110724a.getDescriptor(), i, 55);
            throw null;
        }
        this.f110725a = str;
        this.f110726b = str2;
        this.f110727c = i2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        this.e = str3;
        this.f = str4;
    }
}
