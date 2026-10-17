package zkf;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f322956b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f322957a;

    static {
        String[] elements = {"ACCOUNT_OWNER", "ALIAS_TYPE", "ALIAS_VALUE", "BRAZIL_BANK_NUMBER", "BRAZIL_ISPB"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f322956b = kotlin.collections.d.y0(elements);
    }

    public f(d3j.b beneficiaryInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        this.f322957a = beneficiaryInteractor;
    }

    public static LinkedHashMap a(Set set, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!set.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(tof.a3 r6, tof.t3 r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zkf.e
            if (r0 == 0) goto L13
            r0 = r8
            zkf.e r0 = (zkf.e) r0
            int r1 = r0.f322955x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322955x = r1
            goto L18
        L13:
            zkf.e r0 = new zkf.e
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322955x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            tof.t3 r7 = r0.u
            yhm.o.b(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            tof.x6 r6 = r6.I
            tof.e3 r8 = r6.d
            if (r8 == 0) goto L3f
            java.lang.String r8 = r8.f272726a
            if (r8 != 0) goto L47
        L3f:
            tof.c3 r6 = r6.e
            if (r6 == 0) goto L46
            java.lang.String r8 = r6.f272662a
            goto L47
        L46:
            r8 = r4
        L47:
            if (r8 == 0) goto L72
            d3j.b r6 = r5.f322957a
            w4l.h r2 = w4l.h.f294642c
            efm.r r6 = r6.j(r8, r2)
            efm.r r6 = zi0.c.J(r6)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r0.u = r7
            r0.f322955x = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r6 = r8.getContent()
            f5j.a r6 = (f5j.a) r6
            goto L73
        L72:
            r6 = r4
        L73:
            zkf.c r8 = new zkf.c
            if (r7 == 0) goto L7a
            tof.h4 r0 = r7.K
            goto L7b
        L7a:
            r0 = r4
        L7b:
            if (r7 == 0) goto L88
            tof.h4 r1 = r7.K
            if (r1 == 0) goto L88
            kq2.p r1 = r1.f272783a
            if (r1 == 0) goto L88
            java.util.Map r1 = r1.f188325g
            goto L89
        L88:
            r1 = r4
        L89:
            if (r6 == 0) goto L8e
            java.util.Map r2 = r6.u
            goto L8f
        L8e:
            r2 = r4
        L8f:
            if (r7 == 0) goto L98
            kq2.p r7 = r7.f273068m
            if (r7 == 0) goto L98
            java.util.Map r7 = r7.f188325g
            goto L99
        L98:
            r7 = r4
        L99:
            if (r0 != 0) goto L9c
            goto Lbb
        L9c:
            java.util.Set r0 = zkf.f.f322956b
            if (r1 == 0) goto La9
            java.util.LinkedHashMap r1 = a(r0, r1)
            if (r1 != 0) goto La7
            goto La9
        La7:
            r4 = r1
            goto Lbb
        La9:
            if (r7 == 0) goto Lb0
            java.util.LinkedHashMap r7 = a(r0, r7)
            goto Lb1
        Lb0:
            r7 = r4
        Lb1:
            if (r7 != 0) goto Lba
            if (r2 == 0) goto Lbb
            java.util.LinkedHashMap r4 = a(r0, r2)
            goto Lbb
        Lba:
            r4 = r7
        Lbb:
            r8.<init>(r6, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zkf.f.b(tof.a3, tof.t3, gim.c):java.lang.Object");
    }
}
