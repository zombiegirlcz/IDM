package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/GetIcChipReaderJapanCtProcessesSettingResponse;", "", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;", "targetDocumentTypes", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/GetIcChipReaderJapanCtProcessesSettingResponse;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetIcChipReaderJapanCtProcessesSettingResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f107421a;

    public GetIcChipReaderJapanCtProcessesSettingResponse(@i(name = "target_document_types") @NotNull List<? extends ICChipReaderJapanCTDocumentType> targetDocumentTypes) {
        Intrinsics.checkNotNullParameter(targetDocumentTypes, "targetDocumentTypes");
        this.f107421a = targetDocumentTypes;
    }

    @NotNull
    public final GetIcChipReaderJapanCtProcessesSettingResponse copy(@i(name = "target_document_types") @NotNull List<? extends ICChipReaderJapanCTDocumentType> targetDocumentTypes) {
        Intrinsics.checkNotNullParameter(targetDocumentTypes, "targetDocumentTypes");
        return new GetIcChipReaderJapanCtProcessesSettingResponse(targetDocumentTypes);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof GetIcChipReaderJapanCtProcessesSettingResponse) && Intrinsics.f(this.f107421a, ((GetIcChipReaderJapanCtProcessesSettingResponse) obj2).f107421a);
    }

    public final int hashCode() {
        return this.f107421a.hashCode();
    }

    public final String toString() {
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f107421a, new StringBuilder("GetIcChipReaderJapanCtProcessesSettingResponse(targetDocumentTypes="));
    }
}
