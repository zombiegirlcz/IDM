package gwi;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gvi.b(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f147551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147552c;

    public /* synthetic */ w1(int i, String str, jo3.a aVar, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(u1.f147528a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147550a = str;
        this.f147551b = aVar;
        this.f147552c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f147550a, w1Var.f147550a) && Intrinsics.f(this.f147551b, w1Var.f147551b) && Intrinsics.f(this.f147552c, w1Var.f147552c);
    }

    public final int hashCode() {
        return this.f147552c.hashCode() + v7.j(this.f147551b, this.f147550a.hashCode() * 31, 31);
    }

    public w1(String token, jo3.a originalPrice, ArrayList pointsOptions) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        this.f147550a = token;
        this.f147551b = originalPrice;
        this.f147552c = pointsOptions;
    }
}
