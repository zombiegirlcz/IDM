package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187892a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f187894c;
    public IntRange d;
    public int e;
    public final /* synthetic */ c f;

    public b(c cVar) {
        this.f = cVar;
        int iG = kotlin.ranges.f.g(0, 0, cVar.f187897a.length());
        this.f187893b = iG;
        this.f187894c = iG;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f187894c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f187892a = r1
            r0 = 0
            r7.d = r0
            return
        Lb:
            kotlin.text.c r2 = r7.f
            int r3 = r2.f187898b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.e
            int r6 = r6 + r5
            r7.e = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f187897a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f187893b
            java.lang.CharSequence r2 = r2.f187897a
            int r2 = kotlin.text.d0.P(r2)
            r0.<init>(r1, r2, r5)
            r7.d = r0
            r7.f187894c = r4
            goto L79
        L34:
            kotlin.jvm.functions.Function2 r0 = r2.f187899c
            java.lang.CharSequence r3 = r2.f187897a
            int r6 = r7.f187894c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L58
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f187893b
            java.lang.CharSequence r2 = r2.f187897a
            int r2 = kotlin.text.d0.P(r2)
            r0.<init>(r1, r2, r5)
            r7.d = r0
            r7.f187894c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f186385a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f186386b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f187893b
            kotlin.ranges.IntRange r3 = kotlin.ranges.f.o(r3, r2)
            r7.d = r3
            int r2 = r2 + r0
            r7.f187893b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f187894c = r2
        L79:
            r7.f187892a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f187892a == -1) {
            a();
        }
        return this.f187892a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f187892a == -1) {
            a();
        }
        if (this.f187892a == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.d;
        Intrinsics.i(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f187892a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
