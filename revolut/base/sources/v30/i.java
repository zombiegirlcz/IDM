package v30;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f285779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f285780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f285781c;
    public final Data d;
    public final boolean e;

    public i(boolean z, Data chatRatingOptions, boolean z3, Data incident, boolean z4) {
        Intrinsics.checkNotNullParameter(chatRatingOptions, "chatRatingOptions");
        Intrinsics.checkNotNullParameter(incident, "incident");
        this.f285779a = z;
        this.f285780b = chatRatingOptions;
        this.f285781c = z3;
        this.d = incident;
        this.e = z4;
    }

    public static i a(i iVar, boolean z, Data data, boolean z3, Data data2, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = iVar.f285779a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            data = iVar.f285780b;
        }
        Data chatRatingOptions = data;
        if ((i & 4) != 0) {
            z3 = iVar.f285781c;
        }
        boolean z11 = z3;
        if ((i & 8) != 0) {
            data2 = iVar.d;
        }
        Data incident = data2;
        if ((i & 16) != 0) {
            z4 = iVar.e;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(chatRatingOptions, "chatRatingOptions");
        Intrinsics.checkNotNullParameter(incident, "incident");
        return new i(z6, chatRatingOptions, z11, incident, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f285779a == iVar.f285779a && Intrinsics.f(this.f285780b, iVar.f285780b) && this.f285781c == iVar.f285781c && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + kii.e.c(this.d, j6.a.c(kii.e.c(this.f285780b, Boolean.hashCode(this.f285779a) * 31, 31), 31, this.f285781c), 31);
    }
}
