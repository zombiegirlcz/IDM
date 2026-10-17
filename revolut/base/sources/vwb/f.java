package vwb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f292689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f292690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f292691c;
    public final Data d;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data voucherProductGroupResponseData, boolean z, Data borderlessFooterData, Data legalEntityContext, int i) {
        if ((i & 1) != 0) {
            voucherProductGroupResponseData = fVar.f292689a;
        }
        if ((i & 2) != 0) {
            z = fVar.f292690b;
        }
        if ((i & 4) != 0) {
            borderlessFooterData = fVar.f292691c;
        }
        if ((i & 8) != 0) {
            legalEntityContext = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(voucherProductGroupResponseData, "voucherProductGroupResponseData");
        Intrinsics.checkNotNullParameter(borderlessFooterData, "borderlessFooterData");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new f(voucherProductGroupResponseData, borderlessFooterData, legalEntityContext, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f292689a, fVar.f292689a) && this.f292690b == fVar.f292690b && Intrinsics.f(this.f292691c, fVar.f292691c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f292691c, j6.a.c(this.f292689a.hashCode() * 31, 31, this.f292690b), 31);
    }

    public f(Data voucherProductGroupResponseData, Data borderlessFooterData, Data legalEntityContext, boolean z) {
        Intrinsics.checkNotNullParameter(voucherProductGroupResponseData, "voucherProductGroupResponseData");
        Intrinsics.checkNotNullParameter(borderlessFooterData, "borderlessFooterData");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f292689a = voucherProductGroupResponseData;
        this.f292690b = z;
        this.f292691c = borderlessFooterData;
        this.d = legalEntityContext;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false);
    }
}
