package fye;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;
import xg6.x;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f138982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f138983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f138984c;

    public b(x mandateInteractor, fk3.a configurationInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(mandateInteractor, "mandateInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f138982a = mandateInteractor;
        this.f138983b = configurationInteractor;
        this.f138984c = walletInteractor;
    }
}
