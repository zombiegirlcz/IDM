package ifk;

import hfk.k;
import iha.o;
import iha.q;
import iha.v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f161037a = r0.k(new Pair("FREE_PERIOD", v.FREE_PERIOD), new Pair("DISCOUNT", v.DISCOUNT_PERIOD));

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final iha.i a(hfk.k.a r10) {
        /*
            iha.i r0 = new iha.i
            java.lang.String r1 = r10.getType()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hfk.k$b r10 = r10.getPayload()
            if (r10 == 0) goto L94
            java.util.List r3 = r10.getDocuments()
            if (r3 == 0) goto L65
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r4.next()
            hfk.k$h r6 = (hfk.k.h) r6
            com.revolut.feature.pricingplans.models.documents.PricingPlanDocument r7 = new com.revolut.feature.pricingplans.models.documents.PricingPlanDocument
            java.lang.String r8 = r6.getText()
            if (r8 != 0) goto L3a
        L38:
            r7 = r2
            goto L44
        L3a:
            java.lang.String r6 = r6.getUrl()
            if (r6 != 0) goto L41
            goto L38
        L41:
            r7.<init>(r8, r6)
        L44:
            if (r7 != 0) goto L54
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            java.lang.String r8 = "Failed to map cancellation preventing offer document"
            java.lang.String r9 = "CancellationPreventingOfferMapper"
            rd0.d.a(r7, r9, r8, r2, r6)
            r7 = r2
        L54:
            if (r7 == 0) goto L24
            r5.add(r7)
            goto L24
        L5a:
            int r4 = r5.size()
            int r3 = r3.size()
            if (r4 != r3) goto L65
            goto L66
        L65:
            r5 = r2
        L66:
            java.util.List r3 = r10.getDocuments()
            if (r3 == 0) goto L6f
            if (r5 != 0) goto L6f
            goto L94
        L6f:
            iha.j r3 = new iha.j
            java.lang.String r4 = r10.getPricingPlanId()
            java.lang.String r6 = r10.getUrl()
            hfk.k$n r10 = r10.getSuccess()
            if (r10 == 0) goto L90
            iha.t r7 = new iha.t
            java.lang.String r8 = r10.getTitle()
            if (r8 != 0) goto L88
            goto L90
        L88:
            java.lang.String r10 = r10.getSubtitle()
            r7.<init>(r8, r10)
            r2 = r7
        L90:
            r3.<init>(r4, r6, r2, r5)
            r2 = r3
        L94:
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ifk.d.a(hfk.k$a):iha.i");
    }

    public static final q b(k.j jVar) {
        o oVar;
        String text = jVar.getText();
        if (text == null) {
            return null;
        }
        List<k.g> descriptors = jVar.getDescriptors();
        if (descriptors == null) {
            descriptors = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (k.g gVar : descriptors) {
            String text2 = gVar.getText();
            if (text2 == null) {
                oVar = null;
            } else {
                k.a action = gVar.getAction();
                oVar = new o(action != null ? a(action) : null, text2, gVar.getStyle());
            }
            if (oVar == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CancellationPreventingOfferMapper", "Failed to map cancellation preventing offer hypertext descriptor", null, h0Var);
                oVar = null;
            }
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        return new q(text, arrayList);
    }
}
