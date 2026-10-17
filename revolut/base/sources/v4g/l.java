package v4g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f286084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f286085b;

    public l(TextLocalisedClause message, TextLocalisedClause retry) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(retry, "retry");
        this.f286084a = message;
        this.f286085b = retry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f286084a.equals(lVar.f286084a) && this.f286085b.equals(lVar.f286085b);
    }

    public final int hashCode() {
        return this.f286085b.hashCode() + (this.f286084a.hashCode() * 31);
    }
}
