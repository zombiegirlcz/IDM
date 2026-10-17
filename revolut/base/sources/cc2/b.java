package cc2;

import aii.e;
import com.revolut.feature.apm.qvik.api.navigation.QvikAppSelectorNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QvikAppSelectorNavigation$InputData f22921a;

    public b(QvikAppSelectorNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f22921a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f22921a, ((b) obj2).f22921a);
    }

    public final int hashCode() {
        return this.f22921a.f62771a.hashCode();
    }
}
