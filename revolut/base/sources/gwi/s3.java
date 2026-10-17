package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class s3 {

    @NotNull
    public static final r3 Companion = new r3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147514a;

    public /* synthetic */ s3(int i, String str) {
        if (1 == (i & 1)) {
            this.f147514a = str;
        } else {
            qlm.j1.f(q3.f147500a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s3) && Intrinsics.f(this.f147514a, ((s3) obj2).f147514a);
    }

    public final int hashCode() {
        return this.f147514a.hashCode();
    }

    public s3(String loungeId) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        this.f147514a = loungeId;
    }
}
