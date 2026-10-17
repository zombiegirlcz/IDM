package gwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class n4 {

    @NotNull
    public static final m4 Companion = new m4();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gvi.b(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147478c;

    public /* synthetic */ n4(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(l4.f147452a.getDescriptor(), i, 7);
            throw null;
        }
        this.f147476a = str;
        this.f147477b = str2;
        this.f147478c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f147476a, n4Var.f147476a) && Intrinsics.f(this.f147477b, n4Var.f147477b) && Intrinsics.f(this.f147478c, n4Var.f147478c);
    }

    public final int hashCode() {
        return this.f147478c.hashCode() + p.a.c(this.f147476a.hashCode() * 31, 31, this.f147477b);
    }

    public n4(String label, String queryParam, ArrayList values) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f147476a = label;
        this.f147477b = queryParam;
        this.f147478c = values;
    }
}
