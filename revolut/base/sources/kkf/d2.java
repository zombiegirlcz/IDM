package kkf;

import com.revolut.feature.transactions.impl.ui.kompot.details.block_provider.InvoiceBlockProvider$InvoiceLinkAction;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d2 extends yji.n implements elf.s0 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184637l;

    public d2(klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f184637l = commonDataSource;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_INVOICE_LINK")) {
            InvoiceBlockProvider$InvoiceLinkAction invoiceBlockProvider$InvoiceLinkAction = obj2 instanceof InvoiceBlockProvider$InvoiceLinkAction ? (InvoiceBlockProvider$InvoiceLinkAction) obj2 : null;
            if (invoiceBlockProvider$InvoiceLinkAction == null) {
                return Boolean.FALSE;
            }
            A2(new ExternalDestination.Browser(invoiceBlockProvider$InvoiceLinkAction.f92041a, null));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
