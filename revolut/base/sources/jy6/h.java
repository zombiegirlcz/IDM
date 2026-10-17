package jy6;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f179335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f179336c;
    public final Data d;

    public h() {
        this(0);
    }

    public static h a(h hVar, List availableReminders, boolean z, boolean z3, Data invoiceInfo, int i) {
        if ((i & 1) != 0) {
            availableReminders = hVar.f179334a;
        }
        if ((i & 2) != 0) {
            z = hVar.f179335b;
        }
        if ((i & 4) != 0) {
            z3 = hVar.f179336c;
        }
        if ((i & 8) != 0) {
            invoiceInfo = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(availableReminders, "availableReminders");
        Intrinsics.checkNotNullParameter(invoiceInfo, "invoiceInfo");
        return new h(availableReminders, z, z3, invoiceInfo);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f179334a, hVar.f179334a) && this.f179335b == hVar.f179335b && this.f179336c == hVar.f179336c && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f179334a.hashCode() * 31, 31, this.f179335b), 31, this.f179336c);
    }

    public h(List availableReminders, boolean z, boolean z3, Data invoiceInfo) {
        Intrinsics.checkNotNullParameter(availableReminders, "availableReminders");
        Intrinsics.checkNotNullParameter(invoiceInfo, "invoiceInfo");
        this.f179334a = availableReminders;
        this.f179335b = z;
        this.f179336c = z3;
        this.d = invoiceInfo;
    }

    public h(int i) {
        this(f0.f322471a, false, false, new Data(null, null, true, 3, null));
    }
}
