package com.onfido.android.sdk.capture.ui.model;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015Ba\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003Jj\u0010-\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00066"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "", "uppercaseLabel", "", "captureFrontPrimaryLabel", "captureBackPrimaryLabel", "captureFrontSecondaryLabel", "captureBackSecondaryLabel", "readabilityCheckLabel", "readabilityConfirmationLabel", "readabilityDiscardLabel", "icon", "(Ljava/lang/Integer;IIIIIIII)V", "getCaptureBackPrimaryLabel", "()I", "setCaptureBackPrimaryLabel", "(I)V", "getCaptureBackSecondaryLabel", "setCaptureBackSecondaryLabel", "getCaptureFrontPrimaryLabel", "setCaptureFrontPrimaryLabel", "getCaptureFrontSecondaryLabel", "setCaptureFrontSecondaryLabel", "getIcon", "setIcon", "getReadabilityCheckLabel", "setReadabilityCheckLabel", "getReadabilityConfirmationLabel", "setReadabilityConfirmationLabel", "getReadabilityDiscardLabel", "setReadabilityDiscardLabel", "getUppercaseLabel", "()Ljava/lang/Integer;", "setUppercaseLabel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;IIIIIIII)Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "equals", "", "other", "hashCode", "toString", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DocumentTypeUIModel {
    private static final int NO_ICON = 0;
    private int captureBackPrimaryLabel;
    private int captureBackSecondaryLabel;
    private int captureFrontPrimaryLabel;
    private int captureFrontSecondaryLabel;
    private int icon;
    private int readabilityCheckLabel;
    private int readabilityConfirmationLabel;
    private int readabilityDiscardLabel;
    private Integer uppercaseLabel;

    public DocumentTypeUIModel(Integer num, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        this.uppercaseLabel = num;
        this.captureFrontPrimaryLabel = i;
        this.captureBackPrimaryLabel = i2;
        this.captureFrontSecondaryLabel = i3;
        this.captureBackSecondaryLabel = i5;
        this.readabilityCheckLabel = i6;
        this.readabilityConfirmationLabel = i21;
        this.readabilityDiscardLabel = i22;
        this.icon = i32;
    }

    public static /* synthetic */ DocumentTypeUIModel copy$default(DocumentTypeUIModel documentTypeUIModel, Integer num, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, Object obj2) {
        if ((i33 & 1) != 0) {
            num = documentTypeUIModel.uppercaseLabel;
        }
        if ((i33 & 2) != 0) {
            i = documentTypeUIModel.captureFrontPrimaryLabel;
        }
        if ((i33 & 4) != 0) {
            i2 = documentTypeUIModel.captureBackPrimaryLabel;
        }
        if ((i33 & 8) != 0) {
            i3 = documentTypeUIModel.captureFrontSecondaryLabel;
        }
        if ((i33 & 16) != 0) {
            i5 = documentTypeUIModel.captureBackSecondaryLabel;
        }
        if ((i33 & 32) != 0) {
            i6 = documentTypeUIModel.readabilityCheckLabel;
        }
        if ((i33 & 64) != 0) {
            i21 = documentTypeUIModel.readabilityConfirmationLabel;
        }
        if ((i33 & 128) != 0) {
            i22 = documentTypeUIModel.readabilityDiscardLabel;
        }
        if ((i33 & 256) != 0) {
            i32 = documentTypeUIModel.icon;
        }
        int i43 = i22;
        int i59 = i32;
        int i66 = i6;
        int i74 = i21;
        int i92 = i5;
        int i96 = i2;
        return documentTypeUIModel.copy(num, i, i96, i3, i92, i66, i74, i43, i59);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getUppercaseLabel() {
        return this.uppercaseLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCaptureFrontPrimaryLabel() {
        return this.captureFrontPrimaryLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCaptureBackPrimaryLabel() {
        return this.captureBackPrimaryLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCaptureFrontSecondaryLabel() {
        return this.captureFrontSecondaryLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCaptureBackSecondaryLabel() {
        return this.captureBackSecondaryLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getReadabilityCheckLabel() {
        return this.readabilityCheckLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getReadabilityConfirmationLabel() {
        return this.readabilityConfirmationLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getReadabilityDiscardLabel() {
        return this.readabilityDiscardLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final DocumentTypeUIModel copy(Integer uppercaseLabel, int captureFrontPrimaryLabel, int captureBackPrimaryLabel, int captureFrontSecondaryLabel, int captureBackSecondaryLabel, int readabilityCheckLabel, int readabilityConfirmationLabel, int readabilityDiscardLabel, int icon) {
        return new DocumentTypeUIModel(uppercaseLabel, captureFrontPrimaryLabel, captureBackPrimaryLabel, captureFrontSecondaryLabel, captureBackSecondaryLabel, readabilityCheckLabel, readabilityConfirmationLabel, readabilityDiscardLabel, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentTypeUIModel)) {
            return false;
        }
        DocumentTypeUIModel documentTypeUIModel = (DocumentTypeUIModel) other;
        return Intrinsics.f(this.uppercaseLabel, documentTypeUIModel.uppercaseLabel) && this.captureFrontPrimaryLabel == documentTypeUIModel.captureFrontPrimaryLabel && this.captureBackPrimaryLabel == documentTypeUIModel.captureBackPrimaryLabel && this.captureFrontSecondaryLabel == documentTypeUIModel.captureFrontSecondaryLabel && this.captureBackSecondaryLabel == documentTypeUIModel.captureBackSecondaryLabel && this.readabilityCheckLabel == documentTypeUIModel.readabilityCheckLabel && this.readabilityConfirmationLabel == documentTypeUIModel.readabilityConfirmationLabel && this.readabilityDiscardLabel == documentTypeUIModel.readabilityDiscardLabel && this.icon == documentTypeUIModel.icon;
    }

    public final int getCaptureBackPrimaryLabel() {
        return this.captureBackPrimaryLabel;
    }

    public final int getCaptureBackSecondaryLabel() {
        return this.captureBackSecondaryLabel;
    }

    public final int getCaptureFrontPrimaryLabel() {
        return this.captureFrontPrimaryLabel;
    }

    public final int getCaptureFrontSecondaryLabel() {
        return this.captureFrontSecondaryLabel;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getReadabilityCheckLabel() {
        return this.readabilityCheckLabel;
    }

    public final int getReadabilityConfirmationLabel() {
        return this.readabilityConfirmationLabel;
    }

    public final int getReadabilityDiscardLabel() {
        return this.readabilityDiscardLabel;
    }

    public final Integer getUppercaseLabel() {
        return this.uppercaseLabel;
    }

    public int hashCode() {
        Integer num = this.uppercaseLabel;
        return Integer.hashCode(this.icon) + a.b(this.readabilityDiscardLabel, a.b(this.readabilityConfirmationLabel, a.b(this.readabilityCheckLabel, a.b(this.captureBackSecondaryLabel, a.b(this.captureFrontSecondaryLabel, a.b(this.captureBackPrimaryLabel, a.b(this.captureFrontPrimaryLabel, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setCaptureBackPrimaryLabel(int i) {
        this.captureBackPrimaryLabel = i;
    }

    public final void setCaptureBackSecondaryLabel(int i) {
        this.captureBackSecondaryLabel = i;
    }

    public final void setCaptureFrontPrimaryLabel(int i) {
        this.captureFrontPrimaryLabel = i;
    }

    public final void setCaptureFrontSecondaryLabel(int i) {
        this.captureFrontSecondaryLabel = i;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setReadabilityCheckLabel(int i) {
        this.readabilityCheckLabel = i;
    }

    public final void setReadabilityConfirmationLabel(int i) {
        this.readabilityConfirmationLabel = i;
    }

    public final void setReadabilityDiscardLabel(int i) {
        this.readabilityDiscardLabel = i;
    }

    public final void setUppercaseLabel(Integer num) {
        this.uppercaseLabel = num;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("DocumentTypeUIModel(uppercaseLabel=");
        sb6.append(this.uppercaseLabel);
        sb6.append(", captureFrontPrimaryLabel=");
        sb6.append(this.captureFrontPrimaryLabel);
        sb6.append(", captureBackPrimaryLabel=");
        sb6.append(this.captureBackPrimaryLabel);
        sb6.append(", captureFrontSecondaryLabel=");
        sb6.append(this.captureFrontSecondaryLabel);
        sb6.append(", captureBackSecondaryLabel=");
        sb6.append(this.captureBackSecondaryLabel);
        sb6.append(", readabilityCheckLabel=");
        sb6.append(this.readabilityCheckLabel);
        sb6.append(", readabilityConfirmationLabel=");
        sb6.append(this.readabilityConfirmationLabel);
        sb6.append(", readabilityDiscardLabel=");
        sb6.append(this.readabilityDiscardLabel);
        sb6.append(", icon=");
        return a.t(sb6, this.icon, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ DocumentTypeUIModel(Integer num, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i, i2, i3, i5, i6, i21, i22, (i33 & 256) != 0 ? 0 : i32);
    }
}
