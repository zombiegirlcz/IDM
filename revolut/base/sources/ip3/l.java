package ip3;

import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CorporateEventsTypeFilterScreenContract$InputData f167638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f167639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f167640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f167641s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, CorporateEventsTypeFilterScreenContract$InputData inputData, j60.a bottomDialog, f dialogMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f167638p = inputData;
        this.f167639q = bottomDialog;
        this.f167640r = dialogMapper;
        this.f167641s = new g(inputData.f66153a, inputData.f66154b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f167641s;
    }
}
