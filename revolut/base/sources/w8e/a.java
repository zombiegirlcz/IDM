package w8e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.R$string;
import g6e.b;
import io3.i;
import io3.l;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pyd.c;
import s6e.d;
import tof.a3;
import tof.g3;
import tof.w5;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements l6e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f295643a;

    public a(b subaccountBackgroundInteractor) {
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        this.f295643a = subaccountBackgroundInteractor;
    }

    public static TextLocalisedClause d(String str, boolean z) {
        return z ? new TextLocalisedClause(R$string.bill_accounts_common_transaction_from, u.c(str), null, 12) : new TextLocalisedClause(R$string.bill_accounts_common_transaction_to, u.c(str), null, 12);
    }

    public final Image a(a3 a3Var, Map map) {
        g3 g3Var = a3Var.f272582b0;
        o61.a aVar = (o61.a) map.get(g3Var != null ? g3Var.f272765a : null);
        if (aVar != null) {
            return aVar.f222489c;
        }
        return ((d) this.f295643a).c(SubaccountType.Personal.f88963a);
    }

    public final Image b(a3 transaction, Map billAccounts, Map pockets) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(billAccounts, "billAccounts");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        w5 w5Var = transaction.f272624y;
        dj0.d dVar = transaction.k;
        io3.d dVar2 = (io3.d) pockets.get(w5Var.f273143a);
        boolean z = (dVar2 != null ? dVar2.e : null) == l.CURRENT && dVar2.f163149h == i.INTERNAL;
        if (transaction.H != null) {
            return c(transaction, billAccounts, z);
        }
        if (transaction.G != null) {
            return c(transaction, billAccounts, !z);
        }
        if (transaction.J == null) {
            return a(transaction, billAccounts);
        }
        if (z) {
            int i = c.i(dVar);
            xi0.b bVar = dVar.f115083b;
            return i < 0 ? new PairedImage(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), a(transaction, billAccounts), R$attr.uikit_colorWidgetBackground, null) : new PairedImage(a(transaction, billAccounts), new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null);
        }
        int i2 = c.i(dVar);
        xi0.b bVar2 = dVar.f115083b;
        return i2 < 0 ? new PairedImage(a(transaction, billAccounts), new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null) : new PairedImage(new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), a(transaction, billAccounts), R$attr.uikit_colorWidgetBackground, null);
    }

    public final PairedImage c(a3 a3Var, Map map, boolean z) {
        return z ? new PairedImage(a(a3Var, map), new CurrencyImage(a3Var.k.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), R$attr.uikit_colorWidgetBackground, null) : new PairedImage(new CurrencyImage(a3Var.k.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), a(a3Var, map), R$attr.uikit_colorWidgetBackground, null);
    }
}
