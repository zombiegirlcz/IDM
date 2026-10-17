package xpf;

import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends jki.g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ScheduleTransferInputData f307965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f307966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zpf.b f307967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l80.e f307968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f307969t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ScheduleTransferInputData inputData, j60.a bottomExpandableDialog, zpf.b itemsMapper, l80.e dateProvider, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f307965p = inputData;
        this.f307966q = bottomExpandableDialog;
        this.f307967r = itemsMapper;
        this.f307968s = dateProvider;
        this.f307969t = new a(inputData.f92143b, inputData.k, inputData.f92148l, inputData.f92149m, inputData.i, inputData.f92147j);
    }

    @Override // jki.g
    public final i r2() {
        return this.f307969t;
    }
}
