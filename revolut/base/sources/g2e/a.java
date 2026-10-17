package g2e;

import com.revolut.feature.store.api.model.StoreMegaFilterSelection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f139972b;

    public a() {
        this(0);
    }

    public static a a(List activeQuickFilterIds, List modalSelection) {
        Intrinsics.checkNotNullParameter(activeQuickFilterIds, "activeQuickFilterIds");
        Intrinsics.checkNotNullParameter(modalSelection, "modalSelection");
        return new a(activeQuickFilterIds, modalSelection);
    }

    public final boolean b() {
        if (!this.f139971a.isEmpty()) {
            return false;
        }
        List list = this.f139972b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (!((StoreMegaFilterSelection) it8.next()).f88544b.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f139971a, aVar.f139971a) && Intrinsics.f(this.f139972b, aVar.f139972b);
    }

    public final int hashCode() {
        return this.f139972b.hashCode() + (this.f139971a.hashCode() * 31);
    }

    public a(List activeQuickFilterIds, List modalSelection) {
        Intrinsics.checkNotNullParameter(activeQuickFilterIds, "activeQuickFilterIds");
        Intrinsics.checkNotNullParameter(modalSelection, "modalSelection");
        this.f139971a = activeQuickFilterIds;
        this.f139972b = modalSelection;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i) {
        zhm.f0 f0Var = zhm.f0.f322471a;
        this(f0Var, f0Var);
    }
}
