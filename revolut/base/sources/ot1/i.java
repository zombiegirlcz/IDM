package ot1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f229403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f229404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f229405c;

    public i(List items, a aVar, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f229403a = items;
        this.f229404b = aVar;
        this.f229405c = title;
    }

    @Override // jki.n
    public final List c() {
        return this.f229403a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f229403a, iVar.f229403a) && this.f229404b.equals(iVar.f229404b) && this.f229405c.equals(iVar.f229405c);
    }

    public final int hashCode() {
        return this.f229405c.hashCode() + ((this.f229404b.hashCode() + (this.f229403a.hashCode() * 31)) * 31);
    }
}
