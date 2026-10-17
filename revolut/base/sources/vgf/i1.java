package vgf;

import com.revolut.feature.support.api.SupportApi$Toggles$NewLocateInboundTransferEntryPoints;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreenContract$InputData;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$UnifiedTransactionList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i1 implements cli.n {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kkg.b f289103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9e.d f289104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.j f289105c;
    public final j1 d;
    public final qgf.j e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransactionsScreenContract$InputData f289106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f289107h;
    public final Object i;

    public i1(kkg.b unifiedTransactionsListMapper, a9e.d subscriptionsItemMapper, zjh.j legalEntityDisclaimerMapper, j1 transactionsScrollingHandler, qgf.j navBarInteractionMediator, gte.a featureToggleInteractor, TransactionsScreenContract$InputData inputData, wde.b inboundTransferEntryPointItemFactory) {
        Intrinsics.checkNotNullParameter(unifiedTransactionsListMapper, "unifiedTransactionsListMapper");
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(transactionsScrollingHandler, "transactionsScrollingHandler");
        Intrinsics.checkNotNullParameter(navBarInteractionMediator, "navBarInteractionMediator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inboundTransferEntryPointItemFactory, "inboundTransferEntryPointItemFactory");
        this.f289103a = unifiedTransactionsListMapper;
        this.f289104b = subscriptionsItemMapper;
        this.f289105c = legalEntityDisclaimerMapper;
        this.d = transactionsScrollingHandler;
        this.e = navBarInteractionMediator;
        this.f = featureToggleInteractor;
        this.f289106g = inputData;
        final int i = 0;
        this.f289107h = te0.w.y0(new Function0(this) { // from class: vgf.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i1 f289094b;

            {
                this.f289094b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f289094b.f).c(TransactionListApi$Toggles$UnifiedTransactionList.f91964c);
                        break;
                    default:
                        zC = ((jte.d) this.f289094b.f).c(SupportApi$Toggles$NewLocateInboundTransferEntryPoints.f89340c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.i = te0.w.y0(new Function0(this) { // from class: vgf.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i1 f289094b;

            {
                this.f289094b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f289094b.f).c(TransactionListApi$Toggles$UnifiedTransactionList.f91964c);
                        break;
                    default:
                        zC = ((jte.d) this.f289094b.f).c(SupportApi$Toggles$NewLocateInboundTransferEntryPoints.f89340c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r15) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vgf.i1.c(cli.j):cli.o");
    }
}
