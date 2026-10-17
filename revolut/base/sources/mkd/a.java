package mkd;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotContext f206217a;

    public a(SlotContext slotContext) {
        Intrinsics.checkNotNullParameter(slotContext, "slotContext");
        this.f206217a = slotContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f206217a, ((a) obj2).f206217a);
    }

    public final int hashCode() {
        return this.f206217a.hashCode();
    }
}
