package o7e;

import com.revolut.data.model.Data;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f222771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f222772b;

    public f(Data screenData, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f222771a = screenData;
        this.f222772b = transactionsExtraData;
    }

    public static f a(f fVar, Data screenData, q transactionsExtraData, int i) {
        if ((i & 1) != 0) {
            screenData = fVar.f222771a;
        }
        if ((i & 2) != 0) {
            transactionsExtraData = fVar.f222772b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(screenData, "screenData");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return new f(screenData, transactionsExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f222771a, fVar.f222771a) && Intrinsics.f(this.f222772b, fVar.f222772b);
    }

    public final int hashCode() {
        return this.f222772b.hashCode() + (this.f222771a.hashCode() * 31);
    }
}
