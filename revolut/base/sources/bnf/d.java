package bnf;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LayeredImage f17138b = nib.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LayeredImage f17139c = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue);
    public static final LayeredImage d = nub.a.s();
    public static final CdnImage e = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D239", null, null, null, 30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnf.b f17140a;

    public d(dnf.b tradingTransactionDataMapper) {
        Intrinsics.checkNotNullParameter(tradingTransactionDataMapper, "tradingTransactionDataMapper");
        this.f17140a = tradingTransactionDataMapper;
    }

    public final Image a(tof.a aVar, io3.l lVar, String str, Map map) {
        Object next;
        tof.c cVar = aVar.f272572a;
        switch (c.f17137c[cVar.ordinal()]) {
            case 1:
                if ((lVar == null ? -1 : c.f17136b[lVar.ordinal()]) == 1) {
                    return e;
                }
                if (str != null) {
                    return new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                }
                return null;
            case 2:
            case 3:
            case 4:
                if (str != null) {
                    return new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                }
                return null;
            case 5:
                return LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_credit_card, new Color.Solid(R$attr.uikit_colorWhite), new Color.Solid(R$attr.uikit_colorTeal));
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return f17139c;
            case 11:
            case 12:
            case 13:
                return f17138b;
            case 14:
                return d;
            case 15:
                Iterator it8 = map.values().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (d0.T(((jf8.a) next).d, aVar.f272573b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                jf8.a aVar2 = (jf8.a) next;
                if (aVar2 != null) {
                    return new ContactImage(aVar2.f173728a, (String) null, (String) null, (String) null, (String) null, aVar2.f173730c, (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550);
                }
                return null;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return this.f17140a.b(cVar);
            case 21:
                if (str != null) {
                    return new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                }
            case 22:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
