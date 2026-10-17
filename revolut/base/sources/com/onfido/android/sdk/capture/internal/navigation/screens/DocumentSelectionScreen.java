package com.onfido.android.sdk.capture.internal.navigation.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment;
import com.onfido.android.sdk.capture.utils.CountryCode;
import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006&"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/navigation/screens/DocumentSelectionScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentTypes", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "nfcRequiredWarningVisible", "", "isInWorkflow", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;Ljava/util/List;ZZ)V", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentTypes", "()Ljava/util/List;", "()Z", "getNfcRequiredWarningVisible", "component1", "component2", "component3", "component4", "copy", "createFragment", "Landroidx/fragment/app/Fragment;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DocumentSelectionScreen implements Screen {
    private final CountryCode countryCode;

    @NotNull
    private final List<DocumentType> documentTypes;
    private final boolean isInWorkflow;
    private final boolean nfcRequiredWarningVisible;

    @NotNull
    public static final String KEY_REQUEST = "request_key_document_selection";

    @NotNull
    public static final Parcelable.Creator<DocumentSelectionScreen> CREATOR = new Creator();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DocumentSelectionScreen> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DocumentSelectionScreen createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CountryCode countryCodeValueOf = parcel.readInt() == 0 ? null : CountryCode.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DocumentType.valueOf(parcel.readString()));
            }
            return new DocumentSelectionScreen(countryCodeValueOf, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final DocumentSelectionScreen[] newArray(int i) {
            return new DocumentSelectionScreen[i];
        }
    }

    public DocumentSelectionScreen() {
        this(null, null, false, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentSelectionScreen copy$default(DocumentSelectionScreen documentSelectionScreen, CountryCode countryCode, List list, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            countryCode = documentSelectionScreen.countryCode;
        }
        if ((i & 2) != 0) {
            list = documentSelectionScreen.documentTypes;
        }
        if ((i & 4) != 0) {
            z = documentSelectionScreen.nfcRequiredWarningVisible;
        }
        if ((i & 8) != 0) {
            z3 = documentSelectionScreen.isInWorkflow;
        }
        return documentSelectionScreen.copy(countryCode, list, z, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CountryCode getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final List<DocumentType> component2() {
        return this.documentTypes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getNfcRequiredWarningVisible() {
        return this.nfcRequiredWarningVisible;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsInWorkflow() {
        return this.isInWorkflow;
    }

    @NotNull
    public final DocumentSelectionScreen copy(CountryCode countryCode, @NotNull List<? extends DocumentType> documentTypes, boolean nfcRequiredWarningVisible, boolean isInWorkflow) {
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        return new DocumentSelectionScreen(countryCode, documentTypes, nfcRequiredWarningVisible, isInWorkflow);
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public Fragment createFragment() {
        return DocumentSelectionHostFragment.INSTANCE.createInstance(this.countryCode, "request_key_document_selection", this.nfcRequiredWarningVisible, this.isInWorkflow);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentSelectionScreen)) {
            return false;
        }
        DocumentSelectionScreen documentSelectionScreen = (DocumentSelectionScreen) other;
        return this.countryCode == documentSelectionScreen.countryCode && Intrinsics.f(this.documentTypes, documentSelectionScreen.documentTypes) && this.nfcRequiredWarningVisible == documentSelectionScreen.nfcRequiredWarningVisible && this.isInWorkflow == documentSelectionScreen.isInWorkflow;
    }

    public final CountryCode getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final List<DocumentType> getDocumentTypes() {
        return this.documentTypes;
    }

    public final boolean getNfcRequiredWarningVisible() {
        return this.nfcRequiredWarningVisible;
    }

    public int hashCode() {
        CountryCode countryCode = this.countryCode;
        return Boolean.hashCode(this.isInWorkflow) + a.c(p.a.d((countryCode == null ? 0 : countryCode.hashCode()) * 31, 31, this.documentTypes), 31, this.nfcRequiredWarningVisible);
    }

    public final boolean isInWorkflow() {
        return this.isInWorkflow;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    @NotNull
    public String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("DocumentSelectionScreen(countryCode=");
        sb6.append(this.countryCode);
        sb6.append(", documentTypes=");
        sb6.append(this.documentTypes);
        sb6.append(", nfcRequiredWarningVisible=");
        sb6.append(this.nfcRequiredWarningVisible);
        sb6.append(", isInWorkflow=");
        return a.x(sb6, this.isInWorkflow, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        CountryCode countryCode = this.countryCode;
        if (countryCode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(countryCode.name());
        }
        Iterator itV = p.a.v(this.documentTypes, parcel);
        while (itV.hasNext()) {
            parcel.writeString(((DocumentType) itV.next()).name());
        }
        parcel.writeInt(this.nfcRequiredWarningVisible ? 1 : 0);
        parcel.writeInt(this.isInWorkflow ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentSelectionScreen(CountryCode countryCode, @NotNull List<? extends DocumentType> documentTypes, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        this.countryCode = countryCode;
        this.documentTypes = documentTypes;
        this.nfcRequiredWarningVisible = z;
        this.isInWorkflow = z3;
    }

    public DocumentSelectionScreen(CountryCode countryCode, List list, boolean z, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : countryCode, (i & 2) != 0 ? f0.f322471a : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z3);
    }
}
