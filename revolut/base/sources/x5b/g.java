package x5b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBanner;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerIcon;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerText;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerTextParam;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import w5b.n5;
import w5b.p5;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g {
    /* JADX WARN: Removed duplicated region for block: B:69:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBanner a(w5b.n5 r12) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            w5b.n5$d r0 = r12.f294938a
            r1 = 0
            if (r0 != 0) goto Lc
            goto Lc1
        Lc:
            w5b.n5$g r2 = r0.f294943a
            if (r2 != 0) goto L12
            goto Lc1
        L12:
            java.lang.String r3 = r2.f294953a
            if (r3 != 0) goto L18
            goto Lc1
        L18:
            w5b.n5$f r12 = r12.f294939b
            if (r12 == 0) goto Lc1
            java.lang.String r12 = r12.f294950a
            if (r12 != 0) goto L22
            goto Lc1
        L22:
            w5b.n5$b r4 = r0.f294945c
            if (r4 == 0) goto Lc1
            java.lang.String r4 = r4.f294941a
            if (r4 == 0) goto Lc1
            boolean r5 = kotlin.text.d0.W(r4)
            if (r5 != 0) goto L31
            goto L32
        L31:
            r4 = r1
        L32:
            if (r4 != 0) goto L36
            goto Lc1
        L36:
            java.util.List r2 = r2.f294954b
            if (r2 != 0) goto L3c
            zhm.f0 r2 = zhm.f0.f322471a
        L3c:
            r5 = r2
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7b
            java.lang.Object r7 = r5.next()
            w5b.r5 r7 = (w5b.r5) r7
            boolean r8 = r7 instanceof w5b.p5
            if (r8 == 0) goto L6a
            w5b.p5 r7 = (w5b.p5) r7
            jo3.a r7 = r7.f294978a
            if (r7 == 0) goto L68
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerTextParam r8 = new com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerTextParam
            dj0.d r7 = mo3.a.o(r7)
            r8.<init>(r7)
            goto L6f
        L68:
            r8 = r1
            goto L6f
        L6a:
            boolean r7 = r7 instanceof w5b.q5
            if (r7 == 0) goto L75
            goto L68
        L6f:
            if (r8 == 0) goto L48
            r6.add(r8)
            goto L48
        L75:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L7b:
            int r5 = r6.size()
            int r2 = r2.size()
            if (r5 == r2) goto L86
            goto Lc1
        L86:
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBanner r2 = new com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBanner
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerText r5 = new com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerText
            r5.<init>(r3, r6)
            w5b.n5$e r0 = r0.f294944b
            if (r0 == 0) goto Lbd
            java.lang.String r3 = r0.f294947a
            if (r3 == 0) goto Lbd
            r5b.o[] r6 = r5b.o.values()
            int r7 = r6.length
            r8 = 0
        L9b:
            if (r8 >= r7) goto Lae
            r9 = r6[r8]
            java.lang.String r10 = r9.name()
            r11 = 1
            boolean r10 = kotlin.text.a0.z(r10, r3, r11)
            if (r10 == 0) goto Lab
            goto Laf
        Lab:
            int r8 = r8 + 1
            goto L9b
        Lae:
            r9 = r1
        Laf:
            if (r9 != 0) goto Lb2
            goto Lbd
        Lb2:
            com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerIcon r1 = new com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBannerIcon
            java.lang.String r0 = r0.f294948b
            if (r0 != 0) goto Lba
            java.lang.String r0 = ""
        Lba:
            r1.<init>(r9, r0)
        Lbd:
            r2.<init>(r5, r1, r4, r12)
            return r2
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x5b.g.a(w5b.n5):com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBanner");
    }

    public static final n5 b(CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner) {
        ArrayList arrayList;
        n5.e eVar;
        String str;
        Intrinsics.checkNotNullParameter(cobrandedCardsUpsellBanner, "<this>");
        CobrandedCardsUpsellBannerText cobrandedCardsUpsellBannerText = cobrandedCardsUpsellBanner.f82433a;
        String str2 = cobrandedCardsUpsellBannerText.f82438a;
        ArrayList arrayList2 = cobrandedCardsUpsellBannerText.f82439b;
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            arrayList = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList.add(new p5(mo3.a.p(((CobrandedCardsUpsellBannerTextParam) it8.next()).f82440a)));
            }
        } else {
            arrayList = null;
        }
        n5.g gVar = new n5.g(str2, arrayList);
        CobrandedCardsUpsellBannerIcon cobrandedCardsUpsellBannerIcon = cobrandedCardsUpsellBanner.f82434b;
        if (cobrandedCardsUpsellBannerIcon != null) {
            int i = f.f302928a[cobrandedCardsUpsellBannerIcon.f82436a.ordinal()];
            if (i == 1) {
                str = "IMAGE";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "LOTTIE";
            }
            eVar = new n5.e(str, cobrandedCardsUpsellBannerIcon.f82437b);
        } else {
            eVar = null;
        }
        String str3 = cobrandedCardsUpsellBanner.f82435c;
        if (d0.W(str3)) {
            str3 = null;
        }
        return new n5(new n5.d(gVar, eVar, str3 != null ? new n5.b(str3) : null), new n5.f(cobrandedCardsUpsellBanner.d));
    }
}
