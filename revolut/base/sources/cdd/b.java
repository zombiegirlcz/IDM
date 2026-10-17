package cdd;

import com.revolut.feature.address.models.Address;
import do3.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f23236c;
    public final Address d;
    public final Boolean e;

    public b(String id10, String str, s sVar, Address address, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f23234a = id10;
        this.f23235b = str;
        this.f23236c = sVar;
        this.d = address;
        this.e = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof cdd.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cdd.b r5 = (cdd.b) r5
            java.lang.String r1 = r4.f23234a
            java.lang.String r3 = r5.f23234a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f23235b
            java.lang.String r3 = r4.f23235b
            if (r3 != 0) goto L23
            if (r1 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r1 != 0) goto L26
            goto L21
        L26:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            do3.s r1 = r4.f23236c
            do3.s r3 = r5.f23236c
            if (r1 == r3) goto L34
            return r2
        L34:
            com.revolut.feature.address.models.Address r1 = r4.d
            com.revolut.feature.address.models.Address r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.Boolean r1 = r4.e
            java.lang.Boolean r5 = r5.e
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L4a
            return r2
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cdd.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f23234a.hashCode() * 31;
        String str = this.f23235b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        s sVar = this.f23236c;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Address address = this.d;
        int iHashCode4 = (iHashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public /* synthetic */ b(String str, s sVar, Address address) {
        this(str, null, sVar, address, null);
    }
}
