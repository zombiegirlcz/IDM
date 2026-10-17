package ku8;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import klf.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends oki.h implements o {
    public final ChooseDocumentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ot8.a f189735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f189736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f189737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f189738s;

    public h(ac4.g stateMapper, ChooseDocumentScreenContract$InputData inputData, ot8.a kycDocsInteractor, qd0.b languageProvider, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycDocsInteractor, "kycDocsInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f189735p = kycDocsInteractor;
        this.f189736q = uriHelper;
        String str = inputData.f77597l;
        String languageTag = ((s80.b) languageProvider).b().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        this.f189737r = new vii.b(Intrinsics.f(str, languageTag) ? w4l.h.f294642c : w4l.i.f294643c);
        Data data = new Data(null, null, true, 3, null);
        SelectedKycDocs selectedKycDocs = inputData.f77594g;
        Intrinsics.checkNotNullParameter(selectedKycDocs, "<this>");
        this.f189738s = mra.d.b(this, new j(data, SelectedKycDocs.a(selectedKycDocs, null, null, 3)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        z1(new jl6.b(2, this, h.class, "onDocumentsLoaded", "onDocumentsLoaded(Lcom/revolut/data/model/Data;)V", 4, 13), vkm.q.Q(this.f189737r, new a3(null, this, 6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof my8.l
            com.revolut.feature.kyc.impl.choosedocument.kompot.ChooseDocumentScreenContract$InputData r1 = r7.o
            cli.y r2 = r7.f189738s
            if (r0 == 0) goto L42
            my8.l r8 = (my8.l) r8
            ku8.p r0 = r1.f77591a
            int[] r3 = ku8.g.f189734a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L31
            r3 = 2
            if (r0 != r3) goto L2b
            com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs r0 = r1.f77594g
            java.util.List r1 = r0.f77598a
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r1 = zhm.d0.F0(r8, r1)
            java.lang.String r8 = r8.f210383a
            com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs r8 = com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs.a(r0, r1, r8, r3)
            goto L93
        L2b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L31:
            java.lang.Object r0 = r2.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            ku8.j r0 = (ku8.j) r0
            com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs r0 = r0.f189741b
            com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs r8 = com.revolut.feature.kyc.impl.choosedocument.model.a.c(r0, r8)
            goto L93
        L42:
            boolean r0 = r8 instanceof java.util.List
            r3 = 0
            if (r0 == 0) goto L92
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r0.next()
            boolean r6 = r5 instanceof my8.l
            if (r6 == 0) goto L53
            r4.add(r5)
            goto L53
        L65:
            int r0 = r4.size()
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            if (r0 != r8) goto L78
            boolean r8 = r4.isEmpty()
            if (r8 != 0) goto L78
            goto L79
        L78:
            r4 = r3
        L79:
            if (r4 == 0) goto L92
            ku8.p r8 = r1.f77591a
            ku8.p r0 = ku8.p.REMOTE_DOCS
            if (r8 != r0) goto L92
            java.lang.Object r8 = r2.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            ku8.j r8 = (ku8.j) r8
            com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs r8 = r8.f189741b
            com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs r8 = com.revolut.feature.kyc.impl.choosedocument.model.a.d(r8, r4)
            goto L93
        L92:
            r8 = r3
        L93:
            if (r8 != 0) goto L96
            return
        L96:
            kog.k r0 = new kog.k
            r1 = 22
            r0.<init>(r8, r1)
            r7.H2(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ku8.h.I2(java.lang.Object):void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f189738s;
    }
}
