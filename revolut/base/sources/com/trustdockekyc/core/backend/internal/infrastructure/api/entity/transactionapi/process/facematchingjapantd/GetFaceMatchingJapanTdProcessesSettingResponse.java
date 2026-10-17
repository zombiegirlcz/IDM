package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/GetFaceMatchingJapanTdProcessesSettingResponse;", "", "", "randomShootingEnabled", "<init>", "(Z)V", "copy", "(Z)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/facematchingjapantd/GetFaceMatchingJapanTdProcessesSettingResponse;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetFaceMatchingJapanTdProcessesSettingResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107412a;

    public GetFaceMatchingJapanTdProcessesSettingResponse(@i(name = "random_shooting_enabled") boolean z) {
        this.f107412a = z;
    }

    @NotNull
    public final GetFaceMatchingJapanTdProcessesSettingResponse copy(@i(name = "random_shooting_enabled") boolean randomShootingEnabled) {
        return new GetFaceMatchingJapanTdProcessesSettingResponse(randomShootingEnabled);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof GetFaceMatchingJapanTdProcessesSettingResponse) && this.f107412a == ((GetFaceMatchingJapanTdProcessesSettingResponse) obj2).f107412a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107412a);
    }

    public final String toString() {
        return j6.a.x(new StringBuilder("GetFaceMatchingJapanTdProcessesSettingResponse(randomShootingEnabled="), this.f107412a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
