package com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.PoaDocumentType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001b\u001c\u001dB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u001a\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel$PoaDocumentDetailsViewState;", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "getInstructions", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel$PoaDocumentGuidance;", "documentType", "Lcom/onfido/api/client/data/PoaDocumentType;", "getStringResourceForTitle", "", "isUk", "", "getSubtitleStringResource", "init", "", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "isAddressCard", "trackPoaDocumentDetails", "Companion", "PoaDocumentDetailsViewState", "PoaDocumentGuidance", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaDocumentDetailsViewModel extends ViewModel {

    @NotNull
    private final MutableLiveData<PoaDocumentDetailsViewState> _viewState;

    @NotNull
    private final ScreenTracker screenTracker;

    @NotNull
    private static final PoaDocumentGuidance DEFAULT_GUIDANCE = new PoaDocumentGuidance(R.string.onfido_poa_guidance_instructions_logo, R.string.onfido_poa_guidance_instructions_full_name, R.string.onfido_poa_guidance_instructions_address, R.string.onfido_poa_guidance_instructions_issue_date);

    @NotNull
    private static final PoaDocumentGuidance ADDRESS_CARD_GUIDANCE = new PoaDocumentGuidance(R.string.onfido_poa_guidance_instructions_full_name, R.string.onfido_poa_guidance_instructions_full_address, R.string.onfido_poa_guidance_instructions_address_card_issue_date, R.string.onfido_poa_guidance_instructions_expiry_date);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel$PoaDocumentDetailsViewState;", "", "titleResId", "", "subtitleResId", "instructions", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel$PoaDocumentGuidance;", "(IILcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel$PoaDocumentGuidance;)V", "getInstructions", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel$PoaDocumentGuidance;", "getSubtitleResId", "()I", "getTitleResId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PoaDocumentDetailsViewState {

        @NotNull
        private final PoaDocumentGuidance instructions;
        private final int subtitleResId;
        private final int titleResId;

        public PoaDocumentDetailsViewState(int i, int i2, @NotNull PoaDocumentGuidance instructions) {
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            this.titleResId = i;
            this.subtitleResId = i2;
            this.instructions = instructions;
        }

        public static /* synthetic */ PoaDocumentDetailsViewState copy$default(PoaDocumentDetailsViewState poaDocumentDetailsViewState, int i, int i2, PoaDocumentGuidance poaDocumentGuidance, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = poaDocumentDetailsViewState.titleResId;
            }
            if ((i3 & 2) != 0) {
                i2 = poaDocumentDetailsViewState.subtitleResId;
            }
            if ((i3 & 4) != 0) {
                poaDocumentGuidance = poaDocumentDetailsViewState.instructions;
            }
            return poaDocumentDetailsViewState.copy(i, i2, poaDocumentGuidance);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitleResId() {
            return this.titleResId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSubtitleResId() {
            return this.subtitleResId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final PoaDocumentGuidance getInstructions() {
            return this.instructions;
        }

        @NotNull
        public final PoaDocumentDetailsViewState copy(int titleResId, int subtitleResId, @NotNull PoaDocumentGuidance instructions) {
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            return new PoaDocumentDetailsViewState(titleResId, subtitleResId, instructions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PoaDocumentDetailsViewState)) {
                return false;
            }
            PoaDocumentDetailsViewState poaDocumentDetailsViewState = (PoaDocumentDetailsViewState) other;
            return this.titleResId == poaDocumentDetailsViewState.titleResId && this.subtitleResId == poaDocumentDetailsViewState.subtitleResId && Intrinsics.f(this.instructions, poaDocumentDetailsViewState.instructions);
        }

        @NotNull
        public final PoaDocumentGuidance getInstructions() {
            return this.instructions;
        }

        public final int getSubtitleResId() {
            return this.subtitleResId;
        }

        public final int getTitleResId() {
            return this.titleResId;
        }

        public int hashCode() {
            return this.instructions.hashCode() + j6.a.b(this.subtitleResId, Integer.hashCode(this.titleResId) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "PoaDocumentDetailsViewState(titleResId=" + this.titleResId + ", subtitleResId=" + this.subtitleResId + ", instructions=" + this.instructions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel$PoaDocumentGuidance;", "", "bullet1", "", "bullet2", "bullet3", "bullet4", "(IIII)V", "getBullet1", "()I", "getBullet2", "getBullet3", "getBullet4", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PoaDocumentGuidance {
        private final int bullet1;
        private final int bullet2;
        private final int bullet3;
        private final int bullet4;

        public PoaDocumentGuidance(int i, int i2, int i3, int i5) {
            this.bullet1 = i;
            this.bullet2 = i2;
            this.bullet3 = i3;
            this.bullet4 = i5;
        }

        public static /* synthetic */ PoaDocumentGuidance copy$default(PoaDocumentGuidance poaDocumentGuidance, int i, int i2, int i3, int i5, int i6, Object obj2) {
            if ((i6 & 1) != 0) {
                i = poaDocumentGuidance.bullet1;
            }
            if ((i6 & 2) != 0) {
                i2 = poaDocumentGuidance.bullet2;
            }
            if ((i6 & 4) != 0) {
                i3 = poaDocumentGuidance.bullet3;
            }
            if ((i6 & 8) != 0) {
                i5 = poaDocumentGuidance.bullet4;
            }
            return poaDocumentGuidance.copy(i, i2, i3, i5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getBullet1() {
            return this.bullet1;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getBullet2() {
            return this.bullet2;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBullet3() {
            return this.bullet3;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getBullet4() {
            return this.bullet4;
        }

        @NotNull
        public final PoaDocumentGuidance copy(int bullet1, int bullet2, int bullet3, int bullet4) {
            return new PoaDocumentGuidance(bullet1, bullet2, bullet3, bullet4);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PoaDocumentGuidance)) {
                return false;
            }
            PoaDocumentGuidance poaDocumentGuidance = (PoaDocumentGuidance) other;
            return this.bullet1 == poaDocumentGuidance.bullet1 && this.bullet2 == poaDocumentGuidance.bullet2 && this.bullet3 == poaDocumentGuidance.bullet3 && this.bullet4 == poaDocumentGuidance.bullet4;
        }

        public final int getBullet1() {
            return this.bullet1;
        }

        public final int getBullet2() {
            return this.bullet2;
        }

        public final int getBullet3() {
            return this.bullet3;
        }

        public final int getBullet4() {
            return this.bullet4;
        }

        public int hashCode() {
            return Integer.hashCode(this.bullet4) + j6.a.b(this.bullet3, j6.a.b(this.bullet2, Integer.hashCode(this.bullet1) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("PoaDocumentGuidance(bullet1=");
            sb6.append(this.bullet1);
            sb6.append(", bullet2=");
            sb6.append(this.bullet2);
            sb6.append(", bullet3=");
            sb6.append(this.bullet3);
            sb6.append(", bullet4=");
            return j6.a.t(sb6, this.bullet4, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PoaDocumentType.values().length];
            try {
                iArr[PoaDocumentType.BANK_BUILDING_SOCIETY_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PoaDocumentType.UTILITY_BILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PoaDocumentType.COUNCIL_TAX_LETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PoaDocumentType.BENEFITS_LETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PoaDocumentType.ADDRESS_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PoaDocumentDetailsViewModel(@NotNull ScreenTracker screenTracker) {
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        this.screenTracker = screenTracker;
        this._viewState = new MutableLiveData<>();
    }

    private final PoaDocumentGuidance getInstructions(PoaDocumentType documentType) {
        return isAddressCard(documentType) ? ADDRESS_CARD_GUIDANCE : DEFAULT_GUIDANCE;
    }

    private final int getStringResourceForTitle(PoaDocumentType documentType, boolean isUk) {
        int i = WhenMappings.$EnumSwitchMapping$0[documentType.ordinal()];
        if (i == 1) {
            return isUk ? R.string.onfido_doc_select_button_bank_statement : R.string.onfido_doc_select_button_bank_statement_non_uk;
        }
        if (i == 2) {
            return R.string.onfido_doc_select_button_bill;
        }
        if (i == 3) {
            return R.string.onfido_doc_select_button_tax_letter;
        }
        if (i == 4) {
            return R.string.onfido_doc_select_button_benefits_letter;
        }
        if (i == 5) {
            return R.string.onfido_doc_select_button_address_card;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getSubtitleStringResource(PoaDocumentType documentType) {
        int i = WhenMappings.$EnumSwitchMapping$0[documentType.ordinal()];
        if (i == 1) {
            return R.string.onfido_poa_guidance_subtitle_bank_statement;
        }
        if (i == 2) {
            return R.string.onfido_poa_guidance_subtitle_bill;
        }
        if (i == 3) {
            return R.string.onfido_poa_guidance_subtitle_tax_letter;
        }
        if (i == 4) {
            return R.string.onfido_poa_guidance_subtitle_benefits_letter;
        }
        if (i == 5) {
            return R.string.onfido_poa_guidance_subtitle_address_card;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean isAddressCard(PoaDocumentType documentType) {
        return PoaDocumentType.ADDRESS_CARD == documentType;
    }

    @NotNull
    public final LiveData<PoaDocumentDetailsViewState> getViewState() {
        return this._viewState;
    }

    public final void init(@NotNull CountryCode countryCode, @NotNull PoaDocumentType documentType) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this._viewState.postValue(new PoaDocumentDetailsViewState(getStringResourceForTitle(documentType, PoaDocumentDetailsViewModelKt.isUK(countryCode)), getSubtitleStringResource(documentType), getInstructions(documentType)));
    }

    public final void trackPoaDocumentDetails() {
        this.screenTracker.trackPoaDocumentDetails$onfido_capture_sdk_core_release();
    }
}
