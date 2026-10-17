package ggk;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f143744a;

    public l(ArrayList planConfigs) {
        Intrinsics.checkNotNullParameter(planConfigs, "planConfigs");
        this.f143744a = planConfigs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f143744a.equals(((l) obj2).f143744a);
    }

    public final int hashCode() {
        return this.f143744a.hashCode();
    }
}
