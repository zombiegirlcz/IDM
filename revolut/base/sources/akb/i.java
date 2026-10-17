package akb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f5773a;

    public i(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f5773a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f5773a, ((i) obj2).f5773a);
    }

    public final int hashCode() {
        return this.f5773a.hashCode();
    }
}
