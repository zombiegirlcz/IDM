package g0k;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139501c;
    public final String d;
    public final String e;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5) {
        if (15 != (i & 15)) {
            j1.f(a.f139498a.getDescriptor(), i, 15);
            throw null;
        }
        this.f139499a = str;
        this.f139500b = str2;
        this.f139501c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f139499a, cVar.f139499a) && Intrinsics.f(this.f139500b, cVar.f139500b) && Intrinsics.f(this.f139501c, cVar.f139501c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f139499a.hashCode() * 31, 31, this.f139500b), 31, this.f139501c), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
