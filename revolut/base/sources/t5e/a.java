package t5e;

import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$Page;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f268056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f268057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268058c;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data data, String selectedPagerItemId, int i) {
        if ((i & 1) != 0) {
            data = aVar.f268056a;
        }
        List pagerItems = aVar.f268057b;
        if ((i & 4) != 0) {
            selectedPagerItemId = aVar.f268058c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        return new a(data, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f268057b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f268056a, aVar.f268056a) && Intrinsics.f(this.f268057b, aVar.f268057b) && Intrinsics.f(this.f268058c, aVar.f268058c);
    }

    public final int hashCode() {
        Data data = this.f268056a;
        return this.f268058c.hashCode() + p.a.d((data == null ? 0 : data.hashCode()) * 31, 31, this.f268057b);
    }

    @Override // oki.a
    public final String z() {
        return this.f268058c;
    }

    public a(Data data, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        this.f268056a = data;
        this.f268057b = pagerItems;
        this.f268058c = selectedPagerItemId;
    }

    public /* synthetic */ a(int i) {
        this(null, PerformanceTrackerFlowContract$Page.UNDERLYING_ASSETS.getF89793a(), PerformanceTrackerFlowContract$Page.a());
    }
}
