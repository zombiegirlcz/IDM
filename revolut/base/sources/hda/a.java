package hda;

import aii.e;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketDetailsFlowContract$InputData f151396a;

    public a(PocketDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f151396a = inputData;
    }

    public final PocketDetailsFlowContract$InputData b() {
        return this.f151396a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f151396a, ((a) obj2).f151396a);
    }

    public final int hashCode() {
        return this.f151396a.hashCode();
    }
}
