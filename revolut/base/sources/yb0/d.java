package yb0;

import com.revolut.core.backend_flow.impl.ui.base_form_screen.FormScreenSaveStateDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements ya0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormScreen f312143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f312145c;
    public final lk0.g d;

    public d(FormScreen screen, String searchQuery, Data syncPreselectedTransactionsData, lk0.g gVar) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(syncPreselectedTransactionsData, "syncPreselectedTransactionsData");
        this.f312143a = screen;
        this.f312144b = searchQuery;
        this.f312145c = syncPreselectedTransactionsData;
        this.d = gVar;
    }

    public static d a(d dVar, FormScreen screen, String searchQuery, Data syncPreselectedTransactionsData, lk0.g gVar, int i) {
        if ((i & 1) != 0) {
            screen = dVar.f312143a;
        }
        if ((i & 2) != 0) {
            searchQuery = dVar.f312144b;
        }
        if ((i & 4) != 0) {
            syncPreselectedTransactionsData = dVar.f312145c;
        }
        if ((i & 8) != 0) {
            gVar = dVar.d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(syncPreselectedTransactionsData, "syncPreselectedTransactionsData");
        return new d(screen, searchQuery, syncPreselectedTransactionsData, gVar);
    }

    @Override // ya0.a
    public final BackendScreen b() {
        return this.f312143a;
    }

    @Override // ya0.a
    public final ya0.a c0(FormScreenSaveStateDelegate.RetainedBackendScreenDomainState updatedState) {
        Intrinsics.checkNotNullParameter(updatedState, "updatedState");
        return a(this, updatedState.f51257a, updatedState.f51258b, null, null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f312143a, dVar.f312143a) && Intrinsics.f(this.f312144b, dVar.f312144b) && Intrinsics.f(this.f312145c, dVar.f312145c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f312145c, p.a.c(this.f312143a.hashCode() * 31, 31, this.f312144b), 31);
        lk0.g gVar = this.d;
        return iC + (gVar == null ? 0 : gVar.f196174a.hashCode());
    }

    @Override // ya0.a
    /* JADX INFO: renamed from: j */
    public final String getF51258b() {
        return this.f312144b;
    }
}
