package dah;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzg.a f112533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f112534b;

    public f(mzg.a type, Data data) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f112533a = type;
        this.f112534b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f112533a == fVar.f112533a && Intrinsics.f(this.f112534b, fVar.f112534b);
    }

    public final int hashCode() {
        int iHashCode = this.f112533a.hashCode() * 31;
        Data data = this.f112534b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
