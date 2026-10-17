package nhl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new s(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f215520c;
    public final List d;

    public /* synthetic */ e0(int i, String str, String str2, g gVar, List list) {
        if (1 != (i & 1)) {
            j1.f(c0.f215513a.getDescriptor(), i, 1);
            throw null;
        }
        this.f215518a = str;
        if ((i & 2) == 0) {
            this.f215519b = null;
        } else {
            this.f215519b = str2;
        }
        if ((i & 4) == 0) {
            this.f215520c = null;
        } else {
            this.f215520c = gVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f215518a, e0Var.f215518a) && Intrinsics.f(this.f215519b, e0Var.f215519b) && Intrinsics.f(this.f215520c, e0Var.f215520c) && Intrinsics.f(this.d, e0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f215518a.hashCode() * 31;
        String str = this.f215519b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        g gVar = this.f215520c;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public e0(String ref2, String str, g gVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f215518a = ref2;
        this.f215519b = str;
        this.f215520c = gVar;
        this.d = arrayList;
    }
}
