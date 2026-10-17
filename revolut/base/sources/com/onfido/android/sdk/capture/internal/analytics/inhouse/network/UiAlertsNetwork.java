package com.onfido.android.sdk.capture.internal.analytics.inhouse.network;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.UiAlerts;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import p.a;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 /2\u00020\u0001:\u0002./B\u0085\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B_\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J&\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,HÁ\u0001¢\u0006\u0002\b-R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015¨\u00060"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/UiAlertsNetwork;", "", "seen1", "", "faceVideoTimeout", "", "noFace", "multipleFaces", "requestError", "document", "glare", "blur", "barcode", "cutoff", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBarcode$annotations", "()V", "getBarcode", "()Ljava/lang/String;", "getBlur$annotations", "getBlur", "getCutoff$annotations", "getCutoff", "getDocument$annotations", "getDocument", "getFaceVideoTimeout$annotations", "getFaceVideoTimeout", "getGlare$annotations", "getGlare", "getMultipleFaces$annotations", "getMultipleFaces", "getNoFace$annotations", "getNoFace", "getRequestError$annotations", "getRequestError", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final class UiAlertsNetwork {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String barcode;
    private final String blur;
    private final String cutoff;
    private final String document;
    private final String faceVideoTimeout;
    private final String glare;
    private final String multipleFaces;
    private final String noFace;
    private final String requestError;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/UiAlertsNetwork$Companion;", "", "()V", "fromUiAlerts", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/UiAlertsNetwork;", "uiAlerts", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/UiAlerts;", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final UiAlertsNetwork fromUiAlerts(@NotNull UiAlerts uiAlerts) {
            String strR;
            String strR2;
            String strR3;
            String strR4;
            String strR5;
            String strR6;
            String strR7;
            String strR8;
            Intrinsics.checkNotNullParameter(uiAlerts, "uiAlerts");
            UiAlerts.UiAlertType faceVideoTimeout = uiAlerts.getFaceVideoTimeout();
            String strR9 = null;
            if (faceVideoTimeout != null) {
                String strName = faceVideoTimeout.name();
                Locale locale = Locale.US;
                strR = a.r(locale, "US", strName, locale, "toLowerCase(...)");
            } else {
                strR = null;
            }
            UiAlerts.UiAlertType noFace = uiAlerts.getNoFace();
            if (noFace != null) {
                String strName2 = noFace.name();
                Locale locale2 = Locale.US;
                strR2 = a.r(locale2, "US", strName2, locale2, "toLowerCase(...)");
            } else {
                strR2 = null;
            }
            UiAlerts.UiAlertType multipleFaces = uiAlerts.getMultipleFaces();
            if (multipleFaces != null) {
                String strName3 = multipleFaces.name();
                Locale locale3 = Locale.US;
                strR3 = a.r(locale3, "US", strName3, locale3, "toLowerCase(...)");
            } else {
                strR3 = null;
            }
            UiAlerts.UiAlertType requestError = uiAlerts.getRequestError();
            if (requestError != null) {
                String strName4 = requestError.name();
                Locale locale4 = Locale.US;
                strR4 = a.r(locale4, "US", strName4, locale4, "toLowerCase(...)");
            } else {
                strR4 = null;
            }
            UiAlerts.UiAlertType document = uiAlerts.getDocument();
            if (document != null) {
                String strName5 = document.name();
                Locale locale5 = Locale.US;
                strR5 = a.r(locale5, "US", strName5, locale5, "toLowerCase(...)");
            } else {
                strR5 = null;
            }
            UiAlerts.UiAlertType glare = uiAlerts.getGlare();
            if (glare != null) {
                String strName6 = glare.name();
                Locale locale6 = Locale.US;
                strR6 = a.r(locale6, "US", strName6, locale6, "toLowerCase(...)");
            } else {
                strR6 = null;
            }
            UiAlerts.UiAlertType blur = uiAlerts.getBlur();
            if (blur != null) {
                String strName7 = blur.name();
                Locale locale7 = Locale.US;
                strR7 = a.r(locale7, "US", strName7, locale7, "toLowerCase(...)");
            } else {
                strR7 = null;
            }
            UiAlerts.UiAlertType barcode = uiAlerts.getBarcode();
            if (barcode != null) {
                String strName8 = barcode.name();
                Locale locale8 = Locale.US;
                strR8 = a.r(locale8, "US", strName8, locale8, "toLowerCase(...)");
            } else {
                strR8 = null;
            }
            UiAlerts.UiAlertType cutoff = uiAlerts.getCutoff();
            if (cutoff != null) {
                String strName9 = cutoff.name();
                Locale locale9 = Locale.US;
                strR9 = a.r(locale9, "US", strName9, locale9, "toLowerCase(...)");
            }
            return new UiAlertsNetwork(strR, strR2, strR3, strR4, strR5, strR6, strR7, strR8, strR9);
        }

        @NotNull
        public final KSerializer serializer() {
            return UiAlertsNetwork$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ UiAlertsNetwork(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            j1.f(UiAlertsNetwork$$serializer.INSTANCE.getDescriptor(), i, 511);
            throw null;
        }
        this.faceVideoTimeout = str;
        this.noFace = str2;
        this.multipleFaces = str3;
        this.requestError = str4;
        this.document = str5;
        this.glare = str6;
        this.blur = str7;
        this.barcode = str8;
        this.cutoff = str9;
    }

    public static /* synthetic */ void getBarcode$annotations() {
    }

    public static /* synthetic */ void getBlur$annotations() {
    }

    public static /* synthetic */ void getCutoff$annotations() {
    }

    public static /* synthetic */ void getDocument$annotations() {
    }

    public static /* synthetic */ void getFaceVideoTimeout$annotations() {
    }

    public static /* synthetic */ void getGlare$annotations() {
    }

    public static /* synthetic */ void getMultipleFaces$annotations() {
    }

    public static /* synthetic */ void getNoFace$annotations() {
    }

    public static /* synthetic */ void getRequestError$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(UiAlertsNetwork self, CompositeEncoder output, SerialDescriptor serialDesc) {
        v1 v1Var = v1.f247718a;
        output.encodeNullableSerializableElement(serialDesc, 0, v1Var, self.faceVideoTimeout);
        output.encodeNullableSerializableElement(serialDesc, 1, v1Var, self.noFace);
        output.encodeNullableSerializableElement(serialDesc, 2, v1Var, self.multipleFaces);
        output.encodeNullableSerializableElement(serialDesc, 3, v1Var, self.requestError);
        output.encodeNullableSerializableElement(serialDesc, 4, v1Var, self.document);
        output.encodeNullableSerializableElement(serialDesc, 5, v1Var, self.glare);
        output.encodeNullableSerializableElement(serialDesc, 6, v1Var, self.blur);
        output.encodeNullableSerializableElement(serialDesc, 7, v1Var, self.barcode);
        output.encodeNullableSerializableElement(serialDesc, 8, v1Var, self.cutoff);
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final String getBlur() {
        return this.blur;
    }

    public final String getCutoff() {
        return this.cutoff;
    }

    public final String getDocument() {
        return this.document;
    }

    public final String getFaceVideoTimeout() {
        return this.faceVideoTimeout;
    }

    public final String getGlare() {
        return this.glare;
    }

    public final String getMultipleFaces() {
        return this.multipleFaces;
    }

    public final String getNoFace() {
        return this.noFace;
    }

    public final String getRequestError() {
        return this.requestError;
    }

    public UiAlertsNetwork(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.faceVideoTimeout = str;
        this.noFace = str2;
        this.multipleFaces = str3;
        this.requestError = str4;
        this.document = str5;
        this.glare = str6;
        this.blur = str7;
        this.barcode = str8;
        this.cutoff = str9;
    }
}
