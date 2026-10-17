package i4a;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListIdTarget f158316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppTipUIModel f158317b;

    public b(ListIdTarget target, AppTipUIModel appTipUIModel) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(appTipUIModel, "appTipUIModel");
        this.f158316a = target;
        this.f158317b = appTipUIModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f158316a.equals(bVar.f158316a) && this.f158317b.equals(bVar.f158317b);
    }

    public final int hashCode() {
        return this.f158317b.hashCode() + (this.f158316a.f58286a.hashCode() * 31);
    }
}
