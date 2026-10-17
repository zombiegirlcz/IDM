package com.onfido.android.sdk.capture.utils.mlmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/mlmodel/OnfidoMlModels;", "", "assetName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAssetName", "()Ljava/lang/String;", "DOCUMENT_DETECTION", "DOCUMENT_TYPE_DETECTION", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoMlModels {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnfidoMlModels[] $VALUES;
    public static final OnfidoMlModels DOCUMENT_DETECTION = new OnfidoMlModels("DOCUMENT_DETECTION", 0, "model_new.tflite");
    public static final OnfidoMlModels DOCUMENT_TYPE_DETECTION = new OnfidoMlModels("DOCUMENT_TYPE_DETECTION", 1, "quantised_model.tflite");

    @NotNull
    private final String assetName;

    private static final /* synthetic */ OnfidoMlModels[] $values() {
        return new OnfidoMlModels[]{DOCUMENT_DETECTION, DOCUMENT_TYPE_DETECTION};
    }

    static {
        OnfidoMlModels[] onfidoMlModelsArr$values = $values();
        $VALUES = onfidoMlModelsArr$values;
        $ENTRIES = s.n(onfidoMlModelsArr$values);
    }

    private OnfidoMlModels(String str, int i, String str2) {
        this.assetName = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static OnfidoMlModels valueOf(String str) {
        return (OnfidoMlModels) Enum.valueOf(OnfidoMlModels.class, str);
    }

    public static OnfidoMlModels[] values() {
        return (OnfidoMlModels[]) $VALUES.clone();
    }

    @NotNull
    public final String getAssetName() {
        return this.assetName;
    }
}
