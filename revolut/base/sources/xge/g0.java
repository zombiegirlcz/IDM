package xge;

import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 implements b0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f305720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabAccountsMode f305721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f305722c;
    public final ConcurrentHashMap d;

    public g0(mk0.a personalisationStorage, TabAccountsMode mode) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f305720a = personalisationStorage;
        this.f305721b = mode;
        this.f305722c = hlm.d.a();
        this.d = new ConcurrentHashMap();
    }

    public static final ArrayList a(g0 g0Var, List list, String str) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(str + "_:_" + ((ProductAccountId) it8.next()).f89729a);
        }
        return arrayList;
    }

    public static String d(String str) {
        List listN0 = kotlin.text.d0.n0(str, new String[]{"_:_"}, 0, 6);
        int size = listN0.size();
        if (size == 2) {
            return (String) listN0.get(0);
        }
        if (size != 3) {
            return null;
        }
        return listN0.get(0) + "_:_" + listN0.get(1);
    }

    public final List b(String str) {
        List listN0;
        int size;
        List<String> list = (List) kii.e.n(this.f305721b.h2().f253771b, this.f305720a);
        if (list == null) {
            return zhm.f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            ProductAccountId productAccountId = null;
            if (Intrinsics.f(d(str2), str) && 2 <= (size = (listN0 = kotlin.text.d0.n0(str2, new String[]{"_:_"}, 0, 6)).size()) && size < 4) {
                productAccountId = new ProductAccountId((String) zhm.d0.m0(listN0), null);
            }
            if (productAccountId != null) {
                arrayList.add(productAccountId);
            }
        }
        return arrayList;
    }

    public final MutableSharedFlow c(String str) {
        ConcurrentHashMap concurrentHashMap = this.d;
        Object obj2 = concurrentHashMap.get(str);
        Object obj3 = obj2;
        if (obj2 == null) {
            z1 z1VarB = vkm.q.b(0, 6, null);
            z1VarB.k(b(str));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, z1VarB);
            obj3 = z1VarB;
            if (objPutIfAbsent != null) {
                obj3 = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "getOrPut(...)");
        return (MutableSharedFlow) obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r7, pie.v r8, java.util.List r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof xge.e0
            if (r0 == 0) goto L13
            r0 = r10
            xge.e0 r0 = (xge.e0) r0
            int r1 = r0.f305704w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305704w = r1
            goto L18
        L13:
            xge.e0 r0 = new xge.e0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305704w
            r3 = 0
            hlm.c r4 = r6.f305722c
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2c
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L66
        L2a:
            r7 = move-exception
            goto L6a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r10)
            pie.v r10 = pie.v.FLAT_ROOT
            if (r8 != r10) goto L40
            java.lang.String r7 = r7.getF89742b()
            goto L49
        L40:
            xge.d0 r10 = xge.g0.Companion
            r10.getClass()
            java.lang.String r7 = xge.d0.a(r7, r8)
        L49:
            boolean r8 = r4.tryLock(r3)
            if (r8 == 0) goto L6e
            r0.f305704w = r5     // Catch: java.lang.Throwable -> L2a
            cuc.c0 r8 = new cuc.c0     // Catch: java.lang.Throwable -> L2a
            r8.<init>(r6, r7, r9, r3)     // Catch: java.lang.Throwable -> L2a
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2a
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = skm.e0.J(r7, r8, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L61
            goto L63
        L61:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2a
        L63:
            if (r7 != r1) goto L66
            return r1
        L66:
            r4.unlock(r3)
            goto L6e
        L6a:
            r4.unlock(r3)
            throw r7
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xge.g0.e(com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier, pie.v, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier] */
    /* JADX WARN: Type inference failed for: r7v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r7v10, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r7v5, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r7v6, types: [hlm.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier r7, pie.v r8, java.util.List r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof xge.f0
            if (r0 == 0) goto L13
            r0 = r10
            xge.f0 r0 = (xge.f0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            xge.f0 r0 = new xge.f0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f305710y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            hlm.a r7 = r0.f305708w
            java.util.List r8 = r0.u
            java.util.List r8 = (java.util.List) r8
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L9b
        L32:
            r8 = move-exception
            goto La3
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            int r7 = r0.f305709x
            hlm.a r8 = r0.f305708w
            java.lang.String r9 = r0.v
            java.util.List r2 = r0.u
            java.util.List r2 = (java.util.List) r2
            yhm.o.b(r10)
            r10 = r7
        L4b:
            r7 = r8
            goto L7c
        L4d:
            yhm.o.b(r10)
            pie.v r10 = pie.v.FLAT_ROOT
            if (r8 != r10) goto L59
            java.lang.String r7 = r7.getF89742b()
            goto L62
        L59:
            xge.d0 r10 = xge.g0.Companion
            r10.getClass()
            java.lang.String r7 = xge.d0.a(r7, r8)
        L62:
            r8 = r9
            java.util.List r8 = (java.util.List) r8
            r0.u = r8
            r0.v = r7
            hlm.c r8 = r6.f305722c
            r0.f305708w = r8
            r10 = 0
            r0.f305709x = r10
            r0.A = r4
            java.lang.Object r2 = r8.lock(r5, r0)
            if (r2 != r1) goto L79
            goto L9a
        L79:
            r2 = r9
            r9 = r7
            goto L4b
        L7c:
            r0.u = r5     // Catch: java.lang.Throwable -> L32
            r0.v = r5     // Catch: java.lang.Throwable -> L32
            r0.f305708w = r7     // Catch: java.lang.Throwable -> L32
            r0.f305709x = r10     // Catch: java.lang.Throwable -> L32
            r0.A = r3     // Catch: java.lang.Throwable -> L32
            cuc.c0 r8 = new cuc.c0     // Catch: java.lang.Throwable -> L32
            r8.<init>(r6, r9, r2, r5)     // Catch: java.lang.Throwable -> L32
            skm.p0 r9 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L32
            elm.f r9 = elm.f.f127540b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r8 = skm.e0.J(r9, r8, r0)     // Catch: java.lang.Throwable -> L32
            if (r8 != r1) goto L96
            goto L98
        L96:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L32
        L98:
            if (r8 != r1) goto L9b
        L9a:
            return r1
        L9b:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L32
            r7.unlock(r5)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        La3:
            r7.unlock(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xge.g0.f(com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier, pie.v, java.util.List, gim.c):java.lang.Object");
    }
}
