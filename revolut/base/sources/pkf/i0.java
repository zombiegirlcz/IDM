package pkf;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends yji.n implements elf.s0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0 f237074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wnf.b f237075n;
    public final bmf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dof.a f237076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final elf.b0 f237077q;

    public i0(klf.h0 commonDataSource, j0 offrampItemsMapper, wnf.b commonTransactionContentMapper, bmf.b modalFactory, dof.a dialogsProvider, elf.b0 confirmationClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(offrampItemsMapper, "offrampItemsMapper");
        Intrinsics.checkNotNullParameter(commonTransactionContentMapper, "commonTransactionContentMapper");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(confirmationClickHandler, "confirmationClickHandler");
        this.f237073l = commonDataSource;
        this.f237074m = offrampItemsMapper;
        this.f237075n = commonTransactionContentMapper;
        this.o = modalFactory;
        this.f237076p = dialogsProvider;
        this.f237077q = confirmationClickHandler;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "ID_EXTRAS_CRYPTO_OFF_RAMP_FEE")) {
            return Boolean.FALSE;
        }
        this.f237076p.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transaction_details_crypto_offramp_exchange_fee_title, null, null, 14);
        CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new TextLocalisedClause(R$string.transaction_details_crypto_offramp_exchange_fee_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ID_EXTRAS_CRYPTO_OFF_RAMP_FEE_LEARN_MORE", false), 10)));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        k9 k9Var = k9.Crypto;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        N2(bmf.a.c(this.o, textLocalisedClause, compositeClauseM, textLocalisedClause2, defaultFilledButton, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 8), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new pij.d1(this, 4));
        return Boolean.TRUE;
    }
}
