package com.onfido.android.sdk.capture.internal.ui.countryselection;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import m72.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.e;
import qlm.j1;
import qlm.v1;
import yhm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002;<B[\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\u0010\u000eJ\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003JA\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0001J\u0013\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J&\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208HÁ\u0001¢\u0006\u0002\b9J\u000e\u0010:\u001a\u0004\u0018\u00010\u001c*\u00020\u0005H\u0002R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010'¨\u0006="}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "", "seen1", "", "countryCodeAlpha2", "", "countryCodeAlpha3", "countryName", "documentTypeAlphaThree", "useCases", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCountryCodeAlpha2$annotations", "()V", "getCountryCodeAlpha2", "()Ljava/lang/String;", "getCountryCodeAlpha3$annotations", "getCountryCodeAlpha3", "countryLocaleName", "getCountryLocaleName", "getCountryName$annotations", "getCountryName", "countryNativeName", "getCountryNativeName", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getDocumentTypeAlphaThree$annotations", "getDocumentTypeAlphaThree", "hasValidUseCase", "", "getHasValidUseCase", "()Z", "getUseCases$annotations", "getUseCases", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "toDocumentType", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class SupportedDocument {

    @NotNull
    private final String countryCodeAlpha2;

    @NotNull
    private final String countryCodeAlpha3;

    @NotNull
    private final String countryName;

    @NotNull
    private final String documentTypeAlphaThree;

    @NotNull
    private final List<String> useCases;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {null, null, null, null, new e(v1.f247718a)};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocument;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SupportedDocument$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ SupportedDocument(int i, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            j1.f(SupportedDocument$$serializer.INSTANCE.getDescriptor(), i, 31);
            throw null;
        }
        this.countryCodeAlpha2 = str;
        this.countryCodeAlpha3 = str2;
        this.countryName = str3;
        this.documentTypeAlphaThree = str4;
        this.useCases = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportedDocument copy$default(SupportedDocument supportedDocument, String str, String str2, String str3, String str4, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = supportedDocument.countryCodeAlpha2;
        }
        if ((i & 2) != 0) {
            str2 = supportedDocument.countryCodeAlpha3;
        }
        if ((i & 4) != 0) {
            str3 = supportedDocument.countryName;
        }
        if ((i & 8) != 0) {
            str4 = supportedDocument.documentTypeAlphaThree;
        }
        if ((i & 16) != 0) {
            list = supportedDocument.useCases;
        }
        List list2 = list;
        String str5 = str3;
        return supportedDocument.copy(str, str2, str5, str4, list2);
    }

    public static /* synthetic */ void getCountryCodeAlpha2$annotations() {
    }

    public static /* synthetic */ void getCountryCodeAlpha3$annotations() {
    }

    public static /* synthetic */ void getCountryName$annotations() {
    }

    public static /* synthetic */ void getDocumentTypeAlphaThree$annotations() {
    }

    public static /* synthetic */ void getUseCases$annotations() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final DocumentType toDocumentType(String str) {
        switch (str.hashCode()) {
            case 67772:
                if (str.equals("DLD")) {
                    return DocumentType.DRIVING_LICENCE;
                }
                return null;
            case 77288:
                if (str.equals("NIC")) {
                    return DocumentType.NATIONAL_IDENTITY_CARD;
                }
                return null;
            case 79439:
                if (str.equals("PPO")) {
                    return DocumentType.PASSPORT;
                }
                return null;
            case 81021:
                if (str.equals("REP")) {
                    return DocumentType.RESIDENCE_PERMIT;
                }
                return null;
            case 84992:
                if (str.equals("VIS")) {
                    return DocumentType.VISA;
                }
                return null;
            case 86012:
                if (str.equals("WKP")) {
                    return DocumentType.WORK_PERMIT;
                }
                return null;
            default:
                return null;
        }
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(SupportedDocument self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.countryCodeAlpha2);
        output.encodeStringElement(serialDesc, 1, self.countryCodeAlpha3);
        output.encodeStringElement(serialDesc, 2, self.countryName);
        output.encodeStringElement(serialDesc, 3, self.documentTypeAlphaThree);
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.useCases);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCodeAlpha2() {
        return this.countryCodeAlpha2;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCodeAlpha3() {
        return this.countryCodeAlpha3;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDocumentTypeAlphaThree() {
        return this.documentTypeAlphaThree;
    }

    @NotNull
    public final List<String> component5() {
        return this.useCases;
    }

    @NotNull
    public final SupportedDocument copy(@NotNull String countryCodeAlpha2, @NotNull String countryCodeAlpha3, @NotNull String countryName, @NotNull String documentTypeAlphaThree, @NotNull List<String> useCases) {
        Intrinsics.checkNotNullParameter(countryCodeAlpha2, "countryCodeAlpha2");
        Intrinsics.checkNotNullParameter(countryCodeAlpha3, "countryCodeAlpha3");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(documentTypeAlphaThree, "documentTypeAlphaThree");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        return new SupportedDocument(countryCodeAlpha2, countryCodeAlpha3, countryName, documentTypeAlphaThree, useCases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportedDocument)) {
            return false;
        }
        SupportedDocument supportedDocument = (SupportedDocument) other;
        return Intrinsics.f(this.countryCodeAlpha2, supportedDocument.countryCodeAlpha2) && Intrinsics.f(this.countryCodeAlpha3, supportedDocument.countryCodeAlpha3) && Intrinsics.f(this.countryName, supportedDocument.countryName) && Intrinsics.f(this.documentTypeAlphaThree, supportedDocument.documentTypeAlphaThree) && Intrinsics.f(this.useCases, supportedDocument.useCases);
    }

    @NotNull
    public final String getCountryCodeAlpha2() {
        return this.countryCodeAlpha2;
    }

    @NotNull
    public final String getCountryCodeAlpha3() {
        return this.countryCodeAlpha3;
    }

    @NotNull
    public final String getCountryLocaleName() {
        String displayName = new Locale("", this.countryCodeAlpha2).getDisplayName();
        Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
        return displayName;
    }

    @NotNull
    public final String getCountryName() {
        return this.countryName;
    }

    public final String getCountryNativeName() {
        return (String) d0.e0(1, kotlin.text.d0.n0(this.countryName, new String[]{" | "}, 0, 6));
    }

    public final DocumentType getDocumentType() {
        return toDocumentType(this.documentTypeAlphaThree);
    }

    @NotNull
    public final String getDocumentTypeAlphaThree() {
        return this.documentTypeAlphaThree;
    }

    public final boolean getHasValidUseCase() {
        return this.useCases.contains("verify");
    }

    @NotNull
    public final List<String> getUseCases() {
        return this.useCases;
    }

    public int hashCode() {
        return this.useCases.hashCode() + p.a.c(p.a.c(p.a.c(this.countryCodeAlpha2.hashCode() * 31, 31, this.countryCodeAlpha3), 31, this.countryName), 31, this.documentTypeAlphaThree);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("SupportedDocument(countryCodeAlpha2=");
        sb6.append(this.countryCodeAlpha2);
        sb6.append(", countryCodeAlpha3=");
        sb6.append(this.countryCodeAlpha3);
        sb6.append(", countryName=");
        sb6.append(this.countryName);
        sb6.append(", documentTypeAlphaThree=");
        sb6.append(this.documentTypeAlphaThree);
        sb6.append(", useCases=");
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.useCases, sb6);
    }

    public SupportedDocument(@NotNull String countryCodeAlpha2, @NotNull String countryCodeAlpha3, @NotNull String countryName, @NotNull String documentTypeAlphaThree, @NotNull List<String> useCases) {
        Intrinsics.checkNotNullParameter(countryCodeAlpha2, "countryCodeAlpha2");
        Intrinsics.checkNotNullParameter(countryCodeAlpha3, "countryCodeAlpha3");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(documentTypeAlphaThree, "documentTypeAlphaThree");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        this.countryCodeAlpha2 = countryCodeAlpha2;
        this.countryCodeAlpha3 = countryCodeAlpha3;
        this.countryName = countryName;
        this.documentTypeAlphaThree = documentTypeAlphaThree;
        this.useCases = useCases;
    }
}
