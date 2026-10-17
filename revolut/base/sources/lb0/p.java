package lb0;

import com.revolut.core.backend_flow.impl.ui.base_form_screen.FormScreenSaveStateDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements ya0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormScreen f193546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f193548c;

    public p(FormScreen screen, String searchQuery, Data preloadingItems) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(preloadingItems, "preloadingItems");
        this.f193546a = screen;
        this.f193547b = searchQuery;
        this.f193548c = preloadingItems;
    }

    public static p a(p pVar, FormScreen screen, String searchQuery, Data preloadingItems, int i) {
        if ((i & 1) != 0) {
            screen = pVar.f193546a;
        }
        if ((i & 2) != 0) {
            searchQuery = pVar.f193547b;
        }
        if ((i & 4) != 0) {
            preloadingItems = pVar.f193548c;
        }
        pVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(preloadingItems, "preloadingItems");
        return new p(screen, searchQuery, preloadingItems);
    }

    @Override // ya0.a
    public final BackendScreen b() {
        return this.f193546a;
    }

    @Override // ya0.a
    public final ya0.a c0(FormScreenSaveStateDelegate.RetainedBackendScreenDomainState updatedState) {
        Intrinsics.checkNotNullParameter(updatedState, "updatedState");
        return a(this, updatedState.f51257a, updatedState.f51258b, null, 4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f193546a, pVar.f193546a) && Intrinsics.f(this.f193547b, pVar.f193547b) && Intrinsics.f(this.f193548c, pVar.f193548c);
    }

    public final int hashCode() {
        return this.f193548c.hashCode() + p.a.c(this.f193546a.hashCode() * 31, 31, this.f193547b);
    }

    @Override // ya0.a
    /* JADX INFO: renamed from: j */
    public final String getF51258b() {
        return this.f193547b;
    }
}
