package zq5;

import android.os.Parcelable;
import aw0.k9;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import ip0.zj;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import znd.u0;
import zq5.g;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements cli.n {

    @NotNull
    private static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoSendWalletsListControllerContract$InputData f324370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr5.c f324371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ir5.c f324372c;
    public final hr5.a d;

    public d0(CryptoSendWalletsListControllerContract$InputData inputData, gr5.c navBarMapper, gr5.b commonSearchMapper, ir5.c walletRecipientsMapper, hr5.a beneficiaryRecipientsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(commonSearchMapper, "commonSearchMapper");
        Intrinsics.checkNotNullParameter(walletRecipientsMapper, "walletRecipientsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryRecipientsMapper, "beneficiaryRecipientsMapper");
        this.f324370a = inputData;
        this.f324371b = navBarMapper;
        this.f324372c = walletRecipientsMapper;
        this.d = beneficiaryRecipientsMapper;
    }

    public static RowDelegate.Model a(String str) {
        return new RowDelegate.Model("CRYPTO_SEND_WALLETS_CLIPBOARD_ADDRESS_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_copy, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_select_address_paste_address, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, str, null, 0, 0, 0, 0, 532676600);
    }

    public final qv0.l b(i0 i0Var) {
        if (i0Var instanceof h0) {
            return this.f324372c.b((h0) i0Var);
        }
        if (!(i0Var instanceof e0)) {
            throw new NoWhenBranchMatchedException();
        }
        e0 recipient = (e0) i0Var;
        f5j.a beneficiary = recipient.f324374a;
        String str = beneficiary.f132329a;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        String strQ = j6.a.q("CryptoSendWalletsListController_SwipeToAction_", str);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(beneficiary.z);
        String strQ2 = j6.a.q("CRYPTO_SEND_BENEFICIARY_ITEM_ID", str);
        hr5.a aVar = this.d;
        m3j.l lVar = aVar.f154768a;
        Image imageA = lVar.a(beneficiary);
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(imageA, lVar.f202581b.b(beneficiary), null, false, 28);
        TextClause textClause = new TextClause(n61.j.d(beneficiary), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$attr.uikit_dp16;
        RowDelegate.Model model = new RowDelegate.Model(strQ2, image40, textClause, null, 0, null, null, null, 1, null, false, null, false, null, null, null, null, null, null, recipient, null, i, i, 0, 0, 482344664);
        gr5.a aVar2 = aVar.f154769b;
        RowDelegate.Model modelC = aVar2.c(model, recipient.f324375b);
        Intrinsics.h(instantOfEpochMilli);
        return new wh(strQ, aVar2.b(modelC, instantOfEpochMilli, R$string.crypto_withdrawals_screen_wallets_list_subtitles_tap_to_send_money), zhm.v.k(new SwipeToActionDelegate.SwipeAction(j6.a.q("CryptoSendWalletsListController_SwipeAction_Details_", str), new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.crypto_withdrawals_screen_swipe_action_details, null, null, 14), xh0.NEUTRAL, null, recipient, null, 80), new SwipeToActionDelegate.SwipeAction(j6.a.q("CryptoSendWalletsListController_SwipeAction_Send_", str), new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.crypto_withdrawals_screen_swipe_action_send, null, null, 14), xh0.PRIMARY, null, recipient, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        List list;
        u domainState = (u) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.f324397b) {
            g gVar = domainState.f324398c;
            if (gVar == null) {
                throw new IllegalArgumentException("Search result must be set in search mode");
            }
            if (gVar instanceof d) {
                listC = gr5.b.a(((d) gVar).f324369a);
            } else if (gVar instanceof e) {
                List list2 = ((e) gVar).f324373a;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    qv0.l lVarB = b((i0) it8.next());
                    if (lVarB != null) {
                        arrayList.add(lVarB);
                    }
                }
                if (arrayList.isEmpty()) {
                    m70.a.c(t0.f186434a);
                    listC = gr5.b.a("");
                } else {
                    yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                    list = arrayList;
                    listC = list;
                }
            } else {
                boolean z = gVar instanceof f;
                ir5.c cVar = this.f324372c;
                if (z) {
                    f fVar = (f) gVar;
                    ArrayList compatibleRecipients = fVar.f324376a;
                    ArrayList incompatibleRecipients = fVar.f324377b;
                    xi0.b bVar = this.f324370a.f71334a;
                    Intrinsics.checkNotNullParameter(compatibleRecipients, "compatibleRecipients");
                    Intrinsics.checkNotNullParameter(incompatibleRecipients, "incompatibleRecipients");
                    if (bVar == null) {
                        ArrayList arrayListE0 = zhm.d0.E0(incompatibleRecipients, compatibleRecipients);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it9 = arrayListE0.iterator();
                        while (it9.hasNext()) {
                            qv0.l lVarB2 = cVar.b((f0) it9.next());
                            if (lVarB2 != null) {
                                arrayList2.add(lVarB2);
                            }
                        }
                        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                        listC = arrayList2;
                    } else {
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(compatibleRecipients, 10));
                        Iterator it10 = compatibleRecipients.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(cVar.c((f0) it10.next()));
                        }
                        yp0.b.k(arrayList3, 0, R$attr.uikit_dp16, 0, 0, 29);
                        Collection collectionE0 = !arrayList3.isEmpty() ? zhm.d0.E0(arrayList3, zhm.u.c(new ListSubheaderDelegate.Model("CRYPTO_SEND_WALLETS_COMPATIBLE_ADDRESSES_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_compatible_header_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458))) : zhm.f0.f322471a;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(incompatibleRecipients, 10));
                        Iterator it11 = incompatibleRecipients.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(cVar.c((f0) it11.next()));
                        }
                        yp0.b.k(arrayList4, 0, R$attr.uikit_dp16, 0, 0, 29);
                        listC = zhm.d0.E0(!arrayList4.isEmpty() ? zhm.d0.E0(arrayList4, zhm.u.c(new ListSubheaderDelegate.Model("CRYPTO_SEND_WALLETS_INCOMPATIBLE_ADDRESSES_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_incompatible_header_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458))) : zhm.f0.f322471a, collectionE0);
                    }
                } else if (gVar instanceof i) {
                    String address = ((i) gVar).f324384a;
                    Intrinsics.checkNotNullParameter(address, "address");
                    List listL = zhm.v.l(cVar.b(new g0(address)));
                    yp0.b.k(listL, 0, 0, 0, 0, 31);
                    list = listL;
                    listC = list;
                } else if (gVar instanceof g.a) {
                    FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("CRYPTO_SEND_WALLETS_INCOMPATIBLE_QUERY_ADDRESS_ID", new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_incompatible_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_incompatible_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "CRYPTO_SEND_WALLETS_INCOMPATIBLE_QUERY_ADDRESS_CLICK_ID", false), 10))), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, zj.REGULAR, false, null, null, null, 1856);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    listC = zhm.u.c(model);
                } else {
                    if (!(gVar instanceof h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String address2 = ((h) gVar).f324383a;
                    Intrinsics.checkNotNullParameter(address2, "address");
                    List listC2 = zhm.u.c(new RowDelegate.Model("CRYPTO_SEND_WALLETS_REJECTED_COMPATIBLE_ADDRESS_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), new InactiveCircleBadge(dw0.a.Cancelled), null, false, null, false, 60), new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_rejected_description, zhm.u.c(new TextClause(((hk5.b) cVar.f168008b).a(address2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, null, null, null, 0, null, false, null, false, RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536852472));
                    yp0.b.k(listC2, 0, 0, 0, 0, 31);
                    listC = listC2;
                }
            }
        } else {
            listC = (List) iii.c.f(domainState.f324396a, new u0(21), new znc.j(21), new zhl.l(domainState, this, 6));
        }
        String str = domainState.e;
        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = this.f324371b.f145940a;
        Clause textLocalisedClause = cryptoSendWalletsListControllerContract$InputData.f71334a == null ? new TextLocalisedClause(R$string.crypto_withdrawals_send_title, null, null, 14) : yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(R$string.crypto_withdrawals_send_title, null, null, 14), ix0.d0.a(cryptoSendWalletsListControllerContract$InputData.f71334a, null)));
        aim.e eVarB = zhm.u.b();
        if (!ue8.c.G(cryptoSendWalletsListControllerContract$InputData)) {
            eVarB.add(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "CRYPTO_SEND_WALLETS_INFO_ICON_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
        }
        eVarB.add(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "CRYPTO_SEND_WALLETS_PLUS_ICON_ID", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124));
        return new x(listC, str, new w(textLocalisedClause, zhm.u.a(eVarB), ue8.c.G(cryptoSendWalletsListControllerContract$InputData) ? new k9(null, null, 3) : new k9(null, new aw0.c("CRYPTO_SEND_WALLETS_SCAN_ADDRESS_QR_ID", new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), 1), ue8.c.G(cryptoSendWalletsListControllerContract$InputData) ? new TextLocalisedClause(R$string.crypto_withdrawals_search_hint, null, null, 14) : new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_search_hint, null, null, 14), !ue8.c.G(cryptoSendWalletsListControllerContract$InputData)));
    }
}
