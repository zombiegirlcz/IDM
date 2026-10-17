package x4e;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f302863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f302864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrendViewDelegate.a f302865c;

    public d() {
        this(null, null, null);
    }

    public static d a(d dVar, Data data, Data data2, TrendViewDelegate.a aVar, int i) {
        if ((i & 1) != 0) {
            data = dVar.f302863a;
        }
        if ((i & 2) != 0) {
            data2 = dVar.f302864b;
        }
        if ((i & 4) != 0) {
            aVar = dVar.f302865c;
        }
        dVar.getClass();
        return new d(data, data2, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f302863a, dVar.f302863a) && Intrinsics.f(this.f302864b, dVar.f302864b) && Intrinsics.f(this.f302865c, dVar.f302865c);
    }

    public final int hashCode() {
        Data data = this.f302863a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f302864b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        TrendViewDelegate.a aVar = this.f302865c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public d(Data data, Data data2, TrendViewDelegate.a aVar) {
        this.f302863a = data;
        this.f302864b = data2;
        this.f302865c = aVar;
    }
}
