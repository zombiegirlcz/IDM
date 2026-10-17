package s47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.R$string;
import ds6.f0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.i f259800a;

    public u(w47.b transactionExportComponentMapper, thf.i transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionExportComponentMapper, "transactionExportComponentMapper");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f259800a = transactionItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        int i2;
        int i3;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f0 f0Var = domainState.f259785a;
        Data data = domainState.f259786b;
        int[] iArr = t.f259799a;
        int i5 = iArr[f0Var.ordinal()];
        if (i5 == 1) {
            i = R$string.freelancer_tax_hub_transaction_export_review_inbound_title;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.freelancer_tax_hub_transaction_export_review_outbound_title;
        }
        TextLocalisedClause textLocalisedClause = null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        int i6 = iArr[f0Var.ordinal()];
        if (i6 == 1) {
            i2 = R$string.freelancer_tax_hub_transaction_export_review_inbound_caption;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.freelancer_tax_hub_transaction_export_review_outbound_caption;
        }
        p pVar = new p(textLocalisedClause2, new TextLocalisedClause(i2, null, null, 14));
        Data data2 = domainState.f259787c;
        int i21 = iArr[f0Var.ordinal()];
        if (i21 == 1) {
            i3 = R$string.freelancer_tax_hub_transaction_export_review_action_continue;
        } else {
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R$string.freelancer_tax_hub_transaction_export_review_action_generate_and_send;
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i3, null, null, 14);
        if (f0Var == f0.OUTBOUND) {
            do3.n nVar = (do3.n) data2.getContent();
            String str = nVar != null ? nVar.f116411g : null;
            if (str != null && !d0.W(str)) {
                int i22 = R$string.freelancer_tax_hub_transaction_export_review_footer_caption;
                do3.n nVar2 = (do3.n) data2.getContent();
                String str2 = nVar2 != null ? nVar2.f116411g : null;
                if (str2 == null) {
                    str2 = "";
                }
                textLocalisedClause = new TextLocalisedClause(i22, zhm.u.c(str2), null, 12);
            }
        }
        return new q(pVar, new o(textLocalisedClause3, textLocalisedClause, data.getContent() != null), (List) iii.c.f(data, new s1c.a(29), new s20.c(14), new rbe.c(this, domainState, 24)));
    }
}
