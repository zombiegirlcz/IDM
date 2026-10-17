package gwi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class v3 {

    @NotNull
    public static final u3 Companion = new u3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4 f147540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147541c;
    public final String d;

    public /* synthetic */ v3(int i, String str, b4 b4Var, boolean z, String str2) {
        if (11 != (i & 11)) {
            qlm.j1.f(t3.f147523a.getDescriptor(), i, 11);
            throw null;
        }
        this.f147539a = str;
        this.f147540b = b4Var;
        if ((i & 4) == 0) {
            this.f147541c = false;
        } else {
            this.f147541c = z;
        }
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.f147539a, v3Var.f147539a) && Intrinsics.f(this.f147540b, v3Var.f147540b) && this.f147541c == v3Var.f147541c && Intrinsics.f(this.d, v3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c((this.f147540b.hashCode() + (this.f147539a.hashCode() * 31)) * 31, 31, this.f147541c);
    }

    public v3(String documentId, b4 modal, boolean z, String acceptanceRule) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(modal, "modal");
        Intrinsics.checkNotNullParameter(acceptanceRule, "acceptanceRule");
        this.f147539a = documentId;
        this.f147540b = modal;
        this.f147541c = z;
        this.d = acceptanceRule;
    }
}
