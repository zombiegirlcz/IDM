package au0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes19.dex */
public abstract class t0 {

    public static final class a extends t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9365a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final CdnImage f9366b = new CdnImage("revolut_id_header", "mobile/sso/revolut_id", null, new ImageTransformations(null, null, new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorForeground)), null, null, null, null, 123), UrlImageDrawable.Shimmering.Chip.f60042a, null, Constants.TAG_E4_CUSTOMER_DATA);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float f9367c = 143.0f;
        public static final float d = 24.0f;

        private a() {
        }

        @Override // au0.t0
        public final float a() {
            return d;
        }

        @Override // au0.t0
        public final CdnImage b() {
            return f9366b;
        }

        @Override // au0.t0
        public final float c() {
            return f9367c;
        }
    }

    private t0() {
    }

    public abstract float a();

    public abstract CdnImage b();

    public abstract float c();
}
