package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import androidx.annotation.Keep;
import b3m.c;
import b3m.e;
import b3m.f;
import b3m.g;
import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0010BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult$Result;", "result", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultBasicPersonalInformation;", "basicPersonalInformation", "", "uid", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKIIdentificationResultReasonResponse;", "reason", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultTrail;", "trail", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult$Result;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultBasicPersonalInformation;Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKIIdentificationResultReasonResponse;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultTrail;)V", "copy", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult$Result;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultBasicPersonalInformation;Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKIIdentificationResultReasonResponse;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultTrail;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult;", "Result", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class JPKICTIdentificationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Result f107514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JPKICTIdentificationResultBasicPersonalInformation f107515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107516c;
    public final JPKIIdentificationResultReasonResponse d;
    public final JPKICTIdentificationResultTrail e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResult$Result;", "", "<init>", "(Ljava/lang/String;I)V", "Lb3m/b;", "toModel", "()Lb3m/b;", "Companion", "com/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/a", "SUCCEEDED", "FAILED", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Result {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;

        @NotNull
        public static final a Companion;

        @i(name = "succeeded")
        public static final Result SUCCEEDED = new Result("SUCCEEDED", 0);

        @i(name = "failed")
        public static final Result FAILED = new Result("FAILED", 1);

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{SUCCEEDED, FAILED};
        }

        static {
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = s.n(resultArr$values);
            Companion = new a();
        }

        private Result(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }

        @NotNull
        public final b3m.b toModel() {
            int i = b.f107531a[ordinal()];
            if (i == 1) {
                return b3m.b.SUCCEEDED;
            }
            if (i == 2) {
                return b3m.b.FAILED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public JPKICTIdentificationResult(@i(name = "result") @NotNull Result result, @i(name = "basic_personal_information") JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation, @i(name = "uid") String str, @i(name = "reason") JPKIIdentificationResultReasonResponse jPKIIdentificationResultReasonResponse, @i(name = "trail") JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f107514a = result;
        this.f107515b = jPKICTIdentificationResultBasicPersonalInformation;
        this.f107516c = str;
        this.d = jPKIIdentificationResultReasonResponse;
        this.e = jPKICTIdentificationResultTrail;
    }

    public final c a() {
        b3m.b model = this.f107514a.toModel();
        JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation = this.f107515b;
        e eVar = jPKICTIdentificationResultBasicPersonalInformation != null ? new e(jPKICTIdentificationResultBasicPersonalInformation.f107517a, jPKICTIdentificationResultBasicPersonalInformation.f107518b, jPKICTIdentificationResultBasicPersonalInformation.f107519c, jPKICTIdentificationResultBasicPersonalInformation.d, jPKICTIdentificationResultBasicPersonalInformation.e) : null;
        JPKIIdentificationResultReasonResponse jPKIIdentificationResultReasonResponse = this.d;
        f model2 = jPKIIdentificationResultReasonResponse != null ? jPKIIdentificationResultReasonResponse.toModel() : null;
        JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail = this.e;
        return new c(model, eVar, this.f107516c, model2, jPKICTIdentificationResultTrail != null ? new g(jPKICTIdentificationResultTrail.f107520a, jPKICTIdentificationResultTrail.f107521b, jPKICTIdentificationResultTrail.f107522c, jPKICTIdentificationResultTrail.d) : null);
    }

    @NotNull
    public final JPKICTIdentificationResult copy(@i(name = "result") @NotNull Result result, @i(name = "basic_personal_information") JPKICTIdentificationResultBasicPersonalInformation basicPersonalInformation, @i(name = "uid") String uid2, @i(name = "reason") JPKIIdentificationResultReasonResponse reason, @i(name = "trail") JPKICTIdentificationResultTrail trail) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new JPKICTIdentificationResult(result, basicPersonalInformation, uid2, reason, trail);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JPKICTIdentificationResult)) {
            return false;
        }
        JPKICTIdentificationResult jPKICTIdentificationResult = (JPKICTIdentificationResult) obj2;
        return this.f107514a == jPKICTIdentificationResult.f107514a && Intrinsics.f(this.f107515b, jPKICTIdentificationResult.f107515b) && Intrinsics.f(this.f107516c, jPKICTIdentificationResult.f107516c) && this.d == jPKICTIdentificationResult.d && Intrinsics.f(this.e, jPKICTIdentificationResult.e);
    }

    public final int hashCode() {
        int iHashCode = this.f107514a.hashCode() * 31;
        JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation = this.f107515b;
        int iHashCode2 = (iHashCode + (jPKICTIdentificationResultBasicPersonalInformation == null ? 0 : jPKICTIdentificationResultBasicPersonalInformation.hashCode())) * 31;
        String str = this.f107516c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        JPKIIdentificationResultReasonResponse jPKIIdentificationResultReasonResponse = this.d;
        int iHashCode4 = (iHashCode3 + (jPKIIdentificationResultReasonResponse == null ? 0 : jPKIIdentificationResultReasonResponse.hashCode())) * 31;
        JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail = this.e;
        return iHashCode4 + (jPKICTIdentificationResultTrail != null ? jPKICTIdentificationResultTrail.hashCode() : 0);
    }

    public final String toString() {
        return "JPKICTIdentificationResult(result=" + this.f107514a + ", basicPersonalInformation=" + this.f107515b + ", uid=" + this.f107516c + ", reason=" + this.d + ", trail=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ JPKICTIdentificationResult(Result result, JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation, String str, JPKIIdentificationResultReasonResponse jPKIIdentificationResultReasonResponse, JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(result, (i & 2) != 0 ? null : jPKICTIdentificationResultBasicPersonalInformation, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : jPKIIdentificationResultReasonResponse, (i & 16) != 0 ? null : jPKICTIdentificationResultTrail);
    }
}
