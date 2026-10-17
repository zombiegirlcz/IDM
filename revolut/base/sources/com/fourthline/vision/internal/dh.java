package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class dh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5 f36116b;

    public /* synthetic */ dh(t5 t5Var, int i) {
        this.f36115a = i;
        this.f36116b = t5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36115a) {
            case 0:
                return this.f36116b.get();
            case 1:
                return t5.passportSteps$lambda$0(this.f36116b);
            case 2:
                return t5.allManualSteps$lambda$1(this.f36116b);
            case 3:
                return t5.paperIdSteps$lambda$0(this.f36116b);
            case 4:
                return t5.proofOfAddressSteps$lambda$0(this.f36116b);
            case 5:
                return t5.tinReferenceDocumentSteps$lambda$0(this.f36116b);
            case 6:
                return t5.frontManualBackAutomatic$lambda$0(this.f36116b);
            case 7:
                return t5.frontManualBackAutomatic$lambda$1(this.f36116b);
            case 8:
                return t5.dutchDriversLicenseSteps$lambda$0(this.f36116b);
            case 9:
                return t5.dutchDriversLicenseSteps$lambda$1(this.f36116b);
            case 10:
                return t5.frontAutomaticBackManual$lambda$0(this.f36116b);
            case 11:
                return t5.frontAutomaticBackManual$lambda$1(this.f36116b);
            default:
                return t5.allManualSteps$lambda$0(this.f36116b);
        }
    }
}
