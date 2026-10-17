package mx0;

import com.revolut.core.ui_kit.models.NewBadgeContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewBadgeContent f209663a;

    public e(NewBadgeContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f209663a = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f209663a, ((e) obj2).f209663a);
    }

    public final int hashCode() {
        return this.f209663a.hashCode();
    }
}
