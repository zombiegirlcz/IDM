package sq5;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements g {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.g f265019a;

    public t(t70.g localization) {
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f265019a = localization;
    }

    public static LayeredImage b(CryptoAddressHostingProviderType cryptoAddressHostingProviderType) {
        int i;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = s.f265018a[cryptoAddressHostingProviderType.ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_wallet;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_apps;
        }
        return LayeredImage.Companion.b(companion, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48);
    }

    public static RowDelegate.Model d() {
        RowDelegate.Model model = new RowDelegate.Model("ADDRESS_HOSTING_PICKER_ADD_MANUALLY_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_hosting_picker_empty_state_action, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
        return model;
    }

    public static ArrayList e(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(h((a) it8.next()));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        return arrayList;
    }

    public static ListSubheaderDelegate.Model f(int i) {
        return new ListSubheaderDelegate.Model("ADDRESS_HOSTING_PICKER_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static RowDelegate.Model h(a aVar) {
        return new RowDelegate.Model(j6.a.q("ADDRESS_HOSTING_PICKER_LIST_ITEM_ID", aVar.f264996b), new RowDelegate.Model.MainImage.Image40(aVar.f264995a, null, null, false, null, false, 60), aVar.f264997c, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar.d, null, 0, 0, 0, 0, 532676600);
    }

    public final a a(CryptoAddressHostingProviderType hostingType) {
        String string;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(hostingType, "hostingType");
        int[] iArr = s.f265018a;
        int i = iArr[hostingType.ordinal()];
        t70.g gVar = this.f265019a;
        if (i == 1) {
            string = gVar.getString(R$string.crypto_withdrawals_screen_address_hosting_picker_unknown_wallet);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = gVar.getString(R$string.crypto_withdrawals_screen_address_hosting_picker_unknown_exchange);
        }
        LayeredImage layeredImageB = b(hostingType);
        int i2 = iArr[hostingType.ordinal()];
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_hosting_picker_unknown_wallet, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_hosting_picker_unknown_exchange, null, null, 14);
        }
        return new a(layeredImageB, string, textLocalisedClause, new b(string, hostingType));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        boolean z = domainState.e;
        CryptoAddressHostingProviderType cryptoAddressHostingProviderType = domainState.f265000a;
        List list2 = domainState.f;
        List list3 = domainState.f265003g;
        if (z) {
            boolean zIsEmpty = list3.isEmpty();
            boolean zIsEmpty2 = list2.isEmpty();
            if (zIsEmpty && zIsEmpty2) {
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ADDRESS_HOSTING_PICKER_EMPTY_STATE_ID", new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_hosting_picker_empty_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(8, new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_hosting_picker_empty_state_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model);
            } else {
                if (!zIsEmpty) {
                    eVarB.add(f(R$string.crypto_withdrawals_screen_address_hosting_picker_tab_exchange));
                    eVarB.addAll(e(list3));
                }
                if (!zIsEmpty2) {
                    eVarB.add(f(R$string.crypto_withdrawals_screen_address_hosting_picker_tab_wallet));
                    eVarB.addAll(e(list2));
                }
                eVarB.add(d());
            }
        } else {
            FixedTabsDelegate.Model model2 = new FixedTabsDelegate.Model("ADDRESS_HOSTING_PICKER_TABS_ID", v.k(new FixedTabs.Item("WALLET", new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_hosting_picker_tab_wallet, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item("EXCHANGE", new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_hosting_picker_tab_exchange, null, null, 14), (AnalyticsContext) null, 12)), cryptoAddressHostingProviderType.name(), null, null, R$attr.uikit_dp12, R$attr.uikit_dp0, 0, 0, 408);
            int i = R$attr.uikit_dp0;
            yp0.b.p(model2, i, i, i, i);
            eVarB.add(model2);
            int i2 = s.f265018a[cryptoAddressHostingProviderType.ordinal()];
            if (i2 == 1) {
                list = domainState.f265001b;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                list = domainState.f265002c;
            }
            List list4 = list;
            ArrayList arrayList = new ArrayList(w.t(list4, 10));
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                arrayList.add(h((a) it8.next()));
            }
            int i3 = R$attr.uikit_dp16;
            yp0.b.k(arrayList, i3, i3, 0, 0, 28);
            eVarB.addAll(arrayList);
            eVarB.add(d());
        }
        return new h(u.a(eVarB));
    }

    public final a g(pd5.a hosting, CryptoAddressHostingProviderType hostingType) {
        Image urlImage;
        Intrinsics.checkNotNullParameter(hosting, "hosting");
        Intrinsics.checkNotNullParameter(hostingType, "hostingType");
        if (hosting.f235092b.length() == 0) {
            urlImage = b(hostingType);
        } else {
            urlImage = new UrlImage(hosting.f235092b, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
        }
        String str = hosting.f235091a;
        return new a(urlImage, str, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new b(hosting.f235091a, hostingType));
    }
}
