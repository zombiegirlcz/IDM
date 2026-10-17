package o1a;

import kotlin.jvm.internal.Intrinsics;
import l1a.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1a.b f221364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f221365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1a.c f221366c;

    public b(q1a.b splitBillsInteractor, l1a.e splitBillItemMapper, h splitBillMoneyRequestMapper, l1a.c splitBillDataCommentMapper) {
        Intrinsics.checkNotNullParameter(splitBillsInteractor, "splitBillsInteractor");
        Intrinsics.checkNotNullParameter(splitBillItemMapper, "splitBillItemMapper");
        Intrinsics.checkNotNullParameter(splitBillMoneyRequestMapper, "splitBillMoneyRequestMapper");
        Intrinsics.checkNotNullParameter(splitBillDataCommentMapper, "splitBillDataCommentMapper");
        this.f221364a = splitBillsInteractor;
        this.f221365b = splitBillMoneyRequestMapper;
        this.f221366c = splitBillDataCommentMapper;
    }
}
