package fdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c2 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134054c;
    public final String d;

    public /* synthetic */ c2(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            qlm.j1.f(a2.f134015a.getDescriptor(), i, 7);
            throw null;
        }
        this.f134052a = str;
        this.f134053b = str2;
        this.f134054c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f134052a, c2Var.f134052a) && Intrinsics.f(this.f134053b, c2Var.f134053b) && Intrinsics.f(this.f134054c, c2Var.f134054c) && Intrinsics.f(this.d, c2Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f134052a.hashCode() * 31, 31, this.f134053b), 31, this.f134054c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
