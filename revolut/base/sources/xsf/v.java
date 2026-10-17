package xsf;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f308483a;

    public v(TextClause errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f308483a = errorMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f308483a.equals(((v) obj2).f308483a);
    }

    public final int hashCode() {
        return this.f308483a.hashCode();
    }
}
