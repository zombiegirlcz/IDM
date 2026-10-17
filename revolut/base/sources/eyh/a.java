package eyh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f130858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f130859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f130860c;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f130858a, aVar.f130858a) && Intrinsics.f(this.f130859b, aVar.f130859b) && Intrinsics.f(this.f130860c, aVar.f130860c);
    }

    public final int hashCode() {
        Data data = this.f130858a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f130859b;
        return this.f130860c.hashCode() + ((iHashCode + (data2 != null ? data2.hashCode() : 0)) * 31);
    }

    public a(Data data, Data data2, Data currentRate) {
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        this.f130858a = data;
        this.f130859b = data2;
        this.f130860c = currentRate;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
