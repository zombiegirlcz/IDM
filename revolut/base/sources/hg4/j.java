package hg4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f152093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152094b;

    public j(Data detailsContent, boolean z) {
        Intrinsics.checkNotNullParameter(detailsContent, "detailsContent");
        this.f152093a = detailsContent;
        this.f152094b = z;
    }

    public static j a(j jVar, Data detailsContent, boolean z, int i) {
        if ((i & 1) != 0) {
            detailsContent = jVar.f152093a;
        }
        if ((i & 2) != 0) {
            z = jVar.f152094b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(detailsContent, "detailsContent");
        return new j(detailsContent, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f152093a, jVar.f152093a) && this.f152094b == jVar.f152094b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152094b) + (this.f152093a.hashCode() * 31);
    }
}
