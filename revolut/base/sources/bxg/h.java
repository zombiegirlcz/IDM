package bxg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f19688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pwg.q f19689b;

    public h(Data data, pwg.q qVar) {
        this.f19688a = data;
        this.f19689b = qVar;
    }

    public static h a(h hVar, Data data, pwg.q qVar, int i) {
        if ((i & 1) != 0) {
            data = hVar.f19688a;
        }
        if ((i & 2) != 0) {
            qVar = hVar.f19689b;
        }
        hVar.getClass();
        return new h(data, qVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f19688a, hVar.f19688a) && this.f19689b == hVar.f19689b;
    }

    public final int hashCode() {
        Data data = this.f19688a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        pwg.q qVar = this.f19689b;
        return iHashCode + (qVar != null ? qVar.hashCode() : 0);
    }
}
