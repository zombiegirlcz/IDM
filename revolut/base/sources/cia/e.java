package cia;

import jr6.r;
import kotlin.jvm.internal.Intrinsics;
import ssi.o;
import vha.s;
import vha.v0;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f24435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f24436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mt8.d f24437c;
    public final r d;
    public final o e;

    public e(s proAccountsInteractor, v0 proAccountsUpcomingPaymentsInteractor, mt8.d kycInteractor, r freelancerPendingPromptFactory, o transactionsWidgetUiModel) {
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        Intrinsics.checkNotNullParameter(proAccountsUpcomingPaymentsInteractor, "proAccountsUpcomingPaymentsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(freelancerPendingPromptFactory, "freelancerPendingPromptFactory");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        this.f24435a = proAccountsInteractor;
        this.f24436b = proAccountsUpcomingPaymentsInteractor;
        this.f24437c = kycInteractor;
        this.d = freelancerPendingPromptFactory;
        this.e = transactionsWidgetUiModel;
    }
}
