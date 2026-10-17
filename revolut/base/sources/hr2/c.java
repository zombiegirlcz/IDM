package hr2;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenHeaderAction;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.TransactionStatus;
import com.revolut.feature.be_driven_design.models.domain.d;
import com.revolut.feature.selfserve.entity.config.shared.R$drawable;
import fnc.s;
import fr2.i;
import fr2.j;
import fr2.k;
import gr2.b0;
import gr2.e0;
import gr2.g;
import gr2.i0;
import gr2.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import org.jetbrains.annotations.NotNull;
import yxc.l;
import z9l.h;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements h {

    @NotNull
    public static final a Companion = new a();
    public static final int k = R$drawable.solid_background;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f154751l = r0.k(new Pair("HIGHLIGHTED", Integer.valueOf(R$attr.uikit_colorAccent)), new Pair("REGULAR_PRIMARY", Integer.valueOf(R$attr.uikit_colorForeground)), new Pair("REGULAR_SECONDARY", Integer.valueOf(R$attr.uikit_colorGrey50)), new Pair("DISABLED_PRIMARY", Integer.valueOf(R$attr.uikit_colorGrey20)), new Pair("DISABLED_SECONDARY", Integer.valueOf(R$attr.uikit_colorGrey20)), new Pair("PINK", Integer.valueOf(R$attr.uikit_colorPink)), new Pair("ORANGE", Integer.valueOf(R$attr.uikit_colorOrange)), new Pair("WHITE", Integer.valueOf(R$attr.uikit_colorWhite)), new Pair("RED", Integer.valueOf(R$attr.uikit_colorRed)), new Pair("BLACK", Integer.valueOf(R$attr.uikit_colorBlack)), new Pair("BLUE", Integer.valueOf(R$attr.uikit_colorBlue)), new Pair("GREEN", Integer.valueOf(R$attr.uikit_colorGreen)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f154752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f154753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9l.b f154754c;
    public final s d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f154755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f154756h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f154757j;

    public c(l iconMapper, l iconUiMapper, z9l.b badgeMapper, s legacyHomeScreenDomainMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(iconUiMapper, "iconUiMapper");
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        Intrinsics.checkNotNullParameter(legacyHomeScreenDomainMapper, "legacyHomeScreenDomainMapper");
        this.f154752a = iconMapper;
        this.f154753b = iconUiMapper;
        this.f154754c = badgeMapper;
        this.d = legacyHomeScreenDomainMapper;
        this.e = r0.k(new Pair("ALWAYS_BLUE", k.ALWAYS_BLUE), new Pair("PROGRESS_BLUE_COMPLETED_GREEN", k.PROGRESS_BLUE_COMPLETED_GREEN), new Pair("WARNING_ORANGE", k.WARNING_ORANGE), new Pair("FAILED_RED", k.FAILED_RED));
        this.f = r0.k(new Pair("SOLID", j.SOLID), new Pair("DASHED", j.DASHED));
        this.f154755g = q0.c(new Pair("CONFETTI", i.CONFETTI));
        this.f154756h = r0.k(new Pair("TOAST", com.revolut.feature.be_driven_design.models.domain.c.TOAST), new Pair("STATUS_POPUP", com.revolut.feature.be_driven_design.models.domain.c.STATUS_POPUP));
        this.i = r0.k(new Pair("POST", d.POST), new Pair("PUT", d.PUT), new Pair("PATCH", d.PATCH), new Pair("DELETE", d.DELETE));
        this.f154757j = r0.k(new Pair("WARNING", com.revolut.feature.be_driven_design.models.domain.a.WARNING), new Pair("ERROR", com.revolut.feature.be_driven_design.models.domain.a.ERROR), new Pair("SUCCESS", com.revolut.feature.be_driven_design.models.domain.a.SUCCESS));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Integer a(String str) {
        String upperCase;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return (Integer) f154751l.get(upperCase);
    }

    public final Integer b(String str) {
        aal.b bVarA;
        if (str == null || (bVarA = this.f154752a.a(str)) == null) {
            return null;
        }
        this.f154753b.getClass();
        return Integer.valueOf(l.b(bVarA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    public final FincrimeHomeScreenAction c(gr2.d dVar, String str) {
        d dVar2;
        com.revolut.feature.be_driven_design.models.domain.c cVar;
        com.revolut.feature.be_driven_design.models.domain.b bVar;
        String str2 = dVar.f145823b;
        if (str2 != null) {
            return new FincrimeHomeScreenAction.Deeplink(str2);
        }
        e0 e0Var = dVar.f145822a;
        ?? arrayList = 0;
        if (e0Var != null) {
            String str3 = e0Var.f145827a;
            List list = e0Var.d;
            String str4 = e0Var.f145829c;
            String str5 = e0Var.f145828b;
            com.revolut.feature.be_driven_design.models.domain.a aVar = str3 != null ? (com.revolut.feature.be_driven_design.models.domain.a) u1.v(str3, this.f154757j) : null;
            if ((aVar == null ? -1 : b.f154750a[aVar.ordinal()]) != -1) {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(d((gr2.c) it8.next(), str));
                }
                return new FincrimeHomeScreenAction.Dialog.Status(aVar, str5, str4, arrayList2);
            }
            List list3 = e0Var.e;
            if (list3 != null) {
                List list4 = list3;
                arrayList = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    arrayList.add(e((z.m) it9.next()));
                }
            }
            if (arrayList == 0) {
                arrayList = f0.f322471a;
            }
            List list5 = list;
            ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
            Iterator it10 = list5.iterator();
            while (it10.hasNext()) {
                arrayList3.add(d((gr2.c) it10.next(), str));
            }
            return new FincrimeHomeScreenAction.Dialog.Bottom(str5, str4, arrayList3, arrayList);
        }
        gr2.f0 f0Var = dVar.d;
        if (f0Var == null) {
            g gVar = dVar.f145824c;
            if (gVar == null || (dVar2 = (d) u1.v(gVar.f145835c, this.i)) == null) {
                return null;
            }
            String str6 = gVar.f145833a;
            String str7 = gVar.f145834b;
            if (str7 == null || (cVar = (com.revolut.feature.be_driven_design.models.domain.c) u1.v(str7, this.f154756h)) == null) {
                cVar = com.revolut.feature.be_driven_design.models.domain.c.STATUS_POPUP;
            }
            return new FincrimeHomeScreenAction.Request(str6, cVar, dVar2, gVar.d, gVar.e, str);
        }
        List<i0> list6 = f0Var.f145831a;
        ArrayList arrayList4 = new ArrayList(w.t(list6, 10));
        for (i0 i0Var : list6) {
            String str8 = i0Var.f145838a;
            String str9 = i0Var.f145839b;
            aal.b bVarA = str9 != null ? this.f154752a.a(str9) : null;
            String str10 = i0Var.f145840c;
            com.revolut.feature.be_driven_design.models.domain.b[] bVarArrValues = com.revolut.feature.be_driven_design.models.domain.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i];
                if (a0.z(bVar.name(), str10, true)) {
                    break;
                }
                i++;
            }
            if (bVar == null) {
                bVar = com.revolut.feature.be_driven_design.models.domain.b.DEFAULT;
            }
            arrayList4.add(new FincrimeHomeScreenAction.PopupMenu.Item(str8, bVarA, bVar, i0Var.d));
        }
        return new FincrimeHomeScreenAction.PopupMenu(arrayList4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton d(gr2.c r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.f145818a
            gr2.d r1 = r3.d
            if (r1 == 0) goto Lc
            com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction r4 = r2.c(r1, r4)
            if (r4 != 0) goto L19
        Lc:
            java.lang.String r4 = r3.f145819b
            if (r4 == 0) goto L17
            com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction$Deeplink r1 = new com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction$Deeplink
            r1.<init>(r4)
            r4 = r1
            goto L19
        L17:
            com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction$Dismiss r4 = com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction.Dismiss.f64139a
        L19:
            java.lang.String r3 = r3.f145820c
            if (r3 == 0) goto L86
            int r1 = r3.hashCode()
            switch(r1) {
                case -1734717884: goto L7a;
                case 2041946: goto L6e;
                case 63281119: goto L62;
                case 82564105: goto L56;
                case 609904681: goto L4a;
                case 1629886236: goto L3e;
                case 1690157619: goto L32;
                case 2006485192: goto L26;
                default: goto L24;
            }
        L24:
            goto L86
        L26:
            java.lang.String r1 = "SEMIBLUE"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L2f
            goto L86
        L2f:
            fr2.d r3 = fr2.d.SEMIBLUE
            goto L88
        L32:
            java.lang.String r1 = "FLAT_TEXT"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3b
            goto L86
        L3b:
            fr2.d r3 = fr2.d.FLAT_TEXT
            goto L88
        L3e:
            java.lang.String r1 = "BLUE_WITHOUT_SHADOW"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L47
            goto L86
        L47:
            fr2.d r3 = fr2.d.BLUE_WITHOUT_SHADOW
            goto L88
        L4a:
            java.lang.String r1 = "FLAT_WHITE_TEXT"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L53
            goto L86
        L53:
            fr2.d r3 = fr2.d.FLAT_WHITE_TEXT
            goto L88
        L56:
            java.lang.String r1 = "WHITE"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L5f
            goto L86
        L5f:
            fr2.d r3 = fr2.d.WHITE
            goto L88
        L62:
            java.lang.String r1 = "BLACK"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L6b
            goto L86
        L6b:
            fr2.d r3 = fr2.d.BLACK
            goto L88
        L6e:
            java.lang.String r1 = "BLUE"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L77
            goto L86
        L77:
            fr2.d r3 = fr2.d.BLUE
            goto L88
        L7a:
            java.lang.String r1 = "WIDGET"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L83
            goto L86
        L83:
            fr2.d r3 = fr2.d.WIDGET
            goto L88
        L86:
            fr2.d r3 = fr2.d.UNKNOWN
        L88:
            com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton r1 = new com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton
            r1.<init>(r0, r4, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hr2.c.d(gr2.c, java.lang.String):com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton");
    }

    public final SectionContent.TransactionCell e(z.m mVar) {
        zvl.a aVar;
        String str = mVar.f145921b;
        String str2 = mVar.f145922c;
        if (str2 != null) {
            zvl.a[] aVarArrValues = zvl.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i];
                if (a0.z(aVar.name(), str2, true)) {
                    break;
                }
                i++;
            }
            if (aVar == null) {
                aVar = zvl.a.GENERAL;
            }
        } else {
            aVar = null;
        }
        Integer numB = b(mVar.d);
        String str3 = mVar.e;
        aal.a aVarA = str3 != null ? ((yxc.d) this.f154754c).a(str3) : null;
        String str4 = mVar.f;
        TransactionStatus transactionStatus = null;
        zvl.a aVar2 = aVar;
        String str5 = mVar.f145923g;
        String str6 = mVar.k;
        if (str6 != null) {
            transactionStatus = new TransactionStatus(str6, a(mVar.f145926l));
        }
        return new SectionContent.TransactionCell(str, aVar2, numB, aVarA, str4, str5, transactionStatus, mVar.f145924h, mVar.i, mVar.f145925j);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x021f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9, types: [zhm.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final fr2.c f(gr2.y r42) {
        /*
            Method dump skipped, instruction units count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr2.c.f(gr2.y):fr2.c");
    }

    public final FincrimeHomeScreenHeaderAction g(b0 b0Var, String str) {
        FincrimeHomeScreenAction fincrimeHomeScreenActionC;
        gr2.d dVar = b0Var.f145816c;
        if (dVar == null || (fincrimeHomeScreenActionC = c(dVar, str)) == null) {
            return null;
        }
        String str2 = b0Var.f145814a;
        String str3 = b0Var.f145815b;
        return new FincrimeHomeScreenHeaderAction(str2, str3 != null ? this.f154752a.a(str3) : null, fincrimeHomeScreenActionC);
    }
}
