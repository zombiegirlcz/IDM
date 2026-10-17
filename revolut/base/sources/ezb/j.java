package ezb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f130925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f130926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f130927c;

    public j(ArrayList items, List tabItems, i selectedTab) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f130925a = items;
        this.f130926b = tabItems;
        this.f130927c = selectedTab;
    }

    @Override // cli.p
    public final List c() {
        return this.f130925a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f130925a.equals(jVar.f130925a) && Intrinsics.f(this.f130926b, jVar.f130926b) && this.f130927c == jVar.f130927c;
    }

    public final int hashCode() {
        return this.f130927c.hashCode() + p.a.d(this.f130925a.hashCode() * 31, 31, this.f130926b);
    }
}
