package vjj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289773a;

    public n(String str) {
        this.f289773a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f289773a, ((n) obj2).f289773a);
    }

    public final int hashCode() {
        String str = this.f289773a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
