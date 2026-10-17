package iw4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f168952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168953b;

    public o(TextLocalisedClause textLocalisedClause, boolean z) {
        this.f168952a = textLocalisedClause;
        this.f168953b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f168952a, oVar.f168952a) && this.f168953b == oVar.f168953b;
    }

    public final int hashCode() {
        Clause clause = this.f168952a;
        return Boolean.hashCode(this.f168953b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
