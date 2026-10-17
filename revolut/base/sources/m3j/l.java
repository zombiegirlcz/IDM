package m3j;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements y2j.c {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f202580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f202581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f202582c;

    public l(h accountFieldsMapper, j beneficiaryAvatarMapper, f61.a beneficiaryAccountFieldsNameMapper) {
        Intrinsics.checkNotNullParameter(accountFieldsMapper, "accountFieldsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldsNameMapper, "beneficiaryAccountFieldsNameMapper");
        this.f202580a = accountFieldsMapper;
        this.f202581b = beneficiaryAvatarMapper;
        this.f202582c = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_bank, Integer.valueOf(R$attr.uikit_colorGreyTone50), R$attr.uikit_colorGreyTone10, 11.2f, Float.valueOf(34.0f), null, 32);
    }

    public final Image a(f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        ContactImage contactImageA = this.f202581b.a(beneficiary);
        return contactImageA == null ? this.f202582c : contactImageA;
    }
}
