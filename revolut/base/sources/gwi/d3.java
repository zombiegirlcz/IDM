package gwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class d3 {

    @NotNull
    public static final c3 Companion = new c3();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new gvi.b(21)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f147371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147373c;
    public final int d;
    public final int e;

    public /* synthetic */ d3(int i, jo3.a aVar, String str, List list, int i2, int i3) {
        if (31 != (i & 31)) {
            qlm.j1.f(b3.f147349a.getDescriptor(), i, 31);
            throw null;
        }
        this.f147371a = aVar;
        this.f147372b = str;
        this.f147373c = list;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f147371a, d3Var.f147371a) && Intrinsics.f(this.f147372b, d3Var.f147372b) && Intrinsics.f(this.f147373c, d3Var.f147373c) && this.d == d3Var.d && this.e == d3Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f147371a.hashCode() * 31;
        String str = this.f147372b;
        return Integer.hashCode(this.e) + j6.a.b(this.d, p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f147373c), 31);
    }

    public d3(jo3.a passPrice, String str, ArrayList quotes, int i, int i2) {
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        this.f147371a = passPrice;
        this.f147372b = str;
        this.f147373c = quotes;
        this.d = i;
        this.e = i2;
    }
}
