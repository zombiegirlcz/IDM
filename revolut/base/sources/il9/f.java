package il9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f extends c {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f162182c;
    public final String d;

    public /* synthetic */ f(int i, dj0.d dVar, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(d.f162180a.getDescriptor(), i, 7);
            throw null;
        }
        this.f162181b = str;
        this.f162182c = dVar;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f162181b, fVar.f162181b) && Intrinsics.f(this.f162182c, fVar.f162182c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f162181b.hashCode() * 31, 31, this.f162182c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
