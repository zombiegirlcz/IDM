package mx0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m7 implements o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f209838a;

    public m7(TagViewData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f209838a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m7) && Intrinsics.f(this.f209838a, ((m7) obj2).f209838a);
    }

    public final int hashCode() {
        return this.f209838a.hashCode();
    }
}
