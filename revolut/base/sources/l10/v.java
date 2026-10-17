package l10;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagViewData f191404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n10.b f191405c;
    public final ArrayList d;

    public v(List items, TagViewData navBarTag, n10.b selectedCardType, ArrayList navBarMenuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTag, "navBarTag");
        Intrinsics.checkNotNullParameter(selectedCardType, "selectedCardType");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        this.f191403a = items;
        this.f191404b = navBarTag;
        this.f191405c = selectedCardType;
        this.d = navBarMenuItems;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof v)) {
            return null;
        }
        return new u(!r6.f191404b.equals(this.f191404b), ((v) oldState).f191405c != this.f191405c, !r6.d.equals(this.d));
    }

    @Override // cli.p
    public final List c() {
        return this.f191403a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f191403a, vVar.f191403a) && this.f191404b.equals(vVar.f191404b) && this.f191405c == vVar.f191405c && this.d.equals(vVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f191405c.hashCode() + ((this.f191404b.hashCode() + (this.f191403a.hashCode() * 31)) * 31)) * 31);
    }
}
