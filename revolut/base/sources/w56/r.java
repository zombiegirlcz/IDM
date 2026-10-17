package w56;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.defi.remittances.impl.R$string;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiSendReviewScreenContract$InputData f294717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj5.a f294718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p56.a f294719c;

    public r(DeFiSendReviewScreenContract$InputData inputData, uj5.a blockchainUiMapper, p56.a deFiSendCommonUiMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        Intrinsics.checkNotNullParameter(deFiSendCommonUiMapper, "deFiSendCommonUiMapper");
        this.f294717a = inputData;
        this.f294718b = blockchainUiMapper;
        this.f294719c = deFiSendCommonUiMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k(new aw0.e(false, new TextLocalisedClause(R$string.crypto_defi_send_review_transfer_footer, null, null, 14), null, m6.c(n6.Companion, new TextLocalisedClause(R$string.crypto_defi_send_review_transfer_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, domainState.f294702b.getContent() != null, null, null, null, 988), null, null, 53), new TextLocalisedClause(R$string.crypto_defi_send_review_transfer_title, null, null, 14), (List) iii.c.f(domainState.f294702b, new w29.a(26), new w2.d(27), new vh2.o(this, domainState, 14)));
    }
}
