package s50;

import com.revolut.chat.domain.model.rate.ExperienceTagItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExperienceTagItem f259909a;

    public f(ExperienceTagItem tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f259909a = tag2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f259909a, ((f) obj2).f259909a);
    }

    public final int hashCode() {
        return this.f259909a.hashCode();
    }
}
