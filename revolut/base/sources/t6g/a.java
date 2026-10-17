package t6g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f268343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f268344b;

    public a(TextLocalisedClause title, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f268343a = title;
        this.f268344b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f268343a.equals(aVar.f268343a) && this.f268344b.equals(aVar.f268344b);
    }

    public final int hashCode() {
        return this.f268344b.hashCode() + (this.f268343a.hashCode() * 31);
    }
}
