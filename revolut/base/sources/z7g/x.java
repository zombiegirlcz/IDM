package z7g;

import ip0.v7;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new z1i.a(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f320003c;
    public final jo3.a d;
    public final Map e;

    public /* synthetic */ x(int i, String str, String str2, jo3.a aVar, jo3.a aVar2, Map map) {
        if (5 != (i & 5)) {
            j1.f(v.f320000a.getDescriptor(), i, 5);
            throw null;
        }
        this.f320001a = str;
        if ((i & 2) == 0) {
            this.f320002b = null;
        } else {
            this.f320002b = str2;
        }
        this.f320003c = aVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f320001a, xVar.f320001a) && Intrinsics.f(this.f320002b, xVar.f320002b) && Intrinsics.f(this.f320003c, xVar.f320003c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f320001a.hashCode() * 31;
        String str = this.f320002b;
        int iJ = v7.j(this.f320003c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        jo3.a aVar = this.d;
        int iHashCode2 = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Map map = this.e;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
