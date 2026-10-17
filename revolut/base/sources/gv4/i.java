package gv4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f147053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f147054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147055c;

    public i(aim.e items, TextLocalisedClause title, TextLocalisedClause secondDescription) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f147053a = title;
        this.f147054b = secondDescription;
        this.f147055c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f147055c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f147053a.equals(iVar.f147053a) && this.f147054b.equals(iVar.f147054b) && Intrinsics.f(this.f147055c, iVar.f147055c);
    }

    public final int hashCode() {
        return this.f147055c.hashCode() + t61.a.a(this.f147053a.hashCode() * 31, 31, this.f147054b);
    }
}
