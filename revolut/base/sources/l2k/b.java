package l2k;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f191810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f191812c;
    public final String d;
    public final String e;
    public final String f;

    public b(Pair pair, long j2, dj0.d dVar, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        this.f191810a = pair;
        this.f191811b = j2;
        this.f191812c = dVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof l2k.b
            r2 = 0
            if (r1 != 0) goto La
            goto L56
        La:
            l2k.b r8 = (l2k.b) r8
            kotlin.Pair r1 = r7.f191810a
            kotlin.Pair r3 = r8.f191810a
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            goto L56
        L17:
            long r3 = r7.f191811b
            long r5 = r8.f191811b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            goto L56
        L20:
            dj0.d r1 = r7.f191812c
            dj0.d r3 = r8.f191812c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L2b
            goto L56
        L2b:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L36
            goto L56
        L36:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L41
            goto L56
        L41:
            java.lang.String r8 = r8.f
            java.lang.String r1 = r7.f
            if (r1 != 0) goto L4d
            if (r8 != 0) goto L4b
            r8 = r0
            goto L54
        L4b:
            r8 = r2
            goto L54
        L4d:
            if (r8 != 0) goto L50
            goto L4b
        L50:
            boolean r8 = r1.equals(r8)
        L54:
            if (r8 != 0) goto L57
        L56:
            return r2
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l2k.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f191810a.hashCode() * 31, 31, this.f191811b);
        dj0.d dVar = this.f191812c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }
}
