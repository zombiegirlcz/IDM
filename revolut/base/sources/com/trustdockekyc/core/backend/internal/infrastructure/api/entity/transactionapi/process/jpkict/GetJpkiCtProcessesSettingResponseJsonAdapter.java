package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import com.squareup.moshi.JsonDataException;
import k1m.e0;
import k1m.l;
import k1m.o;
import k1m.q;
import k1m.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesSettingResponseJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/GetJpkiCtProcessesSettingResponse;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "booleanAdapter", "Lk1m/l;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetJpkiCtProcessesSettingResponseJsonAdapter extends l {

    @NotNull
    private final l booleanAdapter;

    @NotNull
    private final o options;

    public GetJpkiCtProcessesSettingResponseJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"individual_number_reading_enabled", "uid_provision_enabled", "tbs_data_template_enabled", "id_photo_reading_enabled"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.booleanAdapter = n.a(moshi, Boolean.TYPE, "individualNumberReadingEnabled");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                bool = (Boolean) this.booleanAdapter.a(reader);
                if (bool == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("individualNumberReadingEnabled", "individual_number_reading_enabled", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                bool2 = (Boolean) this.booleanAdapter.a(reader);
                if (bool2 == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("uidProvisionEnabled", "uid_provision_enabled", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2) {
                bool3 = (Boolean) this.booleanAdapter.a(reader);
                if (bool3 == null) {
                    JsonDataException jsonDataExceptionJ3 = l1m.b.j("tbsDataTemplateEnabled", "tbs_data_template_enabled", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                    throw jsonDataExceptionJ3;
                }
            } else if (iP == 3 && (bool4 = (Boolean) this.booleanAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ4 = l1m.b.j("idPhotoReadingEnabled", "id_photo_reading_enabled", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                throw jsonDataExceptionJ4;
            }
        }
        reader.h();
        if (bool == null) {
            JsonDataException jsonDataExceptionE = l1m.b.e("individualNumberReadingEnabled", "individual_number_reading_enabled", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        boolean zBooleanValue = bool.booleanValue();
        if (bool2 == null) {
            JsonDataException jsonDataExceptionE2 = l1m.b.e("uidProvisionEnabled", "uid_provision_enabled", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        boolean zBooleanValue2 = bool2.booleanValue();
        if (bool3 == null) {
            JsonDataException jsonDataExceptionE3 = l1m.b.e("tbsDataTemplateEnabled", "tbs_data_template_enabled", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        boolean zBooleanValue3 = bool3.booleanValue();
        if (bool4 != null) {
            return new GetJpkiCtProcessesSettingResponse(zBooleanValue, zBooleanValue2, zBooleanValue3, bool4.booleanValue());
        }
        JsonDataException jsonDataExceptionE4 = l1m.b.e("idPhotoReadingEnabled", "id_photo_reading_enabled", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
        throw jsonDataExceptionE4;
    }

    public final void c(t writer, Object obj2) {
        GetJpkiCtProcessesSettingResponse getJpkiCtProcessesSettingResponse = (GetJpkiCtProcessesSettingResponse) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (getJpkiCtProcessesSettingResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("individual_number_reading_enabled");
        this.booleanAdapter.c(writer, Boolean.valueOf(getJpkiCtProcessesSettingResponse.f107508a));
        writer.h("uid_provision_enabled");
        this.booleanAdapter.c(writer, Boolean.valueOf(getJpkiCtProcessesSettingResponse.f107509b));
        writer.h("tbs_data_template_enabled");
        this.booleanAdapter.c(writer, Boolean.valueOf(getJpkiCtProcessesSettingResponse.f107510c));
        writer.h("id_photo_reading_enabled");
        this.booleanAdapter.c(writer, Boolean.valueOf(getJpkiCtProcessesSettingResponse.d));
        writer.g();
    }

    public final String toString() {
        return l9.l.a(55, "GeneratedJsonAdapter(GetJpkiCtProcessesSettingResponse)");
    }
}
