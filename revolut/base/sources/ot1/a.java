package ot1;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f229381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f229382b;

    public a(Clause submitButtonClause, boolean z) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f229381a = submitButtonClause;
        this.f229382b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f229381a.equals(aVar.f229381a) && this.f229382b == aVar.f229382b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229382b) + (this.f229381a.hashCode() * 31);
    }
}
