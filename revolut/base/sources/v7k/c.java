package v7k;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.m;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f286675a;

    public c(e acceptPaymentLinkContentDisclaimerMapper, g acceptPaymentLinkContentNoteMapper, m transactionTextResourcesMapper, t7k.a transferLinkResourcesMapper, a paymentLinkDetailsNotOwnerActionsMapper) {
        Intrinsics.checkNotNullParameter(acceptPaymentLinkContentDisclaimerMapper, "acceptPaymentLinkContentDisclaimerMapper");
        Intrinsics.checkNotNullParameter(acceptPaymentLinkContentNoteMapper, "acceptPaymentLinkContentNoteMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transferLinkResourcesMapper, "transferLinkResourcesMapper");
        Intrinsics.checkNotNullParameter(paymentLinkDetailsNotOwnerActionsMapper, "paymentLinkDetailsNotOwnerActionsMapper");
        this.f286675a = transactionTextResourcesMapper;
    }
}
