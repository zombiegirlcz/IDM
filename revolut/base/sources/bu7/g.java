package bu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] e = {yhm.j.c(yhm.k.PUBLICATION, new br4.e(23)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f18713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18715c;
    public final String d;

    public /* synthetic */ g(int i, f fVar, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(d.f18705a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18713a = fVar;
        this.f18714b = str;
        if ((i & 4) == 0) {
            this.f18715c = str;
        } else {
            this.f18715c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f18713a == gVar.f18713a && Intrinsics.f(this.f18714b, gVar.f18714b) && Intrinsics.f(this.f18715c, gVar.f18715c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f18713a.hashCode() * 31, 31, this.f18714b), 31, this.f18715c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public g(f type, String value, String displayValue, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f18713a = type;
        this.f18714b = value;
        this.f18715c = displayValue;
        this.d = str;
    }

    public /* synthetic */ g(f fVar, String str, String str2, int i) {
        this(fVar, str, (i & 4) != 0 ? str : str2, (String) null);
    }
}
