package igb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new i83.b(29)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f161136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f161137c;
    public final h d;

    public /* synthetic */ i(int i, String str, List list, e eVar, h hVar) {
        if (3 != (i & 3)) {
            j1.f(a.f161114a.getDescriptor(), i, 3);
            throw null;
        }
        this.f161135a = str;
        this.f161136b = list;
        if ((i & 4) == 0) {
            this.f161137c = null;
        } else {
            this.f161137c = eVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f161135a, iVar.f161135a) && Intrinsics.f(this.f161136b, iVar.f161136b) && Intrinsics.f(this.f161137c, iVar.f161137c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f161135a.hashCode() * 31, 31, this.f161136b);
        e eVar = this.f161137c;
        int iHashCode = (iD + (eVar == null ? 0 : Boolean.hashCode(eVar.f161120a))) * 31;
        h hVar = this.d;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public i(String status, ArrayList rewards, e eVar, h hVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f161135a = status;
        this.f161136b = rewards;
        this.f161137c = eVar;
        this.d = hVar;
    }
}
