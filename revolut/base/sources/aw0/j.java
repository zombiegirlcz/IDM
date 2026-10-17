package aw0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f10365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10366b;

    public j(TagViewData data, List extras) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f10365a = data;
        this.f10366b = extras;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f10365a, jVar.f10365a) && Intrinsics.f(this.f10366b, jVar.f10366b);
    }

    public final int hashCode() {
        return this.f10366b.hashCode() + (this.f10365a.hashCode() * 31);
    }

    public j(TagViewData tagViewData) {
        this(tagViewData, zhm.f0.f322471a);
    }
}
