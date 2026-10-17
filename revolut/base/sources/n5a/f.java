package n5a;

import a97.k;
import h3a.l;
import kotlin.jvm.internal.Intrinsics;
import opf.c0;
import p5a.s;
import p5a.t;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements a97.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f212560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p5a.c f212561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f212562c;
    public final p5a.l d;
    public final s e;
    public final com.revolut.domain.interactors.transactions.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f212563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wj0.a f212564h;

    public f(w80.b amountFormatter, p5a.c dataMapper, l itemNavigationCommandFactory, p5a.l sendMoneyNavigationProvider, s sendMoneyRecipientsProvider, t stateMapper, com.revolut.domain.interactors.transactions.a transactionsInteractor, c0 transferSuggestedAmountsInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dataMapper, "dataMapper");
        Intrinsics.checkNotNullParameter(itemNavigationCommandFactory, "itemNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(sendMoneyNavigationProvider, "sendMoneyNavigationProvider");
        Intrinsics.checkNotNullParameter(sendMoneyRecipientsProvider, "sendMoneyRecipientsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f212560a = amountFormatter;
        this.f212561b = dataMapper;
        this.f212562c = itemNavigationCommandFactory;
        this.d = sendMoneyNavigationProvider;
        this.e = sendMoneyRecipientsProvider;
        this.f = transactionsInteractor;
        this.f212563g = transferSuggestedAmountsInteractor;
        this.f212564h = idempotencyKeyHolder;
    }

    @Override // a97.g
    public final a97.h e() {
        return new a97.h(a97.e.class);
    }

    @Override // a97.g
    public final k f() {
        return new d(this);
    }
}
