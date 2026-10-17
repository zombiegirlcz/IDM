package or4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f228058a;

    public e(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f228058a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f228058a, ((e) obj2).f228058a);
    }

    public final int hashCode() {
        return this.f228058a.hashCode();
    }
}
