package gvl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f147226a;

    public m(TextLocalisedClause titleClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f147226a = titleClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f147226a.equals(((m) obj2).f147226a);
    }

    public final int hashCode() {
        return this.f147226a.hashCode();
    }
}
