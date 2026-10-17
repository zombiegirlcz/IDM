package gwi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f147347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147348c;

    public /* synthetic */ b1(int i, String str, String str2, jo3.a aVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(z0.f147574a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147346a = str;
        this.f147347b = aVar;
        this.f147348c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f147346a, b1Var.f147346a) && Intrinsics.f(this.f147347b, b1Var.f147347b) && Intrinsics.f(this.f147348c, b1Var.f147348c);
    }

    public final int hashCode() {
        int iJ = v7.j(this.f147347b, this.f147346a.hashCode() * 31, 31);
        String str = this.f147348c;
        return iJ + (str == null ? 0 : str.hashCode());
    }
}
