package rbk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f253142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f253143b;

    public a(int i, TextLocalisedClause message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f253142a = i;
        this.f253143b = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f253142a == aVar.f253142a && this.f253143b.equals(aVar.f253143b);
    }

    public final int hashCode() {
        return this.f253143b.hashCode() + (Integer.hashCode(this.f253142a) * 31);
    }
}
