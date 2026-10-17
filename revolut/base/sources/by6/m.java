package by6;

import bxg.t;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoicePaymentMethodsScreenContract$InputData f19758a;

    public m(InvoicePaymentMethodsScreenContract$InputData inputData, ey6.b paymentMethodsClauseFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentMethodsClauseFactory, "paymentMethodsClauseFactory");
        this.f19758a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_payment_method_setup_header_title, null, null, 14);
        InvoicePaymentMethodsScreenContract$InputData invoicePaymentMethodsScreenContract$InputData = this.f19758a;
        if (invoicePaymentMethodsScreenContract$InputData instanceof InvoicePaymentMethodsScreenContract$InputData.DefaultInvoicePaymentMethods) {
            i = R$string.freelancer_sale_invoice_payment_method_setup_header_settings_caption;
        } else {
            if (!(invoicePaymentMethodsScreenContract$InputData instanceof InvoicePaymentMethodsScreenContract$InputData.SingleInvoicePaymentMethods)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.freelancer_sale_invoice_payment_method_setup_header_caption;
        }
        return new j(new i(textLocalisedClause, new TextLocalisedClause(i, null, null, 14)), (List) iii.c.f(domainState.f19748b, new t(3), new bw4.t(15), new b88.o(25, domainState, this)), new h(new TextLocalisedClause(R$string.freelancer_sale_invoice_payment_method_setup_action_save, null, null, 14), (domainState.f19748b.getContent() == null || domainState.f19747a.isEmpty()) ? false : true));
    }
}
