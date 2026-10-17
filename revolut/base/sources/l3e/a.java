package l3e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f191936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f191937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191938c;

    public a() {
        this(null, 7);
    }

    public static a a(a aVar, Data purchases, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            purchases = aVar.f191936a;
        }
        if ((i & 2) != 0) {
            data = aVar.f191937b;
        }
        if ((i & 4) != 0) {
            z = aVar.f191938c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        return new a(purchases, data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f191936a, aVar.f191936a) && Intrinsics.f(this.f191937b, aVar.f191937b) && this.f191938c == aVar.f191938c;
    }

    public final int hashCode() {
        int iHashCode = this.f191936a.hashCode() * 31;
        Data data = this.f191937b;
        return Boolean.hashCode(this.f191938c) + ((iHashCode + (data == null ? 0 : data.hashCode())) * 31);
    }

    public a(Data purchases, Data data, boolean z) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        this.f191936a = purchases;
        this.f191937b = data;
        this.f191938c = z;
    }

    public /* synthetic */ a(Data data, int i) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? null : data, false);
    }
}
