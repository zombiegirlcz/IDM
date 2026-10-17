package lyd;

import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements td0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f200787a;

    public e(ImmutableMap mappers) {
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        this.f200787a = mappers;
    }

    @Override // td0.b
    public Set a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f200787a.entrySet()) {
            if (((xi0.c) entry.getValue()).f) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    @Override // td0.b
    public Set b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f200787a.entrySet()) {
            xi0.c cVar = (xi0.c) entry.getValue();
            if (cVar.f && cVar.f306289b == xi0.e.COMMODITY) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // td0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set c(td0.a r9) {
        /*
            r8 = this;
            java.lang.String r0 = "listedFilter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r1 = r8.f200787a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            xi0.c r3 = (xi0.c) r3
            xi0.e r4 = r3.f306289b
            boolean r3 = r3.f
            xi0.e r5 = xi0.e.FIAT
            r6 = 0
            if (r4 != r5) goto L4f
            int[] r4 = td0.c.f269907a
            int r5 = r9.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L42
            r7 = 2
            if (r4 == r7) goto L4c
            r7 = 3
            if (r4 != r7) goto L46
            if (r3 != 0) goto L44
        L42:
            r3 = r5
            goto L4c
        L44:
            r3 = r6
            goto L4c
        L46:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L4c:
            if (r3 == 0) goto L4f
            r6 = r5
        L4f:
            if (r6 == 0) goto L14
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r0.put(r3, r2)
            goto L14
        L5d:
            java.util.Set r9 = r0.keySet()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lyd.e.c(td0.a):java.util.Set");
    }

    @Override // td0.b
    public Set d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f200787a.entrySet()) {
            xi0.c cVar = (xi0.c) entry.getValue();
            if (cVar.f && cVar.f306289b == xi0.e.CRYPTO) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public e(Map currenciesInfo) {
        Intrinsics.checkNotNullParameter(currenciesInfo, "currenciesInfo");
        this.f200787a = currenciesInfo;
    }
}
