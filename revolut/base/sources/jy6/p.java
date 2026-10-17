package jy6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceRemindersScreenContract$InputData f179350a;

    public p(InvoiceRemindersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f179350a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k(new j(new TextLocalisedClause(R$string.freelancer_sale_invoice_reminders_setup_header_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_invoice_reminders_setup_header_caption, null, null, 14)), (List) iii.c.f(domainState.d, new jxb.g(25), new jul.c(9), new joa.j(this, domainState, 9)), new i(new TextLocalisedClause(R$string.freelancer_sale_invoice_reminders_setup_action_save, null, null, 14), domainState.d.getContent() != null));
    }
}
