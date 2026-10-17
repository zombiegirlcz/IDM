package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import com.squareup.moshi.JsonDataException;
import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostPackageResponse;
import java.lang.reflect.Type;
import java.util.List;
import k1m.e0;
import k1m.l;
import k1m.l0;
import k1m.o;
import k1m.q;
import k1m.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponseJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponse;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageResponse$Process;", "listOfProcessAdapter", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PostPackageResponseJsonAdapter extends l {

    @NotNull
    private final l listOfProcessAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public PostPackageResponseJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"id", "package_id", "processes", "selected_at"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "id");
        l lVarB = moshi.b(l0.d(new Type[]{PostPackageResponse.Process.class}), h0.f322473a, "processes");
        Intrinsics.checkNotNullExpressionValue(lVarB, "adapter(...)");
        this.listOfProcessAdapter = lVarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                str2 = (String) this.stringAdapter.a(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("packageId", "package_id", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2) {
                list = (List) this.listOfProcessAdapter.a(reader);
                if (list == null) {
                    JsonDataException jsonDataExceptionJ3 = l1m.b.j("processes", "processes", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                    throw jsonDataExceptionJ3;
                }
            } else if (iP == 3 && (str3 = (String) this.stringAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ4 = l1m.b.j("selectedAt", "selected_at", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                throw jsonDataExceptionJ4;
            }
        }
        reader.h();
        if (str == null) {
            JsonDataException jsonDataExceptionE = l1m.b.e("id", "id", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        if (str2 == null) {
            JsonDataException jsonDataExceptionE2 = l1m.b.e("packageId", "package_id", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        if (list == null) {
            JsonDataException jsonDataExceptionE3 = l1m.b.e("processes", "processes", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        if (str3 != null) {
            return new PostPackageResponse(str, str2, list, str3);
        }
        JsonDataException jsonDataExceptionE4 = l1m.b.e("selectedAt", "selected_at", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
        throw jsonDataExceptionE4;
    }

    public final void c(t writer, Object obj2) {
        PostPackageResponse postPackageResponse = (PostPackageResponse) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (postPackageResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("id");
        this.stringAdapter.c(writer, postPackageResponse.f107389a);
        writer.h("package_id");
        this.stringAdapter.c(writer, postPackageResponse.f107390b);
        writer.h("processes");
        this.listOfProcessAdapter.c(writer, postPackageResponse.f107391c);
        writer.h("selected_at");
        this.stringAdapter.c(writer, postPackageResponse.d);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(41, "GeneratedJsonAdapter(PostPackageResponse)");
    }
}
