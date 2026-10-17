package rv7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f257722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257723b;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f257722a, fVar.f257722a) && Intrinsics.f(this.f257723b, fVar.f257723b);
    }

    public final int hashCode() {
        int iHashCode = this.f257722a.hashCode() * 31;
        String str = this.f257723b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public f(Data documents, String str) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f257722a = documents;
        this.f257723b = str;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), null);
    }
}
