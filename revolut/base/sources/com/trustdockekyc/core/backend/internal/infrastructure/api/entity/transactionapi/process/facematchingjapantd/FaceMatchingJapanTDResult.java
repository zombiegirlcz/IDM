package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\r\u000eB-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$Result;", "result", "", "similarity", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$RandomShooting;", "randomShooting", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$Result;FLjava/util/List;)V", "copy", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$Result;FLjava/util/List;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult;", "RandomShooting", "Result", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FaceMatchingJapanTDResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Result f107407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f107408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f107409c;

    @m(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$RandomShooting;", "", "", "action", "", "similarity", "<init>", "(Ljava/lang/String;F)V", "copy", "(Ljava/lang/String;F)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$RandomShooting;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RandomShooting {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f107410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f107411b;

        public RandomShooting(@i(name = "action") @NotNull String action, @i(name = "similarity") float f) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f107410a = action;
            this.f107411b = f;
        }

        @NotNull
        public final RandomShooting copy(@i(name = "action") @NotNull String action, @i(name = "similarity") float similarity) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new RandomShooting(action, similarity);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RandomShooting)) {
                return false;
            }
            RandomShooting randomShooting = (RandomShooting) obj2;
            return Intrinsics.f(this.f107410a, randomShooting.f107410a) && Float.compare(this.f107411b, randomShooting.f107411b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f107411b) + (this.f107410a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb6 = new StringBuilder("RandomShooting(action=");
            sb6.append(this.f107410a);
            sb6.append(", similarity=");
            return m72.b.s(sb6, this.f107411b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/FaceMatchingJapanTDResult$Result;", "", "<init>", "(Ljava/lang/String;I)V", "Lz2m/c;", "toModel", "()Lz2m/c;", "Companion", "com/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/a", "SUCCEEDED", "FAILED", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        public final z2m.c toModel() {
            int i = b.f107418a[ordinal()];
            if (i == 1) {
                return z2m.c.SUCCEEDED;
            }
            if (i == 2) {
                return z2m.c.FAILED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public FaceMatchingJapanTDResult(@i(name = "result") @NotNull Result result, @i(name = "similarity") float f, @i(name = "random_shooting") List<RandomShooting> list) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f107407a = result;
        this.f107408b = f;
        this.f107409c = list;
    }

    @NotNull
    public final FaceMatchingJapanTDResult copy(@i(name = "result") @NotNull Result result, @i(name = "similarity") float similarity, @i(name = "random_shooting") List<RandomShooting> randomShooting) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new FaceMatchingJapanTDResult(result, similarity, randomShooting);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FaceMatchingJapanTDResult)) {
            return false;
        }
        FaceMatchingJapanTDResult faceMatchingJapanTDResult = (FaceMatchingJapanTDResult) obj2;
        return this.f107407a == faceMatchingJapanTDResult.f107407a && Float.compare(this.f107408b, faceMatchingJapanTDResult.f107408b) == 0 && Intrinsics.f(this.f107409c, faceMatchingJapanTDResult.f107409c);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f107408b, this.f107407a.hashCode() * 31, 31);
        List list = this.f107409c;
        return iB + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("FaceMatchingJapanTDResult(result=");
        sb6.append(this.f107407a);
        sb6.append(", similarity=");
        sb6.append(this.f107408b);
        sb6.append(", randomShooting=");
        return m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f107409c, sb6);
    }

    public /* synthetic */ FaceMatchingJapanTDResult(Result result, float f, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(result, f, (i & 4) != 0 ? null : list);
    }
}
