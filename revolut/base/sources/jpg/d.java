package jpg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f177274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f177275b;

    public d(a addMoneyTarget, TextLocalisedClause message) {
        Intrinsics.checkNotNullParameter(addMoneyTarget, "addMoneyTarget");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f177274a = addMoneyTarget;
        this.f177275b = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f177274a.equals(dVar.f177274a) && this.f177275b.equals(dVar.f177275b);
    }

    public final int hashCode() {
        return this.f177275b.hashCode() + (this.f177274a.f177272a.hashCode() * 31);
    }
}
