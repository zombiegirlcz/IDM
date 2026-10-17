package knk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f186174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f186175b;

    public f(Data layout, Data billingOption) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(billingOption, "billingOption");
        this.f186174a = layout;
        this.f186175b = billingOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f186174a, fVar.f186174a) && Intrinsics.f(this.f186175b, fVar.f186175b);
    }

    public final int hashCode() {
        return this.f186175b.hashCode() + (this.f186174a.hashCode() * 31);
    }
}
