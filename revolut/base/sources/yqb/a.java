package yqb;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import yqb.b;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public final Set a(SlotContext slotContext) {
        Intrinsics.checkNotNullParameter(slotContext, "slotContext");
        b.a aVar = b.Companion;
        aVar.getClass();
        Set set = b.f316027b;
        if (!set.contains(slotContext.f87254a)) {
            return h0.f322473a;
        }
        aVar.getClass();
        return set;
    }
}
