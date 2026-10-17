package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\nB\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse$Result;", "result", "", "similarity", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse$Result;F)V", "copy", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse$Result;F)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse;", "Result", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostFaceMatchingJapanTdProcessesFaceMatchingsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Result f107415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f107416b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsResponse$Result;", "", "<init>", "(Ljava/lang/String;I)V", "Lz2m/c;", "toModel", "()Lz2m/c;", "SUCCEEDED", "FAILED", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Result {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;

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
        public final z2m.c toModel() {
            int i = c.f107419a[ordinal()];
            if (i == 1) {
                return z2m.c.SUCCEEDED;
            }
            if (i == 2) {
                return z2m.c.FAILED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public PostFaceMatchingJapanTdProcessesFaceMatchingsResponse(@i(name = "result") @NotNull Result result, @i(name = "similarity") float f) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f107415a = result;
        this.f107416b = f;
    }

    @NotNull
    public final PostFaceMatchingJapanTdProcessesFaceMatchingsResponse copy(@i(name = "result") @NotNull Result result, @i(name = "similarity") float similarity) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new PostFaceMatchingJapanTdProcessesFaceMatchingsResponse(result, similarity);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostFaceMatchingJapanTdProcessesFaceMatchingsResponse)) {
            return false;
        }
        PostFaceMatchingJapanTdProcessesFaceMatchingsResponse postFaceMatchingJapanTdProcessesFaceMatchingsResponse = (PostFaceMatchingJapanTdProcessesFaceMatchingsResponse) obj2;
        return this.f107415a == postFaceMatchingJapanTdProcessesFaceMatchingsResponse.f107415a && Float.compare(this.f107416b, postFaceMatchingJapanTdProcessesFaceMatchingsResponse.f107416b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f107416b) + (this.f107415a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("PostFaceMatchingJapanTdProcessesFaceMatchingsResponse(result=");
        sb6.append(this.f107415a);
        sb6.append(", similarity=");
        return m72.b.s(sb6, this.f107416b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
