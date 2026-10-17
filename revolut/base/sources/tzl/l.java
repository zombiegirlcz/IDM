package tzl;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k50.i4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rch.o;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.t;
import vkm.t0;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzl.d f275993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f275994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f275995c;
    public final z1 d;
    public final z1 e;
    public final RuntimeException f;

    public l() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r15 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        if (r15 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(tzl.l r13, tzl.e r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tzl.l.a(tzl.l, tzl.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract boolean b(Object obj2, Object obj3, Object obj4);

    public abstract Object c(Object obj2);

    public Object d(LinkedHashSet existingKeys) {
        p50.h pageDescriptor = p50.h.f232995a;
        Intrinsics.checkNotNullParameter(pageDescriptor, "pageDescriptor");
        Intrinsics.checkNotNullParameter(existingKeys, "existingKeys");
        return null;
    }

    public abstract Object e(Object obj2, Object obj3);

    public final Data f() {
        Collection collectionValues;
        LinkedHashMap linkedHashMap = this.f275995c;
        if (linkedHashMap == null || (collectionValues = linkedHashMap.values()) == null) {
            return null;
        }
        return (Data) d0.n0(collectionValues);
    }

    public abstract Flow g(Object obj2, Object obj3, Object obj4);

    public final Object h(Object obj2, Continuation continuation) {
        Set setKeySet;
        Data data = f();
        LinkedHashMap linkedHashMap = this.f275995c;
        Object objN0 = (linkedHashMap == null || (setKeySet = linkedHashMap.keySet()) == null) ? null : d0.n0(setKeySet);
        if (data != null && objN0 != null) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (data.getError() != null || !b(objN0, data.getContent(), obj2)) {
                return Unit.f186387a;
            }
        }
        Object objI = i(this.f275993a.f284688a, obj2, continuation);
        return objI == fim.a.COROUTINE_SUSPENDED ? objI : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r3.emit(r10, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r3.emit(r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(uzl.a r9, java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof tzl.h
            if (r0 == 0) goto L13
            r0 = r11
            tzl.h r0 = (tzl.h) r0
            int r1 = r0.f275987x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275987x = r1
            goto L18
        L13:
            tzl.h r0 = new tzl.h
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f275987x
            vkm.z1 r3 = r8.d
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L54
            if (r2 == r6) goto L50
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            yhm.o.b(r11)
            goto L4d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.u
            yhm.o.b(r11)
            tzl.a r10 = new tzl.a
            r10.<init>(r9)
            r0.u = r7
            r0.f275987x = r4
            java.lang.Object r9 = r3.emit(r10, r0)
            if (r9 != r1) goto L4d
            goto L68
        L4d:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L50:
            yhm.o.b(r11)
            goto L69
        L54:
            yhm.o.b(r11)
            if (r9 == 0) goto L6c
            tzl.a r9 = new tzl.a
            r9.<init>(r10)
            r0.u = r7
            r0.f275987x = r6
            java.lang.Object r9 = r3.emit(r9, r0)
            if (r9 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6c:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tzl.l.i(uzl.a, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final t0 j(long j2) {
        return q.B(new o(2, this, l.class, "getDataFlow", "getDataFlow(Lcom/revolut/utils/paging/PagingSource$KeyStrategy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 13), t1.g(this.d, j2));
    }

    public final Object k(p50.d dVar, i4 i4Var) throws Throwable {
        Object objD;
        p50.h pageDescriptor = p50.h.f232995a;
        Intrinsics.checkNotNullParameter(pageDescriptor, "pageDescriptor");
        LinkedHashMap linkedHashMap = this.f275995c;
        if (linkedHashMap == null) {
            objD = null;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it8 = linkedHashMap.entrySet().iterator();
            while (it8.hasNext()) {
                linkedHashSet.add(((Map.Entry) it8.next()).getKey());
            }
            objD = d(linkedHashSet);
        }
        if (objD == null) {
            return Unit.f186387a;
        }
        Object objEmit = this.d.emit(new b(objD, dVar), i4Var);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r6.d.emit(r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tzl.i
            if (r0 == 0) goto L13
            r0 = r8
            tzl.i r0 = (tzl.i) r0
            int r1 = r0.f275989x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275989x = r1
            goto L18
        L13:
            tzl.i r0 = new tzl.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f275989x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L5f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            java.lang.Object r7 = r0.u
            yhm.o.b(r8)
            goto L4d
        L39:
            yhm.o.b(r8)
            r6.f275995c = r3
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r0.u = r7
            r0.f275989x = r5
            vkm.z1 r2 = r6.e
            java.lang.Object r8 = r2.emit(r8, r0)
            if (r8 != r1) goto L4d
            goto L5e
        L4d:
            tzl.c r8 = new tzl.c
            r8.<init>(r7)
            r0.u = r3
            r0.f275989x = r4
            vkm.z1 r7 = r6.d
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tzl.l.l(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r5.d.emit(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof tzl.j
            if (r0 == 0) goto L13
            r0 = r7
            tzl.j r0 = (tzl.j) r0
            int r1 = r0.f275991x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275991x = r1
            goto L18
        L13:
            tzl.j r0 = new tzl.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f275991x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            r0.u = r6
            r0.f275991x = r4
            vkm.z1 r2 = r5.e
            java.lang.Object r7 = r2.emit(r7, r0)
            if (r7 != r1) goto L4a
            goto L5c
        L4a:
            tzl.d r7 = new tzl.d
            r7.<init>(r6)
            r6 = 0
            r0.u = r6
            r0.f275991x = r3
            vkm.z1 r6 = r5.d
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tzl.l.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Flow n(j2 loadingTriggerFlow) {
        t tVar;
        Intrinsics.checkNotNullParameter(loadingTriggerFlow, "loadingTriggerFlow");
        synchronized (this) {
            Continuation continuation = null;
            tVar = new t(new q0(loadingTriggerFlow, new tqh.j(this, continuation, 23), 1), new ska.c(this, continuation, 14));
        }
        return tVar;
    }

    public l(int i) {
        uzl.d.Companion.getClass();
        uzl.d config = new uzl.d(new uzl.a());
        Intrinsics.checkNotNullParameter(config, "config");
        this.f275993a = config;
        new IllegalStateException("This paging source is already subscribed to a trigger flow. Using multiple trigger flows leads to unexpected behaviour, consider combining them in one single flow");
        this.d = q.b(1, 1, ukm.f.DROP_LATEST);
        this.e = q.b(0, 7, null);
        this.f = new RuntimeException("Loading was stopped by a new command");
    }
}
