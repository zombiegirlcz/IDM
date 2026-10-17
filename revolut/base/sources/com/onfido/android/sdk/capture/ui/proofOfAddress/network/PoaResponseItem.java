package com.onfido.android.sdk.capture.ui.proofOfAddress.network;

import com.onfido.api.client.data.PoaDocumentType;
import com.onfido.api.client.data.PoaDocumentType$$serializer;
import java.util.List;
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
import qlm.e;
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 %2\u00020\u0001:\u0002$%BO\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000eJ&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/PoaResponseItem;", "", "seen1", "", "countryAlpha3", "", "countryAlpha2", "countryName", "documentTypes", "", "Lcom/onfido/api/client/data/PoaDocumentType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCountryAlpha2$annotations", "()V", "getCountryAlpha2", "()Ljava/lang/String;", "getCountryAlpha3$annotations", "getCountryAlpha3", "countryLocaleName", "getCountryLocaleName", "getCountryName$annotations", "getCountryName", "getDocumentTypes$annotations", "getDocumentTypes", "()Ljava/util/List;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final class PoaResponseItem {

    @NotNull
    private final String countryAlpha2;

    @NotNull
    private final String countryAlpha3;

    @NotNull
    private final String countryName;

    @NotNull
    private final List<PoaDocumentType> documentTypes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {null, null, null, new e(PoaDocumentType$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/PoaResponseItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/PoaResponseItem;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PoaResponseItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ PoaResponseItem(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            j1.f(PoaResponseItem$$serializer.INSTANCE.getDescriptor(), i, 15);
            throw null;
        }
        this.countryAlpha3 = str;
        this.countryAlpha2 = str2;
        this.countryName = str3;
        this.documentTypes = list;
    }

    public static /* synthetic */ void getCountryAlpha2$annotations() {
    }

    public static /* synthetic */ void getCountryAlpha3$annotations() {
    }

    public static /* synthetic */ void getCountryName$annotations() {
    }

    public static /* synthetic */ void getDocumentTypes$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(PoaResponseItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.countryAlpha3);
        output.encodeStringElement(serialDesc, 1, self.countryAlpha2);
        output.encodeStringElement(serialDesc, 2, self.countryName);
        output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.documentTypes);
    }

    @NotNull
    public final String getCountryAlpha2() {
        return this.countryAlpha2;
    }

    @NotNull
    public final String getCountryAlpha3() {
        return this.countryAlpha3;
    }

    @NotNull
    public final String getCountryLocaleName() {
        String displayName = new Locale("", this.countryAlpha2).getDisplayName();
        Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
        return displayName;
    }

    @NotNull
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final List<PoaDocumentType> getDocumentTypes() {
        return this.documentTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoaResponseItem(@NotNull String countryAlpha3, @NotNull String countryAlpha2, @NotNull String countryName, @NotNull List<? extends PoaDocumentType> documentTypes) {
        Intrinsics.checkNotNullParameter(countryAlpha3, "countryAlpha3");
        Intrinsics.checkNotNullParameter(countryAlpha2, "countryAlpha2");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        this.countryAlpha3 = countryAlpha3;
        this.countryAlpha2 = countryAlpha2;
        this.countryName = countryName;
        this.documentTypes = documentTypes;
    }
}
