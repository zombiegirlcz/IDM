package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.orca.internal.f1;
import com.fourthline.orca.internal.lz;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentValidationConfig;
import com.fourthline.vision.document.MrzValidationPolicy;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class ol {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(r70 r70Var) {
        String strF;
        lg1 lg1VarB = r70Var.b();
        if (lg1VarB == null || (strF = lg1VarB.f()) == null) {
            throw new IllegalStateException("FL Developer error. Functionality requires missing 'WorkflowId'");
        }
        return strF;
    }

    public final Function0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new wm1(mainRepository, 1);
    }

    public final wf a(ml mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new wf(mainRepository.h().g(), mainRepository.h().b().getIb.b.Analysis java.lang.String().getMinimumAge(), mainRepository.h().b().getIb.b.Analysis java.lang.String().getImageUploadTimeoutMs(), mainRepository.h().b().getIb.b.Analysis java.lang.String().getBackendProcessingTimeoutMs());
    }

    public final kh b() {
        return new kh(new qq0(), new g91(x71.f34916c), new im0());
    }

    public final List c(ml mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return mainRepository.h().b().getSupportedDocuments();
    }

    public final xm a(bg dataBundle, ef deviceDataBundle, sg0 analyticsTracker, ml mainRepository, List countries, boolean z) {
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(countries, "countries");
        um umVarH = mainRepository.h();
        dj djVarB = umVarH.b();
        DocumentType documentTypeF = umVarH.f();
        boolean tiltedStepsEnabled = umVarH.j() ? djVarB.getTiltedStepsEnabled() : false;
        MrzValidationPolicy mrzValidationPolicy = MrzValidationPolicy.NORMAL;
        List supportedDocuments = djVarB.getSupportedDocuments();
        Object obj2 = null;
        if (supportedDocuments.isEmpty()) {
            supportedDocuments = null;
        }
        DocumentScannerConfig documentScannerConfig = new DocumentScannerConfig(documentTypeF, false, tiltedStepsEnabled, false, RecordingType.VIDEO_ONLY, mrzValidationPolicy, new DocumentValidationConfig(djVarB.getIb.b.Analysis java.lang.String().getMinimumAge(), supportedDocuments), VideoDuration.DEFAULT.INSTANCE, 10L, z, 10, null);
        boolean zG = umVarH.g();
        boolean zH = umVarH.h();
        double dC = umVarH.c();
        Iterator it8 = countries.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((fd) next).c(), umVarH.d())) {
                obj2 = next;
                break;
            }
        }
        fd fdVar = (fd) obj2;
        iz documentStrategy = djVarB.getDocumentStrategy();
        wk wkVar = wk.f34723a;
        return new xm(dataBundle, deviceDataBundle, analyticsTracker, documentScannerConfig, false, false, zG, zH, false, dC, fdVar, documentStrategy.a(wkVar.f()) ? true : djVarB.getCameraX().getEnabled(), djVarB.getVideo().getBitrate(), djVarB.getDocumentStrategy().a(wkVar.c()) ? f1.b.f28309a : f1.a.f28308a);
    }

    public final wd1 b(wm flowActionProvider) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        z51 z51Var = new z51();
        y51 y51Var = new y51();
        m.Companion companion = yhm.m.INSTANCE;
        return new lj0(flowActionProvider, z51Var, y51Var, new s41(new lz.b(lz.c.a.f30793a)));
    }

    public final c80 b(ml mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        c80 c80Var = new c80("document");
        c80Var.set("document_type", mainRepository.h().f());
        String strD = mainRepository.h().d();
        if (strD == null) {
            strD = "n/a";
        }
        c80Var.set("document_country", strD);
        return c80Var;
    }

    public final bg a() {
        return new we(null, null, null, 7, null);
    }

    public final wd1 a(wm flowActionProvider) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        z51 z51Var = new z51();
        y51 y51Var = new y51();
        m.Companion companion = yhm.m.INSTANCE;
        return new lj0(flowActionProvider, z51Var, y51Var, new s41(new lz.b(lz.c.a.f30793a)));
    }

    public final wm a(r70 mainRepository, xm productRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(productRepository, "productRepository");
        return new wm(s70.a(mainRepository), productRepository);
    }
}
