package xed;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f304620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f304621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f304622c;

    public i(TextLocalisedClause navBarTitle, TextLocalisedClause navBarDescription, ArrayList items) {
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304620a = navBarTitle;
        this.f304621b = navBarDescription;
        this.f304622c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f304622c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f304620a.equals(iVar.f304620a) && this.f304621b.equals(iVar.f304621b) && this.f304622c.equals(iVar.f304622c);
    }

    public final int hashCode() {
        return this.f304622c.hashCode() + t61.a.a(this.f304620a.hashCode() * 31, 31, this.f304621b);
    }
}
