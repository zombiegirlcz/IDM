package m3j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3j.c f202577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayeredImage f202578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f202579c;

    public j(c3j.c revolutUserDeterminer) {
        Intrinsics.checkNotNullParameter(revolutUserDeterminer, "revolutUserDeterminer");
        this.f202577a = revolutUserDeterminer;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_bank;
        int i2 = R$attr.uikit_colorPopoverBackground;
        this.f202578b = LayeredImage.Companion.f(companion, i, R$attr.uikit_colorStatusInactive, i2, Integer.valueOf(i2), 4.0f, 3.0f, null, 64);
        this.f202579c = h5k.a.e();
    }

    public static ContactImage c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    public final ContactImage a(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        return c(n61.j.c(beneficiary));
    }

    public final Image b(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        String str = beneficiary.f132338p;
        if (this.f202577a.a(beneficiary)) {
            return this.f202579c;
        }
        if (str == null || str.length() == 0) {
            return this.f202578b;
        }
        return new UrlImage(str, null, null, null, 0L, null, null, null, null, this.f202578b, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorPopoverBackground), false, 8), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 506878);
    }
}
