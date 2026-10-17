package q35;

import ip0.v7;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f241842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f241843c;
    public final w d;
    public final v e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f241844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZonedDateTime f241845h;
    public final String i;

    public x(String id10, dj0.d amount, u mode, w type, v state, String str, String str2, ZonedDateTime zonedDateTime, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f241841a = id10;
        this.f241842b = amount;
        this.f241843c = mode;
        this.d = type;
        this.e = state;
        this.f = str;
        this.f241844g = str2;
        this.f241845h = zonedDateTime;
        this.i = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
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
            boolean r1 = r5 instanceof q35.x
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q35.x r5 = (q35.x) r5
            java.lang.String r1 = r4.f241841a
            java.lang.String r3 = r5.f241841a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            dj0.d r1 = r4.f241842b
            dj0.d r3 = r5.f241842b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            q35.u r1 = r4.f241843c
            q35.u r3 = r5.f241843c
            if (r1 == r3) goto L29
            return r2
        L29:
            q35.w r1 = r4.d
            q35.w r3 = r5.d
            if (r1 == r3) goto L30
            return r2
        L30:
            q35.v r1 = r4.e
            q35.v r3 = r5.e
            if (r1 == r3) goto L37
            return r2
        L37:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L42
            return r2
        L42:
            java.lang.String r1 = r5.f241844g
            java.lang.String r3 = r4.f241844g
            if (r3 != 0) goto L4e
            if (r1 != 0) goto L4c
            r1 = r0
            goto L55
        L4c:
            r1 = r2
            goto L55
        L4e:
            if (r1 != 0) goto L51
            goto L4c
        L51:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        L55:
            if (r1 != 0) goto L58
            return r2
        L58:
            java.time.ZonedDateTime r1 = r4.f241845h
            java.time.ZonedDateTime r3 = r5.f241845h
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L63
            return r2
        L63:
            java.lang.String r1 = r4.i
            java.lang.String r5 = r5.i
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 != 0) goto L6e
            return r2
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q35.x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f241843c.hashCode() + v7.c(this.f241841a.hashCode() * 31, 31, this.f241842b)) * 31)) * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f241844g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.f241845h;
        int iHashCode4 = (iHashCode3 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
