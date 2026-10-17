package j29;

import j1f.q0;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f170771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170772c;

    public /* synthetic */ w(int i, String str, jo3.a aVar, List list) {
        if (7 != (i & 7)) {
            j1.f(u.f170769a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170770a = str;
        this.f170771b = aVar;
        this.f170772c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f170770a, wVar.f170770a) && Intrinsics.f(this.f170771b, wVar.f170771b) && Intrinsics.f(this.f170772c, wVar.f170772c);
    }

    public final int hashCode() {
        int iHashCode = this.f170770a.hashCode() * 31;
        jo3.a aVar = this.f170771b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f170772c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
