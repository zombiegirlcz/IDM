package qgb;

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
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new qba.c(21)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f245742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f245743c;
    public final h d;

    public /* synthetic */ i(int i, String str, List list, e eVar, h hVar) {
        if (3 != (i & 3)) {
            j1.f(a.f245724a.getDescriptor(), i, 3);
            throw null;
        }
        this.f245741a = str;
        this.f245742b = list;
        if ((i & 4) == 0) {
            this.f245743c = null;
        } else {
            this.f245743c = eVar;
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
        return Intrinsics.f(this.f245741a, iVar.f245741a) && Intrinsics.f(this.f245742b, iVar.f245742b) && Intrinsics.f(this.f245743c, iVar.f245743c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f245741a.hashCode() * 31, 31, this.f245742b);
        e eVar = this.f245743c;
        int iHashCode = (iD + (eVar == null ? 0 : Boolean.hashCode(eVar.f245731a))) * 31;
        h hVar = this.d;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public i(String status, ArrayList rewards, e eVar, h hVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f245741a = status;
        this.f245742b = rewards;
        this.f245743c = eVar;
        this.d = hVar;
    }
}
