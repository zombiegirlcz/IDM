package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147447b;

    public /* synthetic */ l(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(j.f147427a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147446a = str;
        this.f147447b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f147446a, lVar.f147446a) && Intrinsics.f(this.f147447b, lVar.f147447b);
    }

    public final int hashCode() {
        String str = this.f147446a;
        return this.f147447b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
