package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class va {

    @NotNull
    public static final ua Companion = new ua();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f153345c;
    public final String d;
    public final String e;

    public /* synthetic */ va(int i, String str, String str2, m0 m0Var, String str3, String str4) {
        if (31 != (i & 31)) {
            qlm.j1.f(ta.f153321a.getDescriptor(), i, 31);
            throw null;
        }
        this.f153343a = str;
        this.f153344b = str2;
        this.f153345c = m0Var;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof va)) {
            return false;
        }
        va vaVar = (va) obj2;
        return Intrinsics.f(this.f153343a, vaVar.f153343a) && Intrinsics.f(this.f153344b, vaVar.f153344b) && Intrinsics.f(this.f153345c, vaVar.f153345c) && Intrinsics.f(this.d, vaVar.d) && Intrinsics.f(this.e, vaVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f153345c.hashCode() + p.a.c(this.f153343a.hashCode() * 31, 31, this.f153344b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public va(String requestId, String type, m0 vehicle, String str, String str2) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        this.f153343a = requestId;
        this.f153344b = type;
        this.f153345c = vehicle;
        this.d = str;
        this.e = str2;
    }
}
