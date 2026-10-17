package gw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f147252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f147253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f147254c;
    public final boolean d;

    public p(Clause primaryText, Clause clause, Image image, boolean z) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        this.f147252a = primaryText;
        this.f147253b = clause;
        this.f147254c = image;
        this.d = z;
    }

    @Override // gw0.q
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f147252a, pVar.f147252a) && Intrinsics.f(this.f147253b, pVar.f147253b) && Intrinsics.f(this.f147254c, pVar.f147254c) && this.d == pVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f147252a.hashCode() * 31;
        Clause clause = this.f147253b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f147254c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31);
    }
}
