package zzk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xel.c;
import xel.f;
import zhm.v;
import zhm.w;
import zzl.b;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f326784a;

    public a(b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f326784a = regexMatcher;
    }

    public static Integer a(int i, List list) {
        if (list != null) {
            Iterator it8 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it8.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                c cVar = (c) next;
                if (i2 > i && Intrinsics.f(cVar.f, Boolean.FALSE)) {
                    break;
                }
                i2 = i3;
            }
            if (i2 != -1) {
                return Integer.valueOf(i2);
            }
        }
        return null;
    }

    public static ArrayList b(ArrayList arrayList) {
        ArrayList arrayListS = t61.a.s("documents", arrayList);
        for (Object obj2 : arrayList) {
            f fVar = (f) obj2;
            if (fVar.f304715c && fVar.f304714b) {
                arrayListS.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayListS, 10));
        Iterator it8 = arrayListS.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((f) it8.next()).f304713a);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xel.f c(xel.c r3, xel.a r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "requiredDocument"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "inputDocumentData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 == 0) goto Lf
            java.lang.String r5 = r4.f304700b
            goto L11
        Lf:
            java.lang.String r5 = r4.f304699a
        L11:
            xel.c r5 = xel.c.a(r3, r5)
            boolean r0 = r4.f304701c
            if (r0 == 0) goto L35
            java.lang.String r3 = r3.f304709h
            if (r3 == 0) goto L2c
            java.lang.String r0 = r4.f304699a
            zzl.b r1 = r2.f326784a
            zzl.c r1 = (zzl.c) r1
            boolean r3 = r1.a(r3, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L2d
        L2c:
            r3 = 0
        L2d:
            boolean r3 = pd.b.k(r3)
            if (r3 == 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = 0
        L36:
            boolean r4 = r4.f304701c
            xel.f r0 = new xel.f
            r0.<init>(r5, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zzk.a.c(xel.c, xel.a, boolean):xel.f");
    }
}
