package cle;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature_news_api.NewsInfoFeatureConfig;
import com.revolut.retail.common.ui.model.NewsUiItem;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f24981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q06.l f24982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f80.a f24983n;

    public j(a presentationModel, q06.l deeplinkRouter, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f24981l = presentationModel;
        this.f24982m = deeplinkRouter;
        this.f24983n = uriHelper;
    }

    @Override // cle.f
    public final vkm.d Z2(vke.d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        a aVar = this.f24981l;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        uke.b bVar = aVar.f24977a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        pke.d dVar = bVar.f280732a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return rd0.e.b(dVar.d.f(type, true));
    }

    @Override // cle.f
    public final efm.b b3(vke.c banner) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(banner, "banner");
        vke.a aVar = banner.f;
        if (aVar instanceof vke.e) {
            String str4 = ((vke.e) aVar).f289922a;
            pfm.a aVar2 = new pfm.a(((s06.j) this.f24982m).c(str4, false, lg0.a.IGNORE), new ch6.d(new c7e.i(this, str4, 27), 8), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            return aVar2;
        }
        if (!(aVar instanceof vke.b)) {
            pfm.m mVar = pfm.m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        vke.b bVar = (vke.b) aVar;
        String str5 = banner.f289918a;
        String str6 = banner.f289920c;
        String str7 = banner.e;
        String str8 = banner.f289921g;
        UrlImage urlImage = null;
        if (str8 != null) {
            str2 = str6;
            str = str5;
            str3 = null;
            urlImage = new UrlImage(str8, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), 64, 64, false, false, 409598);
        } else {
            str = str5;
            str2 = str6;
            str3 = null;
        }
        boolean z = banner.f289919b;
        String str9 = bVar.f289916a;
        a80.d dVar = bVar.f289917b;
        pfm.h hVar = new pfm.h(new a08.l(this, new FeatureCommand(new NewsInfoFeatureConfig(new NewsUiItem(str, str9, dVar != null ? dVar.f1986b : str3, null, urlImage, str2, str7, dVar != null ? dVar.f1985a : str3, null, null, false, null, null, z, null, null, false, 2088712), str3)), 11), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
