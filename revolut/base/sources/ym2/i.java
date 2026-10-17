package ym2;

import bn2.j0;
import cli.y;
import com.revolut.feature.backgroundpicker.impl.flow.themes_gallery.ThemesGalleryControllerContract$InputData;
import km2.x;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements e {
    public final j0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f314843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f314844q;

    public i(j mapper, ThemesGalleryControllerContract$InputData inputData, j0 themesInteractor, x themeCustomisationRepository) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(themesInteractor, "themesInteractor");
        Intrinsics.checkNotNullParameter(themeCustomisationRepository, "themeCustomisationRepository");
        this.o = themesInteractor;
        this.f314843p = themeCustomisationRepository;
        this.f314844q = mra.d.b(this, new d(inputData.f63796a, r0.g(), h0.f322473a, false), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new yl6.b(this, null, 2), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f314844q;
    }
}
