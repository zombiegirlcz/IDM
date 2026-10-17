package gyl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class i {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] f = {null, null, null, null, j.c(k.PUBLICATION, new gx2.a(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f147929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f147930c;
    public final String d;
    public final List e;

    public /* synthetic */ i(int i, String str, double d, double d5, String str2, List list) {
        if (31 != (i & 31)) {
            j1.f(d.f147921a.getDescriptor(), i, 31);
            throw null;
        }
        this.f147928a = str;
        this.f147929b = d;
        this.f147930c = d5;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f147928a, iVar.f147928a) && Double.compare(this.f147929b, iVar.f147929b) == 0 && Double.compare(this.f147930c, iVar.f147930c) == 0 && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(m72.b.c(m72.b.c(this.f147928a.hashCode() * 31, this.f147929b, 31), this.f147930c, 31), 31, this.d);
    }

    public i(String id10, double d, double d5, String dotColor, ArrayList labels) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(dotColor, "dotColor");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.f147928a = id10;
        this.f147929b = d;
        this.f147930c = d5;
        this.d = dotColor;
        this.e = labels;
    }
}
