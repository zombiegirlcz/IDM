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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/IdentifyJPKICTBasicPersonalInfoJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/IdentifyJPKICTBasicPersonalInfo;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IdentifyJPKICTBasicPersonalInfoJsonAdapter extends l {

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public IdentifyJPKICTBasicPersonalInfoJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"all_name", "gender", "date_of_birth", "address"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "allName");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("allName", "all_name", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                str2 = (String) this.stringAdapter.a(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("gender", "gender", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2) {
                str3 = (String) this.stringAdapter.a(reader);
                if (str3 == null) {
                    JsonDataException jsonDataExceptionJ3 = l1m.b.j("dateOfBirth", "date_of_birth", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                    throw jsonDataExceptionJ3;
                }
            } else if (iP == 3 && (str4 = (String) this.stringAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ4 = l1m.b.j("address", "address", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                throw jsonDataExceptionJ4;
            }
        }
        reader.h();
        if (str == null) {
            JsonDataException jsonDataExceptionE = l1m.b.e("allName", "all_name", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        if (str2 == null) {
            JsonDataException jsonDataExceptionE2 = l1m.b.e("gender", "gender", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        if (str3 == null) {
            JsonDataException jsonDataExceptionE3 = l1m.b.e("dateOfBirth", "date_of_birth", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        if (str4 != null) {
            return new IdentifyJPKICTBasicPersonalInfo(str, str2, str3, str4);
        }
        JsonDataException jsonDataExceptionE4 = l1m.b.e("address", "address", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
        throw jsonDataExceptionE4;
    }

    public final void c(t writer, Object obj2) {
        IdentifyJPKICTBasicPersonalInfo identifyJPKICTBasicPersonalInfo = (IdentifyJPKICTBasicPersonalInfo) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (identifyJPKICTBasicPersonalInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("all_name");
        this.stringAdapter.c(writer, identifyJPKICTBasicPersonalInfo.f107511a);
        writer.h("gender");
        this.stringAdapter.c(writer, identifyJPKICTBasicPersonalInfo.f107512b);
        writer.h("date_of_birth");
        this.stringAdapter.c(writer, identifyJPKICTBasicPersonalInfo.f107513c);
        writer.h("address");
        this.stringAdapter.c(writer, identifyJPKICTBasicPersonalInfo.d);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(53, "GeneratedJsonAdapter(IdentifyJPKICTBasicPersonalInfo)");
    }
}
