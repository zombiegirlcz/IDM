package j3a;

import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;
import zhm.w;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e {
    public static final Set a(Set set, PaymentVendor paymentVendor) {
        Collection collectionY0;
        Intrinsics.checkNotNullParameter(set, "<this>");
        boolean zF = Intrinsics.f(set, com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a);
        WhoToTransferActionItem.ApmBillsBpay apmBillsBpay = WhoToTransferActionItem.ApmBillsBpay.f80068a;
        WhoToTransferActionItem.ApmWero apmWero = WhoToTransferActionItem.ApmWero.f80084a;
        WhoToTransferActionItem.ApmUpi apmUpi = WhoToTransferActionItem.ApmUpi.f80083a;
        WhoToTransferActionItem.ApmSpin apmSpin = WhoToTransferActionItem.ApmSpin.f80082a;
        WhoToTransferActionItem.ApmQvik apmQvik = WhoToTransferActionItem.ApmQvik.f80080a;
        WhoToTransferActionItem.ApmPix apmPix = WhoToTransferActionItem.ApmPix.f80078a;
        WhoToTransferActionItem.ApmPayId apmPayId = WhoToTransferActionItem.ApmPayId.f80077a;
        WhoToTransferActionItem.ApmMultibanco apmMultibanco = WhoToTransferActionItem.ApmMultibanco.f80075a;
        WhoToTransferActionItem.ApmIris apmIris = WhoToTransferActionItem.ApmIris.f80074a;
        WhoToTransferActionItem.ApmBreb apmBreb = WhoToTransferActionItem.ApmBreb.f80073a;
        WhoToTransferActionItem.ApmBlik apmBlik = WhoToTransferActionItem.ApmBlik.f80072a;
        WhoToTransferActionItem.ApmBizum apmBizum = WhoToTransferActionItem.ApmBizum.f80071a;
        WhoToTransferActionItem.ApmAani apmAani = WhoToTransferActionItem.ApmAani.f80067a;
        WhoToTransferActionItem.CheckRecipient checkRecipient = WhoToTransferActionItem.CheckRecipient.f80089a;
        WhoToTransferActionItem.CharityList charityList = WhoToTransferActionItem.CharityList.f80088a;
        WhoToTransferActionItem.NewCryptoAddress newCryptoAddress = WhoToTransferActionItem.NewCryptoAddress.f80095a;
        WhoToTransferActionItem.Group group = WhoToTransferActionItem.Group.f80093a;
        WhoToTransferActionItem.BankRecipient bankRecipient = WhoToTransferActionItem.BankRecipient.f80085a;
        WhoToTransferActionItem.CardRecipient cardRecipient = WhoToTransferActionItem.CardRecipient.f80086a;
        WhoToTransferActionItem.SearchAddFriend searchAddFriend = WhoToTransferActionItem.SearchAddFriend.f80102a;
        WhoToTransferActionItem.AddFriend addFriend = WhoToTransferActionItem.AddFriend.f80061a;
        WhoToTransferActionItem.AddContact addContact = WhoToTransferActionItem.AddContact.f80060a;
        if (zF) {
            return z0.i(addContact, addFriend, searchAddFriend, cardRecipient, bankRecipient, group, newCryptoAddress, charityList, checkRecipient, apmAani, apmBizum, apmBlik, apmBreb, apmIris, apmMultibanco, apmPayId, apmPix, apmQvik, apmSpin, apmUpi, apmWero, WhoToTransferActionItem.AllPaymentVendors.f80066a, WhoToTransferActionItem.PayBillsTaxes.f80096a, apmBillsBpay, WhoToTransferActionItem.PhoneTopUps.f80099a, WhoToTransferActionItem.ApmMultibancoViaVerde.f80076a, WhoToTransferActionItem.GiroDirectDebits.f80092a, WhoToTransferActionItem.MasavDirectDebits.f80094a, paymentVendor != null ? new WhoToTransferActionItem.FavoritePaymentVendor(paymentVendor) : null, WhoToTransferActionItem.QrCode.f80100a);
        }
        Set<WhoToTransferFilter> set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        for (WhoToTransferFilter whoToTransferFilter : set2) {
            if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Device.f80002a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Revolut.f80005a)) {
                WhoToTransferActionItem[] elements = {addContact, addFriend, searchAddFriend};
                Intrinsics.checkNotNullParameter(elements, "elements");
                collectionY0 = kotlin.collections.d.y0(elements);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmAani.f79985a)) {
                collectionY0 = y0.b(apmAani);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBizum.f79986a)) {
                collectionY0 = y0.b(apmBizum);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBlik.f79987a)) {
                collectionY0 = y0.b(apmBlik);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBreb.f79988a)) {
                collectionY0 = y0.b(apmBreb);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmIris.f79989a)) {
                collectionY0 = y0.b(apmIris);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmMultibanco.f79990a)) {
                collectionY0 = y0.b(apmMultibanco);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPayId.f79991a)) {
                collectionY0 = y0.b(apmPayId);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPix.f79992a)) {
                collectionY0 = y0.b(apmPix);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmQvik.f79993a)) {
                collectionY0 = y0.b(apmQvik);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmSpin.f79994a)) {
                collectionY0 = y0.b(apmSpin);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmUpi.f79995a)) {
                collectionY0 = y0.b(apmUpi);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmWero.f79996a)) {
                collectionY0 = y0.b(apmWero);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Cards.f79998a)) {
                collectionY0 = y0.b(cardRecipient);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Accounts.f79984a)) {
                collectionY0 = y0.b(bankRecipient);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Groups.f80003a)) {
                collectionY0 = y0.b(group);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.CryptoWallets.f80001a)) {
                collectionY0 = y0.b(newCryptoAddress);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Charities.f79999a)) {
                collectionY0 = y0.b(charityList);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Checks.f80000a)) {
                collectionY0 = y0.b(checkRecipient);
            } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Billers.f79997a)) {
                collectionY0 = y0.b(apmBillsBpay);
            } else {
                if (!(whoToTransferFilter instanceof WhoToTransferFilter.MobileWallet)) {
                    throw new NoWhenBranchMatchedException();
                }
                collectionY0 = h0.f322473a;
            }
            arrayList.add(collectionY0);
        }
        return d0.i1(w.u(arrayList));
    }
}
