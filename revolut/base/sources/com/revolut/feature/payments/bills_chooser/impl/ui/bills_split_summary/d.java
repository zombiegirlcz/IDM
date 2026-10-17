package com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import kotlin.jvm.internal.Intrinsics;
import sgm.e3;
import wde.f;
import wk2.x;
import wp9.e0;
import wp9.v;
import zp9.a0;
import zp9.d0;
import zp9.y;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillInputData f79257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zp9.b f79258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f79259c;
    public final y d;
    public final e3 e;

    public d(SplitBillInputData inputData, zp9.b billsTopSectionMapper, a0 splitsHeaderMapper, d0 summaryV2SectionMapper, y splitTabsMapper, e3 itemizationContentMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(billsTopSectionMapper, "billsTopSectionMapper");
        Intrinsics.checkNotNullParameter(splitsHeaderMapper, "splitsHeaderMapper");
        Intrinsics.checkNotNullParameter(summaryV2SectionMapper, "summaryV2SectionMapper");
        Intrinsics.checkNotNullParameter(splitTabsMapper, "splitTabsMapper");
        Intrinsics.checkNotNullParameter(itemizationContentMapper, "itemizationContentMapper");
        this.f79257a = inputData;
        this.f79258b = billsTopSectionMapper;
        this.f79259c = summaryV2SectionMapper;
        this.d = splitTabsMapper;
        this.e = itemizationContentMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        v domainState = (v) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (e0) iii.c.f(domainState.f299202a, new x(domainState, 27), new f(domainState, 21), new vh2.o(this, domainState, 23));
    }
}
