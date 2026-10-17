package okc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f225981c;
    public final r d;

    public /* synthetic */ o(int i, String str, String str2, String str3, r rVar) {
        if (15 != (i & 15)) {
            j1.f(m.f225978a.getDescriptor(), i, 15);
            throw null;
        }
        this.f225979a = str;
        this.f225980b = str2;
        this.f225981c = str3;
        this.d = rVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f225979a, oVar.f225979a) && Intrinsics.f(this.f225980b, oVar.f225980b) && Intrinsics.f(this.f225981c, oVar.f225981c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f225979a.hashCode() * 31, 31, this.f225980b), 31, this.f225981c);
        r rVar = this.d;
        return iC + (rVar == null ? 0 : rVar.hashCode());
    }
}
