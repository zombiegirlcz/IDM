package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class a5 {

    @NotNull
    public static final z4 Companion = new z4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ld7.c f147339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld7.c f147340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ld7.c f147341c;
    public final ld7.c d;
    public final ld7.c e;

    public /* synthetic */ a5(int i, ld7.c cVar, ld7.c cVar2, ld7.c cVar3, ld7.c cVar4, ld7.c cVar5) {
        if (1 != (i & 1)) {
            qlm.j1.f(y4.f147572a.getDescriptor(), i, 1);
            throw null;
        }
        this.f147339a = cVar;
        if ((i & 2) == 0) {
            this.f147340b = null;
        } else {
            this.f147340b = cVar2;
        }
        if ((i & 4) == 0) {
            this.f147341c = null;
        } else {
            this.f147341c = cVar3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = cVar5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj2;
        return Intrinsics.f(this.f147339a, a5Var.f147339a) && Intrinsics.f(this.f147340b, a5Var.f147340b) && Intrinsics.f(this.f147341c, a5Var.f147341c) && Intrinsics.f(this.d, a5Var.d) && Intrinsics.f(this.e, a5Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f147339a.hashCode() * 31;
        ld7.c cVar = this.f147340b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        ld7.c cVar2 = this.f147341c;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        ld7.c cVar3 = this.d;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        ld7.c cVar4 = this.e;
        return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    public a5(ld7.c content, ld7.c cVar, ld7.c cVar2, ld7.c cVar3, ld7.c cVar4) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f147339a = content;
        this.f147340b = cVar;
        this.f147341c = cVar2;
        this.d = cVar3;
        this.e = cVar4;
    }
}
