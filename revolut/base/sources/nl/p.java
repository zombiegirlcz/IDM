package nl;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import com.onfido.workflow.internal.ui.NfcFlowScreen;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class p {

    @NotNull
    public static final g Companion = new g();
    public static final NfcProperties f = new NfcProperties(false, "", new byte[0], null, false, false, 0, 0, null, 496, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentConfigurationManager f216931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pl.j f216932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Navigator f216933c;
    public final sl.d d;
    public final OnfidoRemoteConfig e;

    public p(DocumentConfigurationManager documentConfigurationManager, pl.j nfcFlowHelper, Navigator navigator, sl.d submitTaskCompletionUseCase, OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(documentConfigurationManager, "documentConfigurationManager");
        Intrinsics.checkNotNullParameter(nfcFlowHelper, "nfcFlowHelper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(submitTaskCompletionUseCase, "submitTaskCompletionUseCase");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        this.f216931a = documentConfigurationManager;
        this.f216932b = nfcFlowHelper;
        this.f216933c = navigator;
        this.d = submitTaskCompletionUseCase;
        this.e = onfidoRemoteConfig;
    }

    public static Observable a(Observable observable, DocSide docSide) {
        Observable observableCast = observable.filter(b.f216877h).cast(ml.y.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable map = observableCast.map(k.f216923a);
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableCast2 = map.filter(b.i).cast(DocumentCaptureScreen.DocumentCaptureResult.Completed.class);
        Intrinsics.checkNotNullExpressionValue(observableCast2, "cast(...)");
        Observable map2 = observableCast2.filter(new l(docSide)).map(m.f216927a);
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableCast3 = observable.filter(b.f).cast(ml.q.class);
        Intrinsics.checkNotNullExpressionValue(observableCast3, "cast(...)");
        j function = j.f;
        Intrinsics.checkNotNullParameter(function, "function");
        Observable map3 = observableCast3.map(new p0(6));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableCast4 = map3.filter(b.f216876g).cast(tl.b.class);
        Intrinsics.checkNotNullExpressionValue(observableCast4, "cast(...)");
        Observable observableFilter = observableCast4.filter(new kpj.f(docSide, 22));
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        Observable observableMerge = Observable.merge(map2, observableFilter);
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            tl.m mVar = (tl.m) it8.next();
            zhm.a0.x(zhm.v.k(new ml.g(mVar.a(), ml.f.DOCUMENT_PHOTO), new ml.g(mVar.c(), ml.f.DOCUMENT_VIDEO)), arrayList);
        }
        return arrayList;
    }

    public final Completable b(Observable uiEventsObservable, sl.n documentTask, final DocumentType documentType, final CountryCode countryCode, ArrayList mediaUploads, final NfcProperties nfcProperties, NFCOptions nfcOptions) {
        final sl.n nVar;
        Observable observableA;
        final pl.j jVar = this.f216932b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(uiEventsObservable, "uiEventsObservable");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(mediaUploads, "mediaUploads");
        Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
        Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
        Intrinsics.checkNotNullParameter(documentTask, "documentTask");
        if (!(nfcOptions instanceof NFCOptions.Enabled)) {
            nVar = documentTask;
            observableA = jVar.a(mediaUploads);
        } else if (NFCOptionsKt.isRequired(nfcOptions) || (nfcProperties.getIsNfcSupported() && nfcProperties.getNfcKey().length() != 0)) {
            final NFCOptions.Enabled enabled = (NFCOptions.Enabled) nfcOptions;
            nVar = documentTask;
            ogm.e eVar = new ogm.e(new igm.a() { // from class: pl.a
                @Override // igm.a
                public final void run() {
                    j this$0 = jVar;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    DocumentType documentType2 = documentType;
                    Intrinsics.checkNotNullParameter(documentType2, "$documentType");
                    NfcProperties nfcProperties2 = nfcProperties;
                    Intrinsics.checkNotNullParameter(nfcProperties2, "$nfcProperties");
                    NFCOptions.Enabled nfcOptions2 = enabled;
                    Intrinsics.checkNotNullParameter(nfcOptions2, "$nfcOptions");
                    sl.n documentTask2 = nVar;
                    Intrinsics.checkNotNullParameter(documentTask2, "$documentTask");
                    Navigator navigator = this$0.f237232a;
                    LinkedHashMap linkedHashMap = documentTask2.d;
                    ArrayList arrayList = new ArrayList();
                    Iterator it8 = linkedHashMap.entrySet().iterator();
                    while (it8.hasNext()) {
                        a0.x((List) ((Map.Entry) it8.next()).getValue(), arrayList);
                    }
                    navigator.navigateTo(new NfcFlowScreen(documentType2, countryCode, nfcProperties2, nfcOptions2, arrayList.size() == 1, true));
                }
            }, 2);
            Observable observableCast = uiEventsObservable.filter(pl.g.f237227b).cast(ml.f0.class);
            Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
            pl.h function = pl.h.f;
            Intrinsics.checkNotNullParameter(function, "function");
            Observable observableFlatMap = observableCast.map(new pl.g(2)).flatMap(new pl.i(jVar, mediaUploads));
            Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
            observableA = eVar.d(observableFlatMap);
            Intrinsics.checkNotNullExpressionValue(observableA, "andThen(...)");
        } else {
            observableA = jVar.a(mediaUploads);
            nVar = documentTask;
        }
        Completable completableFlatMapCompletable = observableA.take(1L).flatMapCompletable(new k7i.i(this, nVar, 13));
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return completableFlatMapCompletable;
    }
}
