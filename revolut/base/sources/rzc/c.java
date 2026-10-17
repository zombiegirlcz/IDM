package rzc;

import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements com.revolut.feature.chooser.c, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final td0.b f258588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.chooser.a f258589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f258590c;

    public c(td0.b currencySetsProvider, com.revolut.feature.chooser.a chooserPresentationModel) {
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        Intrinsics.checkNotNullParameter(chooserPresentationModel, "chooserPresentationModel");
        this.f258588a = currencySetsProvider;
        this.f258589b = chooserPresentationModel;
        this.f258590c = j6.a.h("create(...)");
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b H0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.f258589b.H0(query);
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 N2() {
        return this.f258589b.N2();
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b T0() {
        this.f258589b.T0();
        return m.f235744a;
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b a2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        h hVar = new h(new b(this, id10, 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 d1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f258589b.d1(id10);
    }

    @Override // com.revolut.feature.chooser.c
    public final r j() {
        return this.f258589b.j();
    }

    @Override // com.revolut.feature.chooser.c
    public final r m() {
        return this.f258589b.m();
    }
}
