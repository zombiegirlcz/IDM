package com.revolut.feature.payments.groups.impl.ui_chat.flow;

import d8l.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lp2.c;
import oki.h;
import yki.i;
import zjh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements ls9.b {
    public final GroupChatFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f79359p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f79360q;

    public b(GroupChatFlowContract$InputData inputData, f groupChatBackgroundInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(groupChatBackgroundInteractor, "groupChatBackgroundInteractor");
        this.o = inputData;
        this.f79359p = groupChatBackgroundInteractor;
        this.f79360q = d.a(this, new c(this, 3));
    }

    @Override // yki.j
    public final void M0() {
        l2(new lo.c(this, (Continuation) null, 5), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79360q;
    }
}
