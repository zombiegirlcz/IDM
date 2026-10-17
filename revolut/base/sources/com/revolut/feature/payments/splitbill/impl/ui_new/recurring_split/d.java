package com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split;

import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import y1a.g;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h implements y1a.c {

    @NotNull
    public static final y1a.d Companion = new y1a.d();
    public final RecurringSplitFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f79909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k1a.g f79910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f79911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f79912s;

    public d(RecurringSplitFlowContract$InputData inputData, g screenProvider, k1a.g recurringSplitInteractor, e recurringSplitMembersProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(screenProvider, "screenProvider");
        Intrinsics.checkNotNullParameter(recurringSplitInteractor, "recurringSplitInteractor");
        Intrinsics.checkNotNullParameter(recurringSplitMembersProvider, "recurringSplitMembersProvider");
        this.o = inputData;
        this.f79909p = screenProvider;
        this.f79910q = recurringSplitInteractor;
        this.f79911r = recurringSplitMembersProvider;
        this.f79912s = d8l.d.a(this, new xwd.a(this, 12));
    }

    @Override // yki.j
    public final void M0() {
        l2(new xb4.e(this, null, 20), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79912s;
    }
}
