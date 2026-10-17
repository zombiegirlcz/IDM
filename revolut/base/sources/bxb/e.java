package bxb;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f19647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f19648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19649c;
    public final Data d;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data userVoucherListData, Set openedUserVoucherIds, boolean z, Data borderlessFooterData, int i) {
        if ((i & 1) != 0) {
            userVoucherListData = eVar.f19647a;
        }
        if ((i & 2) != 0) {
            openedUserVoucherIds = eVar.f19648b;
        }
        if ((i & 4) != 0) {
            z = eVar.f19649c;
        }
        if ((i & 8) != 0) {
            borderlessFooterData = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(userVoucherListData, "userVoucherListData");
        Intrinsics.checkNotNullParameter(openedUserVoucherIds, "openedUserVoucherIds");
        Intrinsics.checkNotNullParameter(borderlessFooterData, "borderlessFooterData");
        return new e(userVoucherListData, openedUserVoucherIds, z, borderlessFooterData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f19647a, eVar.f19647a) && Intrinsics.f(this.f19648b, eVar.f19648b) && this.f19649c == eVar.f19649c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.f(this.f19647a.hashCode() * 31, 31, this.f19648b), 31, this.f19649c);
    }

    public e(Data userVoucherListData, Set openedUserVoucherIds, boolean z, Data borderlessFooterData) {
        Intrinsics.checkNotNullParameter(userVoucherListData, "userVoucherListData");
        Intrinsics.checkNotNullParameter(openedUserVoucherIds, "openedUserVoucherIds");
        Intrinsics.checkNotNullParameter(borderlessFooterData, "borderlessFooterData");
        this.f19647a = userVoucherListData;
        this.f19648b = openedUserVoucherIds;
        this.f19649c = z;
        this.d = borderlessFooterData;
    }

    public e(int i) {
        this(new Data(null, null, true, 3, null), h0.f322473a, false, new Data(null, null, false, 7, null));
    }
}
