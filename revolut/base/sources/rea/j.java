package rea;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import com.meshconnect.link.ui.LinkActivity;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.camera.util.IntentHelper;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentConfiguration;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;
import skm.a2;
import zp0.x;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements kfm.o, kfm.p, kfm.c, kfm.g, ActivityResultCallback, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f253576b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f253575a = i;
        this.f253576b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f253575a) {
            case 20:
                ((rjf.a) this.f253576b).invoke(obj2);
                break;
            default:
                ((rof.d) this.f253576b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f253575a) {
            case 0:
                rd3.m mVar = (rd3.m) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (eda.e) mVar.invoke(p0);
            case 1:
                i iVar = (i) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) iVar.invoke(p0);
            case 2:
                rd3.m mVar2 = (rd3.m) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) mVar2.invoke(p0);
            case 3:
                raf.o oVar = (raf.o) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) oVar.invoke(p0);
            case 4:
            case 9:
            case 10:
            case 18:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            default:
                rof.d dVar = (rof.d) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar.invoke(p0);
            case 5:
                rd3.m mVar3 = (rd3.m) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p10.f) mVar3.invoke(p0);
            case 6:
                rd3.m mVar4 = (rd3.m) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) mVar4.invoke(p0);
            case 7:
                rd3.m mVar5 = (rd3.m) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) mVar5.invoke(p0);
            case 8:
                pud.b bVar = (pud.b) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar.invoke(p0);
            case 11:
                d62.a aVar = (d62.a) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (xo9.h) aVar.invoke(p0);
            case 12:
                rgf.m mVar6 = (rgf.m) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) mVar6.invoke(p0);
            case 13:
                rg3.d dVar2 = (rg3.d) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) dVar2.invoke(p0);
            case 14:
                rgf.m mVar7 = (rgf.m) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) mVar7.invoke(p0);
            case 15:
                return (GiveConsentConfiguration) ((rg3.d) this.f253576b).invoke(p0);
            case 16:
                ri6.a aVar2 = (ri6.a) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar2.invoke(p0);
            case 17:
                ri6.a aVar3 = (ri6.a) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar3.invoke(p0);
            case 19:
                rjf.a aVar4 = (rjf.a) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar4.invoke(p0);
            case 21:
                rj7.b bVar2 = (rj7.b) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                bVar2.invoke(p0);
                return Boolean.TRUE;
            case 26:
                rof.d dVar3 = (rof.d) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar3.invoke(p0);
            case 28:
                n0 n0Var = (n0) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) n0Var.invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String str, String extractedValue, String formattedValue, boolean z) {
        TaxNumberInputScreen taxNumberInputScreen = (TaxNumberInputScreen) this.f253576b;
        TaxNumberInputScreen.Companion aVar = TaxNumberInputScreen.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        com.revolut.feature.tax_residency.impl.screens.tin.c cVar = (com.revolut.feature.tax_residency.impl.screens.tin.c) taxNumberInputScreen.T2();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        a2 a2Var = cVar.f90139w;
        if (a2Var != null) {
            a2Var.f(null);
        }
        cVar.f90139w = cVar.n2(new ack.o(cVar, extractedValue, formattedValue, z, (Continuation) null, 22), new whi.b(6));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj2) {
        Intent data;
        Uri data2;
        Bundle extras;
        int i = this.f253575a;
        Object obj3 = this.f253576b;
        switch (i) {
            case 22:
                LinkActivity linkActivity = (LinkActivity) obj3;
                ActivityResult activityResult = (ActivityResult) obj2;
                int i2 = LinkActivity.f49860d0;
                if (activityResult != null && (data = activityResult.getData()) != null && (data2 = data.getData()) != null) {
                    WebView webView = ((mk.a) linkActivity.f49861a0.getValue()).f206137g;
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.getSettings().setDomStorageEnabled(true);
                    webView.getSettings().setCacheMode(2);
                    webView.loadUrl(data2.toString());
                    break;
                }
                break;
            default:
                rl.f this$0 = (rl.f) obj3;
                ActivityResult activityResult2 = (ActivityResult) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Navigator navigator = this$0.f254904b;
                PublishSubject publishSubject = this$0.f;
                navigator.exitCurrentScreen();
                int resultCode = activityResult2.getResultCode();
                setKeySet = null;
                Set<String> setKeySet = null;
                if (resultCode == -2) {
                    Intent data3 = activityResult2.getData();
                    if (data3 != null) {
                        Serializable serializableExtra = data3.getSerializableExtra("onfido_exception_result");
                        UnknownCameraException unknownCameraException = serializableExtra instanceof UnknownCameraException ? (UnknownCameraException) serializableExtra : null;
                        if (unknownCameraException != null) {
                            publishSubject.onNext(new tl.e(unknownCameraException));
                        }
                        break;
                    }
                } else if (resultCode == -1) {
                    Intent data4 = activityResult2.getData();
                    if (data4 != null) {
                        IntentHelper intentHelper = IntentHelper.INSTANCE;
                        if (intentHelper.getDocTypeFrom(data4) != null) {
                            CaptureStepDataBundle documentDataBundle = intentHelper.getDocumentDataBundle(data4);
                            NfcProperties nfcProperties = intentHelper.getNfcProperties(data4);
                            CaptureActivity.Companion companion = CaptureActivity.INSTANCE;
                            String uploadedFileId = companion.getUploadedFileId(data4);
                            String documentVideoId = companion.getDocumentVideoId(data4);
                            boolean mediaSupportedNFC = companion.getMediaSupportedNFC(data4);
                            publishSubject.onNext(new tl.b(documentDataBundle, nfcProperties != null ? new tl.k(uploadedFileId, documentVideoId, mediaSupportedNFC, nfcProperties) : new tl.l(uploadedFileId, documentVideoId, mediaSupportedNFC)));
                            break;
                        } else if (!data4.hasExtra("video_path")) {
                            Intent data5 = activityResult2.getData();
                            String uploadedFileId2 = data5 != null ? CaptureActivity.INSTANCE.getUploadedFileId(data5) : null;
                            Intent data6 = activityResult2.getData();
                            UploadedArtifact uploadedArtifact = data6 != null ? CaptureActivity.INSTANCE.getUploadedArtifact(data6) : null;
                            if (uploadedFileId2 == null || uploadedArtifact == null) {
                                Timber.Companion companion2 = Timber.INSTANCE;
                                Intent data7 = activityResult2.getData();
                                if (data7 != null && (extras = data7.getExtras()) != null) {
                                    setKeySet = extras.keySet();
                                }
                                companion2.i("Failed to parse intent that contains " + setKeySet, new Object[0]);
                            } else {
                                publishSubject.onNext(new tl.h(uploadedArtifact));
                            }
                            break;
                        } else {
                            String stringExtra = data4.getStringExtra("video_path");
                            if (stringExtra != null) {
                                Serializable serializableExtra2 = data4.getSerializableExtra("onfido_liveness_challenges");
                                Intrinsics.i(serializableExtra2, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges");
                                publishSubject.onNext(new tl.i(stringExtra, (LivenessPerformedChallenges) serializableExtra2));
                                break;
                            }
                        }
                    }
                } else if (resultCode == 0) {
                    publishSubject.onNext(tl.a.f271978a);
                    break;
                } else if (resultCode == 445) {
                    Intent data8 = activityResult2.getData();
                    if (data8 != null) {
                        String stringExtra2 = data8.getStringExtra("INVALID_CERTIFICATE_MESSAGE");
                        if (stringExtra2 == null) {
                            stringExtra2 = "";
                        }
                        publishSubject.onNext(new tl.c(stringExtra2));
                        break;
                    }
                } else if (resultCode == 446) {
                    publishSubject.onNext(tl.d.f271982a);
                    break;
                } else if (resultCode == 448) {
                    publishSubject.onNext(tl.g.f271984a);
                    break;
                }
                break;
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f253575a) {
            case 4:
                rd3.m mVar = (rd3.m) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) mVar.invoke(p0)).booleanValue();
            case 9:
                rg3.d dVar = (rg3.d) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) dVar.invoke(p0)).booleanValue();
            default:
                rg3.d dVar2 = (rg3.d) this.f253576b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) dVar2.invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        qce.b bVar = (qce.b) this.f253576b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (od0.i) bVar.invoke(p0, p17);
    }
}
