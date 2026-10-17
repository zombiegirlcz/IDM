package com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.a;
import ec8.q;
import fci.e0;
import fe9.f;
import fee.e;
import fee.h;
import fee.i;
import fee.m;
import iii.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.g;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements n {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f89411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InboundTransactionListScreenContract$InputData f89412b;

    public b(g transactionRowMapper, InboundTransactionListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(transactionRowMapper, "transactionRowMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f89411a = transactionRowMapper;
        this.f89412b = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) c.f(domainState.f134592a, new f(4), new e0(1), new q(this, 24)), domainState.f134592a.getLoading() ? a.C0555a.f89410a : this.f89412b.f89409a.size() > 1 ? new h(new TextLocalisedClause(R$string.locate_inbound_transfer_matching_transaction_list_multiple_transactions_header_title, null, null, 14), new TextLocalisedClause(R$string.locate_inbound_transfer_matching_transaction_list_multiple_transactions_header_subtitle, null, null, 14)) : new h(new TextLocalisedClause(R$string.locate_inbound_transfer_matching_transaction_list_one_transaction_header_title, null, null, 14), new TextLocalisedClause(R$string.locate_inbound_transfer_matching_transaction_list_one_transaction_header_subtitle, null, null, 14)));
    }
}
