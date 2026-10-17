package gkf;

import klf.h0;
import klf.m1;
import klf.n2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f144387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f144388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c61.a f144389c;
    public final zv9.a d;
    public final n2 e;
    public final k71.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f144390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f144391h;

    public l(h0 commonDataSource, m1 juniorDataSource, c61.a groupsDataProvider, zv9.a paymentsProductFeatureChecker, n2 splitBillDataSource, k71.i transactionDescriptor, a recurringSplitDataProvider, g splitBillActionGuard) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(groupsDataProvider, "groupsDataProvider");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(splitBillDataSource, "splitBillDataSource");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(recurringSplitDataProvider, "recurringSplitDataProvider");
        Intrinsics.checkNotNullParameter(splitBillActionGuard, "splitBillActionGuard");
        this.f144387a = commonDataSource;
        this.f144388b = juniorDataSource;
        this.f144389c = groupsDataProvider;
        this.d = paymentsProductFeatureChecker;
        this.e = splitBillDataSource;
        this.f = transactionDescriptor;
        this.f144390g = recurringSplitDataProvider;
        this.f144391h = splitBillActionGuard;
    }
}
