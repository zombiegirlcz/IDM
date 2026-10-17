package com.trustdockekyc.core.backend.domain.model;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u001f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\u0082\u0001\u001d\"#$%&'()*+,-./0123456789:;<=>¨\u0006?"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "CameraNotAuthorized", "Canceled", "DriversLicenseLocked", "IllegalArgumentError", "IllegalStateError", "InvalidBaseUrlError", "InvalidPackageIdError", "InvalidParamsError", "InvalidProcessIdError", "InvalidProjectIdError", "IoError", "MaintenanceError", "MismatchedMyNumberCard", "MyNumberCardLockedError", "NetworkConnectionFailedError", "NetworkResponseError", "NfcCommunicationError", "com/trustdockekyc/core/backend/domain/model/a", "NfcInvalidDataError", "NfcInvalidPINError", "NfcMissingPINError", "NfcUnavailableError", "NfcUnknownError", "NoCertificate", "NoVideoDevice", "NotFoundError", "w1m/a", "ServerError", "TimeoutError", "Under16years", "UnknownError", "Lcom/trustdockekyc/core/backend/domain/model/AppError$CameraNotAuthorized;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$Canceled;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$DriversLicenseLocked;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$IllegalArgumentError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$IllegalStateError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidBaseUrlError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidPackageIdError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidParamsError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidProcessIdError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidProjectIdError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$IoError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$MaintenanceError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$MismatchedMyNumberCard;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$MyNumberCardLockedError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NetworkConnectionFailedError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NetworkResponseError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcCommunicationError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcInvalidDataError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcInvalidPINError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcMissingPINError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcUnavailableError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcUnknownError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NoCertificate;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NoVideoDevice;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$NotFoundError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$ServerError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$TimeoutError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$Under16years;", "Lcom/trustdockekyc/core/backend/domain/model/AppError$UnknownError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AppError extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1m.c f107372a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$CameraNotAuthorized;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CameraNotAuthorized extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$Canceled;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Canceled extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$DriversLicenseLocked;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DriversLicenseLocked extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$IllegalArgumentError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IllegalArgumentError extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$IllegalStateError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IllegalStateError extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidBaseUrlError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidBaseUrlError extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidPackageIdError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidPackageIdError extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidParamsError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidParamsError extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidProcessIdError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidProcessIdError extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$InvalidProjectIdError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidProjectIdError extends AppError {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$IoError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lw1m/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IoError extends AppError implements w1m.a {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$MaintenanceError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MaintenanceError extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$MismatchedMyNumberCard;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MismatchedMyNumberCard extends AppError {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$MyNumberCardLockedError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lcom/trustdockekyc/core/backend/domain/model/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MyNumberCardLockedError extends AppError implements a {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NetworkConnectionFailedError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lw1m/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkConnectionFailedError extends AppError implements w1m.a {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NetworkResponseError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkResponseError extends AppError {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcCommunicationError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lcom/trustdockekyc/core/backend/domain/model/a;", "Lw1m/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcCommunicationError extends AppError implements a, w1m.a {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcInvalidDataError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lcom/trustdockekyc/core/backend/domain/model/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcInvalidDataError extends AppError implements a {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcInvalidPINError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lcom/trustdockekyc/core/backend/domain/model/a;", "com/trustdockekyc/core/backend/domain/model/b", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcInvalidPINError extends AppError implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f107373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f107374c;

        public /* synthetic */ NfcInvalidPINError(Integer num, w1m.c cVar, int i) {
            this((i & 1) != 0 ? null : num, (b) null, (i & 4) != 0 ? null : cVar);
        }

        public NfcInvalidPINError(Integer num, b bVar, w1m.c cVar) {
            super(cVar);
            this.f107373b = num;
            this.f107374c = bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcMissingPINError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lcom/trustdockekyc/core/backend/domain/model/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcMissingPINError extends AppError implements a {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcUnavailableError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lcom/trustdockekyc/core/backend/domain/model/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcUnavailableError extends AppError implements a {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NfcUnknownError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lcom/trustdockekyc/core/backend/domain/model/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NfcUnknownError extends AppError implements a {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NoCertificate;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoCertificate extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NoVideoDevice;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoVideoDevice extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$NotFoundError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotFoundError extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$ServerError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServerError extends AppError {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$TimeoutError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "Lw1m/a;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TimeoutError extends AppError implements w1m.a {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$Under16years;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Under16years extends AppError {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/trustdockekyc/core/backend/domain/model/AppError$UnknownError;", "Lcom/trustdockekyc/core/backend/domain/model/AppError;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnknownError extends AppError {
    }

    public AppError(w1m.c cVar) {
        super(cVar != null ? cVar.d : null, cVar != null ? cVar.f293890b : null);
        this.f107372a = cVar;
    }

    public final boolean a() {
        if ((this instanceof MyNumberCardLockedError ? true : this instanceof DriversLicenseLocked ? true : this instanceof Under16years) || (this instanceof NoCertificate)) {
            return true;
        }
        if (this instanceof InvalidBaseUrlError ? true : this instanceof NetworkResponseError ? true : this instanceof ServerError ? true : this instanceof IllegalArgumentError ? true : this instanceof NotFoundError ? true : this instanceof MaintenanceError ? true : this instanceof IllegalStateError ? true : this instanceof IoError ? true : this instanceof NetworkConnectionFailedError ? true : this instanceof TimeoutError ? true : this instanceof UnknownError ? true : this instanceof NfcCommunicationError ? true : this instanceof NfcInvalidPINError ? true : this instanceof NfcMissingPINError ? true : this instanceof NfcUnknownError ? true : this instanceof NfcInvalidDataError ? true : this instanceof NfcUnavailableError ? true : this instanceof InvalidParamsError ? true : this instanceof InvalidProjectIdError ? true : this instanceof MismatchedMyNumberCard ? true : this instanceof InvalidPackageIdError ? true : this instanceof InvalidProcessIdError ? true : this instanceof Canceled ? true : this instanceof CameraNotAuthorized ? true : this instanceof NoVideoDevice) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final x2m.a b() {
        if (this instanceof InvalidBaseUrlError) {
            return x2m.a.INVALID_BASE_URL;
        }
        if (this instanceof NetworkResponseError) {
            return x2m.a.NETWORK_ERROR;
        }
        if (this instanceof ServerError) {
            return x2m.a.API_ERROR;
        }
        if (this instanceof IllegalArgumentError) {
            return x2m.a.UNKNOWN_ERROR;
        }
        if (this instanceof NotFoundError) {
            return x2m.a.API_ERROR;
        }
        if (this instanceof MaintenanceError) {
            return x2m.a.IN_MAINTENANCE;
        }
        if (this instanceof IllegalStateError) {
            return x2m.a.UNKNOWN_ERROR;
        }
        if (this instanceof IoError ? true : this instanceof NetworkConnectionFailedError ? true : this instanceof TimeoutError) {
            return x2m.a.NETWORK_ERROR;
        }
        if (this instanceof UnknownError) {
            return x2m.a.UNKNOWN_ERROR;
        }
        if (this instanceof NfcCommunicationError) {
            return x2m.a.NFC_NOT_AVAILABLE;
        }
        if (this instanceof MyNumberCardLockedError) {
            return x2m.a.MYNUMBER_CARD_LOCKED;
        }
        if (this instanceof MismatchedMyNumberCard) {
            return x2m.a.MISMATCHED_MYNUMBER_CARD;
        }
        if (this instanceof NfcInvalidPINError ? true : this instanceof NfcMissingPINError ? true : this instanceof NfcUnknownError ? true : this instanceof NfcInvalidDataError) {
            return x2m.a.UNKNOWN_ERROR;
        }
        if (this instanceof NfcUnavailableError) {
            return x2m.a.NFC_NOT_AVAILABLE;
        }
        if (this instanceof InvalidParamsError) {
            return x2m.a.INVALID_PARAMS;
        }
        if (this instanceof InvalidProjectIdError) {
            return x2m.a.INVALID_PROJECT_ID;
        }
        if (!(this instanceof InvalidPackageIdError) && !(this instanceof InvalidProcessIdError)) {
            if (this instanceof Canceled) {
                throw new IllegalStateException("キャンセルは ABORT ステータスで処理しなければならない");
            }
            if (this instanceof CameraNotAuthorized) {
                return x2m.a.CAMERA_NOT_AUTHORIZED;
            }
            if (this instanceof DriversLicenseLocked) {
                return x2m.a.DRIVERS_LICENSE_LOCKED;
            }
            if (this instanceof NoCertificate) {
                return x2m.a.NO_CERTIFICATE;
            }
            if (this instanceof NoVideoDevice) {
                return x2m.a.NO_VIDEO_DEVICE;
            }
            if (this instanceof Under16years) {
                return x2m.a.UNDER_16YEARS;
            }
            throw new NoWhenBranchMatchedException();
        }
        return x2m.a.INVALID_PACKAGE_ID;
    }
}
