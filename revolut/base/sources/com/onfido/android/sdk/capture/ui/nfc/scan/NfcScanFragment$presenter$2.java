package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.content.res.Resources;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter;
import com.onfido.android.sdk.capture.utils.CountryCode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class NfcScanFragment$presenter$2 extends u implements Function0<NfcScanPresenter> {
    final /* synthetic */ NfcScanFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NfcScanFragment$presenter$2(NfcScanFragment nfcScanFragment) {
        super(0);
        this.this$0 = nfcScanFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final NfcScanPresenter invoke() {
        Serializable serializable = this.this$0.requireArguments().getSerializable("document_type_key");
        Intrinsics.i(serializable, "null cannot be cast to non-null type com.onfido.android.sdk.capture.DocumentType");
        DocumentType documentType = (DocumentType) serializable;
        Serializable serializable2 = this.this$0.requireArguments().getSerializable("country_code_key");
        CountryCode countryCode = serializable2 instanceof CountryCode ? (CountryCode) serializable2 : null;
        Serializable serializable3 = this.this$0.requireArguments().getSerializable("nfc_flow_type_key");
        Intrinsics.i(serializable3, "null cannot be cast to non-null type com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType");
        NfcFlowType nfcFlowType = (NfcFlowType) serializable3;
        Serializable serializable4 = this.this$0.requireArguments().getSerializable("key_passport_bac_key");
        Intrinsics.i(serializable4, "null cannot be cast to non-null type com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey");
        PassportBACKey passportBACKey = (PassportBACKey) serializable4;
        byte[] byteArray = this.this$0.requireArguments().getByteArray("key_aa_challenge");
        Intrinsics.h(byteArray);
        int i = this.this$0.requireArguments().getInt("pin_length_key");
        NfcScanPresenter.Factory presenterFactory$onfido_capture_sdk_core_release = this.this$0.getPresenterFactory$onfido_capture_sdk_core_release();
        MRTDDataGroup[] mRTDDataGroupArrM3709default = MRTDDataGroup.INSTANCE.m3709default();
        Resources resources = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return presenterFactory$onfido_capture_sdk_core_release.create(documentType, countryCode, nfcFlowType, passportBACKey, byteArray, false, mRTDDataGroupArrM3709default, null, i, resources);
    }
}
