package sd6;

import aii.e;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimInstructionsControllerDescriptor$InputData f261828a;

    public b(EsimInstructionsControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f261828a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f261828a, ((b) obj2).f261828a);
    }

    public final int hashCode() {
        return this.f261828a.hashCode();
    }
}
