package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147369a;

    public /* synthetic */ d0(int i, String str) {
        if (1 == (i & 1)) {
            this.f147369a = str;
        } else {
            qlm.j1.f(b0.f147345a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f147369a, ((d0) obj2).f147369a);
    }

    public final int hashCode() {
        return this.f147369a.hashCode();
    }
}
