package alb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f6175a;

    public e(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f6175a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f6175a, ((e) obj2).f6175a);
    }

    public final int hashCode() {
        return this.f6175a.hashCode();
    }
}
