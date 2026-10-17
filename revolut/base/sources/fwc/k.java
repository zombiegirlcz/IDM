package fwc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f138608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138609b;

    public k(TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f138608a = title;
        this.f138609b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f138608a.equals(kVar.f138608a) && Intrinsics.f(this.f138609b, kVar.f138609b);
    }

    public final int hashCode() {
        return this.f138609b.hashCode() + (this.f138608a.hashCode() * 31);
    }
}
