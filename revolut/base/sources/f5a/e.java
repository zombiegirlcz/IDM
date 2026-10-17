package f5a;

import kotlin.jvm.internal.Intrinsics;
import lld.p;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132292a;

    public e(p slotChecklistControllerProvider, b chatTransferSlotChecklistEventHandler) {
        Intrinsics.checkNotNullParameter(slotChecklistControllerProvider, "slotChecklistControllerProvider");
        Intrinsics.checkNotNullParameter(chatTransferSlotChecklistEventHandler, "chatTransferSlotChecklistEventHandler");
        this.f132292a = chatTransferSlotChecklistEventHandler;
    }
}
