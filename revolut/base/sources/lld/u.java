package lld;

import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotChecklistControllerContract$InputData f196734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final skd.i f196735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kpj.f f196736c;

    public u(SlotChecklistControllerContract$InputData inputData, skd.i slotManagerInteractor, kpj.f slotChecklistPayloadContextMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(slotChecklistPayloadContextMapper, "slotChecklistPayloadContextMapper");
        this.f196734a = inputData;
        this.f196735b = slotManagerInteractor;
        this.f196736c = slotChecklistPayloadContextMapper;
    }
}
