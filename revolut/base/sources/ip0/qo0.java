package ip0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class qo0 implements ro0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f166036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ho0 f166037b;

    public qo0(TagViewData tag2, ho0 extraTag) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(extraTag, "extraTag");
        this.f166036a = tag2;
        this.f166037b = extraTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qo0)) {
            return false;
        }
        qo0 qo0Var = (qo0) obj2;
        return Intrinsics.f(this.f166036a, qo0Var.f166036a) && Intrinsics.f(this.f166037b, qo0Var.f166037b);
    }

    @Override // ip0.ro0
    public final TagViewData getTag() {
        return this.f166036a;
    }

    public final int hashCode() {
        return this.f166037b.hashCode() + (this.f166036a.hashCode() * 31);
    }
}
