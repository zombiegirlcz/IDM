package q7c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.NoWhenBranchMatchedException;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c6c.a {
    public static Image a(String str, CdnImage cdnImage) {
        return str != null ? new UrlImage(str, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) cdnImage, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 515578) : cdnImage;
    }

    public static CdnImage b(d6c.a aVar) {
        CdnImage cdnImage;
        switch (a.f242805a[aVar.ordinal()]) {
            case 1:
            case 2:
                cdnImage = c7c.a.f21913a;
                break;
            case 3:
                cdnImage = c7c.a.f21914b;
                break;
            case 4:
                cdnImage = c7c.a.f21915c;
                break;
            case 5:
                cdnImage = c7c.a.d;
                break;
            case 6:
                cdnImage = c7c.a.e;
                break;
            case 7:
                cdnImage = c7c.a.f;
                break;
            case 8:
                cdnImage = c7c.a.f21916g;
                break;
            case 9:
                cdnImage = c7c.a.f21917h;
                break;
            case 10:
                cdnImage = c7c.a.i;
                break;
            case 11:
                cdnImage = c7c.a.f21918j;
                break;
            case 12:
                cdnImage = c7c.a.k;
                break;
            case 13:
                cdnImage = c7c.a.f21919l;
                break;
            case 14:
                cdnImage = c7c.a.f21920m;
                break;
            case 15:
                cdnImage = c7c.a.f21921n;
                break;
            case 16:
                cdnImage = c7c.a.o;
                break;
            case 17:
                cdnImage = c7c.a.f21922p;
                break;
            case 18:
                cdnImage = c7c.a.f21923q;
                break;
            case 19:
                cdnImage = c7c.a.f21924r;
                break;
            case 20:
                cdnImage = c7c.a.f21925s;
                break;
            case 21:
                cdnImage = c7c.a.f21926t;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return CdnImage.a(cdnImage, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG));
    }
}
