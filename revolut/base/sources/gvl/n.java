package gvl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f147227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f147229c;

    public n(m toolbar, List items, l nextButton) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.f147227a = toolbar;
        this.f147228b = items;
        this.f147229c = nextButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f147228b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f147227a, nVar.f147227a) && Intrinsics.f(this.f147228b, nVar.f147228b) && Intrinsics.f(this.f147229c, nVar.f147229c);
    }

    public final int hashCode() {
        return this.f147229c.f147225a.hashCode() + p.a.d(this.f147227a.f147226a.hashCode() * 31, 31, this.f147228b);
    }
}
