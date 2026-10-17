package k7;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f181766c = new f("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f181768b;

    public f(String... strArr) {
        this.f181767a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f181767a
            int r1 = r0.size()
            r2 = 0
            if (r8 < r1) goto Lb
            goto L87
        Lb:
            int r1 = r0.size()
            r3 = 1
            int r1 = r1 - r3
            if (r8 != r1) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            java.lang.Object r4 = r0.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "**"
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L4f
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L35
            java.lang.String r9 = "*"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L33
            goto L35
        L33:
            r9 = r2
            goto L36
        L35:
            r9 = r3
        L36:
            if (r1 != 0) goto L4c
            int r1 = r0.size()
            int r1 = r1 + (-2)
            if (r8 != r1) goto L87
            java.lang.Object r8 = a0.d.e(r3, r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L87
        L4c:
            if (r9 == 0) goto L87
            goto L7e
        L4f:
            if (r1 != 0) goto L7c
            int r4 = r8 + 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L7c
            int r9 = r0.size()
            int r9 = r9 + (-2)
            if (r8 == r9) goto L7e
            int r9 = r0.size()
            int r9 = r9 + (-3)
            if (r8 != r9) goto L87
            java.lang.Object r8 = a0.d.e(r3, r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L87
            goto L7e
        L7c:
            if (r1 == 0) goto L7f
        L7e:
            return r3
        L7f:
            int r8 = r8 + r3
            int r1 = r0.size()
            int r1 = r1 - r3
            if (r8 >= r1) goto L88
        L87:
            return r2
        L88:
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.f.a(int, java.lang.String):boolean");
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f181767a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f181767a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f181767a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && f.class == obj2.getClass()) {
            f fVar = (f) obj2;
            if (!this.f181767a.equals(fVar.f181767a)) {
                return false;
            }
            g gVar = this.f181768b;
            g gVar2 = fVar.f181768b;
            if (gVar != null) {
                return gVar.equals(gVar2);
            }
            if (gVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f181767a.hashCode() * 31;
        g gVar = this.f181768b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("KeyPath{keys=");
        sb6.append(this.f181767a);
        sb6.append(",resolved=");
        return j6.a.x(sb6, this.f181768b != null, CoreConstants.CURLY_RIGHT);
    }

    public f(f fVar) {
        this.f181767a = new ArrayList(fVar.f181767a);
        this.f181768b = fVar.f181768b;
    }
}
