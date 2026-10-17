package fs7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zr7.l f137639c;

    public /* synthetic */ p(int i, String str, String str2, zr7.l lVar) {
        if (7 != (i & 7)) {
            j1.f(n.f137636a.getDescriptor(), i, 7);
            throw null;
        }
        this.f137637a = str;
        this.f137638b = str2;
        this.f137639c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f137637a, pVar.f137637a) && Intrinsics.f(this.f137638b, pVar.f137638b) && Intrinsics.f(this.f137639c, pVar.f137639c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f137637a.hashCode() * 31, 31, this.f137638b);
        zr7.l lVar = this.f137639c;
        return iC + (lVar == null ? 0 : lVar.hashCode());
    }

    public p(String title, String value, zr7.l lVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f137637a = title;
        this.f137638b = value;
        this.f137639c = lVar;
    }
}
