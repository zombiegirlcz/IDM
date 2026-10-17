package jk5;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ef;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import com.revolut.feature.crypto.remittance.impl.R$string;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$DomainState;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj5.b f175103a;

    public m(sj5.b cryptoRemittanceValuesShortener) {
        Intrinsics.checkNotNullParameter(cryptoRemittanceValuesShortener, "cryptoRemittanceValuesShortener");
        this.f175103a = cryptoRemittanceValuesShortener;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        List listL;
        CommonRemittanceFieldDialogContract$DomainState domainState = (CommonRemittanceFieldDialogContract$DomainState) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransactionCryptoRemittanceAction transactionCryptoRemittanceAction = domainState.f70953a;
        if (transactionCryptoRemittanceAction instanceof TransactionCryptoRemittanceAction.AddressAction) {
            textLocalisedClause = new TextLocalisedClause(R.string.common_word_address, null, null, 14);
        } else {
            if (!(transactionCryptoRemittanceAction instanceof TransactionCryptoRemittanceAction.TransactionHashAction)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_remittance_fields_transaction_hash, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, null, null, null, false, 30);
        TransactionCryptoRemittanceAction transactionCryptoRemittanceAction2 = domainState.f70953a;
        String str = domainState.f70954b;
        boolean z = transactionCryptoRemittanceAction2 instanceof TransactionCryptoRemittanceAction.AddressAction;
        sj5.b bVar = this.f175103a;
        if (z) {
            String str2 = transactionCryptoRemittanceAction2.f70932b;
            GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_copy, null, null, 6);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_remittance_fields_address_copy_action_title, null, null, 14);
            TextClause textClause = new TextClause(((hk5.b) bVar).a(str2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ef efVar = ef.ACTIONABLE;
            RowDelegate.Model[] elements = {new RowDelegate.Model("COPY_ADDRESS_ID", glyphImage, null, null, textLocalisedClause2, textClause, null, null, 0, null, false, false, null, null, null, null, efVar, null, null, 0, 0, 0, 0, 1069547372), str != null ? new RowDelegate.Model("VIEW_ADDRESS_ON_BLOCK_EXPLORER_ID", new GlyphImage(R$drawable.uikit_icn_24_eye_show, null, null, 6), null, null, new TextLocalisedClause(R$string.crypto_remittance_fields_address_block_explorer_view_action_title, null, null, 14), new TextLocalisedClause(R$string.crypto_remittance_fields_transaction_hash_block_explorer_view_action_subtitle, u.c(str), null, 12), null, null, 0, null, false, false, null, null, null, null, efVar, null, null, 0, 0, 0, 0, 1069547372) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, R$attr.uikit_dp16, 0, 0, 29);
        } else {
            if (!(transactionCryptoRemittanceAction2 instanceof TransactionCryptoRemittanceAction.TransactionHashAction)) {
                throw new NoWhenBranchMatchedException();
            }
            String str3 = transactionCryptoRemittanceAction2.f70932b;
            GlyphImage glyphImage2 = new GlyphImage(R$drawable.uikit_icn_24_copy, null, null, 6);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.crypto_remittance_fields_transaction_hash_copy_action_title, null, null, 14);
            TextClause textClause2 = new TextClause(((hk5.b) bVar).a(str3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ef efVar2 = ef.ACTIONABLE;
            RowDelegate.Model[] elements2 = {new RowDelegate.Model("COPY_TRANSACTION_HASH_ID", glyphImage2, null, null, textLocalisedClause3, textClause2, null, null, 0, null, false, false, null, null, null, null, efVar2, null, null, 0, 0, 0, 0, 1069547372), str != null ? new RowDelegate.Model("VIEW_TRANSACTION_ON_BLOCK_EXPLORER_ID", new GlyphImage(R$drawable.uikit_icn_24_eye_show, null, null, 6), null, null, new TextLocalisedClause(R$string.crypto_remittance_fields_transaction_hash_block_explorer_view_action_title, null, null, 14), new TextLocalisedClause(R$string.crypto_remittance_fields_transaction_hash_block_explorer_view_action_subtitle, u.c(str), null, 12), null, null, 0, null, false, false, null, null, null, null, efVar2, null, null, 0, 0, 0, 0, 1069547372) : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
            yp0.b.k(listL, 0, R$attr.uikit_dp16, 0, 0, 29);
        }
        return new d(listL, aVar);
    }
}
