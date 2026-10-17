package nl;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl.n f216915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f216916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Observable f216917c;

    public i(sl.n nVar, p pVar, Observable observable) {
        this.f216915a = nVar;
        this.f216916b = pVar;
        this.f216917c = observable;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        DocSide docSide;
        Observable observableJust;
        tl.b frontDocumentUploadResult = (tl.b) obj2;
        Intrinsics.checkNotNullParameter(frontDocumentUploadResult, "frontDocumentUploadResult");
        CaptureStepDataBundle captureStepDataBundle = frontDocumentUploadResult.f271979a;
        DocumentType documentType = captureStepDataBundle.getDocumentType();
        if (documentType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CountryCode countryCode = captureStepDataBundle.getCountryCode();
        tl.m mVar = frontDocumentUploadResult.f271980b;
        boolean z = mVar instanceof tl.k;
        tl.k kVar = z ? (tl.k) mVar : null;
        sl.n nVar = this.f216915a;
        NfcArguments nfcArguments = new NfcArguments(nVar.f264052c, mVar.b() ? new NfcArguments.CapturedNfcData(mVar.a(), kVar != null ? kVar.d : null, mVar.b()) : null);
        p pVar = this.f216916b;
        boolean zIsAddressPageCaptureEnabledForWorkflow = pVar.f216931a.isAddressPageCaptureEnabledForWorkflow(documentType, countryCode, nVar.f264053g);
        boolean zBackSideCaptureNeeded$default = DocumentConfigurationManager.backSideCaptureNeeded$default(pVar.f216931a, documentType, captureStepDataBundle.getGenericDocPages(), null, 4, null);
        Observable observable = this.f216917c;
        q qVar = q.f216938a;
        if (!zBackSideCaptureNeeded$default && !zIsAddressPageCaptureEnabledForWorkflow) {
            if (!z && NFCOptionsKt.isRequired(nVar.f264052c)) {
                mgm.b bVarD = pVar.b(observable, nVar, documentType, countryCode, p.c(zhm.u.c(mVar)), new NfcProperties(false, "", new byte[0], null, false, false, 0, 0, null, 496, null), nVar.f264052c).d(Observable.just(qVar));
                Intrinsics.checkNotNullExpressionValue(bVarD, "andThen(...)");
                return bVarD;
            }
            if (z) {
                mgm.b bVarD2 = pVar.b(observable, nVar, documentType, countryCode, p.c(zhm.u.c(mVar)), ((tl.k) mVar).d, nVar.f264052c).d(Observable.just(qVar));
                Intrinsics.checkNotNullExpressionValue(bVarD2, "andThen(...)");
                return bVarD2;
            }
            if (!(mVar instanceof tl.l)) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.e.f(pVar.f216933c);
            Completable completableA = pVar.d.a(nVar, p.c(zhm.u.c(mVar)));
            completableA.getClass();
            ogm.a aVar = new ogm.a(completableA, n.f216928a, 2);
            Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
            return aVar.d(Observable.just(qVar));
        }
        CaptureStepDataBundle captureStepDataBundle2 = frontDocumentUploadResult.f271979a;
        DocSide docSide2 = DocSide.BACK;
        CaptureStepDataBundle captureStepDataBundleCopy$default = CaptureStepDataBundle.copy$default(captureStepDataBundle2, null, null, null, null, docSide2, null, null, LDSFile.EF_DG15_TAG, null);
        if (pVar.e.isRefactoredCaptureEnabled()) {
            Observable observableK = new ogm.e(new f(0, captureStepDataBundleCopy$default, pVar, nfcArguments), 2).k();
            Intrinsics.checkNotNullExpressionValue(observableK, "toObservable(...)");
            observableJust = observableK;
            docSide = docSide2;
        } else {
            DocumentType documentType2 = captureStepDataBundleCopy$default.getDocumentType();
            if (documentType2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            docSide = docSide2;
            observableJust = Observable.just(new s(captureStepDataBundleCopy$default.getDocumentFormat(), documentType2, nfcArguments, captureStepDataBundleCopy$default.getCountryCode(), docSide2));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        }
        if (zIsAddressPageCaptureEnabledForWorkflow) {
            ogm.e eVar = new ogm.e(new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(pVar, 14), 2);
            Observable observableCast = observable.filter(b.e).cast(ml.x.class);
            Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
            Single<Object> singleFirstOrError = observableCast.firstOrError();
            singleFirstOrError.getClass();
            observableJust = new ogm.a(eVar, new ogm.e(singleFirstOrError, 5), 0).d(observableJust);
        }
        Intrinsics.h(observableJust);
        DocumentType documentType3 = captureStepDataBundleCopy$default.getDocumentType();
        if (documentType3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Observable observableConcat = Observable.concat(observableJust, p.a(observable, docSide).take(1L).flatMapCompletable(new hd.r(pVar, mVar, observable, this.f216915a, documentType3, captureStepDataBundleCopy$default.getCountryCode())).d(Observable.just(qVar)));
        Intrinsics.checkNotNullExpressionValue(observableConcat, "concat(...)");
        return observableConcat;
    }
}
