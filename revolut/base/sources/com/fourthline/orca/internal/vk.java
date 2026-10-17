package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.orca.internal.f1;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentValidationConfig;
import com.fourthline.vision.document.MrzValidationPolicy;
import java.net.URI;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vk implements uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qo f34373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj f34374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yj0 f34375c;
    private final ef d;
    private final sg0 e;
    private final cd0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f34376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f34377h;
    private final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f34378j;
    private final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f34379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f34380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f34381n;
    private final double o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final f1 f34382p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final gh f34383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final yj0 f34384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f34385s;

    public vk(qo flowConfig, gj bundle, yj0 personBundle, ef deviceDataBundle, sg0 analyticsTracker, cd0 nfcResultToBundleMapper, boolean z, boolean z3, Integer num, boolean z4) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(nfcResultToBundleMapper, "nfcResultToBundleMapper");
        this.f34373a = flowConfig;
        this.f34374b = bundle;
        this.f34375c = personBundle;
        this.d = deviceDataBundle;
        this.e = analyticsTracker;
        this.f = nfcResultToBundleMapper;
        this.f34376g = z;
        this.f34377h = z3;
        this.i = num;
        this.f34378j = z4;
        this.k = true;
        this.f34379l = flowConfig.b().getEnabled();
        iz izVarD = flowConfig.d();
        wk wkVar = wk.f34723a;
        this.f34380m = izVarD.a(wkVar.e());
        this.f34381n = flowConfig.d().a(wkVar.d()) ? false : flowConfig.c().getEnabled();
        this.o = flowConfig.e().a();
        this.f34382p = flowConfig.d().a(wkVar.c()) ? f1.b.f28309a : f1.a.f28308a;
        this.f34383q = bundle.f();
        this.f34384r = bundle.k();
    }

    @Override // com.fourthline.orca.internal.vo
    public void a(ko result) {
        Intrinsics.checkNotNullParameter(result, "result");
        a(result.a());
    }

    @Override // com.fourthline.orca.internal.to
    public /* bridge */ DocumentType b() {
        return super.b();
    }

    @Override // com.fourthline.orca.internal.mi
    public di c() {
        return this.f34374b.o();
    }

    @Override // com.fourthline.orca.internal.mi
    public Date d() {
        return this.f34375c.d();
    }

    @Override // com.fourthline.orca.internal.mi
    public boolean e() {
        return oe.a(this.f34375c.t().d(), k().getValidationConfig().getMinPersonAge());
    }

    @Override // com.fourthline.orca.internal.to
    public /* bridge */ en f() {
        return super.f();
    }

    @Override // com.fourthline.orca.internal.to
    public Integer g() {
        return this.i;
    }

    @Override // com.fourthline.orca.internal.mi
    public boolean h() {
        return this.f34385s;
    }

    @Override // com.fourthline.orca.internal.to
    public double i() {
        return this.o;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean isDynamicStepsEnabled() {
        return this.f34380m;
    }

    @Override // com.fourthline.orca.internal.to
    public boolean j() {
        return this.f34379l;
    }

    @Override // com.fourthline.orca.internal.to
    public DocumentScannerConfig k() {
        DocumentType documentTypeC;
        if (isDynamicStepsEnabled()) {
            documentTypeC = this.f34374b.m();
            if (documentTypeC == null) {
                di diVarO = this.f34374b.o();
                documentTypeC = diVarO != null ? diVarO.c() : null;
                if (documentTypeC == null) {
                    throw new NullPointerException("Document type is not provided either via Builder or from Document Type selection screen");
                }
            }
        } else {
            di diVarO2 = this.f34374b.o();
            if (diVarO2 == null || (documentTypeC = diVarO2.c()) == null) {
                throw new NullPointerException("Document type is not provided either via Builder or from Document Type selection screen");
            }
        }
        return new DocumentScannerConfig(documentTypeC, t(), this.f34374b.i() == null && this.f34373a.i(), false, RecordingType.VIDEO_ONLY, MrzValidationPolicy.NORMAL, new DocumentValidationConfig(this.f34373a.b().getMinimumAge(), this.f34373a.h()), VideoDuration.DEFAULT.INSTANCE, 10L, this.f34378j);
    }

    @Override // com.fourthline.orca.internal.to
    public boolean l() {
        return this.k;
    }

    @Override // com.fourthline.orca.internal.mi
    public Date m() {
        return this.f34383q.c();
    }

    @Override // com.fourthline.orca.internal.to
    public f1 n() {
        return this.f34382p;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    @Override // com.fourthline.orca.internal.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            r6 = this;
            java.util.Date r0 = r6.m()
            r1 = 0
            if (r0 == 0) goto L5b
            com.fourthline.orca.internal.fd r2 = r6.a()
            r3 = 0
            if (r2 == 0) goto L13
            java.lang.String r2 = r2.c()
            goto L14
        L13:
            r2 = r3
        L14:
            java.lang.String r4 = "FRA"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            r4 = 1
            if (r2 == 0) goto L2d
            com.fourthline.orca.internal.di r2 = r6.c()
            if (r2 == 0) goto L28
            com.fourthline.core.DocumentType r2 = r2.c()
            goto L29
        L28:
            r2 = r3
        L29:
            com.fourthline.core.DocumentType r5 = com.fourthline.core.DocumentType.ID_CARD
            if (r2 == r5) goto L3d
        L2d:
            com.fourthline.orca.internal.di r2 = r6.c()
            if (r2 == 0) goto L38
            com.fourthline.core.DocumentType r2 = r2.c()
            goto L39
        L38:
            r2 = r3
        L39:
            com.fourthline.core.DocumentType r5 = com.fourthline.core.DocumentType.FRENCH_ID_CARD
            if (r2 != r5) goto L3e
        L3d:
            return r4
        L3e:
            r2 = 2
            java.util.Date r0 = com.fourthline.orca.internal.oe.a(r0, r3, r2, r3)
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.util.Date r2 = com.fourthline.orca.internal.oe.a(r5, r3, r2, r3)
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r3 != 0) goto L5a
            boolean r0 = r0.after(r2)
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r1
        L5a:
            return r4
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.vk.o():boolean");
    }

    @Override // com.fourthline.orca.internal.to
    public boolean p() {
        return this.f34381n;
    }

    @Override // com.fourthline.orca.internal.mi
    public boolean q() {
        return this.f34383q.b();
    }

    @Override // com.fourthline.orca.internal.to
    public boolean r() {
        return this.f34377h;
    }

    @Override // com.fourthline.orca.internal.mi
    public String s() {
        return this.f34383q.k();
    }

    public boolean t() {
        return this.f34376g;
    }

    @Override // com.fourthline.orca.internal.to
    public fd a() {
        return this.f34374b.g();
    }

    @Override // com.fourthline.orca.internal.mi
    public void b(Date date) {
        this.f34383q.o().a(date);
    }

    @Override // com.fourthline.orca.internal.mi
    public void a(boolean z) {
        this.f34385s = z;
    }

    @Override // com.fourthline.orca.internal.mi
    public void a(String str) {
        this.f34383q.o().a(str);
    }

    @Override // com.fourthline.orca.internal.mi
    public void a(Date date) {
        this.f34375c.t().a(date);
    }

    private final void a(DocumentScannerResult documentScannerResult) {
        di diVarC;
        URI url2;
        this.f34374b.a(documentScannerResult);
        gj gjVar = this.f34374b;
        VideoRecording videoRecording = documentScannerResult.getVideoRecording();
        gjVar.a((videoRecording == null || (url2 = videoRecording.getUrl()) == null) ? null : uc1.a(url2));
        this.d.a(documentScannerResult.getMetadata().getMotionData());
        h9.d.a(this.e, this.d.l(), "document");
        fh fhVarF = this.f34383q.f();
        fhVarF.a((String) null);
        fhVarF.b((Date) null);
        fhVarF.a((Date) null);
        fhVarF.a((List) null);
        go.a(fhVarF, documentScannerResult);
        ad0 ad0VarI = this.f34374b.i();
        if (ad0VarI != null && (diVarC = c()) != null) {
            this.f.a(ad0VarI, diVarC.c());
        }
        a(this.f34375c.e(), documentScannerResult);
        a(false);
    }

    public final void a(zj0 zj0Var, DocumentScannerResult result) {
        Intrinsics.checkNotNullParameter(zj0Var, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        MrzInfo mrzInfo = result.getMrzInfo();
        if (mrzInfo instanceof MrtdMrzInfo) {
            MrtdMrzInfo mrtdMrzInfo = (MrtdMrzInfo) mrzInfo;
            zj0Var.b(a(mrtdMrzInfo.getFirstNames()));
            zj0Var.c(a(mrtdMrzInfo.getLastNames()));
            zj0Var.a(mrtdMrzInfo.getValidationErrors().contains(MrtdMrzInfoValidationError.INVALID_BIRTH_DATE) ? null : mrtdMrzInfo.getBirthDate());
            zj0Var.d(mrtdMrzInfo.getNationality());
            zj0Var.a(mrtdMrzInfo.getGender());
        }
    }

    private final String a(List list) {
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            while (it8.hasNext()) {
                next = ((String) next) + " " + ((String) it8.next());
            }
            return (String) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
