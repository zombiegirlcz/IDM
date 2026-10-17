package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody;", "", "", "face", "", "randomness", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f107414b;

    public PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody(@i(name = "face") @NotNull String face, @i(name = "randomness") @NotNull List<String> randomness) {
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(randomness, "randomness");
        this.f107413a = face;
        this.f107414b = randomness;
    }

    @NotNull
    public final PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody copy(@i(name = "face") @NotNull String face, @i(name = "randomness") @NotNull List<String> randomness) {
        Intrinsics.checkNotNullParameter(face, "face");
        Intrinsics.checkNotNullParameter(randomness, "randomness");
        return new PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody(face, randomness);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody)) {
            return false;
        }
        PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody postFaceMatchingJapanTdProcessesFaceMatchingsRequestBody = (PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody) obj2;
        return Intrinsics.f(this.f107413a, postFaceMatchingJapanTdProcessesFaceMatchingsRequestBody.f107413a) && Intrinsics.f(this.f107414b, postFaceMatchingJapanTdProcessesFaceMatchingsRequestBody.f107414b);
    }

    public final int hashCode() {
        return this.f107414b.hashCode() + (this.f107413a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody(face=");
        sb6.append(this.f107413a);
        sb6.append(", randomness=");
        return m72.b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f107414b, sb6);
    }

    public PostFaceMatchingJapanTdProcessesFaceMatchingsRequestBody(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? f0.f322471a : list);
    }
}
