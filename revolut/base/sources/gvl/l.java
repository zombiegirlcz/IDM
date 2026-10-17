package gvl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f147225a;

    public l(TextLocalisedClause textClause) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        this.f147225a = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f147225a.equals(((l) obj2).f147225a);
    }

    public final int hashCode() {
        return this.f147225a.hashCode();
    }
}
