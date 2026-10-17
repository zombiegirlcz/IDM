package com.onfido.android.sdk.capture.ui.documentselection.host;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.ui.documentselection.DocumentTypeSelectionFragment;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\b\u0010\u0007\u001a\u00020\bH\u0016J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentTypeSelectionScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "nfcRequiredWarningVisible", "", "(Z)V", "component1", "copy", "createFragment", "Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionFragment;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DocumentTypeSelectionScreen implements Screen {

    @NotNull
    public static final Parcelable.Creator<DocumentTypeSelectionScreen> CREATOR = new Creator();
    private final boolean nfcRequiredWarningVisible;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DocumentTypeSelectionScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DocumentTypeSelectionScreen createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentTypeSelectionScreen(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DocumentTypeSelectionScreen[] newArray(int i) {
            return new DocumentTypeSelectionScreen[i];
        }
    }

    public DocumentTypeSelectionScreen(boolean z) {
        this.nfcRequiredWarningVisible = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final boolean getNfcRequiredWarningVisible() {
        return this.nfcRequiredWarningVisible;
    }

    public static /* synthetic */ DocumentTypeSelectionScreen copy$default(DocumentTypeSelectionScreen documentTypeSelectionScreen, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = documentTypeSelectionScreen.nfcRequiredWarningVisible;
        }
        return documentTypeSelectionScreen.copy(z);
    }

    @NotNull
    public final DocumentTypeSelectionScreen copy(boolean nfcRequiredWarningVisible) {
        return new DocumentTypeSelectionScreen(nfcRequiredWarningVisible);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentTypeSelectionScreen) && this.nfcRequiredWarningVisible == ((DocumentTypeSelectionScreen) other).nfcRequiredWarningVisible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.nfcRequiredWarningVisible);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    @NotNull
    public String toString() {
        return a.x(new StringBuilder("DocumentTypeSelectionScreen(nfcRequiredWarningVisible="), this.nfcRequiredWarningVisible, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.nfcRequiredWarningVisible ? 1 : 0);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public DocumentTypeSelectionFragment createFragment() {
        return DocumentTypeSelectionFragment.INSTANCE.createInstance(this.nfcRequiredWarningVisible);
    }
}
