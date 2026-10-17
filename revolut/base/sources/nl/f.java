package nl;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.core.os.BundleKt;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.screens.DocumentSelectionScreen;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class f implements igm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f216905c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(int i, Serializable serializable, Object obj2, Object obj3) {
        this.f216903a = i;
        this.f216904b = obj2;
        this.f216905c = serializable;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // igm.a
    public final void run() throws IOException {
        switch (this.f216903a) {
            case 0:
                p this$0 = (p) this.f216904b;
                CaptureStepDataBundle captureStepDataBundle = (CaptureStepDataBundle) this.f216905c;
                NfcArguments nfcArguments = (NfcArguments) this.d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(captureStepDataBundle, "$captureStepDataBundle");
                Intrinsics.checkNotNullParameter(nfcArguments, "$nfcArguments");
                this$0.f216933c.navigateTo(new DocumentCaptureScreen(captureStepDataBundle, false, nfcArguments));
                return;
            case 1:
                u this$02 = (u) this.f216904b;
                CountryCode countryCode = (CountryCode) this.f216905c;
                sl.n documentTask = (sl.n) this.d;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(documentTask, "$documentTask");
                this$02.f216951a.navigateTo(new DocumentSelectionScreen(countryCode, null, Intrinsics.f(documentTask.f264052c, NFCOptions.Enabled.Required.INSTANCE), true, 2, null));
                return;
            case 2:
                u this$03 = (u) this.f216904b;
                CaptureStepDataBundle captureDataBundle = (CaptureStepDataBundle) this.f216905c;
                sl.n documentTask2 = (sl.n) this.d;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(captureDataBundle, "$captureDataBundle");
                Intrinsics.checkNotNullParameter(documentTask2, "$documentTask");
                Navigator navigator = this$03.f216951a;
                DocSide docSide = captureDataBundle.getDocSide();
                if (docSide == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                navigator.navigateTo(new DocumentCaptureScreen(captureDataBundle, docSide == DocSide.FRONT, new NfcArguments(documentTask2.f264052c, null, 2, 0 == true ? 1 : 0)));
                return;
            case 3:
                String biometricToken = (String) this.f216904b;
                String customerUserHash = (String) this.f216905c;
                ol.c this$04 = (ol.c) this.d;
                Intrinsics.checkNotNullParameter(biometricToken, "$biometricToken");
                Intrinsics.checkNotNullParameter(customerUserHash, "$customerUserHash");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Bundle bundleBundleOf = BundleKt.bundleOf(new Pair("biometric_token", biometricToken), new Pair("biometric_customer_user_hash", customerUserHash));
                ResultReceiver resultReceiver = this$04.f226263b;
                if (resultReceiver != null) {
                    resultReceiver.send(-1, bundleBundleOf);
                    return;
                }
                return;
            default:
                ol.e this$05 = (ol.e) this.f216904b;
                String customerUserHash2 = (String) this.f216905c;
                String biometricToken2 = (String) this.d;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(customerUserHash2, "$customerUserHash");
                Intrinsics.checkNotNullParameter(biometricToken2, "$biometricToken");
                Context context = this$05.f226265a;
                Json json = this$05.f226266b;
                File file = new File(context.getFilesDir(), "ebt_storage.json");
                LinkedHashMap linkedHashMapZ = file.exists() ? zhm.r0.z((Map) json.b(jh.d.v(json.f187949b, kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(String.class)))), lim.m.f(file, Charsets.UTF_8))) : new LinkedHashMap();
                linkedHashMapZ.put(customerUserHash2, biometricToken2);
                lim.m.h(file, json.c(jh.d.v(json.f187949b, kotlin.jvm.internal.o0.f186429a.d(kotlin.jvm.internal.o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(String.class))))), linkedHashMapZ), Charsets.UTF_8);
                return;
        }
    }
}
