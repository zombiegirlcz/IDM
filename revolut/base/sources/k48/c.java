package k48;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.joint.InternalJointTransferType;
import dj0.d;
import java.util.Map;
import k71.k;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.w5;
import tof.z6;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements m38.b {
    public static ContactImage a(z6 z6Var) {
        return new ContactImage(z6Var != null ? z6Var.f273196a : null, (String) null, (String) null, z6Var != null ? z6Var.f273199g : null, (String) null, z6Var != null ? z6Var.c() : null, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4054);
    }

    public final Image b(a3 transaction, Map pockets, String str) {
        String str2;
        String str3;
        w5 w5Var;
        String str4;
        String str5;
        w5 w5Var2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        if (str == null) {
            return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_arrow_right_left, R$attr.uikit_colorDeepGrey, R$attr.uikit_colorDeepGrey_10);
        }
        InternalJointTransferType internalJointTransferTypeM = k.M(str, transaction);
        String str6 = transaction.f272624y.f273143a;
        z6 z6Var = transaction.H;
        z6 z6Var2 = transaction.G;
        d dVar = transaction.k;
        switch (internalJointTransferTypeM == null ? -1 : b.f180844a[internalJointTransferTypeM.ordinal()]) {
            case 1:
            case 2:
                String str7 = (z6Var == null || (w5Var = z6Var.k) == null) ? null : w5Var.f273143a;
                io3.d dVar2 = (io3.d) pockets.get(str7 != null ? str7 : "");
                if (dVar2 == null || (str2 = dVar2.f163147c) == null) {
                    str2 = dVar.f115083b.f306286a;
                }
                io3.d dVar3 = (io3.d) pockets.get(str6);
                if (dVar3 == null || (str3 = dVar3.f163147c) == null) {
                    str3 = dVar.f115083b.f306286a;
                }
                return new PairedImage(new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(str3, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
            case 3:
            case 4:
                io3.d dVar4 = (io3.d) pockets.get(str6);
                if (dVar4 == null || (str4 = dVar4.f163147c) == null) {
                    str4 = dVar.f115083b.f306286a;
                }
                String str8 = (z6Var2 == null || (w5Var2 = z6Var2.k) == null) ? null : w5Var2.f273143a;
                io3.d dVar5 = (io3.d) pockets.get(str8 != null ? str8 : "");
                if (dVar5 == null || (str5 = dVar5.f163147c) == null) {
                    str5 = dVar.f115083b.f306286a;
                }
                return new PairedImage(new CurrencyImage(str4, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(str5, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
            case 5:
                return a(z6Var);
            case 6:
                return a(z6Var2);
            default:
                return new PairedImage(new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
        }
    }
}
