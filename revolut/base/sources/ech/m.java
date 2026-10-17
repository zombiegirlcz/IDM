package ech;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f124747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f124748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f124749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gch.c f124750s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d initialState, e mapper, j60.a bottomExpandableDialogView, gch.c recurringDepositPeriodPickerExtension) {
        super(mapper);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogView, "bottomExpandableDialogView");
        Intrinsics.checkNotNullParameter(recurringDepositPeriodPickerExtension, "recurringDepositPeriodPickerExtension");
        this.f124747p = initialState;
        this.f124748q = mapper;
        this.f124749r = bottomExpandableDialogView;
        this.f124750s = recurringDepositPeriodPickerExtension;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f124750s.c3(), null, null, new ea4.d(this, null, 7), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f124747p;
    }
}
