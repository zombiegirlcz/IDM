package fpa;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f137074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f137075b;

    public f(TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f137074a = title;
        this.f137075b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f137074a, fVar.f137074a) && Intrinsics.f(this.f137075b, fVar.f137075b);
    }

    public final int hashCode() {
        return this.f137075b.hashCode() + (this.f137074a.hashCode() * 31);
    }

    public f(TextLocalisedClause textLocalisedClause) {
        this(textLocalisedClause, f0.f322471a);
    }
}
