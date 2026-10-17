package gnb;

import boh.f;
import enb.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pre.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f144952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ijb.a f144953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ugc.a f144954c;
    public final c d;

    public b(g repository, ijb.a savingsProductInteractor, ugc.a savingsChallengeInteractor, c termsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f144952a = repository;
        this.f144953b = savingsProductInteractor;
        this.f144954c = savingsChallengeInteractor;
        this.d = termsInteractor;
    }

    public final Flow a(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return f.e(ijb.a.b(this.f144953b, productId), new a(this, 0));
    }
}
