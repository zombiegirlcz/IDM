package aj3;

import com.revolut.feature.chooser.ChooserScreenContract$Model;
import kotlin.jvm.internal.Intrinsics;
import y7a.w;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChooserScreenContract$Model f5382a;

    public d(ChooserScreenContract$Model selectedModel) {
        Intrinsics.checkNotNullParameter(selectedModel, "selectedModel");
        this.f5382a = selectedModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f5382a, ((d) obj2).f5382a);
    }

    public final int hashCode() {
        return this.f5382a.hashCode();
    }
}
