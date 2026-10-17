package zq5;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f324396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f324397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f324398c;
    public final String d;
    public final String e;

    public u() {
        this(0);
    }

    public static u a(u uVar, Data data, boolean z, g gVar, String str, String str2, int i) {
        if ((i & 1) != 0) {
            data = uVar.f324396a;
        }
        Data sendRecipients = data;
        if ((i & 2) != 0) {
            z = uVar.f324397b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            gVar = uVar.f324398c;
        }
        g gVar2 = gVar;
        if ((i & 8) != 0) {
            str = uVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = uVar.e;
        }
        uVar.getClass();
        Intrinsics.checkNotNullParameter(sendRecipients, "sendRecipients");
        return new u(sendRecipients, z3, gVar2, str3, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f324396a, uVar.f324396a) && this.f324397b == uVar.f324397b && Intrinsics.f(this.f324398c, uVar.f324398c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f324396a.hashCode() * 31, 31, this.f324397b);
        g gVar = this.f324398c;
        int iHashCode = (iC + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public u(Data sendRecipients, boolean z, g gVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(sendRecipients, "sendRecipients");
        this.f324396a = sendRecipients;
        this.f324397b = z;
        this.f324398c = gVar;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ u(int i) {
        this(new Data(null, null, true, 3, null), false, null, null, null);
    }
}
