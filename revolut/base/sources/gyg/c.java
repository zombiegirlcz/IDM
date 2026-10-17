package gyg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f147854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f147855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fzg.e f147856c;
    public final fzg.e d;

    public c(dj0.d value, DateTime time, fzg.e start, fzg.e end2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f147854a = value;
        this.f147855b = time;
        this.f147856c = start;
        this.d = end2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f147854a, cVar.f147854a) && Intrinsics.f(this.f147855b, cVar.f147855b) && Intrinsics.f(this.f147856c, cVar.f147856c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f147856c.hashCode() + m72.b.f(this.f147855b, this.f147854a.hashCode() * 31, 31)) * 31);
    }
}
