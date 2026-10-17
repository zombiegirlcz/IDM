package rna;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements e {
    public final ekg.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f255541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s70.a f255542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jl0.a f255543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f255544s;

    public i(n mapper, qd0.b languageProvider, ekg.g uiPersonalisationInteractor, j60.a bottomDialogExtension, s70.a intentProvider, jl0.a aVar) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.o = uiPersonalisationInteractor;
        this.f255541p = bottomDialogExtension;
        this.f255542q = intentProvider;
        this.f255543r = aVar;
        String displayLanguage = ((s80.b) languageProvider).b().getDisplayLanguage();
        Intrinsics.checkNotNullExpressionValue(displayLanguage, "getDisplayLanguage(...)");
        this.f255544s = mra.d.b(this, new d(new Data(null, null, true, 3, null), displayLanguage), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.o.c(), null, null, new rk9.d(this, null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f255544s;
    }
}
