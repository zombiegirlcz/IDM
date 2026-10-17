package x04;

import dx4.a1;
import dx4.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ny3.i;
import ny3.l;
import ny3.m;
import ny3.n;
import ny3.o;
import ny3.p;
import x04.a;
import x04.f;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr3.g f301519a;

    public h(dr3.g creditPromptContentDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        this.f301519a = creditPromptContentDtoMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ny3.k c(x04.e r7) {
        /*
            java.lang.String r0 = r7.getStatus()
            if (r0 == 0) goto L22
            ny3.j[] r1 = ny3.j.values()
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1f
            r4 = r1[r3]
            java.lang.String r5 = r4.name()
            r6 = 1
            boolean r5 = kotlin.text.a0.z(r5, r0, r6)
            if (r5 == 0) goto L1c
            goto L20
        L1c:
            int r3 = r3 + 1
            goto Lc
        L1f:
            r4 = 0
        L20:
            if (r4 != 0) goto L24
        L22:
            ny3.j r4 = ny3.j.SUCCESS
        L24:
            ny3.k r0 = new ny3.k
            java.lang.String r1 = r7.getTitle()
            java.lang.String r7 = r7.getDescription()
            r0.<init>(r1, r7, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x04.h.c(x04.e):ny3.k");
    }

    public static m d(f.b bVar) {
        String strA = bVar.getDocumentId();
        String strC = bVar.getTitle();
        y0 y0Var = a1.Companion;
        String strB = bVar.getIcon();
        y0Var.getClass();
        a1 a1VarA = y0.a(strB);
        if (a1VarA == null) {
            a1VarA = a1.STATEMENT;
        }
        Boolean boolD = bVar.getUpload();
        return new m(strA, strC, a1VarA, boolD != null ? boolD.booleanValue() : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public final p a(g dto) {
        ?? C;
        Intrinsics.checkNotNullParameter(dto, "dto");
        if (!(dto instanceof c)) {
            if (!(dto instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            d dVar = (d) dto;
            ny3.f fVarB = b(dVar.getDocument());
            b bVarB = dVar.getMissingOptionalDocumentConfirmationPopup();
            return new i(fVarB, bVarB != null ? new ny3.g(bVarB.getTitle(), bVarB.getDescription(), bVarB.getPrimaryButtonTitle(), bVarB.getSecondaryButtonTitle()) : null, c(dVar.getSuccessPopup()));
        }
        c cVar = (c) dto;
        f fVarD = cVar.getSummary();
        String strG = fVarD.getTitle();
        String strB = fVarD.getDescription();
        f.c cVarF = fVarD.getSecondDescription();
        n nVar = cVarF != null ? new n(cVarF.getText(), dr3.g.c(this.f301519a, cVarF.getInfo(), null, null, 14)) : null;
        List listD = fVarD.getGroupItems();
        if (listD != null) {
            List<f.a> list = listD;
            C = new ArrayList(w.t(list, 10));
            for (f.a aVar : list) {
                String strB2 = aVar.getTitle();
                List listA = aVar.getItems();
                ArrayList arrayList = new ArrayList(w.t(listA, 10));
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    arrayList.add(d((f.b) it8.next()));
                }
                C.add(new l(strB2, arrayList));
            }
        } else {
            List listE = fVarD.getItems();
            if (listE == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List list2 = listE;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(d((f.b) it9.next()));
            }
            C = u.c(new l(null, arrayList2));
        }
        o oVar = new o(strG, strB, nVar, C, fVarD.getDisclaimer(), fVarD.getButtonTitle());
        List listA2 = cVar.getDocuments();
        ArrayList arrayList3 = new ArrayList(w.t(listA2, 10));
        Iterator it10 = listA2.iterator();
        while (it10.hasNext()) {
            arrayList3.add(b((a) it10.next()));
        }
        b bVarB2 = cVar.getMissingOptionalDocumentConfirmationPopup();
        return new ny3.h(oVar, arrayList3, bVarB2 != null ? new ny3.g(bVarB2.getTitle(), bVarB2.getDescription(), bVarB2.getPrimaryButtonTitle(), bVarB2.getSecondaryButtonTitle()) : null, c(cVar.getSuccessPopup()));
    }

    public final ny3.f b(a aVar) {
        ny3.e eVar;
        String strE = aVar.getDocumentId();
        String strH = aVar.getTitle();
        String strC = aVar.getDescription();
        a.b bVarG = aVar.getSecondDescription();
        ny3.d bVar = null;
        if (bVarG != null) {
            String strC2 = bVarG.getText();
            if (bVarG.getInfo() != null) {
                bVar = new ny3.c(dr3.g.c(this.f301519a, bVarG.getInfo(), null, null, 14));
            } else if (bVarG.getDownloadPdfUrl() != null) {
                bVar = new ny3.b(bVarG.getDownloadPdfUrl());
            }
            eVar = new ny3.e(strC2, bVar);
        } else {
            eVar = null;
        }
        a.C1671a c1671aA = aVar.getAddDocumentItem();
        ny3.a aVar2 = new ny3.a(c1671aA.getTitle(), c1671aA.getDescription());
        String strD = aVar.getDisclaimer();
        String strB = aVar.getButtonTitle();
        Boolean boolF = aVar.getRequired();
        return new ny3.f(strE, strH, strC, eVar, aVar2, strD, strB, boolF != null ? boolF.booleanValue() : true);
    }
}
