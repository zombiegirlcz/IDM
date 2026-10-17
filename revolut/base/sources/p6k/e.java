package p6k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6k.c f233351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q6k.e f233352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r6k.a f233353c;

    public e(q6k.c moneyRequestClickHandler, q6k.e moneyRequestMapper, r6k.a openRequestClickHandler, r6k.b openRequestMapper) {
        Intrinsics.checkNotNullParameter(moneyRequestClickHandler, "moneyRequestClickHandler");
        Intrinsics.checkNotNullParameter(moneyRequestMapper, "moneyRequestMapper");
        Intrinsics.checkNotNullParameter(openRequestClickHandler, "openRequestClickHandler");
        Intrinsics.checkNotNullParameter(openRequestMapper, "openRequestMapper");
        this.f233351a = moneyRequestClickHandler;
        this.f233352b = moneyRequestMapper;
        this.f233353c = openRequestClickHandler;
    }
}
