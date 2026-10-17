package kgf;

import ang.f;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f183979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f183980b;

    public c(n walletInteractor, al4.n creditCardInteractor, mhf.a accountNotificationsInteractor, z delistedPocketsInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(accountNotificationsInteractor, "accountNotificationsInteractor");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f183979a = walletInteractor;
        this.f183980b = delistedPocketsInteractor;
    }
}
