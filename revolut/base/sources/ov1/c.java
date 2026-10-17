package ov1;

import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrebNavigation$InputData f229947a;

    public c(BrebNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f229947a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f229947a, ((c) obj2).f229947a);
    }

    public final int hashCode() {
        return this.f229947a.f61697a.hashCode();
    }
}
