package pwk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.utils.TabNavigationId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabNavigationId f240486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentNavigateCommand f240487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f240488c;

    public a(TabNavigationId id10, FragmentNavigateCommand navigationCommand, Clause name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(navigationCommand, "navigationCommand");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f240486a = id10;
        this.f240487b = navigationCommand;
        this.f240488c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f240486a.equals(aVar.f240486a) && this.f240487b.equals(aVar.f240487b) && this.f240488c.equals(aVar.f240488c);
    }

    public final int hashCode() {
        return this.f240488c.hashCode() + ((this.f240487b.hashCode() + (this.f240486a.f104064a.hashCode() * 31)) * 31);
    }
}
