package hcj;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.dg;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io5.b f150921a;

    public r(io5.b cryptoAddressItemsMapper) {
        Intrinsics.checkNotNullParameter(cryptoAddressItemsMapper, "cryptoAddressItemsMapper");
        this.f150921a = cryptoAddressItemsMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.List] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        ?? arrayList;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xi0.b bVar = domainState.f150905b;
        Data data = domainState.f150904a;
        n nVar = (n) data.getContent();
        ArrayList arrayList2 = nVar != null ? nVar.f150913a : null;
        n nVar2 = (n) data.getContent();
        Integer numValueOf = nVar2 != null ? Integer.valueOf(nVar2.f150914b) : null;
        Throwable error = data.getError();
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            RowDelegate.Model model = new RowDelegate.Model("ADD_ADDRESS_ID", LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_add_wallet_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804);
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(io5.b.a(this.f150921a, (CryptoAddress) it8.next()));
            }
            arrayList = i2b.a.q(model, arrayList3);
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        } else if (numValueOf != null && numValueOf.intValue() == 0) {
            FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("NO_ADDRESSES_STATE", new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_no_addresses_title, null, null, 14), new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_no_addresses_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D082", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_add_wallet_title, null, null, 14), false, null, null, false, 0, 0, 32704);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            arrayList = u.c(model2);
        } else if (arrayList2 != null && arrayList2.isEmpty()) {
            FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("NO_COMPATIBLE_STATE", new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_no_addresses_title, null, null, 14), new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_no_compatible_subtitle, ehe.n.x(bVar, ticker, null, 4), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D082", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_add_wallet_title, null, null, 14), false, null, null, false, 0, 0, 32704);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            arrayList = u.c(model3);
        } else if (error == null || data.getLoading()) {
            IntRange intRange = new IntRange(1, 3, 1);
            arrayList = new ArrayList(w.t(intRange, 10));
            vim.f it9 = intRange.iterator();
            while (it9.f289625c) {
                pb0 pb0Var = new pb0(a0.d.n("LOADING_STATE_ITEM_ID", it9.nextInt()));
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                arrayList.add(pb0Var);
            }
        } else {
            dg dgVar = new dg("ERROR_ITEM_ID", new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_error_title, null, null, 14), new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_error_subtitle, null, null, 14));
            yp0.b.l(dgVar, 0, 0, 0, 0, null, false, 63);
            arrayList = u.c(dgVar);
        }
        return new m(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_ID", false), 10))), new TextLocalisedClause(R$string.crypto_receive_deposit_return_address_list_header_title, ehe.n.x(domainState.f150905b, ticker, null, 4), null, 12), arrayList);
    }
}
