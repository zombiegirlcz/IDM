package il7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162120c;
    public final String d;

    public /* synthetic */ o(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(m.f162117a.getDescriptor(), i, 15);
            throw null;
        }
        this.f162118a = str;
        this.f162119b = str2;
        this.f162120c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f162118a, oVar.f162118a) && Intrinsics.f(this.f162119b, oVar.f162119b) && Intrinsics.f(this.f162120c, oVar.f162120c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f162118a.hashCode() * 31, 31, this.f162119b), 31, this.f162120c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public o(String type, String value, String displayValue, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f162118a = type;
        this.f162119b = value;
        this.f162120c = displayValue;
        this.d = str;
    }
}
