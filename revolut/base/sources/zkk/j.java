package zkk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f323069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f323070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f323071c;

    public j(Data billingPicker, Data selectedBillingOption, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(billingPicker, "billingPicker");
        Intrinsics.checkNotNullParameter(selectedBillingOption, "selectedBillingOption");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f323069a = billingPicker;
        this.f323070b = selectedBillingOption;
        this.f323071c = legalEntityContext;
    }

    public static j a(j jVar, Data billingPicker, Data selectedBillingOption, Data legalEntityContext, int i) {
        if ((i & 1) != 0) {
            billingPicker = jVar.f323069a;
        }
        if ((i & 2) != 0) {
            selectedBillingOption = jVar.f323070b;
        }
        if ((i & 4) != 0) {
            legalEntityContext = jVar.f323071c;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(billingPicker, "billingPicker");
        Intrinsics.checkNotNullParameter(selectedBillingOption, "selectedBillingOption");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new j(billingPicker, selectedBillingOption, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f323069a, jVar.f323069a) && Intrinsics.f(this.f323070b, jVar.f323070b) && Intrinsics.f(this.f323071c, jVar.f323071c);
    }

    public final int hashCode() {
        return this.f323071c.hashCode() + kii.e.c(this.f323070b, this.f323069a.hashCode() * 31, 31);
    }
}
