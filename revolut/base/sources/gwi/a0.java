package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147334b;

    public /* synthetic */ a0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(y.f147565a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147333a = str;
        this.f147334b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f147333a, a0Var.f147333a) && Intrinsics.f(this.f147334b, a0Var.f147334b);
    }

    public final int hashCode() {
        return this.f147334b.hashCode() + (this.f147333a.hashCode() * 31);
    }

    public a0(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f147333a = firstName;
        this.f147334b = lastName;
    }
}
