package com.onfido.android.sdk.capture.internal.analytics.inhouse.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames;", "", "()V", "BioToBio", "Document", "Face", "Flow", "Motion", "Nfc", "Permissions", "PublicNames", "Screen", "WaitingScreen", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EventNames {

    @NotNull
    public static final EventNames INSTANCE = new EventNames();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$BioToBio;", "", "()V", "BIOMETRIC_TOKEN_RETRIEVAL", "", "BIOMETRIC_TOKEN_RETRIEVAL_COMPLETED", "BIOMETRIC_TOKEN_RETRIEVAL_ERROR", "BIOMETRIC_TOKEN_STORAGE", "BIOMETRIC_TOKEN_STORAGE_COMPLETED", "BIOMETRIC_TOKEN_STORAGE_ERROR", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BioToBio {

        @NotNull
        public static final String BIOMETRIC_TOKEN_RETRIEVAL_ERROR = "BIOMETRIC_TOKEN_RETRIEVAL_ERROR";

        @NotNull
        public static final String BIOMETRIC_TOKEN_STORAGE_COMPLETED = "BIOMETRIC_TOKEN_STORAGE_COMPLETED";

        @NotNull
        public static final String BIOMETRIC_TOKEN_RETRIEVAL = "BIOMETRIC_TOKEN_RETRIEVAL";

        @NotNull
        public static final String BIOMETRIC_TOKEN_STORAGE_ERROR = "BIOMETRIC_TOKEN_STORAGE_ERROR";

        @NotNull
        public static final String BIOMETRIC_TOKEN_STORAGE = "BIOMETRIC_TOKEN_STORAGE";

        @NotNull
        public static final String BIOMETRIC_TOKEN_RETRIEVAL_COMPLETED = "BIOMETRIC_TOKEN_RETRIEVAL_COMPLETED";

        @NotNull
        public static final BioToBio INSTANCE = new BioToBio();

        private BioToBio() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Document;", "", "()V", "DOCUMENT_CAPTURE", "", "DOCUMENT_CAPTURE_ERROR", "DOCUMENT_CAPTURE_FLOW_COMPLETED", "DOCUMENT_CONFIRMATION", "DOCUMENT_CONFIRMATION_ERROR", "DOCUMENT_CONFIRMATION_WARNING", "DOCUMENT_UPLOAD_COMPLETED", "DOCUMENT_UPLOAD_STARTED", "DOCUMENT_VALID_MRZ_EXTRACTED", "ONFIDO_ML_MODEL_READY", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Document {

        @NotNull
        public static final String DOCUMENT_CONFIRMATION_WARNING = "DOCUMENT_CONFIRMATION_WARNING";

        @NotNull
        public static final String DOCUMENT_CONFIRMATION_ERROR = "DOCUMENT_CONFIRMATION_ERROR";

        @NotNull
        public static final String DOCUMENT_CAPTURE = "DOCUMENT_CAPTURE";

        @NotNull
        public static final String DOCUMENT_UPLOAD_STARTED = "DOCUMENT_UPLOAD_STARTED";

        @NotNull
        public static final String DOCUMENT_VALID_MRZ_EXTRACTED = "DOCUMENT_VALID_MRZ_EXTRACTED";

        @NotNull
        public static final String DOCUMENT_CAPTURE_ERROR = "DOCUMENT_CAPTURE_ERROR";

        @NotNull
        public static final String DOCUMENT_CONFIRMATION = "DOCUMENT_CONFIRMATION";

        @NotNull
        public static final String ONFIDO_ML_MODEL_READY = "ONFIDO_ML_MODEL_READY";

        @NotNull
        public static final String DOCUMENT_CAPTURE_FLOW_COMPLETED = "DOCUMENT_CAPTURE_FLOW_COMPLETED";

        @NotNull
        public static final String DOCUMENT_UPLOAD_COMPLETED = "DOCUMENT_UPLOAD_COMPLETED";

        @NotNull
        public static final Document INSTANCE = new Document();

        private Document() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Face;", "", "()V", "FACE_SELFIE_CAPTURE", "", "FACE_SELFIE_CAPTURE_BACK_BUTTON_CLICKED", "FACE_SELFIE_CAPTURE_CAPTURE_BUTTON_CLICKED", "FACE_SELFIE_CONFIRMATION", "FACE_SELFIE_CONFIRMATION_BACK_BUTTON_CLICKED", "FACE_SELFIE_CONFIRMATION_RETAKE_BUTTON_CLICKED", "FACE_SELFIE_CONFIRMATION_UPLOAD_BUTTON_CLICKED", "FACE_SELFIE_CONFIRMATION_UPLOAD_STATUS", "FACE_SELFIE_INTRO", "FACE_SELFIE_INTRO_BACK_BUTTON_CLICKED", "FACE_SELFIE_INTRO_TAKE_SELFIE_BUTTON_CLICKED", "FACE_SELFIE_UPLOAD_COMPLETED", "FACE_SELFIE_UPLOAD_STARTED", "FACE_VIDEO_CAPTURE", "FACE_VIDEO_CAPTURE_ALIGNED", "FACE_VIDEO_CAPTURE_BACK_BUTTON_CLICKED", "FACE_VIDEO_CAPTURE_CONFIRMATION_VIDEO_ERROR", "FACE_VIDEO_CAPTURE_ERROR", "FACE_VIDEO_CAPTURE_FINISH_BUTTON_CLICKED", "FACE_VIDEO_CAPTURE_FIRST_CHALLENGE", "FACE_VIDEO_CAPTURE_NEXT_BUTTON_CLICKED", "FACE_VIDEO_CAPTURE_RECORD_BUTTON_CLICKED", "FACE_VIDEO_CAPTURE_SECOND_CHALLENGE", "FACE_VIDEO_CAPTURE_TIMEOUT", "FACE_VIDEO_CAPTURE_TIMEOUT_RETRY_BUTTON_CLICKED", "FACE_VIDEO_CONFIRMATION", "FACE_VIDEO_CONFIRMATION_BACK_BUTTON_CLICKED", "FACE_VIDEO_CONFIRMATION_RETAKE_BUTTON_CLICKED", "FACE_VIDEO_CONFIRMATION_UPLOAD_BUTTON_CLICKED", "FACE_VIDEO_CONFIRMATION_UPLOAD_STATUS", "FACE_VIDEO_INTRO", "FACE_VIDEO_INTRO_BACK_BUTTON_CLICKED", "FACE_VIDEO_INTRO_RECORD_VIDEO_BUTTON_CLICKED", "FACE_VIDEO_UPLOAD_COMPLETED", "FACE_VIDEO_UPLOAD_STARTED", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Face {

        @NotNull
        public static final String FACE_SELFIE_CONFIRMATION_BACK_BUTTON_CLICKED = "FACE_SELFIE_CONFIRMATION_BACK_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CONFIRMATION_RETAKE_BUTTON_CLICKED = "FACE_VIDEO_CONFIRMATION_RETAKE_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_TIMEOUT = "FACE_VIDEO_CAPTURE_TIMEOUT";

        @NotNull
        public static final String FACE_SELFIE_UPLOAD_STARTED = "FACE_SELFIE_UPLOAD_STARTED";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_ERROR = "FACE_VIDEO_CAPTURE_ERROR";

        @NotNull
        public static final String FACE_SELFIE_INTRO = "FACE_INTRO";

        @NotNull
        public static final String FACE_SELFIE_UPLOAD_COMPLETED = "FACE_SELFIE_UPLOAD_COMPLETED";

        @NotNull
        public static final String FACE_SELFIE_CONFIRMATION_UPLOAD_BUTTON_CLICKED = "FACE_SELFIE_CONFIRMATION_UPLOAD_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_SECOND_CHALLENGE = "FACE_VIDEO_CAPTURE_SECOND_CHALLENGE";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_BACK_BUTTON_CLICKED = "FACE_VIDEO_CAPTURE_BACK_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_NEXT_BUTTON_CLICKED = "FACE_VIDEO_CAPTURE_NEXT_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_INTRO = "FACE_VIDEO_INTRO";

        @NotNull
        public static final String FACE_VIDEO_INTRO_RECORD_VIDEO_BUTTON_CLICKED = "FACE_VIDEO_INTRO_RECORD_VIDEO_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_CONFIRMATION_VIDEO_ERROR = "VIDEO_FACIAL_CAPTURE_CONFIRMATION_VIDEO_ERROR";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_TIMEOUT_RETRY_BUTTON_CLICKED = "FACE_VIDEO_CAPTURE_TIMEOUT_RETRY_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CONFIRMATION_BACK_BUTTON_CLICKED = "FACE_VIDEO_CONFIRMATION_BACK_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_ALIGNED = "FACE_VIDEO_CAPTURE_ALIGNED";

        @NotNull
        public static final String FACE_SELFIE_CONFIRMATION_UPLOAD_STATUS = "FACE_SELFIE_CONFIRMATION_UPLOAD_STATUS";

        @NotNull
        public static final String FACE_SELFIE_INTRO_TAKE_SELFIE_BUTTON_CLICKED = "FACE_SELFIE_INTRO_TAKE_SELFIE_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_UPLOAD_COMPLETED = "FACE_VIDEO_UPLOAD_COMPLETED";

        @NotNull
        public static final String FACE_VIDEO_CONFIRMATION_UPLOAD_STATUS = "FACE_VIDEO_CONFIRMATION_UPLOAD_STATUS";

        @NotNull
        public static final String FACE_VIDEO_INTRO_BACK_BUTTON_CLICKED = "FACE_VIDEO_INTRO_BACK_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE = "FACE_VIDEO_CAPTURE";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_FINISH_BUTTON_CLICKED = "FACE_VIDEO_CAPTURE_FINISH_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_SELFIE_CONFIRMATION = "FACE_SELFIE_CONFIRMATION";

        @NotNull
        public static final String FACE_SELFIE_INTRO_BACK_BUTTON_CLICKED = "FACE_SELFIE_INTRO_BACK_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_SELFIE_CAPTURE_CAPTURE_BUTTON_CLICKED = "FACE_SELFIE_CAPTURE_CAPTURE_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_SELFIE_CONFIRMATION_RETAKE_BUTTON_CLICKED = "FACE_SELFIE_CONFIRMATION_RETAKE_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_SELFIE_CAPTURE = "FACE_SELFIE_CAPTURE";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_RECORD_BUTTON_CLICKED = "FACE_VIDEO_CAPTURE_RECORD_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CONFIRMATION = "FACE_VIDEO_CONFIRMATION";

        @NotNull
        public static final String FACE_VIDEO_CAPTURE_FIRST_CHALLENGE = "FACE_VIDEO_CAPTURE_FIRST_CHALLENGE";

        @NotNull
        public static final String FACE_VIDEO_UPLOAD_STARTED = "FACE_VIDEO_UPLOAD_STARTED";

        @NotNull
        public static final String FACE_SELFIE_CAPTURE_BACK_BUTTON_CLICKED = "FACE_SELFIE_CAPTURE_BACK_BUTTON_CLICKED";

        @NotNull
        public static final String FACE_VIDEO_CONFIRMATION_UPLOAD_BUTTON_CLICKED = "FACE_VIDEO_CONFIRMATION_UPLOAD_BUTTON_CLICKED";

        @NotNull
        public static final Face INSTANCE = new Face();

        private Face() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Flow;", "", "()V", "FLOW_COMPLETED", "", "FLOW_EXITED", "FLOW_STARTED", "INTERRUPTED_FLOW_ERROR", "LANGUAGE_DISPLAYED", "UI_THEME_DISPLAYED", "USER_EXIT_TAPPED_ALERT_CANCEL", "USER_EXIT_TAPPED_ALERT_CONFIRM", "USER_EXIT_TAPPED_EXIT_BUTTON", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Flow {

        @NotNull
        public static final String USER_EXIT_TAPPED_EXIT_BUTTON = "USER_EXIT_TAPPED_EXIT_BUTTON";

        @NotNull
        public static final String LANGUAGE_DISPLAYED = "LANGUAGE_DISPLAYED";

        @NotNull
        public static final String USER_EXIT_TAPPED_ALERT_CONFIRM = "USER_EXIT_TAPPED_ALERT_CONFIRM";

        @NotNull
        public static final String FLOW_COMPLETED = "FLOW_COMPLETED";

        @NotNull
        public static final String INTERRUPTED_FLOW_ERROR = "INTERRUPTED_FLOW_ERROR";

        @NotNull
        public static final String FLOW_STARTED = "FLOW_STARTED";

        @NotNull
        public static final String USER_EXIT_TAPPED_ALERT_CANCEL = "USER_EXIT_TAPPED_ALERT_CANCEL";

        @NotNull
        public static final String FLOW_EXITED = "FLOW_EXITED";

        @NotNull
        public static final String UI_THEME_DISPLAYED = "UI_THEME_DISPLAYED";

        @NotNull
        public static final Flow INSTANCE = new Flow();

        private Flow() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Motion;", "", "()V", "FACE_LIVENESS_ALIGNMENT", "", "FACE_LIVENESS_ALIGNMENT_STATUS", "FACE_LIVENESS_CAMERA", "FACE_LIVENESS_CAMERA_ERROR", "FACE_LIVENESS_CAPTURE", "FACE_LIVENESS_CAPTURE_ERROR_TIMEOUT", "FACE_LIVENESS_CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED", "FACE_LIVENESS_CAPTURE_ERROR_TOO_FAST", "FACE_LIVENESS_CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED", "FACE_LIVENESS_CAPTURE_STATUS", "FACE_LIVENESS_CONNECTION_ERROR", "FACE_LIVENESS_CONNECTION_ERROR_RESTART_CLICKED", "FACE_LIVENESS_CONNECTION_ERROR_RETRY_CLICKED", "FACE_LIVENESS_FACE_DETECTOR", "FACE_LIVENESS_INTRO", "FACE_LIVENESS_INTRO_READY_CLICKED", "FACE_LIVENESS_MLKIT_ERROR", "FACE_LIVENESS_NO_FACE_DETECTED", "FACE_LIVENESS_NO_FACE_DETECTED_RESTART_CLICKED", "FACE_LIVENESS_PLAY_SERVICES_ERROR", "FACE_LIVENESS_UPLOAD", "FACE_LIVENESS_UPLOAD_COMPLETED", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Motion {

        @NotNull
        public static final String FACE_LIVENESS_CAPTURE_ERROR_TOO_FAST = "FACE_LIVENESS_CAPTURE_ERROR_TOO_FAST";

        @NotNull
        public static final String FACE_LIVENESS_CAMERA_ERROR = "FACE_LIVENESS_CAMERA_ERROR";

        @NotNull
        public static final String FACE_LIVENESS_INTRO = "FACE_LIVENESS_INTRO";

        @NotNull
        public static final String FACE_LIVENESS_ALIGNMENT_STATUS = "FACE_LIVENESS_ALIGNMENT_STATUS";

        @NotNull
        public static final String FACE_LIVENESS_ALIGNMENT = "FACE_LIVENESS_ALIGNMENT";

        @NotNull
        public static final String FACE_LIVENESS_CAPTURE_STATUS = "FACE_LIVENESS_CAPTURE_STATUS";

        @NotNull
        public static final String FACE_LIVENESS_CONNECTION_ERROR = "FACE_LIVENESS_CONNECTION_ERROR";

        @NotNull
        public static final String FACE_LIVENESS_UPLOAD = "FACE_LIVENESS_UPLOAD";

        @NotNull
        public static final String FACE_LIVENESS_MLKIT_ERROR = "FACE_LIVENESS_MLKIT_ERROR";

        @NotNull
        public static final String FACE_LIVENESS_NO_FACE_DETECTED = "FACE_LIVENESS_NO_FACE_DETECTED";

        @NotNull
        public static final String FACE_LIVENESS_FACE_DETECTOR = "FACE_LIVENESS_FACE_DETECTOR";

        @NotNull
        public static final String FACE_LIVENESS_CAPTURE = "FACE_LIVENESS_CAPTURE";

        @NotNull
        public static final String FACE_LIVENESS_CAPTURE_ERROR_TIMEOUT = "FACE_LIVENESS_CAPTURE_ERROR_TIMEOUT";

        @NotNull
        public static final String FACE_LIVENESS_PLAY_SERVICES_ERROR = "FACE_LIVENESS_PLAY_SERVICES_ERROR";

        @NotNull
        public static final String FACE_LIVENESS_CAMERA = "FACE_LIVENESS_CAMERA";

        @NotNull
        public static final String FACE_LIVENESS_CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED = "FACE_LIVENESS_CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED";

        @NotNull
        public static final String FACE_LIVENESS_CONNECTION_ERROR_RESTART_CLICKED = "FACE_LIVENESS_CONNECTION_ERROR_RESTART_CLICKED";

        @NotNull
        public static final String FACE_LIVENESS_NO_FACE_DETECTED_RESTART_CLICKED = "FACE_LIVENESS_NO_FACE_DETECTED_RESTART_CLICKED";

        @NotNull
        public static final String FACE_LIVENESS_CONNECTION_ERROR_RETRY_CLICKED = "FACE_LIVENESS_CONNECTION_ERROR_RETRY_CLICKED";

        @NotNull
        public static final String FACE_LIVENESS_INTRO_READY_CLICKED = "FACE_LIVENESS_INTRO_READY_CLICKED";

        @NotNull
        public static final String FACE_LIVENESS_CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED = "FACE_LIVENESS_CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED";

        @NotNull
        public static final String FACE_LIVENESS_UPLOAD_COMPLETED = "FACE_LIVENESS_UPLOAD_COMPLETED";

        @NotNull
        public static final Motion INSTANCE = new Motion();

        private Motion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Nfc;", "", "()V", "DOCUMENT_NFC_SUPPORTED", "", "NFC_BAC_ERROR", "NFC_CAN_ENTRY_COMPLETED", "NFC_CHIP_AUTHENTICATED", "NFC_CHIP_BLOCKED_CONTINUE_CLICKED", "NFC_CHIP_BLOCKED_EXIT_CLICKED", "NFC_CHIP_BLOCKED_UNLOCK_CLICKED", "NFC_CHIP_CONNECTION_LOST", "NFC_CHIP_DISCOVERED", "NFC_CHOOSE_ANOTHER_DOCUMENT_CLICKED", "NFC_CONTINUE_AT_INITIAL_PROMPT", "NFC_EXIT_VERIFICATION_CLICKED", "NFC_FLOW_DATA_UPLOAD_COMPLETED", "NFC_FLOW_DATA_UPLOAD_STARTED", "NFC_OPEN_SETTINGS_CLICKED", "NFC_PACE_ERROR", "NFC_PIN_ENTRY_CONTINUE_CLICKED", "NFC_PIN_ENTRY_SKIP_CLICKED", "NFC_PROPERTIES_ERROR", "NFC_RETRY_SELECTED", "NFC_SKIP_AT_INITIAL_PROMPT", "NFC_SKIP_AT_MANUAL_CAN_ENTRY", "NFC_SKIP_AT_RETRY", "NFC_START_SCANNING_SELECTED", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Nfc {

        @NotNull
        public static final String NFC_OPEN_SETTINGS_CLICKED = "NFC_OPEN_SETTINGS_CLICKED";

        @NotNull
        public static final String NFC_SKIP_AT_INITIAL_PROMPT = "NFC_SKIP_AT_INITIAL_PROMPT";

        @NotNull
        public static final String NFC_CHIP_DISCOVERED = "NFC_CHIP_DISCOVERED";

        @NotNull
        public static final String DOCUMENT_NFC_SUPPORTED = "DOCUMENT_NFC_SUPPORTED";

        @NotNull
        public static final String NFC_BAC_ERROR = "NFC_BAC_ERROR";

        @NotNull
        public static final String NFC_SKIP_AT_RETRY = "NFC_SKIP_AT_RETRY";

        @NotNull
        public static final String NFC_CHIP_BLOCKED_EXIT_CLICKED = "NFC_CHIP_BLOCKED_EXIT_CLICKED";

        @NotNull
        public static final String NFC_PIN_ENTRY_SKIP_CLICKED = "NFC_PIN_ENTRY_SKIP_CLICKED";

        @NotNull
        public static final String NFC_CHIP_BLOCKED_CONTINUE_CLICKED = "NFC_CHIP_BLOCKED_EXIT_CLICKED";

        @NotNull
        public static final String NFC_EXIT_VERIFICATION_CLICKED = "NFC_EXIT_VERIFICATION_CLICKED";

        @NotNull
        public static final String NFC_FLOW_DATA_UPLOAD_STARTED = "NFC_DATA_UPLOAD_STARTED";

        @NotNull
        public static final String NFC_SKIP_AT_MANUAL_CAN_ENTRY = "NFC_SKIP_AT_MANUAL_CAN_ENTRY";

        @NotNull
        public static final String NFC_FLOW_DATA_UPLOAD_COMPLETED = "NFC_DATA_UPLOAD_COMPLETED";

        @NotNull
        public static final String NFC_CHIP_AUTHENTICATED = "NFC_CHIP_AUTHENTICATED";

        @NotNull
        public static final String NFC_PIN_ENTRY_CONTINUE_CLICKED = "NFC_PIN_ENTRY_CONTINUE_CLICKED";

        @NotNull
        public static final String NFC_CHOOSE_ANOTHER_DOCUMENT_CLICKED = "NFC_CHOOSE_ANOTHER_DOCUMENT_CLICKED";

        @NotNull
        public static final String NFC_PACE_ERROR = "NFC_PACE_ERROR";

        @NotNull
        public static final String NFC_PROPERTIES_ERROR = "NFC_PROPERTIES_ERROR";

        @NotNull
        public static final String NFC_CHIP_BLOCKED_UNLOCK_CLICKED = "NFC_CHIP_BLOCKED_UNLOCK_CLICKED";

        @NotNull
        public static final String NFC_CONTINUE_AT_INITIAL_PROMPT = "NFC_CONTINUE_AT_INITIAL_PROMPT";

        @NotNull
        public static final String NFC_RETRY_SELECTED = "NFC_RETRY_SELECTED";

        @NotNull
        public static final String NFC_START_SCANNING_SELECTED = "NFC_START_SCANNING_SELECTED";

        @NotNull
        public static final String NFC_CAN_ENTRY_COMPLETED = "NFC_CAN_ENTRY_COMPLETED";

        @NotNull
        public static final String NFC_CHIP_CONNECTION_LOST = "NFC_CHIP_CONNECTION_LOST";

        @NotNull
        public static final Nfc INSTANCE = new Nfc();

        private Nfc() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Permissions;", "", "()V", "PERMISSIONS_MANAGEMENT", "", "PERMISSION_DENIED", "PERMISSION_GRANTED", "PERMISSION_SETTINGS_CLICK", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Permissions {

        @NotNull
        public static final String PERMISSION_SETTINGS_CLICK = "PERMISSION_SETTINGS_CLICK";

        @NotNull
        public static final String PERMISSIONS_MANAGEMENT = "PERMISSIONS_MANAGEMENT";

        @NotNull
        public static final String PERMISSION_DENIED = "PERMISSION_DENIED";

        @NotNull
        public static final String PERMISSION_GRANTED = "PERMISSION_GRANTED";

        @NotNull
        public static final Permissions INSTANCE = new Permissions();

        private Permissions() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$PublicNames;", "", "()V", "Face", "Flow", "Other", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PublicNames {

        @NotNull
        public static final PublicNames INSTANCE = new PublicNames();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$PublicNames$Face;", "", "()V", "FACE_INTRO", "", "FACE_MOTION_ALIGNMENT", "FACE_MOTION_CAPTURE", "FACE_MOTION_CAPTURE_ERROR_TIMEOUT", "FACE_MOTION_CAPTURE_ERROR_TOO_FAST", "FACE_MOTION_CONNECTION_ERROR", "FACE_MOTION_INTRO", "FACE_MOTION_NO_FACE_DETECTED", "FACE_MOTION_UPLOAD", "FACE_MOTION_UPLOAD_COMPLETED", "FACE_SELFIE_CAPTURE", "FACE_SELFIE_CONFIRMATION", "FACE_SELFIE_UPLOAD_STARTED", "FACE_VIDEO_CAPTURE", "FACE_VIDEO_CONFIRMATION", "FACE_VIDEO_INTRO", "FACE_VIDEO_UPLOAD_STARTED", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Face {

            @NotNull
            public static final String FACE_VIDEO_CAPTURE = "VIDEO_FACIAL_CAPTURE";

            @NotNull
            public static final String FACE_SELFIE_CONFIRMATION = "FACIAL_CAPTURE_CONFIRMATION";

            @NotNull
            public static final String FACE_SELFIE_UPLOAD_STARTED = "FACIAL_UPLOAD";

            @NotNull
            public static final String FACE_MOTION_CAPTURE_ERROR_TOO_FAST = "MOTION_FACIAL_CAPTURE_ERROR_TOO_FAST";

            @NotNull
            public static final String FACE_SELFIE_CAPTURE = "FACIAL_CAPTURE";

            @NotNull
            public static final String FACE_VIDEO_INTRO = "VIDEO_FACIAL_INTRO";

            @NotNull
            public static final String FACE_MOTION_ALIGNMENT = "MOTION_FACIAL_ALIGNMENT";

            @NotNull
            public static final String FACE_MOTION_INTRO = "MOTION_FACIAL_INTRO";

            @NotNull
            public static final String FACE_MOTION_NO_FACE_DETECTED = "MOTION_FACIAL_NO_FACE_DETECTED";

            @NotNull
            public static final String FACE_MOTION_UPLOAD = "MOTION_FACIAL_UPLOAD";

            @NotNull
            public static final String FACE_VIDEO_CONFIRMATION = "VIDEO_FACIAL_CAPTURE_CONFIRMATION";

            @NotNull
            public static final String FACE_MOTION_CONNECTION_ERROR = "MOTION_FACIAL_CONNECTION_ERROR";

            @NotNull
            public static final String FACE_MOTION_CAPTURE = "MOTION_FACIAL_CAPTURE";

            @NotNull
            public static final String FACE_VIDEO_UPLOAD_STARTED = "VIDEO_FACIAL_UPLOAD";

            @NotNull
            public static final String FACE_MOTION_CAPTURE_ERROR_TIMEOUT = "MOTION_FACIAL_CAPTURE_ERROR_TIMEOUT";

            @NotNull
            public static final String FACE_MOTION_UPLOAD_COMPLETED = "MOTION_FACIAL_UPLOAD_COMPLETED";

            @NotNull
            public static final String FACE_INTRO = "FACIAL_INTRO";

            @NotNull
            public static final Face INSTANCE = new Face();

            private Face() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$PublicNames$Flow;", "", "()V", "USER_EXITED_FLOW", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Flow {

            @NotNull
            public static final String USER_EXITED_FLOW = "USER_EXITED_FLOW";

            @NotNull
            public static final Flow INSTANCE = new Flow();

            private Flow() {
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$PublicNames$Other;", "", "()V", "DOCUMENT_UPLOAD_STARTED", "", "USER_CONSENT", "WELCOME", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Other {

            @NotNull
            public static final String DOCUMENT_UPLOAD_STARTED = "DOCUMENT_UPLOAD";

            @NotNull
            public static final String WELCOME = "WELCOME";

            @NotNull
            public static final String USER_CONSENT = "USER_CONSENT";

            @NotNull
            public static final Other INSTANCE = new Other();

            private Other() {
            }
        }

        private PublicNames() {
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0017\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0017\u001e\u001f !\"#$%&'()*+,-./01234¨\u00065"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "CountrySelection", "DocumentCapture", "DocumentListFetchRetried", "DocumentTypeSelection", "Final", "NfcCanEntry", "NfcCanMaxAttemptsReached", "NfcChipBlocked", "NfcDeviceNotSupported", "NfcDocumentNotSupported", "NfcError", "NfcIntro", "NfcPinEntry", "NfcRead", "NfcSettingsIntro", "PoaCountrySelection", "PoaDocumentDetails", "PoaDocumentSubmission", "PoaDocumentTypeSelection", "PoaVerifyAddress", "Unknown", "UserConsent", "Welcome", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$CountrySelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$DocumentCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$DocumentListFetchRetried;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$DocumentTypeSelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$Final;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcCanEntry;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcCanMaxAttemptsReached;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcChipBlocked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcDeviceNotSupported;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcDocumentNotSupported;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcIntro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcPinEntry;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcRead;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcSettingsIntro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaCountrySelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaDocumentDetails;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaDocumentSubmission;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaDocumentTypeSelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaVerifyAddress;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$Unknown;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$UserConsent;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$Welcome;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Screen {

        @NotNull
        private final String name;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$CountrySelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CountrySelection extends Screen {

            @NotNull
            public static final CountrySelection INSTANCE = new CountrySelection();

            private CountrySelection() {
                super("COUNTRY_SELECTION", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$DocumentCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DocumentCapture extends Screen {

            @NotNull
            public static final DocumentCapture INSTANCE = new DocumentCapture();

            private DocumentCapture() {
                super("DOCUMENT_CAPTURE", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$DocumentListFetchRetried;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DocumentListFetchRetried extends Screen {

            @NotNull
            public static final DocumentListFetchRetried INSTANCE = new DocumentListFetchRetried();

            private DocumentListFetchRetried() {
                super("API_SDK_DOCUMENT_FETCH_RETRY", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$DocumentTypeSelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class DocumentTypeSelection extends Screen {

            @NotNull
            public static final DocumentTypeSelection INSTANCE = new DocumentTypeSelection();

            private DocumentTypeSelection() {
                super("DOCUMENT_TYPE_SELECTION", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$Final;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Final extends Screen {

            @NotNull
            public static final Final INSTANCE = new Final();

            private Final() {
                super("COMPLETE", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcCanEntry;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcCanEntry extends Screen {

            @NotNull
            public static final NfcCanEntry INSTANCE = new NfcCanEntry();

            private NfcCanEntry() {
                super("NFC_CAN_ENTRY", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcCanMaxAttemptsReached;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcCanMaxAttemptsReached extends Screen {

            @NotNull
            public static final NfcCanMaxAttemptsReached INSTANCE = new NfcCanMaxAttemptsReached();

            private NfcCanMaxAttemptsReached() {
                super("NFC_CAN_MAX_ATTEMPTS_REACHED", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcChipBlocked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcChipBlocked extends Screen {

            @NotNull
            public static final NfcChipBlocked INSTANCE = new NfcChipBlocked();

            private NfcChipBlocked() {
                super("NFC_CHIP_BLOCKED", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcDeviceNotSupported;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcDeviceNotSupported extends Screen {

            @NotNull
            public static final NfcDeviceNotSupported INSTANCE = new NfcDeviceNotSupported();

            private NfcDeviceNotSupported() {
                super("NFC_DEVICE_NOT_SUPPORTED", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcDocumentNotSupported;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcDocumentNotSupported extends Screen {

            @NotNull
            public static final NfcDocumentNotSupported INSTANCE = new NfcDocumentNotSupported();

            private NfcDocumentNotSupported() {
                super("NFC_DOCUMENT_NOT_SUPPORTED", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcError extends Screen {

            @NotNull
            public static final NfcError INSTANCE = new NfcError();

            private NfcError() {
                super("NFC_READ_ERROR", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcIntro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcIntro extends Screen {

            @NotNull
            public static final NfcIntro INSTANCE = new NfcIntro();

            private NfcIntro() {
                super("NFC_INTRO", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcPinEntry;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcPinEntry extends Screen {

            @NotNull
            public static final NfcPinEntry INSTANCE = new NfcPinEntry();

            private NfcPinEntry() {
                super("NFC_PIN_ENTRY", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcRead;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcRead extends Screen {

            @NotNull
            public static final NfcRead INSTANCE = new NfcRead();

            private NfcRead() {
                super("NFC_READ", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$NfcSettingsIntro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcSettingsIntro extends Screen {

            @NotNull
            public static final NfcSettingsIntro INSTANCE = new NfcSettingsIntro();

            private NfcSettingsIntro() {
                super("NFC_SETTINGS_INTRO", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaCountrySelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PoaCountrySelection extends Screen {

            @NotNull
            public static final PoaCountrySelection INSTANCE = new PoaCountrySelection();

            private PoaCountrySelection() {
                super("POA_COUNTRY_SELECTION", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaDocumentDetails;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PoaDocumentDetails extends Screen {

            @NotNull
            public static final PoaDocumentDetails INSTANCE = new PoaDocumentDetails();

            private PoaDocumentDetails() {
                super("POA_DOCUMENT_DETAILS", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaDocumentSubmission;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PoaDocumentSubmission extends Screen {

            @NotNull
            public static final PoaDocumentSubmission INSTANCE = new PoaDocumentSubmission();

            private PoaDocumentSubmission() {
                super("POA_DOCUMENT_SUBMISSION", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaDocumentTypeSelection;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PoaDocumentTypeSelection extends Screen {

            @NotNull
            public static final PoaDocumentTypeSelection INSTANCE = new PoaDocumentTypeSelection();

            private PoaDocumentTypeSelection() {
                super("POA_DOCUMENT_TYPE_SELECTION", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$PoaVerifyAddress;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PoaVerifyAddress extends Screen {

            @NotNull
            public static final PoaVerifyAddress INSTANCE = new PoaVerifyAddress();

            private PoaVerifyAddress() {
                super("POA_VERIFY_ADDRESS", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$Unknown;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Unknown extends Screen {

            @NotNull
            public static final Unknown INSTANCE = new Unknown();

            private Unknown() {
                super("UNKNOWN", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$UserConsent;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class UserConsent extends Screen {

            @NotNull
            public static final UserConsent INSTANCE = new UserConsent();

            private UserConsent() {
                super("USER_CONSENT", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen$Welcome;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$Screen;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Welcome extends Screen {

            @NotNull
            public static final Welcome INSTANCE = new Welcome();

            private Welcome() {
                super("WELCOME", null);
            }
        }

        private Screen(String str) {
            this.name = str;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public /* synthetic */ Screen(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventNames$WaitingScreen;", "", "()V", "WAITING_SCREEN_COMPLETED", "", "WAITING_SCREEN_ENDED", "WAITING_SCREEN_STARTED", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WaitingScreen {

        @NotNull
        public static final String WAITING_SCREEN_COMPLETED = "WAITING_SCREEN_COMPLETED";

        @NotNull
        public static final String WAITING_SCREEN_ENDED = "WAITING_SCREEN_ENDED";

        @NotNull
        public static final String WAITING_SCREEN_STARTED = "WAITING_SCREEN_STARTED";

        @NotNull
        public static final WaitingScreen INSTANCE = new WaitingScreen();

        private WaitingScreen() {
        }
    }

    private EventNames() {
    }
}
