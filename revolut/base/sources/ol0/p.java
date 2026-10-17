package ol0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.a0;
import kotlin.text.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class p {
    public static boolean a(p pVar, CharSequence charSequence, String other, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "suffix");
        int length = i - other.length();
        if (length < 0) {
            return false;
        }
        int length2 = other.length();
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return charSequence instanceof String ? a0.B((String) charSequence, length, true, other, 0, length2) : d0.d0(charSequence, length, other, 0, length2, true);
    }

    public static final void b(ArrayDeque arrayDeque, Ref$IntRef ref$IntRef, e eVar) {
        if (!arrayDeque.isEmpty()) {
            ((e) arrayDeque.last()).b(ref$IntRef.f186408a);
            ref$IntRef.f186408a = 0;
        }
        arrayDeque.addLast(eVar);
    }

    public static final void c(ArrayList arrayList, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, p pVar, ArrayDeque arrayDeque) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            Boolean boolValueOf = null;
            if (!it8.hasNext()) {
                arrayList.clear();
                int i2 = ref$IntRef.f186408a;
                ref$IntRef.f186408a = 0;
                int i3 = 0;
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    l lVar = (l) arrayList2.get(i5);
                    int i6 = lVar.f226297b;
                    boolean z = lVar.f226296a;
                    if (i6 == 1) {
                        if (boolValueOf != null && !Boolean.valueOf(z).equals(boolValueOf)) {
                            b(arrayDeque, ref$IntRef2, new m(arrayList2.subList(i3, i5)));
                            ref$IntRef2.f186408a = ((l) arrayList2.get(i5 - 1)).d;
                            i3 = i5;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                }
                if (i3 < arrayList2.size()) {
                    b(arrayDeque, ref$IntRef2, new m(arrayList2.subList(i3, arrayList2.size())));
                }
                ref$IntRef2.f186408a += i2;
                return;
            }
            Object next = it8.next();
            int i21 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            o oVar = (o) next;
            StringBuilder sb6 = oVar.f226303c;
            int length = sb6.length();
            if (length > 0) {
                int i22 = length - 1;
                if (sb6.charAt(i22) == '\n') {
                    sb6.setLength(i22);
                }
            }
            String string = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList2.add(new l(pVar.e(string, 0, string.length()), oVar.f226301a, oVar.f226302b, oVar.e));
            i = i21;
        }
    }

    public static final void d(StringBuilder sb6, p pVar, ArrayDeque arrayDeque, Ref$IntRef ref$IntRef) {
        if (sb6.length() > 0) {
            int length = sb6.length();
            if (length > 0) {
                int i = length - 1;
                if (sb6.charAt(i) == '\n') {
                    sb6.setLength(i);
                }
            }
            String string = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            b(arrayDeque, ref$IntRef, new q(pVar.e(string, 0, string.length())));
            kotlin.text.w.g(sb6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x027a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(java.lang.CharSequence r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.p.e(java.lang.CharSequence, int, int):java.util.List");
    }
}
