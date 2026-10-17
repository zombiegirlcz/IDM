package com.fourthline.core.location;

import com.fourthline.vision.internal.qh;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001:\u0002\u001d\u001eJ7\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u000b\u0010\tJ;\u0010\r\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/fourthline/core/location/LocationProvider;", "", "Lkotlin/Function1;", "Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "", "success", "Lcom/fourthline/core/location/LocationProviderError;", "failure", "requestAuthorization", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "requestFullAccuracy", "Lcom/fourthline/core/location/Coordinate;", "requestLocation", "cancelLocationRequest", "()V", "", "getLocationServicesEnabled", "()Z", "locationServicesEnabled", "getAuthorizationStatus", "()Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "authorizationStatus", "getAccuracyAuthorization", "()Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "accuracyAuthorization", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "location", "AccuracyAuthorization", "AuthorizationStatus", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LocationProvider {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "", "<init>", "(Ljava/lang/String;I)V", "FULL", "REDUCED", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccuracyAuthorization {
        public static final AccuracyAuthorization FULL = new AccuracyAuthorization("FULL", 0);
        public static final AccuracyAuthorization REDUCED = new AccuracyAuthorization("REDUCED", 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ AccuracyAuthorization[] f26419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f26420b;

        static {
            AccuracyAuthorization[] accuracyAuthorizationArrA = a();
            f26419a = accuracyAuthorizationArrA;
            f26420b = s.n(accuracyAuthorizationArrA);
        }

        private AccuracyAuthorization(String str, int i) {
        }

        private static final /* synthetic */ AccuracyAuthorization[] a() {
            return new AccuracyAuthorization[]{FULL, REDUCED};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return f26420b;
        }

        public static AccuracyAuthorization valueOf(String str) {
            return (AccuracyAuthorization) Enum.valueOf(AccuracyAuthorization.class, str);
        }

        public static AccuracyAuthorization[] values() {
            return (AccuracyAuthorization[]) f26419a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_DETERMINED", "AUTHORIZED", "DENIED", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AuthorizationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ AuthorizationStatus[] f26421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f26422b;
        public static final AuthorizationStatus NOT_DETERMINED = new AuthorizationStatus("NOT_DETERMINED", 0);
        public static final AuthorizationStatus AUTHORIZED = new AuthorizationStatus("AUTHORIZED", 1);
        public static final AuthorizationStatus DENIED = new AuthorizationStatus("DENIED", 2);

        static {
            AuthorizationStatus[] authorizationStatusArrA = a();
            f26421a = authorizationStatusArrA;
            f26422b = s.n(authorizationStatusArrA);
        }

        private AuthorizationStatus(String str, int i) {
        }

        private static final /* synthetic */ AuthorizationStatus[] a() {
            return new AuthorizationStatus[]{NOT_DETERMINED, AUTHORIZED, DENIED};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return f26422b;
        }

        public static AuthorizationStatus valueOf(String str) {
            return (AuthorizationStatus) Enum.valueOf(AuthorizationStatus.class, str);
        }

        public static AuthorizationStatus[] values() {
            return (AuthorizationStatus[]) f26421a.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit a(Coordinate it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void requestLocation$default(LocationProvider locationProvider, Function1 function1, Function1 function12, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestLocation");
        }
        if ((i & 1) != 0) {
            function1 = new qh(7);
        }
        if ((i & 2) != 0) {
            function12 = new qh(8);
        }
        locationProvider.requestLocation(function1, function12);
    }

    void cancelLocationRequest();

    @NotNull
    AccuracyAuthorization getAccuracyAuthorization();

    @NotNull
    AuthorizationStatus getAuthorizationStatus();

    Coordinate getLocation();

    boolean getLocationServicesEnabled();

    void requestAuthorization(@NotNull Function1<? super AuthorizationStatus, Unit> success, @NotNull Function1<? super LocationProviderError, Unit> failure);

    void requestFullAccuracy(@NotNull Function1<? super AccuracyAuthorization, Unit> success, @NotNull Function1<? super LocationProviderError, Unit> failure);

    void requestLocation(@NotNull Function1<? super Coordinate, Unit> success, @NotNull Function1<? super LocationProviderError, Unit> failure);

    /* JADX INFO: Access modifiers changed from: private */
    static Unit a(LocationProviderError it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }
}
