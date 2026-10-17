package qv4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f249527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f249528b;

    public g(f selectedTab, Data content) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f249527a = selectedTab;
        this.f249528b = content;
    }

    public static g a(g gVar, f selectedTab, Data content, int i) {
        if ((i & 1) != 0) {
            selectedTab = gVar.f249527a;
        }
        if ((i & 2) != 0) {
            content = gVar.f249528b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(content, "content");
        return new g(selectedTab, content);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f249527a == gVar.f249527a && Intrinsics.f(this.f249528b, gVar.f249528b);
    }

    public final int hashCode() {
        return this.f249528b.hashCode() + (this.f249527a.hashCode() * 31);
    }
}
