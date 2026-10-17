package wya;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f301185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f301186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f301187c;
    public final Data d;
    public final boolean e;

    public h(Data data, Data troubleshootActions, Data data2, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(troubleshootActions, "troubleshootActions");
        this.f301185a = data;
        this.f301186b = troubleshootActions;
        this.f301187c = z;
        this.d = data2;
        this.e = z3;
    }

    public static h a(h hVar, Data data, Data troubleshootActions, Data data2, int i) {
        if ((i & 1) != 0) {
            data = hVar.f301185a;
        }
        Data data3 = data;
        boolean z = hVar.f301187c;
        if ((i & 8) != 0) {
            data2 = hVar.d;
        }
        boolean z3 = hVar.e;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(troubleshootActions, "troubleshootActions");
        return new h(data3, troubleshootActions, data2, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f301185a, hVar.f301185a) && Intrinsics.f(this.f301186b, hVar.f301186b) && this.f301187c == hVar.f301187c && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        Data data = this.f301185a;
        int iC = j6.a.c(kii.e.c(this.f301186b, (data == null ? 0 : data.hashCode()) * 31, 31), 31, this.f301187c);
        Data data2 = this.d;
        return Boolean.hashCode(this.e) + ((iC + (data2 != null ? data2.hashCode() : 0)) * 31);
    }
}
