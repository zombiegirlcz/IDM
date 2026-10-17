package gv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f147051b;

    public f(List interests, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(interests, "interests");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f147050a = interests;
        this.f147051b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f147050a, fVar.f147050a) && Intrinsics.f(this.f147051b, fVar.f147051b);
    }

    public final int hashCode() {
        return this.f147051b.f297794a.hashCode() + (this.f147050a.hashCode() * 31);
    }
}
