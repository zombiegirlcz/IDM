package muk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f209042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f209043b;

    public f(Data technicalInsights, Data data) {
        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
        this.f209042a = technicalInsights;
        this.f209043b = data;
    }

    public static f a(f fVar, Data technicalInsights, Data data, int i) {
        if ((i & 1) != 0) {
            technicalInsights = fVar.f209042a;
        }
        if ((i & 2) != 0) {
            data = fVar.f209043b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(technicalInsights, "technicalInsights");
        return new f(technicalInsights, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f209042a, fVar.f209042a) && Intrinsics.f(this.f209043b, fVar.f209043b);
    }

    public final int hashCode() {
        int iHashCode = this.f209042a.hashCode() * 31;
        Data data = this.f209043b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
