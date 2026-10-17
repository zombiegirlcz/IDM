package jb0;

import com.revolut.core.backend_flow.impl.ui.base_form_screen.FormScreenSaveStateDelegate;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements ya0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormScreen f172537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk0.g f172539c;

    public d(FormScreen screen, String searchQuery, lk0.g gVar) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f172537a = screen;
        this.f172538b = searchQuery;
        this.f172539c = gVar;
    }

    public static d a(d dVar, FormScreen screen, String searchQuery, lk0.g gVar, int i) {
        if ((i & 1) != 0) {
            screen = dVar.f172537a;
        }
        if ((i & 2) != 0) {
            searchQuery = dVar.f172538b;
        }
        if ((i & 4) != 0) {
            gVar = dVar.f172539c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new d(screen, searchQuery, gVar);
    }

    @Override // ya0.a
    public final BackendScreen b() {
        return this.f172537a;
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
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f172537a, dVar.f172537a) && Intrinsics.f(this.f172538b, dVar.f172538b) && Intrinsics.f(this.f172539c, dVar.f172539c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f172537a.hashCode() * 31, 31, this.f172538b);
        lk0.g gVar = this.f172539c;
        return iC + (gVar == null ? 0 : gVar.f196174a.hashCode());
    }

    @Override // ya0.a
    /* JADX INFO: renamed from: j */
    public final String getF51258b() {
        return this.f172538b;
    }
}
