package nml;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f217382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217383b;

    public j(TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f217382a = text;
        this.f217383b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f217382a.equals(jVar.f217382a) && this.f217383b == jVar.f217383b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217383b) + (this.f217382a.hashCode() * 31);
    }
}
