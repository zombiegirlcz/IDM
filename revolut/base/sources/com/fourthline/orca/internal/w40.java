package com.fourthline.orca.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class w40 {

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34507c;
        long d;
        long e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f34508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f34509h;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34508g = obj2;
            this.f34509h |= Integer.MIN_VALUE;
            Object objA = w40.a(null, null, 0L, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34512c;
        Object d;
        Object e;
        long f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f34513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f34514h;
        int i;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34514h = obj2;
            this.i |= Integer.MIN_VALUE;
            Object objA = w40.a(null, 0L, null, null, null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final Map a(kem.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Set<Map.Entry> setEntries = rVar.entries();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntries) {
            String str = (String) entry.getKey();
            Iterator it8 = ((Iterable) entry.getValue()).iterator();
            if (!it8.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it8.next();
            while (it8.hasNext()) {
                next = ((String) next) + ((String) it8.next());
            }
            linkedHashMap.put(str, (String) next);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(hem.c r30, long r31, java.lang.Long r33, com.fourthline.orca.internal.db0 r34, java.lang.String r35, kotlin.coroutines.Continuation r36) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.w40.a(hem.c, long, java.lang.Long, com.fourthline.orca.internal.db0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(hem.c r17, com.fourthline.orca.internal.aa r18, long r19, kotlin.coroutines.Continuation r21) {
        /*
            r0 = r21
            boolean r1 = r0 instanceof com.fourthline.orca.internal.w40.a
            if (r1 == 0) goto L15
            r1 = r0
            com.fourthline.orca.internal.w40$a r1 = (com.fourthline.orca.internal.w40.a) r1
            int r2 = r1.f34509h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f34509h = r2
            goto L1a
        L15:
            com.fourthline.orca.internal.w40$a r1 = new com.fourthline.orca.internal.w40$a
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f34508g
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f34509h
            r4 = 1
            if (r3 == 0) goto L43
            if (r3 != r4) goto L3b
            long r2 = r1.e
            long r4 = r1.d
            java.lang.Object r6 = r1.f34507c
            hem.c r6 = (hem.c) r6
            java.lang.Object r6 = r1.f34506b
            com.fourthline.orca.internal.aa r6 = (com.fourthline.orca.internal.aa) r6
            java.lang.Object r1 = r1.f34505a
            hem.c r1 = (hem.c) r1
            yhm.o.b(r0)
            r7 = r2
            r11 = r4
            goto L83
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            yhm.o.b(r0)
            long r5 = r18.a()
            wdm.f r0 = r17.a()
            kotlin.jvm.internal.p0 r3 = kotlin.jvm.internal.o0.f186429a
            java.lang.Class<byte[]> r7 = byte[].class
            kotlin.reflect.KClass r3 = r3.b(r7)
            r8 = 0
            kotlin.reflect.KType r7 = kotlin.jvm.internal.o0.b(r7)     // Catch: java.lang.Throwable -> L5c
            goto L5d
        L5c:
            r7 = r8
        L5d:
            tem.a r9 = new tem.a
            r9.<init>(r3, r7)
            r3 = r17
            r1.f34505a = r3
            r7 = r18
            r1.f34506b = r7
            r1.f34507c = r8
            r10 = r19
            r1.d = r10
            r1.e = r5
            r8 = 0
            r1.f = r8
            r1.f34509h = r4
            java.lang.Object r0 = r0.a(r9, r1)
            if (r0 != r2) goto L7e
            return r2
        L7e:
            r15 = r5
            r6 = r7
            r7 = r15
            r1 = r3
            r11 = r10
        L83:
            if (r0 == 0) goto Lac
            byte[] r0 = (byte[]) r0
            long r9 = r6.a()
            int r2 = r0.length
            long r13 = (long) r2
            com.fourthline.orca.internal.bb0 r2 = com.fourthline.orca.internal.z9.a(r7, r9, r11, r13)
            yhm.m$a r3 = yhm.m.INSTANCE
            com.fourthline.orca.internal.eb0 r3 = new com.fourthline.orca.internal.eb0
            kem.d0 r4 = r1.e()
            int r4 = r4.f183194a
            kem.r r1 = r1.getHeaders()
            java.util.Map r1 = a(r1)
            com.fourthline.orca.internal.sc r5 = new com.fourthline.orca.internal.sc
            r5.<init>(r0)
            r3.<init>(r4, r1, r5, r2)
            return r3
        Lac:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.ByteArray"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.w40.a(hem.c, com.fourthline.orca.internal.aa, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
