package uob;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f281595a;

    public g(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f281595a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f281595a, ((g) obj2).f281595a);
    }

    public final int hashCode() {
        return this.f281595a.hashCode();
    }
}
