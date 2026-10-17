package nue;

import com.revolut.domain.models.topup.methods.TopupMethod;
import hx7.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import yte.p;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023d, code lost:
    
        if (r0.equals("MCY_UPI_APP") == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0241, code lost:
    
        r9 = r22.getTitle();
        r10 = r22.getDescription();
        r0 = r22.getLogo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x024d, code lost:
    
        if (r0 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x024f, code lost:
    
        r5 = hx7.l.B(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0253, code lost:
    
        r11 = r5;
        r8 = r22.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0258, code lost:
    
        if (r8 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x025a, code lost:
    
        r0 = r22.getState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025e, code lost:
    
        if (r0 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0260, code lost:
    
        r18 = com.revolut.domain.models.topup.methods.UpiMethodState.valueOf(r0);
        r13 = r22.getSupportedCurrencyCodes();
        r0 = r22.getTags();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x026c, code lost:
    
        if (r0 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x026e, code lost:
    
        r2 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x027d, code lost:
    
        if (r0.hasNext() == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x027f, code lost:
    
        r4 = (java.lang.String) r0.next();
        yte.p.Companion.getClass();
        r4 = yte.o.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x028e, code lost:
    
        if (r4 == null) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0290, code lost:
    
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0296, code lost:
    
        r2 = zhm.f0.f322471a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02ac, code lost:
    
        return new com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod.UpiApp(r8, r9, r10, r11, null, r13, null, r2, r22.getFundsArrivalTimeDescription(), kotlin.jvm.internal.Intrinsics.f(r22.getType(), "MCY_UPI_APP"), r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b2, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b8, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r0.equals("MCY_NET_BANKING") == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        r9 = r22.getTitle();
        r10 = r22.getDescription();
        r0 = r22.getLogo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        r5 = hx7.l.B(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        r11 = r5;
        r8 = r22.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        if (r8 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r0 = r22.getState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
    
        r18 = com.revolut.domain.models.topup.methods.NetBankingMethodState.valueOf(r0);
        r13 = r22.getSupportedCurrencyCodes();
        r0 = r22.getTags();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        r2 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e5, code lost:
    
        if (r0.hasNext() == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        r3 = (java.lang.String) r0.next();
        yte.p.Companion.getClass();
        r3 = yte.o.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        if (r3 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
    
        r2.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r2 = zhm.f0.f322471a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
    
        return new com.revolut.domain.models.topup.methods.TopupMethod.StoredMethod.NetBanking(r8, r9, r10, r11, null, r13, null, r2, r22.getFundsArrivalTimeDescription(), kotlin.jvm.internal.Intrinsics.f(r22.getType(), "MCY_NET_BANKING"), r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011a, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r0.equals("NET_BANKING") == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b9, code lost:
    
        if (r0.equals("UPI_APP") == false) goto L213;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0437  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v27, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v35, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.domain.models.topup.methods.TopupMethod a(fue.a r22) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nue.b.a(fue.a):com.revolut.domain.models.topup.methods.TopupMethod");
    }

    public static fue.a b(TopupMethod topupMethod, String str, String str2, String str3, String str4, String str5, Map map) {
        String f60522c = topupMethod.getF60522c();
        String d = topupMethod.getD();
        io3.b e = topupMethod.getE();
        que.a aVarG = e != null ? l.G(e) : null;
        List f = topupMethod.getF();
        List f60508a = topupMethod.getF60508a();
        ArrayList arrayList = new ArrayList(w.t(f60508a, 10));
        Iterator it8 = f60508a.iterator();
        while (it8.hasNext()) {
            arrayList.add(((p) it8.next()).name());
        }
        return new fue.a(str, f60522c, d, aVarG, str2, str3, f, str4, arrayList, topupMethod.getF60523g(), str5, map);
    }
}
