package ip0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class po0 implements ro0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f165856a;

    public po0(TagViewData tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f165856a = tag2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof po0) && Intrinsics.f(this.f165856a, ((po0) obj2).f165856a);
    }

    @Override // ip0.ro0
    public final TagViewData getTag() {
        return this.f165856a;
    }

    public final int hashCode() {
        return this.f165856a.hashCode();
    }
}
