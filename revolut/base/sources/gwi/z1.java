package gwi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class z1 {

    @NotNull
    public static final y1 Companion = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f147576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147577c;

    public /* synthetic */ z1(int i, String str, String str2, jo3.a aVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(x1.f147557a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147575a = str;
        this.f147576b = aVar;
        this.f147577c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.f147575a, z1Var.f147575a) && Intrinsics.f(this.f147576b, z1Var.f147576b) && Intrinsics.f(this.f147577c, z1Var.f147577c);
    }

    public final int hashCode() {
        return this.f147577c.hashCode() + v7.j(this.f147576b, this.f147575a.hashCode() * 31, 31);
    }

    public z1(String token, String points, jo3.a monetaryAmount) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(monetaryAmount, "monetaryAmount");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f147575a = token;
        this.f147576b = monetaryAmount;
        this.f147577c = points;
    }
}
