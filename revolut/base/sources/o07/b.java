package o07;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f221159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f221160b;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f221159a, bVar.f221159a) && Intrinsics.f(this.f221160b, bVar.f221160b);
    }

    public final int hashCode() {
        return this.f221160b.hashCode() + (this.f221159a.hashCode() * 31);
    }

    public b(Data processingFeesData, Data userCompany) {
        Intrinsics.checkNotNullParameter(processingFeesData, "processingFeesData");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f221159a = processingFeesData;
        this.f221160b = userCompany;
    }

    public /* synthetic */ b(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
