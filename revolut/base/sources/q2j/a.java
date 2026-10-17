package q2j;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.retail.feature.balance.picker.legacy.impl.BalanceScreenContract$Configuration;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BalanceScreenContract$Configuration f241661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f241662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cm4.a f241663c;

    public a(BalanceScreenContract$Configuration configuration, f01.c uiKitResources, cm4.a creditCardBaseMapper) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(creditCardBaseMapper, "creditCardBaseMapper");
        this.f241661a = configuration;
        this.f241662b = uiKitResources;
        this.f241663c = creditCardBaseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model.c.b a(q2j.d r18) {
        /*
            r17 = this;
            r0 = r17
            com.revolut.retail.feature.balance.picker.legacy.impl.BalanceScreenContract$Configuration r1 = r0.f241661a
            com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig$ShowBalancesSetting r1 = r1.f99578l
            com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig$ShowBalancesSetting$None r2 = com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig.ShowBalancesSetting.None.f99565a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            r3 = 0
            if (r2 == 0) goto L10
            goto L71
        L10:
            r2 = 2
            com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig$ShowBalancesSetting[] r2 = new com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig.ShowBalancesSetting[r2]
            com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig$ShowBalancesSetting$InItemCurrency r4 = com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig.ShowBalancesSetting.InItemCurrency.f99564a
            r5 = 0
            r2[r5] = r4
            r4 = 1
            com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig$ShowBalancesSetting$InItemAndBaseCurrencies r5 = com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig.ShowBalancesSetting.InItemAndBaseCurrencies.f99563a
            r2[r4] = r5
            java.util.List r2 = zhm.v.k(r2)
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L41
            dj0.d r7 = r18.d()
            if (r7 == 0) goto L41
            com.revolut.core.ui_kit.models.MoneyClause r6 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r8 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r12 = 0
            r13 = 15
            r9 = 0
            r10 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 12
            r6.<init>(r7, r8, r9, r10, r11)
            r8 = r6
            goto L42
        L41:
            r8 = r3
        L42:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r1 == 0) goto L6c
            dj0.d r1 = r18.c()
            if (r1 == 0) goto L52
            boolean r4 = r1.k()
        L52:
            if (r4 != 0) goto L56
            r10 = r1
            goto L57
        L56:
            r10 = r3
        L57:
            if (r10 == 0) goto L6c
            com.revolut.core.ui_kit.models.MoneyClause r9 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r11 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r15 = 0
            r16 = 15
            r12 = 0
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r14 = 12
            r9.<init>(r10, r11, r12, r13, r14)
            goto L6d
        L6c:
            r9 = r3
        L6d:
            if (r8 != 0) goto L72
            if (r9 != 0) goto L72
        L71:
            return r3
        L72:
            com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$b r7 = new com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$b
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q2j.a.a(q2j.d):com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$b");
    }

    public final AccountCellItemDelegate.Model b(d wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        boolean z = wrapper instanceof c;
        BalanceScreenContract$Configuration balanceScreenContract$Configuration = this.f241661a;
        com.revolut.core.ui_kit.delegates.c aVar = com.revolut.core.ui_kit.delegates.b.f53699a;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (z) {
            c cVar = (c) wrapper;
            xi0.b bVar = cVar.d;
            String str = cVar.f241667a;
            CurrencyImage currencyImage = new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            TextClause textClause = new TextClause(cVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            CurrencyClause currencyClause = new CurrencyClause(bVar, ticker, null, 4);
            RowDelegate.Model.c.b bVarA = a(cVar);
            Set set = balanceScreenContract$Configuration.k;
            if (!(set != null ? set.contains(bVar.f306286a) : true)) {
                aVar = new com.revolut.core.ui_kit.delegates.a();
            }
            return new AccountCellItemDelegate.Model(str, false, (Image) currencyImage, (Clause) textClause, aVar, false, (Clause) currencyClause, bVarA, (ProgressStyle) null, (Object) null, (Parcelable) null, 130848);
        }
        if (!(wrapper instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        b bVar2 = (b) wrapper;
        xi0.b bVar3 = bVar2.f241668b;
        CreditCard creditCard = bVar2.d;
        cl4.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        ProgressStyle progressStyleA = ((wq4.a) this.f241663c).a(cl4.f.a(creditCard.f.f115082a, creditCard.f69794c.f115082a, creditCard.f69798l.f306286a));
        boolean z3 = creditCard.o == null;
        String str2 = bVar2.f241667a;
        Image image = creditCard.f69797j;
        TextClause textClause2 = new TextClause(bVar2.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        CurrencyClause currencyClause2 = new CurrencyClause(bVar3, ticker, null, 4);
        RowDelegate.Model.c.b bVarA2 = a(bVar2);
        Set set2 = balanceScreenContract$Configuration.k;
        if (!(set2 != null ? set2.contains(bVar3.f306286a) : true) || !z3) {
            aVar = new com.revolut.core.ui_kit.delegates.a();
        }
        return new AccountCellItemDelegate.Model(str2, false, image, (Clause) textClause2, aVar, false, (Clause) currencyClause2, bVarA2, progressStyleA, (Object) null, (Parcelable) null, 130592);
    }
}
