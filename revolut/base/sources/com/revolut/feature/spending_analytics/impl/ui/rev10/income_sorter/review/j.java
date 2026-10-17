package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sqd.i0;
import sqd.w;
import thf.m;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.d f87873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f87874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final end.d f87875c;
    public final pqd.a d;

    public j(thf.d transactionIconResourcesMapper, m transactionTextResourcesMapper, end.d incomeSorterDestinationUIMapper, pqd.a incomeSorterDestinationSubtitleMapper, uqd.a incomeSorterReviewDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(incomeSorterDestinationUIMapper, "incomeSorterDestinationUIMapper");
        Intrinsics.checkNotNullParameter(incomeSorterDestinationSubtitleMapper, "incomeSorterDestinationSubtitleMapper");
        Intrinsics.checkNotNullParameter(incomeSorterReviewDisclaimersMapper, "incomeSorterReviewDisclaimersMapper");
        this.f87873a = transactionIconResourcesMapper;
        this.f87874b = transactionTextResourcesMapper;
        this.f87875c = incomeSorterDestinationUIMapper;
        this.d = incomeSorterDestinationSubtitleMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        sqd.a domainState = (sqd.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (w) iii.c.f(domainState.f265041a, new soi.a(13), new sl5.g(25), new si5.c(this, domainState, 3));
    }
}
