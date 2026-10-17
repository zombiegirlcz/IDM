package juk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f178672c;
    public final Data d;

    public e(Data marketSentiment, Data data, Data data2, String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(marketSentiment, "marketSentiment");
        this.f178670a = ref2;
        this.f178671b = marketSentiment;
        this.f178672c = data;
        this.d = data2;
    }

    public static e a(e eVar, Data marketSentiment, Data data, Data data2, int i) {
        String ref2 = eVar.f178670a;
        if ((i & 2) != 0) {
            marketSentiment = eVar.f178671b;
        }
        if ((i & 4) != 0) {
            data = eVar.f178672c;
        }
        if ((i & 8) != 0) {
            data2 = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(marketSentiment, "marketSentiment");
        return new e(marketSentiment, data, data2, ref2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f178670a, eVar.f178670a) && Intrinsics.f(this.f178671b, eVar.f178671b) && Intrinsics.f(this.f178672c, eVar.f178672c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f178671b, this.f178670a.hashCode() * 31, 31);
        Data data = this.f178672c;
        int iHashCode = (iC + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.d;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }
}
