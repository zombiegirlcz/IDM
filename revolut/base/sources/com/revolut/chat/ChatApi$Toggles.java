package com.revolut.chat;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.PublicExperimentDefinition;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
public final class ChatApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AirActionsPanel;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirActionsPanel extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirActionsPanel f50959c = new AirActionsPanel();

        @NotNull
        public static final Parcelable.Creator<AirActionsPanel> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirActionsPanel.f50959c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirActionsPanel[i];
            }
        }

        private AirActionsPanel() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airActionsPanel");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AirBarChartCard;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirBarChartCard extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirBarChartCard f50960c = new AirBarChartCard();

        @NotNull
        public static final Parcelable.Creator<AirBarChartCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirBarChartCard.f50960c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirBarChartCard[i];
            }
        }

        private AirBarChartCard() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airBarChartCard");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AirCmsSuggestions;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirCmsSuggestions extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirCmsSuggestions f50961c = new AirCmsSuggestions();

        @NotNull
        public static final Parcelable.Creator<AirCmsSuggestions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirCmsSuggestions.f50961c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirCmsSuggestions[i];
            }
        }

        private AirCmsSuggestions() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airCmsSuggestions");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AirFollowUpSuggestions;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirFollowUpSuggestions extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirFollowUpSuggestions f50962c = new AirFollowUpSuggestions();

        @NotNull
        public static final Parcelable.Creator<AirFollowUpSuggestions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirFollowUpSuggestions.f50962c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirFollowUpSuggestions[i];
            }
        }

        private AirFollowUpSuggestions() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airFollowUpSuggestionsEnabled");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AirIntroRevamp;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirIntroRevamp extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirIntroRevamp f50963c = new AirIntroRevamp();

        @NotNull
        public static final Parcelable.Creator<AirIntroRevamp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirIntroRevamp.f50963c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirIntroRevamp[i];
            }
        }

        private AirIntroRevamp() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airIntroRevamp");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AirIntroZoomDisabled;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirIntroZoomDisabled extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirIntroZoomDisabled f50964c = new AirIntroZoomDisabled();

        @NotNull
        public static final Parcelable.Creator<AirIntroZoomDisabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirIntroZoomDisabled.f50964c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirIntroZoomDisabled[i];
            }
        }

        private AirIntroZoomDisabled() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airIntroZoomDisabled");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AirMandatoryIntroStoryConfirmation;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirMandatoryIntroStoryConfirmation extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirMandatoryIntroStoryConfirmation f50965c = new AirMandatoryIntroStoryConfirmation();

        @NotNull
        public static final Parcelable.Creator<AirMandatoryIntroStoryConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirMandatoryIntroStoryConfirmation.f50965c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirMandatoryIntroStoryConfirmation[i];
            }
        }

        private AirMandatoryIntroStoryConfirmation() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airMandatoryIntroStoryConfirmation");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AirSearchMessages;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AirSearchMessages extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AirSearchMessages f50966c = new AirSearchMessages();

        @NotNull
        public static final Parcelable.Creator<AirSearchMessages> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AirSearchMessages.f50966c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AirSearchMessages[i];
            }
        }

        private AirSearchMessages() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("airSearchMessages");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AssistantBranding;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AssistantBranding extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AssistantBranding f50967c = new AssistantBranding();

        @NotNull
        public static final Parcelable.Creator<AssistantBranding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AssistantBranding.f50967c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssistantBranding[i];
            }
        }

        private AssistantBranding() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("assistantBranding");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AssistantExperimentDefinition;", "Lcom/revolut/feature/toggles/models/PublicExperimentDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AssistantExperimentDefinition extends PublicExperimentDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AssistantExperimentDefinition f50968a = new AssistantExperimentDefinition();

        @NotNull
        public static final Parcelable.Creator<AssistantExperimentDefinition> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AssistantExperimentDefinition.f50968a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssistantExperimentDefinition[i];
            }
        }

        private AssistantExperimentDefinition() {
            Intrinsics.checkNotNullParameter("moneyAssistantExperiment", "experimentId");
            Intrinsics.checkNotNullParameter("moneyAssistant", "defaultMutableStateExperimentId");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AssistantIntro;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AssistantIntro extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AssistantIntro f50969c = new AssistantIntro();

        @NotNull
        public static final Parcelable.Creator<AssistantIntro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AssistantIntro.f50969c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssistantIntro[i];
            }
        }

        private AssistantIntro() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moneyAssistantIntroVideo");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$AssistantSuggestionsV3;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AssistantSuggestionsV3 extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AssistantSuggestionsV3 f50970c = new AssistantSuggestionsV3();

        @NotNull
        public static final Parcelable.Creator<AssistantSuggestionsV3> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AssistantSuggestionsV3.f50970c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssistantSuggestionsV3[i];
            }
        }

        private AssistantSuggestionsV3() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("assistantSuggestionsV3");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatBEDrivenTileDismissal;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatBEDrivenTileDismissal extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatBEDrivenTileDismissal f50971c = new ChatBEDrivenTileDismissal();

        @NotNull
        public static final Parcelable.Creator<ChatBEDrivenTileDismissal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatBEDrivenTileDismissal.f50971c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatBEDrivenTileDismissal[i];
            }
        }

        private ChatBEDrivenTileDismissal() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatBEDrivenTileDismissal");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ChatBEDrivenTileDismissal);
        }

        public final int hashCode() {
            return -1189237261;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatBulkAttachments;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatBulkAttachments extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatBulkAttachments f50972c = new ChatBulkAttachments();

        @NotNull
        public static final Parcelable.Creator<ChatBulkAttachments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatBulkAttachments.f50972c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatBulkAttachments[i];
            }
        }

        private ChatBulkAttachments() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatBulkAttachments");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatComposerRedesignEnabled;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatComposerRedesignEnabled extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatComposerRedesignEnabled f50973c = new ChatComposerRedesignEnabled();

        @NotNull
        public static final Parcelable.Creator<ChatComposerRedesignEnabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatComposerRedesignEnabled.f50973c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatComposerRedesignEnabled[i];
            }
        }

        private ChatComposerRedesignEnabled() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatComposerRedesign");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatDownloadTranscriptDateSelection;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatDownloadTranscriptDateSelection extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatDownloadTranscriptDateSelection f50974c = new ChatDownloadTranscriptDateSelection();

        @NotNull
        public static final Parcelable.Creator<ChatDownloadTranscriptDateSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatDownloadTranscriptDateSelection.f50974c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatDownloadTranscriptDateSelection[i];
            }
        }

        private ChatDownloadTranscriptDateSelection() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatDownloadTranscriptDateSelection");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatHistoryEagerLoading;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatHistoryEagerLoading extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatHistoryEagerLoading f50975c = new ChatHistoryEagerLoading();

        @NotNull
        public static final Parcelable.Creator<ChatHistoryEagerLoading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatHistoryEagerLoading.f50975c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatHistoryEagerLoading[i];
            }
        }

        private ChatHistoryEagerLoading() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatHistoryEagerLoading");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatLineChartCard;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatLineChartCard extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatLineChartCard f50976c = new ChatLineChartCard();

        @NotNull
        public static final Parcelable.Creator<ChatLineChartCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatLineChartCard.f50976c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatLineChartCard[i];
            }
        }

        private ChatLineChartCard() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatLineChartCard");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatPersistentComposerDraft;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatPersistentComposerDraft extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatPersistentComposerDraft f50977c = new ChatPersistentComposerDraft();

        @NotNull
        public static final Parcelable.Creator<ChatPersistentComposerDraft> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatPersistentComposerDraft.f50977c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatPersistentComposerDraft[i];
            }
        }

        private ChatPersistentComposerDraft() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatPersistentComposerDraft");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatProfileRedesign;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatProfileRedesign extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatProfileRedesign f50978c = new ChatProfileRedesign();

        @NotNull
        public static final Parcelable.Creator<ChatProfileRedesign> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatProfileRedesign.f50978c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatProfileRedesign[i];
            }
        }

        private ChatProfileRedesign() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatProfileRedesign");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatSearchMessages;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatSearchMessages extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatSearchMessages f50979c = new ChatSearchMessages();

        @NotNull
        public static final Parcelable.Creator<ChatSearchMessages> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatSearchMessages.f50979c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatSearchMessages[i];
            }
        }

        private ChatSearchMessages() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatSearchMessages");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ChatTransactionObject;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChatTransactionObject extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChatTransactionObject f50980c = new ChatTransactionObject();

        @NotNull
        public static final Parcelable.Creator<ChatTransactionObject> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChatTransactionObject.f50980c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatTransactionObject[i];
            }
        }

        private ChatTransactionObject() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatTransactionObjectEnabled");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$ExternalDynamicWidgets;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalDynamicWidgets extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ExternalDynamicWidgets f50981c = new ExternalDynamicWidgets();

        @NotNull
        public static final Parcelable.Creator<ExternalDynamicWidgets> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExternalDynamicWidgets.f50981c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalDynamicWidgets[i];
            }
        }

        private ExternalDynamicWidgets() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatExternalDynamicWidgets");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ExternalDynamicWidgets);
        }

        public final int hashCode() {
            return -1144057392;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$FloatingDatePill;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FloatingDatePill extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FloatingDatePill f50982c = new FloatingDatePill();

        @NotNull
        public static final Parcelable.Creator<FloatingDatePill> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FloatingDatePill.f50982c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FloatingDatePill[i];
            }
        }

        private FloatingDatePill() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chatFloatingDatePill");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$InboundCallsAllPlans;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InboundCallsAllPlans extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InboundCallsAllPlans f50983c = new InboundCallsAllPlans();

        @NotNull
        public static final Parcelable.Creator<InboundCallsAllPlans> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InboundCallsAllPlans.f50983c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InboundCallsAllPlans[i];
            }
        }

        private InboundCallsAllPlans() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("supportInboundCallsAllPlansTesting");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$MoneyAssistant;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoneyAssistant extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoneyAssistant f50984c = new MoneyAssistant();

        @NotNull
        public static final Parcelable.Creator<MoneyAssistant> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoneyAssistant.f50984c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyAssistant[i];
            }
        }

        private MoneyAssistant() {
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final PublicExperimentDefinition V2() {
            return AssistantExperimentDefinition.f50968a;
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moneyAssistant");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/chat/ChatApi$Toggles$SupportNewInbox;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SupportNewInbox extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SupportNewInbox f50985c = new SupportNewInbox();

        @NotNull
        public static final Parcelable.Creator<SupportNewInbox> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SupportNewInbox.f50985c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SupportNewInbox[i];
            }
        }

        private SupportNewInbox() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("supportNewInbox");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private ChatApi$Toggles() {
    }

    public static List a() {
        return v.k(ChatComposerRedesignEnabled.f50973c, MoneyAssistant.f50984c, InboundCallsAllPlans.f50983c, SupportNewInbox.f50985c, AssistantIntro.f50969c, AirIntroRevamp.f50963c, AssistantExperimentDefinition.f50968a, AssistantBranding.f50967c, ChatProfileRedesign.f50978c, ChatBulkAttachments.f50972c, ExternalDynamicWidgets.f50981c, ChatBEDrivenTileDismissal.f50971c, AirActionsPanel.f50959c, ChatTransactionObject.f50980c, ChatPersistentComposerDraft.f50977c, ChatSearchMessages.f50979c, AirSearchMessages.f50966c, ChatDownloadTranscriptDateSelection.f50974c, AssistantSuggestionsV3.f50970c, AirFollowUpSuggestions.f50962c, ChatLineChartCard.f50976c, AirBarChartCard.f50960c, AirCmsSuggestions.f50961c, AirMandatoryIntroStoryConfirmation.f50965c, FloatingDatePill.f50982c, AirIntroZoomDisabled.f50964c, ChatHistoryEagerLoading.f50975c);
    }
}
