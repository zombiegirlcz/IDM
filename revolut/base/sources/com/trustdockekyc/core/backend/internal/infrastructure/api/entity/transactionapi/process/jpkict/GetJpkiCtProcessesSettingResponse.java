package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesSettingResponse;", "", "", "individualNumberReadingEnabled", "uidProvisionEnabled", "tbsDataTemplateEnabled", "idPhotoReadingEnabled", "<init>", "(ZZZZ)V", "copy", "(ZZZZ)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesSettingResponse;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GetJpkiCtProcessesSettingResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f107508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f107509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107510c;
    public final boolean d;

    public GetJpkiCtProcessesSettingResponse(@i(name = "individual_number_reading_enabled") boolean z, @i(name = "uid_provision_enabled") boolean z3, @i(name = "tbs_data_template_enabled") boolean z4, @i(name = "id_photo_reading_enabled") boolean z6) {
        this.f107508a = z;
        this.f107509b = z3;
        this.f107510c = z4;
        this.d = z6;
    }

    @NotNull
    public final GetJpkiCtProcessesSettingResponse copy(@i(name = "individual_number_reading_enabled") boolean individualNumberReadingEnabled, @i(name = "uid_provision_enabled") boolean uidProvisionEnabled, @i(name = "tbs_data_template_enabled") boolean tbsDataTemplateEnabled, @i(name = "id_photo_reading_enabled") boolean idPhotoReadingEnabled) {
        return new GetJpkiCtProcessesSettingResponse(individualNumberReadingEnabled, uidProvisionEnabled, tbsDataTemplateEnabled, idPhotoReadingEnabled);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GetJpkiCtProcessesSettingResponse)) {
            return false;
        }
        GetJpkiCtProcessesSettingResponse getJpkiCtProcessesSettingResponse = (GetJpkiCtProcessesSettingResponse) obj2;
        return this.f107508a == getJpkiCtProcessesSettingResponse.f107508a && this.f107509b == getJpkiCtProcessesSettingResponse.f107509b && this.f107510c == getJpkiCtProcessesSettingResponse.f107510c && this.d == getJpkiCtProcessesSettingResponse.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f107508a) * 31, 31, this.f107509b), 31, this.f107510c);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("GetJpkiCtProcessesSettingResponse(individualNumberReadingEnabled=");
        sb6.append(this.f107508a);
        sb6.append(", uidProvisionEnabled=");
        sb6.append(this.f107509b);
        sb6.append(", tbsDataTemplateEnabled=");
        sb6.append(this.f107510c);
        sb6.append(", idPhotoReadingEnabled=");
        return j6.a.x(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
