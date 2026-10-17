package gwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class a6 {

    @NotNull
    public static final z5 Companion = new z5();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new gvi.b(28)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s5 f147344c;

    public /* synthetic */ a6(int i, String str, List list, s5 s5Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(y5.f147573a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147342a = str;
        this.f147343b = list;
        this.f147344c = s5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj2;
        return Intrinsics.f(this.f147342a, a6Var.f147342a) && Intrinsics.f(this.f147343b, a6Var.f147343b) && Intrinsics.f(this.f147344c, a6Var.f147344c);
    }

    public final int hashCode() {
        return this.f147344c.hashCode() + p.a.d(this.f147342a.hashCode() * 31, 31, this.f147343b);
    }

    public a6(String title, ArrayList cells, s5 footer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f147342a = title;
        this.f147343b = cells;
        this.f147344c = footer;
    }
}
