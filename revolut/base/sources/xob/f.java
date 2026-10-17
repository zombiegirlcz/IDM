package xob;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f307768a;

    public f(Data contentData) {
        Intrinsics.checkNotNullParameter(contentData, "contentData");
        this.f307768a = contentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f307768a, ((f) obj2).f307768a);
    }

    public final int hashCode() {
        return this.f307768a.hashCode();
    }
}
