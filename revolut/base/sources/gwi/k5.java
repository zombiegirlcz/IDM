package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class k5 {

    @NotNull
    public static final j5 Companion = new j5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147445c;

    public /* synthetic */ k5(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(i5.f147426a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147443a = str;
        this.f147444b = str2;
        this.f147445c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj2;
        return Intrinsics.f(this.f147443a, k5Var.f147443a) && Intrinsics.f(this.f147444b, k5Var.f147444b) && Intrinsics.f(this.f147445c, k5Var.f147445c);
    }

    public final int hashCode() {
        int iHashCode = this.f147443a.hashCode() * 31;
        String str = this.f147444b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147445c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public k5(String type, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f147443a = type;
        this.f147444b = str;
        this.f147445c = str2;
    }
}
