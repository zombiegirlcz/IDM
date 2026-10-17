package gw0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f147258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147259b;

    public u(TagViewData tagData, boolean z) {
        Intrinsics.checkNotNullParameter(tagData, "tagData");
        this.f147258a = tagData;
        this.f147259b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f147258a, uVar.f147258a) && this.f147259b == uVar.f147259b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147259b) + (this.f147258a.hashCode() * 31);
    }
}
