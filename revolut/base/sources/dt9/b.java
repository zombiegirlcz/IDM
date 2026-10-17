package dt9;

import kotlin.jvm.internal.Intrinsics;
import mq9.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f117399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f117400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f117401c;

    public b(f groupsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f117399a = groupsInteractor;
        this.f117400b = transactionsInteractor;
        this.f117401c = userInteractor;
    }
}
