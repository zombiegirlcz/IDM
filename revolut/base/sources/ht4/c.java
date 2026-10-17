package ht4;

import al4.m;
import al4.n;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import thf.d;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements bm4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f155323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f155324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f155325c;
    public final d d;
    public final k0 e;

    public c(n creditCardInteractor, m creditCardInstalmentInteractor, z creditCardInstalmentTransactionsInteractor, d transactionIconMapper, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentTransactionsInteractor, "creditCardInstalmentTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionIconMapper, "transactionIconMapper");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f155323a = creditCardInteractor;
        this.f155324b = creditCardInstalmentInteractor;
        this.f155325c = creditCardInstalmentTransactionsInteractor;
        this.d = transactionIconMapper;
        this.e = creditCardFeatureInteractor;
    }
}
