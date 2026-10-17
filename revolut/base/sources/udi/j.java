package udi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f279212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f279213b;

    public j() {
        this(0);
    }

    public static j a(j jVar, Data pointsPocket, Data thresholdsData, int i) {
        if ((i & 1) != 0) {
            pointsPocket = jVar.f279212a;
        }
        if ((i & 2) != 0) {
            thresholdsData = jVar.f279213b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(pointsPocket, "pointsPocket");
        Intrinsics.checkNotNullParameter(thresholdsData, "thresholdsData");
        return new j(pointsPocket, thresholdsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f279212a, jVar.f279212a) && Intrinsics.f(this.f279213b, jVar.f279213b);
    }

    public final int hashCode() {
        return this.f279213b.hashCode() + (this.f279212a.hashCode() * 31);
    }

    public j(Data pointsPocket, Data thresholdsData) {
        Intrinsics.checkNotNullParameter(pointsPocket, "pointsPocket");
        Intrinsics.checkNotNullParameter(thresholdsData, "thresholdsData");
        this.f279212a = pointsPocket;
        this.f279213b = thresholdsData;
    }

    public /* synthetic */ j(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null));
    }
}
