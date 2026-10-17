package com.revolut.feature.backgroundpicker.impl.flow.themes_gallery;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bn2.j0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DarkModeThumbnailPreviewDelegate;
import com.revolut.core.ui_kit.delegates.LightModeThumbnailPreviewDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SystemModeThumbnailPreviewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backgroundpicker.impl.R$string;
import com.revolut.feature.backgroundpicker.impl.flow.themes_gallery.ThemesGalleryController;
import com.revolut.feature.backgroundpicker.impl.flow.themes_gallery.ThemesGalleryControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import km2.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import yjj.j;
import ym2.b;
import ym2.c;
import ym2.e;
import ym2.f;
import ym2.g;
import ym2.i;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/themes_gallery/ThemesGalleryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lym2/f;", "Ldli/a;", "Lym2/g;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThemesGalleryController extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ThemesGalleryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final ThemesGalleryControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final int O;
    public final ListSubheaderDelegate P;
    public final SystemModeThumbnailPreviewDelegate Q;
    public final DarkModeThumbnailPreviewDelegate R;
    public final LightModeThumbnailPreviewDelegate S;
    public final ScrollerBoxDelegate T;
    public final Object U;

    public ThemesGalleryController(ThemesGalleryControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ym2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThemesGalleryController f314835b;

            {
                this.f314835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ThemesGalleryController themesGalleryController = this.f314835b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ThemesGalleryController.V;
                        phm.a aVar = (phm.a) ue0.e.j(themesGalleryController.m2()).a().get(pm2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pm2.h.class, " is not found"));
                        }
                        pm2.c cVar = ((pm2.c) aVar2.b()).f237462g;
                        ThemesGalleryControllerContract$InputData themesGalleryControllerContract$InputData = themesGalleryController.K;
                        themesGalleryControllerContract$InputData.getClass();
                        return new pm2.f(cVar, themesGalleryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ThemesGalleryController.V;
                        pm2.f fVar = (pm2.f) themesGalleryController.M.getValue();
                        fVar.getClass();
                        j jVar = new j();
                        ThemesGalleryControllerContract$InputData themesGalleryControllerContract$InputData2 = fVar.f237468a;
                        pm2.c cVar2 = fVar.f237469b;
                        j0 j0VarA = cVar2.a();
                        mk0.a aVarA = cVar2.d.d.a();
                        s.j(aVarA);
                        return new i(jVar, themesGalleryControllerContract$InputData2, j0VarA, new x(aVarA));
                    default:
                        KProperty[] kPropertyArr3 = ThemesGalleryController.V;
                        ThemesGalleryController themesGalleryController2 = this.f314835b;
                        return dli.f.a(themesGalleryController2, (e) themesGalleryController2.N.getValue(), v.k(themesGalleryController2.P, themesGalleryController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ym2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThemesGalleryController f314835b;

            {
                this.f314835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ThemesGalleryController themesGalleryController = this.f314835b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ThemesGalleryController.V;
                        phm.a aVar = (phm.a) ue0.e.j(themesGalleryController.m2()).a().get(pm2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pm2.h.class, " is not found"));
                        }
                        pm2.c cVar = ((pm2.c) aVar2.b()).f237462g;
                        ThemesGalleryControllerContract$InputData themesGalleryControllerContract$InputData = themesGalleryController.K;
                        themesGalleryControllerContract$InputData.getClass();
                        return new pm2.f(cVar, themesGalleryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ThemesGalleryController.V;
                        pm2.f fVar = (pm2.f) themesGalleryController.M.getValue();
                        fVar.getClass();
                        j jVar = new j();
                        ThemesGalleryControllerContract$InputData themesGalleryControllerContract$InputData2 = fVar.f237468a;
                        pm2.c cVar2 = fVar.f237469b;
                        j0 j0VarA = cVar2.a();
                        mk0.a aVarA = cVar2.d.d.a();
                        s.j(aVarA);
                        return new i(jVar, themesGalleryControllerContract$InputData2, j0VarA, new x(aVarA));
                    default:
                        KProperty[] kPropertyArr3 = ThemesGalleryController.V;
                        ThemesGalleryController themesGalleryController2 = this.f314835b;
                        return dli.f.a(themesGalleryController2, (e) themesGalleryController2.N.getValue(), v.k(themesGalleryController2.P, themesGalleryController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = R$layout.screen_recycler_basic_navbar;
        this.P = new ListSubheaderDelegate();
        SystemModeThumbnailPreviewDelegate systemModeThumbnailPreviewDelegate = new SystemModeThumbnailPreviewDelegate();
        this.Q = systemModeThumbnailPreviewDelegate;
        DarkModeThumbnailPreviewDelegate darkModeThumbnailPreviewDelegate = new DarkModeThumbnailPreviewDelegate();
        this.R = darkModeThumbnailPreviewDelegate;
        LightModeThumbnailPreviewDelegate lightModeThumbnailPreviewDelegate = new LightModeThumbnailPreviewDelegate();
        this.S = lightModeThumbnailPreviewDelegate;
        final int i3 = 2;
        this.T = new ScrollerBoxDelegate(v.k(systemModeThumbnailPreviewDelegate, darkModeThumbnailPreviewDelegate, lightModeThumbnailPreviewDelegate));
        this.U = w.y0(new Function0(this) { // from class: ym2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThemesGalleryController f314835b;

            {
                this.f314835b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ThemesGalleryController themesGalleryController = this.f314835b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ThemesGalleryController.V;
                        phm.a aVar = (phm.a) ue0.e.j(themesGalleryController.m2()).a().get(pm2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pm2.h.class, " is not found"));
                        }
                        pm2.c cVar = ((pm2.c) aVar2.b()).f237462g;
                        ThemesGalleryControllerContract$InputData themesGalleryControllerContract$InputData = themesGalleryController.K;
                        themesGalleryControllerContract$InputData.getClass();
                        return new pm2.f(cVar, themesGalleryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ThemesGalleryController.V;
                        pm2.f fVar = (pm2.f) themesGalleryController.M.getValue();
                        fVar.getClass();
                        j jVar = new j();
                        ThemesGalleryControllerContract$InputData themesGalleryControllerContract$InputData2 = fVar.f237468a;
                        pm2.c cVar2 = fVar.f237469b;
                        j0 j0VarA = cVar2.a();
                        mk0.a aVarA = cVar2.d.d.a();
                        s.j(aVarA);
                        return new i(jVar, themesGalleryControllerContract$InputData2, j0VarA, new x(aVarA));
                    default:
                        KProperty[] kPropertyArr3 = ThemesGalleryController.V;
                        ThemesGalleryController themesGalleryController2 = this.f314835b;
                        return dli.f.a(themesGalleryController2, (e) themesGalleryController2.N.getValue(), v.k(themesGalleryController2.P, themesGalleryController2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Integer num = uiState.f314841b;
        if (num != null) {
            d3().f174531c.scrollToPosition(num.intValue());
            i iVar = (i) ((e) this.N.getValue());
            iVar.H2(iVar.f314844q, new j(8));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (pm2.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (e) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174530b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174530b.setTitle(new TextLocalisedClause(R$string.themes_gallery_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174530b.f59211b), new yl6.b(this, null, 1), 3);
        r rVarMergeArray = r.mergeArray(this.Q.d, this.R.d, this.S.d);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        ViewController.P2(this, rd0.e.b(rVarMergeArray), new c(this, null), 3);
    }

    public final jii.j d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.j) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
