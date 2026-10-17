package ojk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements cli.j, v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f225823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f225824b;

    public j0(Data screenConfig, a0 itemsExtraData) {
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        this.f225823a = screenConfig;
        this.f225824b = itemsExtraData;
    }

    public static j0 c(j0 j0Var, Data screenConfig, a0 itemsExtraData, int i) {
        if ((i & 1) != 0) {
            screenConfig = j0Var.f225823a;
        }
        if ((i & 2) != 0) {
            itemsExtraData = j0Var.f225824b;
        }
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        Intrinsics.checkNotNullParameter(itemsExtraData, "itemsExtraData");
        return new j0(screenConfig, itemsExtraData);
    }

    @Override // ojk.v
    public final a0 a() {
        return this.f225824b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f225823a, j0Var.f225823a) && Intrinsics.f(this.f225824b, j0Var.f225824b);
    }

    public final int hashCode() {
        return this.f225824b.hashCode() + (this.f225823a.hashCode() * 31);
    }
}
