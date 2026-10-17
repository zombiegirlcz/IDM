package ip0;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f164568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f164569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f164570c;
    public final float d;

    public hk(TextLocalisedClause title, MoneyClause subtitle, int i, float f) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f164568a = title;
        this.f164569b = subtitle;
        this.f164570c = i;
        this.d = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hk)) {
            return false;
        }
        hk hkVar = (hk) obj2;
        return this.f164568a.equals(hkVar.f164568a) && this.f164569b.equals(hkVar.f164569b) && this.f164570c == hkVar.f164570c && Float.compare(this.d, hkVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + j6.a.b(this.f164570c, v7.a(this.f164568a.hashCode() * 31, 31, this.f164569b), 31);
    }
}
