package yra;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f316173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f316174b;

    public i(TextLocalisedClause submitButtonClause, boolean z) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f316173a = submitButtonClause;
        this.f316174b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f316173a.equals(iVar.f316173a) && this.f316174b == iVar.f316174b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f316174b) + (this.f316173a.hashCode() * 31);
    }
}
