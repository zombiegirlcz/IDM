package bta;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class z {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] i = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new br4.e(20)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18512c;
    public final p d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f18513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f18514h;

    public /* synthetic */ z(int i2, String str, String str2, String str3, p pVar, List list, String str4, v vVar, y yVar) {
        if (255 != (i2 & 255)) {
            j1.f(l.f18494a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f18510a = str;
        this.f18511b = str2;
        this.f18512c = str3;
        this.d = pVar;
        this.e = list;
        this.f = str4;
        this.f18513g = vVar;
        this.f18514h = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f18510a, zVar.f18510a) && Intrinsics.f(this.f18511b, zVar.f18511b) && Intrinsics.f(this.f18512c, zVar.f18512c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f18513g, zVar.f18513g) && Intrinsics.f(this.f18514h, zVar.f18514h);
    }

    public final int hashCode() {
        int iD = p.a.d((this.d.hashCode() + p.a.c(p.a.c(this.f18510a.hashCode() * 31, 31, this.f18511b), 31, this.f18512c)) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        v vVar = this.f18513g;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        y yVar = this.f18514h;
        return iHashCode2 + (yVar != null ? yVar.hashCode() : 0);
    }
}
