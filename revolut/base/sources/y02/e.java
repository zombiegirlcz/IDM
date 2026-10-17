package y02;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductAccountListAction f310104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ProductAccountListAction f310105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProductAccountListAction f310106c;
    public static final ProductAccountListAction d;
    public static final ProductAccountListAction e;
    public static final ProductAccountListAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProductAccountListAction f310107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProductAccountListAction f310108h;
    public static final ProductAccountListAction i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProductAccountListAction f310109j;
    public static final List k;

    static {
        ApmBizum apmBizum = ApmBizum.f61808c;
        ProductAccountListAction productAccountListActionA = a("ACTION_APM_BIZUM_ID", apmBizum);
        f310104a = productAccountListActionA;
        ApmBlik apmBlik = ApmBlik.f61809c;
        ProductAccountListAction productAccountListActionA2 = a("ACTION_APM_BLIK_ID", apmBlik);
        f310105b = productAccountListActionA2;
        ApmBreb apmBreb = ApmBreb.f61810c;
        ProductAccountListAction productAccountListActionA3 = a("ACTION_BREB_ID", apmBreb);
        f310106c = productAccountListActionA3;
        ApmIris apmIris = ApmIris.f61811c;
        ProductAccountListAction productAccountListActionA4 = a("ACTION_APM_IRIS_ID", apmIris);
        d = productAccountListActionA4;
        ApmMultibanco apmMultibanco = ApmMultibanco.f61815c;
        ProductAccountListAction productAccountListActionA5 = a("ACTION_APM_MULTIBANCO_ID", apmMultibanco);
        e = productAccountListActionA5;
        ApmPayId apmPayId = ApmPayId.f61819c;
        ProductAccountListAction productAccountListActionA6 = a("ACTION_APM_PAYID_ID", apmPayId);
        f = productAccountListActionA6;
        ApmQvik apmQvik = ApmQvik.f61823c;
        ProductAccountListAction productAccountListActionA7 = a("ACTION_APM_QVIK_ID", apmQvik);
        f310107g = productAccountListActionA7;
        ApmWero apmWero = ApmWero.f61829c;
        ProductAccountListAction productAccountListActionA8 = a("ACTION_WERO_ID", apmWero);
        f310108h = productAccountListActionA8;
        ApmUpi apmUpi = ApmUpi.f61828c;
        ProductAccountListAction productAccountListActionA9 = a("ACTION_UPI_ID", apmUpi);
        i = productAccountListActionA9;
        ApmPix apmPix = ApmPix.f61820c;
        ProductAccountListAction productAccountListAction = new ProductAccountListAction(376, null, apmPix.e(), new ResourceImage(R$drawable.uikit_icn_24_logo_pix_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), apmPix, "ACTION_PIX_ID", null, null, false, false);
        f310109j = productAccountListAction;
        k = v.k(new d(apmBizum, productAccountListActionA), new d(apmBlik, productAccountListActionA2), new d(apmBreb, productAccountListActionA3), new d(apmIris, productAccountListActionA4), new d(apmMultibanco, productAccountListActionA5), new d(apmPayId, productAccountListActionA6), new d(apmPix, productAccountListAction), new d(apmQvik, productAccountListActionA7), new d(apmUpi, productAccountListActionA9), new d(apmWero, productAccountListActionA8));
    }

    private e() {
    }

    public static ProductAccountListAction a(String str, ApmProduct apmProduct) {
        return new ProductAccountListAction(376, null, apmProduct.e(), new ResourceImage(apmProduct.d(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), apmProduct, str, null, null, false, false);
    }
}
