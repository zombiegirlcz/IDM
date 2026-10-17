package ip0;

import com.revolut.core.ui_kit.models.ProfileCardModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k30 implements m30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileCardModel.CircleActionButtonModel f164953a;

    public k30(ProfileCardModel.CircleActionButtonModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f164953a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k30) && Intrinsics.f(this.f164953a, ((k30) obj2).f164953a);
    }

    public final int hashCode() {
        return this.f164953a.hashCode();
    }
}
