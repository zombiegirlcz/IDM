package mx4;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import dx4.f5;
import dx4.m5;
import dx4.n5;
import dx4.t5;
import dx4.u5;
import dx4.v5;
import dx4.w5;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes22.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f210193a;

    public u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f210193a = context;
    }

    public final Image a(dx4.d1 contentImage) {
        ImageTransformations imageTransformations;
        Intrinsics.checkNotNullParameter(contentImage, "contentImage");
        if (contentImage instanceof dx4.m0) {
            dx4.m0 m0Var = (dx4.m0) contentImage;
            return new CdnImage(m0Var.f120673a, m0Var.f120674b, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        boolean zQ = false;
        if (contentImage instanceof f5) {
            int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
            if (defaultNightMode != 1) {
                zQ = defaultNightMode != 2 ? kli.a.q(this.f210193a) : true;
            }
            if (zQ) {
                dx4.m0 m0Var2 = ((f5) contentImage).f120600b;
                return new CdnImage(m0Var2.f120673a, m0Var2.f120674b, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            }
            dx4.m0 m0Var3 = ((f5) contentImage).f120599a;
            return new CdnImage(m0Var3.f120673a, m0Var3.f120674b, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        if (contentImage instanceof m5) {
            m5 m5Var = (m5) contentImage;
            String str = m5Var.f120683a;
            int i = t.f210191a[m5Var.f120684b.ordinal()];
            if (i == 1) {
                imageTransformations = null;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                imageTransformations = new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG);
            }
            return new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, imageTransformations, null, null, false, false, 507902);
        }
        if (!(contentImage instanceof w5)) {
            if (!(contentImage instanceof n5)) {
                throw new NoWhenBranchMatchedException();
            }
            n5 n5Var = (n5) contentImage;
            return new ContactImage(n5Var.f120691a, (String) null, (String) null, (String) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.o(n5Var.f120692b, " ", n5Var.f120693c), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062);
        }
        w5 w5Var = (w5) contentImage;
        dx4.a1 a1Var = w5Var.f120819a;
        v5 v5Var = w5Var.f120821c;
        if (v5Var == null) {
            int i2 = t.f210192b[w5Var.f120820b.ordinal()];
            if (i2 == 1) {
                return a1Var.T1();
            }
            if (i2 == 2) {
                return a1Var.d();
            }
            throw new NoWhenBranchMatchedException();
        }
        t5 backgroundColor = v5Var.f120803a;
        u5 iconColor = v5Var.f120804b;
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int iC = a1Var.c();
        if (dx4.z0.f120858b[iconColor.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorWhite);
        if (dx4.z0.f120857a[backgroundColor.ordinal()] == 1) {
            return LayeredImage.Companion.b(companion, iC, numValueOf, R$attr.uikit_colorTeal, 8.0f, null, null, 48);
        }
        throw new NoWhenBranchMatchedException();
    }
}
