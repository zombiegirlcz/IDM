package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class d5 {

    @NotNull
    public static final c5 Companion = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147375b;

    public /* synthetic */ d5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(b5.f147353a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147374a = str;
        this.f147375b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f147374a, d5Var.f147374a) && Intrinsics.f(this.f147375b, d5Var.f147375b);
    }

    public final int hashCode() {
        return this.f147375b.hashCode() + (this.f147374a.hashCode() * 31);
    }

    public d5(String country, String planName) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(planName, "planName");
        this.f147374a = country;
        this.f147375b = planName;
    }
}
