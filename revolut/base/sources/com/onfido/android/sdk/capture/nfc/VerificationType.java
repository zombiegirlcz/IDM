package com.onfido.android.sdk.capture.nfc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/nfc/VerificationType;", "", "()V", "ActiveAuthentication", "ChipAuthentication", "Lcom/onfido/android/sdk/capture/nfc/VerificationType$ActiveAuthentication;", "Lcom/onfido/android/sdk/capture/nfc/VerificationType$ChipAuthentication;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class VerificationType {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/nfc/VerificationType$ActiveAuthentication;", "Lcom/onfido/android/sdk/capture/nfc/VerificationType;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActiveAuthentication extends VerificationType {

        @NotNull
        public static final ActiveAuthentication INSTANCE = new ActiveAuthentication();

        private ActiveAuthentication() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActiveAuthentication);
        }

        public int hashCode() {
            return 1414321893;
        }

        @NotNull
        public String toString() {
            return "ActiveAuthentication";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/nfc/VerificationType$ChipAuthentication;", "Lcom/onfido/android/sdk/capture/nfc/VerificationType;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChipAuthentication extends VerificationType {

        @NotNull
        public static final ChipAuthentication INSTANCE = new ChipAuthentication();

        private ChipAuthentication() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ChipAuthentication);
        }

        public int hashCode() {
            return 1151893355;
        }

        @NotNull
        public String toString() {
            return "ChipAuthentication";
        }
    }

    public /* synthetic */ VerificationType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VerificationType() {
    }
}
