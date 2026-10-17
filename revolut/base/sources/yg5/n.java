package yg5;

import aw0.m6;
import aw0.n6;
import aw0.na;
import aw0.o9;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.crypto.gift.asset.impl.R$string;
import ip0.fl0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox0.b0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(List list) {
        List<ug5.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ug5.b bVar : list2) {
            xi0.b bVar2 = bVar.f279931a;
            xi0.b bVar3 = bVar.f279931a;
            AvatarModel.Default r3 = new AvatarModel.Default(new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, null, null, null, 126);
            CurrencyClause currencyClause = new CurrencyClause(bVar3, CurrencyClause.Format.DisplayName.f57755a, null, 4);
            String str = bVar3.f306286a;
            arrayList.add(new SpinnerPickerItemDelegateModel(r3, currencyClause, j6.a.q("CRYPTO_GIFT_ASSET_", str), new ug5.c(str), 36));
        }
        if (arrayList.isEmpty()) {
            return arrayList;
        }
        int size = arrayList.size();
        int i = 1073741822 % size;
        int i2 = i + (size & (((i ^ size) & ((-i) | i)) >> 31));
        return d0.E0(d0.W(i2, arrayList), d0.W0(i2, arrayList));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        ug5.a aVar;
        n6 n6VarC;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.d;
        boolean z = domainState.f313526c;
        List listC = str == null ? f0.f322471a : zhm.u.c(new fl0(new na(new TextLocalisedClause(R$string.crypto_gifted_assets_header_title, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), "TITLE_LIST_ID"));
        com.revolut.core.ui_kit.views.spinnerPicker.c aVar2 = (z || (aVar = domainState.f313524a) == null) ? m.f313532a : new com.revolut.core.ui_kit.views.spinnerPicker.a(a(aVar.f279928a), a(aVar.f279929b), a(aVar.f279930c), SpinnerPickerView.b.a.f59703a, ey0.f.CENTER);
        if (z) {
            n6.Companion.getClass();
            n6VarC = m6.a();
        } else {
            n6VarC = m6.c(n6.Companion, new TextLocalisedClause(R$string.crypto_gifted_assets_footer_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020);
        }
        n6 n6Var = n6VarC;
        b0 b0Var = b0.BELOW_BUTTONS;
        ox0.d0 d0Var = ox0.d0.DISCLAIMER;
        String str2 = domainState.e;
        return new l(listC, aVar2, new aw0.e(false, str2 != null ? new HtmlClause(0, 28, (Integer) null, (Object) null, str2) : null, b0Var, n6Var, null, d0Var, 17));
    }
}
