package ft4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f137920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f137921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137922c;

    public m() {
        this(0);
    }

    public static m a(m mVar, Data tabsContent, h selectedTab, String searchQuery, int i) {
        if ((i & 1) != 0) {
            tabsContent = mVar.f137920a;
        }
        if ((i & 2) != 0) {
            selectedTab = mVar.f137921b;
        }
        if ((i & 4) != 0) {
            searchQuery = mVar.f137922c;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(tabsContent, "tabsContent");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new m(tabsContent, selectedTab, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f137920a, mVar.f137920a) && this.f137921b == mVar.f137921b && Intrinsics.f(this.f137922c, mVar.f137922c);
    }

    public final int hashCode() {
        return this.f137922c.hashCode() + ((this.f137921b.hashCode() + (this.f137920a.hashCode() * 31)) * 31);
    }

    public m(Data tabsContent, h selectedTab, String searchQuery) {
        Intrinsics.checkNotNullParameter(tabsContent, "tabsContent");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f137920a = tabsContent;
        this.f137921b = selectedTab;
        this.f137922c = searchQuery;
    }

    public /* synthetic */ m(int i) {
        this(new Data(null, null, true, 3, null), h.CREDIT, "");
    }
}
