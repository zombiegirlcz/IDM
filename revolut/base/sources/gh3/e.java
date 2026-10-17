package gh3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f143837a;

    public e(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f143837a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f143837a, ((e) obj2).f143837a);
    }

    public final int hashCode() {
        return this.f143837a.hashCode();
    }
}
