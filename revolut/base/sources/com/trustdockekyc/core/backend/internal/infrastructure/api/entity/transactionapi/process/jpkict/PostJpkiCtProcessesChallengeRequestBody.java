package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/PostJpkiCtProcessesChallengeRequestBody;", "", "", "tbsRawData", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/PostJpkiCtProcessesChallengeRequestBody;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostJpkiCtProcessesChallengeRequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107526a;

    public PostJpkiCtProcessesChallengeRequestBody(@i(name = "tbs_raw_data") @NotNull String tbsRawData) {
        Intrinsics.checkNotNullParameter(tbsRawData, "tbsRawData");
        this.f107526a = tbsRawData;
    }

    @NotNull
    public final PostJpkiCtProcessesChallengeRequestBody copy(@i(name = "tbs_raw_data") @NotNull String tbsRawData) {
        Intrinsics.checkNotNullParameter(tbsRawData, "tbsRawData");
        return new PostJpkiCtProcessesChallengeRequestBody(tbsRawData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PostJpkiCtProcessesChallengeRequestBody) && Intrinsics.f(this.f107526a, ((PostJpkiCtProcessesChallengeRequestBody) obj2).f107526a);
    }

    public final int hashCode() {
        return this.f107526a.hashCode();
    }

    public final String toString() {
        return j6.a.u(new StringBuilder("PostJpkiCtProcessesChallengeRequestBody(tbsRawData="), this.f107526a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
