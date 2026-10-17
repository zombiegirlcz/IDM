package w2b;

import kotlin.jvm.internal.Intrinsics;
import vrl.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294008a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f294009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f294010c;
    public final Object d;

    public a(y2b.e inputData, y1b.a cfdInteractor, ryc.a cfdPositionFlowSinglePositionIdProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        Intrinsics.checkNotNullParameter(cfdPositionFlowSinglePositionIdProvider, "cfdPositionFlowSinglePositionIdProvider");
        this.f294009b = inputData;
        this.f294010c = cfdInteractor;
        this.d = cfdPositionFlowSinglePositionIdProvider;
    }

    public a(d inputData, t2b.c cfdFlowDataMediator, s orderLimitsByPortfolio) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cfdFlowDataMediator, "cfdFlowDataMediator");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolio, "orderLimitsByPortfolio");
        this.f294009b = inputData;
        this.f294010c = cfdFlowDataMediator;
        this.d = orderLimitsByPortfolio;
    }
}
