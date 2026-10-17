package gp3;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f145226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f145227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145228c;
    public final Map d;

    public b(Data data, Data data2, boolean z, Map faqsExpandedState) {
        Intrinsics.checkNotNullParameter(faqsExpandedState, "faqsExpandedState");
        this.f145226a = data;
        this.f145227b = data2;
        this.f145228c = z;
        this.d = faqsExpandedState;
    }

    public static b a(b bVar, Data data, Data data2, Map faqsExpandedState, int i) {
        if ((i & 1) != 0) {
            data = bVar.f145226a;
        }
        if ((i & 2) != 0) {
            data2 = bVar.f145227b;
        }
        boolean z = bVar.f145228c;
        if ((i & 8) != 0) {
            faqsExpandedState = bVar.d;
        }
        bVar.getClass();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(faqsExpandedState, "faqsExpandedState");
        return new b(data, data2, z, faqsExpandedState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f145226a, bVar.f145226a) && Intrinsics.f(this.f145227b, bVar.f145227b) && this.f145228c == bVar.f145228c && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        Data data = this.f145226a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f145227b;
        return Boolean.hashCode(true) + p.a.e(j6.a.c((iHashCode + (data2 != null ? data2.hashCode() : 0)) * 31, 31, this.f145228c), 31, this.d);
    }
}
