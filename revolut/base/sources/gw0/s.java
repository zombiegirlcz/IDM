package gw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();
    public static final s e = new s(null, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f147255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147257c;
    public final boolean d;

    public s(TextLocalisedClause textLocalisedClause, boolean z, boolean z3, boolean z4) {
        this.f147255a = textLocalisedClause;
        this.f147256b = z;
        this.f147257c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f147255a, sVar.f147255a) && this.f147256b == sVar.f147256b && this.f147257c == sVar.f147257c && this.d == sVar.d;
    }

    public final int hashCode() {
        Clause clause = this.f147255a;
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f147256b), 31, this.f147257c);
    }
}
