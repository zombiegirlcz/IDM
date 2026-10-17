package bn2;

import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f17041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UiAssetLockState f17042b;

    public t(Data backgrounds, UiAssetLockState state) {
        Intrinsics.checkNotNullParameter(backgrounds, "backgrounds");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f17041a = backgrounds;
        this.f17042b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f17041a, tVar.f17041a) && Intrinsics.f(this.f17042b, tVar.f17042b);
    }

    public final int hashCode() {
        return this.f17042b.hashCode() + (this.f17041a.hashCode() * 31);
    }
}
