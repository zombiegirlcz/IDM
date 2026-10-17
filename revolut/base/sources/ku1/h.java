package ku1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c02.j f189608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f189609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f189610c;
    public final Data d;
    public final String e;
    public final String f;

    public h(c02.j jVar, Data location, Data pocketData, Data quote, String str, String str2) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f189608a = jVar;
        this.f189609b = location;
        this.f189610c = pocketData;
        this.d = quote;
        this.e = str;
        this.f = str2;
    }

    public static h a(h hVar, c02.j jVar, Data data, Data data2, Data data3, String str, String str2, int i) {
        if ((i & 1) != 0) {
            jVar = hVar.f189608a;
        }
        c02.j jVar2 = jVar;
        if ((i & 2) != 0) {
            data = hVar.f189609b;
        }
        Data location = data;
        if ((i & 4) != 0) {
            data2 = hVar.f189610c;
        }
        Data pocketData = data2;
        if ((i & 8) != 0) {
            data3 = hVar.d;
        }
        Data quote = data3;
        if ((i & 16) != 0) {
            str = hVar.e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = hVar.f;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(pocketData, "pocketData");
        Intrinsics.checkNotNullParameter(quote, "quote");
        return new h(jVar2, location, pocketData, quote, str3, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f189608a, hVar.f189608a) && Intrinsics.f(this.f189609b, hVar.f189609b) && Intrinsics.f(this.f189610c, hVar.f189610c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        c02.j jVar = this.f189608a;
        int iC = kii.e.c(this.d, kii.e.c(this.f189610c, kii.e.c(this.f189609b, (jVar == null ? 0 : jVar.hashCode()) * 31, 31), 31), 31);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
