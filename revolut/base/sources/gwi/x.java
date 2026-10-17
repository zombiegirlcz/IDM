package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class x {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f147556c;

    public /* synthetic */ x(int i, String str, String str2, w wVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(p.f147486a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147554a = str;
        this.f147555b = str2;
        this.f147556c = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f147554a, xVar.f147554a) && Intrinsics.f(this.f147555b, xVar.f147555b) && Intrinsics.f(this.f147556c, xVar.f147556c);
    }

    public final int hashCode() {
        int iHashCode = this.f147554a.hashCode() * 31;
        String str = this.f147555b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.f147556c;
        return iHashCode2 + (wVar != null ? wVar.hashCode() : 0);
    }
}
