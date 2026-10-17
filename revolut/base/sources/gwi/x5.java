package gwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class x5 {

    @NotNull
    public static final w5 Companion = new w5();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gvi.b(27)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6 f147562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147564c;
    public final s5 d;

    public /* synthetic */ x5(int i, e6 e6Var, String str, List list, s5 s5Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(v5.f147543a.getDescriptor(), i, 15);
            throw null;
        }
        this.f147562a = e6Var;
        this.f147563b = str;
        this.f147564c = list;
        this.d = s5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj2;
        return Intrinsics.f(this.f147562a, x5Var.f147562a) && Intrinsics.f(this.f147563b, x5Var.f147563b) && Intrinsics.f(this.f147564c, x5Var.f147564c) && Intrinsics.f(this.d, x5Var.d);
    }

    public final int hashCode() {
        e6 e6Var = this.f147562a;
        int iD = p.a.d(p.a.c((e6Var == null ? 0 : e6Var.hashCode()) * 31, 31, this.f147563b), 31, this.f147564c);
        s5 s5Var = this.d;
        return iD + (s5Var != null ? s5Var.hashCode() : 0);
    }

    public x5(e6 e6Var, String imageUrl, ArrayList cells, s5 s5Var) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.f147562a = e6Var;
        this.f147563b = imageUrl;
        this.f147564c = cells;
        this.d = s5Var;
    }
}
