package pkg;

import com.google.common.collect.ImmutableSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237168a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f237169b;

    public b(ImmutableSet dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        this.f237169b = dataSources;
    }

    public b(com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f237169b = transactionsInteractor;
    }
}
