package xga;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f305660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f305661c;

    public /* synthetic */ s(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(q.f305658a.getDescriptor(), i, 3);
            throw null;
        }
        this.f305659a = str;
        this.f305660b = str2;
        if ((i & 4) == 0) {
            this.f305661c = null;
        } else {
            this.f305661c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f305659a, sVar.f305659a) && Intrinsics.f(this.f305660b, sVar.f305660b) && Intrinsics.f(this.f305661c, sVar.f305661c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f305659a.hashCode() * 31, 31, this.f305660b);
        String str = this.f305661c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
