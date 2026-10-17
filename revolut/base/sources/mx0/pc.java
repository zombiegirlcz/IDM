package mx0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagViewData f209944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f209945c;

    public pc(String listId, TagViewData tagViewData, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
        this.f209943a = listId;
        this.f209944b = tagViewData;
        this.f209945c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj2;
        return Intrinsics.f(this.f209943a, pcVar.f209943a) && Intrinsics.f(this.f209944b, pcVar.f209944b) && Intrinsics.f(this.f209945c, pcVar.f209945c);
    }

    public final int hashCode() {
        int iHashCode = (this.f209944b.hashCode() + (this.f209943a.hashCode() * 31)) * 31;
        Object obj2 = this.f209945c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
