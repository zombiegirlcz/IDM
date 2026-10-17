package aze;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import je6.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sze.d;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements xte.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f11457b;

    public b(h logoMapper, d imageFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(logoMapper, "logoMapper");
        Intrinsics.checkNotNullParameter(imageFactory, "imageFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f11456a = logoMapper;
        this.f11457b = featureToggleInteractor;
    }

    public final Image b(TopupMethod topupMethod) {
        boolean z = topupMethod instanceof TopupMethod.StoredMethod.Card;
        h hVar = this.f11456a;
        if (z) {
            return ((di6.a) hVar).a(((TopupMethod.StoredMethod.Card) topupMethod).d, d.a(R$drawable.uikit_icn_24_card));
        }
        if (topupMethod instanceof TopupMethod.OtherMethod) {
            TopupMethod.OtherMethod otherMethod = (TopupMethod.OtherMethod) topupMethod;
            if (otherMethod.f60440a == TopupMethodType.CARD) {
                return ((di6.a) hVar).a(otherMethod.d, d.a(R$drawable.uikit_icn_24_card));
            }
        }
        return ((di6.a) hVar).b(topupMethod.getE());
    }

    public final Image c(TopupMethod.StoredMethod storedMethod) {
        Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
        Image imageB = b(storedMethod);
        if (imageB != null) {
            return imageB;
        }
        if (storedMethod instanceof TopupMethod.StoredMethod.Card) {
            return d.a(R$drawable.uikit_icn_24_card);
        }
        if ((storedMethod instanceof TopupMethod.StoredMethod.PixSmartTransfer) || (storedMethod instanceof TopupMethod.StoredMethod.Akahu) || (storedMethod instanceof TopupMethod.StoredMethod.GmoPgBankDirect) || (storedMethod instanceof TopupMethod.StoredMethod.Openbanking)) {
            return d.a(R$drawable.uikit_icn_24_bank);
        }
        if (storedMethod instanceof TopupMethod.StoredMethod.PayTo) {
            return d.a(R$drawable.uikit_icn_24_payto);
        }
        if (storedMethod instanceof TopupMethod.StoredMethod.NetBanking) {
            return d.a(R$drawable.uikit_icn_24_bank);
        }
        if (storedMethod instanceof TopupMethod.StoredMethod.UpiApp) {
            return d.a(R$drawable.uikit_icn_24_upi);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(java.util.List r35, com.revolut.domain.models.topup.methods.TopupMethod r36, com.revolut.domain.models.topup.methods.TopupMethod r37, java.lang.Boolean r38) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aze.b.d(java.util.List, com.revolut.domain.models.topup.methods.TopupMethod, com.revolut.domain.models.topup.methods.TopupMethod, java.lang.Boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList e(java.util.List r35, com.revolut.domain.models.topup.methods.TopupMethod r36, com.revolut.domain.models.topup.methods.TopupMethod r37) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aze.b.e(java.util.List, com.revolut.domain.models.topup.methods.TopupMethod, com.revolut.domain.models.topup.methods.TopupMethod):java.util.ArrayList");
    }
}
