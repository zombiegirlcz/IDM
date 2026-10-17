package xs4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f308397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f308398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f308399c;

    public i(TextLocalisedClause textLocalisedClause, boolean z, boolean z3) {
        this.f308397a = textLocalisedClause;
        this.f308398b = z;
        this.f308399c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f308397a, iVar.f308397a) && this.f308398b == iVar.f308398b && this.f308399c == iVar.f308399c;
    }

    public final int hashCode() {
        Clause clause = this.f308397a;
        return Boolean.hashCode(this.f308399c) + j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f308398b);
    }
}
