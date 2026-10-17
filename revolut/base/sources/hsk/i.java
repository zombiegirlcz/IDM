package hsk;

import android.os.Parcelable;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.detailed_stats.DetailedStatsNavigationId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f155079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentNavigateCommand f155080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155081c;

    public i(DetailedStatsNavigationId id10, FragmentNavigateCommand navigationCommand, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(navigationCommand, "navigationCommand");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f155079a = id10;
        this.f155080b = navigationCommand;
        this.f155081c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f155079a, iVar.f155079a) && Intrinsics.f(this.f155080b, iVar.f155080b) && Intrinsics.f(this.f155081c, iVar.f155081c);
    }

    public final int hashCode() {
        return this.f155081c.hashCode() + ((this.f155080b.hashCode() + (this.f155079a.hashCode() * 31)) * 31);
    }
}
