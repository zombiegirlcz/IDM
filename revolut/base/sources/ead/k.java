package ead;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f124201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f124202c;
    public final String d;

    public k(List items, TextLocalisedClause title, List tabs, String selectedTabId) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f124200a = items;
        this.f124201b = title;
        this.f124202c = tabs;
        this.d = selectedTabId;
    }

    @Override // cli.p
    public final List c() {
        return this.f124200a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f124200a, kVar.f124200a) && this.f124201b.equals(kVar.f124201b) && Intrinsics.f(this.f124202c, kVar.f124202c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(t61.a.a(this.f124200a.hashCode() * 31, 31, this.f124201b), 31, this.f124202c);
    }
}
