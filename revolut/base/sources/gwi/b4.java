package gwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class b4 {

    @NotNull
    public static final a4 Companion = new a4();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gvi.b(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld7.f f147351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147352c;

    public b4(int i, String str, ld7.f fVar, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(z3.f147578a.getDescriptor(), i, 3);
            throw null;
        }
        this.f147350a = str;
        this.f147351b = fVar;
        if ((i & 4) == 0) {
            this.f147352c = zhm.f0.f322471a;
        } else {
            this.f147352c = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f147350a, b4Var.f147350a) && Intrinsics.f(this.f147351b, b4Var.f147351b) && Intrinsics.f(this.f147352c, b4Var.f147352c);
    }

    public final int hashCode() {
        return this.f147352c.hashCode() + ((this.f147351b.f194043a.hashCode() + (this.f147350a.hashCode() * 31)) * 31);
    }

    public b4(String title, ld7.f description, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f147350a = title;
        this.f147351b = description;
        this.f147352c = items;
    }
}
