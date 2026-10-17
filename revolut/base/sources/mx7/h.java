package mx7;

import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends ori.a implements g, com.revolut.feature.chooser.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.chooser.c f210227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f210228c;

    public h(i state, com.revolut.feature.chooser.c chooserPresentationModel) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chooserPresentationModel, "chooserPresentationModel");
        this.f210227b = chooserPresentationModel;
        this.f210228c = state;
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b H0(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return this.f210227b.H0(query);
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 N2() {
        return this.f210227b.N2();
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b T0() {
        return this.f210227b.T0();
    }

    @Override // com.revolut.feature.chooser.c
    public final efm.b a2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f210227b.a2(id10);
    }

    @Override // com.revolut.feature.chooser.c
    public final d0 d1(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return this.f210227b.d1(id10);
    }

    @Override // com.revolut.feature.chooser.c
    public final r j() {
        return this.f210227b.j();
    }

    @Override // com.revolut.feature.chooser.c
    public final r m() {
        return this.f210227b.m();
    }
}
