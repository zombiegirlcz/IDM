package kld;

import akd.r;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f185432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SlotContext f185433b;

    public m(r promoBanner, SlotContext context) {
        Intrinsics.checkNotNullParameter(promoBanner, "promoBanner");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f185432a = promoBanner;
        this.f185433b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f185432a, mVar.f185432a) && Intrinsics.f(this.f185433b, mVar.f185433b);
    }

    public final int hashCode() {
        return this.f185433b.hashCode() + (this.f185432a.hashCode() * 31);
    }
}
