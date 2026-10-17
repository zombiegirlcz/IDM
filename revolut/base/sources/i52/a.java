package i52;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f158542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f158543b;

    public a(Clause submitButtonClause, boolean z) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f158542a = submitButtonClause;
        this.f158543b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f158542a.equals(aVar.f158542a) && this.f158543b == aVar.f158543b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158543b) + (this.f158542a.hashCode() * 31);
    }
}
