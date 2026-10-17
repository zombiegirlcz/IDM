package ft7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f137956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137957b;

    public a(TextLocalisedClause text, String value) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f137956a = text;
        this.f137957b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f137956a.equals(aVar.f137956a) && Intrinsics.f(this.f137957b, aVar.f137957b);
    }

    public final int hashCode() {
        return this.f137957b.hashCode() + (this.f137956a.hashCode() * 31);
    }
}
