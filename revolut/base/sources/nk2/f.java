package nk2;

import com.revolut.data.model.Data;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj2.c f216632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f216633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f216634c;
    public final Data d;

    public f(tj2.c limitType, dj0.d limitAmount, Data data, Data canUpdateLimit) {
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        Intrinsics.checkNotNullParameter(canUpdateLimit, "canUpdateLimit");
        this.f216632a = limitType;
        this.f216633b = limitAmount;
        this.f216634c = data;
        this.d = canUpdateLimit;
    }

    public static f a(f fVar, Data data, Data canUpdateLimit, int i) {
        tj2.c limitType = fVar.f216632a;
        dj0.d limitAmount = fVar.f216633b;
        if ((i & 4) != 0) {
            data = fVar.f216634c;
        }
        if ((i & 8) != 0) {
            canUpdateLimit = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        Intrinsics.checkNotNullParameter(canUpdateLimit, "canUpdateLimit");
        return new f(limitType, limitAmount, data, canUpdateLimit);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f216632a == fVar.f216632a && Intrinsics.f(this.f216633b, fVar.f216633b) && Intrinsics.f(this.f216634c, fVar.f216634c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f216632a.hashCode() * 31, 31, this.f216633b);
        Data data = this.f216634c;
        return this.d.hashCode() + ((iC + (data == null ? 0 : data.hashCode())) * 31);
    }
}
