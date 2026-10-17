package i47;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.R$string;
import ds6.d0;
import i2l.n0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w47.b f158307a;

    public r(w47.b transactionExportComponentMapper) {
        Intrinsics.checkNotNullParameter(transactionExportComponentMapper, "transactionExportComponentMapper");
        this.f158307a = transactionExportComponentMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        l lVar = new l(new TextLocalisedClause(R$string.freelancer_tax_hub_transaction_export_filter_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_tax_hub_transaction_export_filter_caption, null, null, 14));
        Data data = domainState.f158287a;
        d0 d0Var = (d0) data.getContent();
        int i = d0Var != null ? d0Var.e : 0;
        return new m(lVar, new k(new TextLocalisedClause(i > 100 ? R$string.freelancer_tax_hub_transaction_export_review_action_generate_and_send : R$string.freelancer_tax_hub_transaction_export_filter_section_action_continue, null, null, 14), (data.getContent() == null || domainState.f158289c.isEmpty() || ((i <= 2000) && domainState.f158288b.isEmpty())) ? false : true, data.getContent() != null), (List) iii.c.f(domainState.f158287a, new i3k.h(4), new n0(5), new hb4.n(this, domainState, 22)));
    }
}
