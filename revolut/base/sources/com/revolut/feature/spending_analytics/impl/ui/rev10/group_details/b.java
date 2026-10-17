package com.revolut.feature.spending_analytics.impl.ui.rev10.group_details;

import aw0.k7;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.MoneyClause;
import iii.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;
import qjj.g;
import qpb.i;
import qpd.f;
import qpd.k;
import qpd.l;
import qpd.r;
import qpd.s;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements n {

    @NotNull
    public static final r Companion = new r();
    public static final MoneyClause.Format.Defaults e = new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f87712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cmd.a f87713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mzi.b f87714c;
    public final GroupDetailsScreenContract$InputData d;

    public b(s groupDetailsTransactionMapper, cmd.a categoryGroupMapper, mzi.b intervalMapper, GroupDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(groupDetailsTransactionMapper, "groupDetailsTransactionMapper");
        Intrinsics.checkNotNullParameter(categoryGroupMapper, "categoryGroupMapper");
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f87712a = groupDetailsTransactionMapper;
        this.f87713b = categoryGroupMapper;
        this.f87714c = intervalMapper;
        this.d = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l((List) c.f(domainState.f248352a, new i(2), new g(24), new qbg.j(this, 12)), (k) c.f(domainState.f248352a, new i(3), new g(25), new z(this, domainState, 13)));
    }
}
