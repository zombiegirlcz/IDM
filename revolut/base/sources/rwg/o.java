package rwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257936c;
    public final String d;
    public final l e;

    public /* synthetic */ o(int i, String str, String str2, String str3, String str4, l lVar) {
        if (31 != (i & 31)) {
            j1.f(m.f257933a.getDescriptor(), i, 31);
            throw null;
        }
        this.f257934a = str;
        this.f257935b = str2;
        this.f257936c = str3;
        this.d = str4;
        this.e = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f257934a, oVar.f257934a) && Intrinsics.f(this.f257935b, oVar.f257935b) && Intrinsics.f(this.f257936c, oVar.f257936c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f257934a.hashCode() * 31, 31, this.f257935b), 31, this.f257936c), 31, this.d);
    }
}
