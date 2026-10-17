package com.onfido.android.sdk.capture.validation;

import com.onfido.api.client.ValidationLevel;
import com.onfido.api.client.ValidationType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/validation/Validation;", "", "validationType", "Lcom/onfido/api/client/ValidationType;", "validationLevel", "Lcom/onfido/api/client/ValidationLevel;", "(Lcom/onfido/api/client/ValidationType;Lcom/onfido/api/client/ValidationLevel;)V", "level", "", "getLevel", "()Ljava/lang/String;", "type", "getType", "getValidationType$onfido_capture_sdk_core_release", "()Lcom/onfido/api/client/ValidationType;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Validation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String level;

    @NotNull
    private final String type;

    @NotNull
    private final ValidationType validationType;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/validation/Validation$Companion;", "", "()V", "fromInternalOnfidoTypes", "Lcom/onfido/android/sdk/capture/validation/Validation;", "validationType", "Lcom/onfido/api/client/ValidationType;", "validationLevel", "Lcom/onfido/api/client/ValidationLevel;", "fromInternalOnfidoTypes$onfido_capture_sdk_core_release", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Validation fromInternalOnfidoTypes$onfido_capture_sdk_core_release(@NotNull ValidationType validationType, @NotNull ValidationLevel validationLevel) {
            Intrinsics.checkNotNullParameter(validationType, "validationType");
            Intrinsics.checkNotNullParameter(validationLevel, "validationLevel");
            return new Validation(validationType, validationLevel);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Validation(@NotNull ValidationType validationType, @NotNull ValidationLevel validationLevel) {
        Intrinsics.checkNotNullParameter(validationType, "validationType");
        Intrinsics.checkNotNullParameter(validationLevel, "validationLevel");
        this.validationType = validationType;
        String id10 = validationType.getId();
        Intrinsics.checkNotNullExpressionValue(id10, "getId(...)");
        this.type = id10;
        String id11 = validationLevel.getId();
        Intrinsics.checkNotNullExpressionValue(id11, "getId(...)");
        this.level = id11;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: getValidationType$onfido_capture_sdk_core_release, reason: from getter */
    public final ValidationType getValidationType() {
        return this.validationType;
    }
}
