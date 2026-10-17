package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageRequestBodyJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/PostPackageRequestBody;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PostPackageRequestBodyJsonAdapter extends l {

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public PostPackageRequestBodyJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"package_id"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "packageId");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws JsonDataException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0 && (str = (String) this.stringAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ = l1m.b.j("packageId", "package_id", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                throw jsonDataExceptionJ;
            }
        }
        reader.h();
        if (str != null) {
            return new PostPackageRequestBody(str);
        }
        JsonDataException jsonDataExceptionE = l1m.b.e("packageId", "package_id", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
        throw jsonDataExceptionE;
    }

    public final void c(t writer, Object obj2) {
        PostPackageRequestBody postPackageRequestBody = (PostPackageRequestBody) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (postPackageRequestBody == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("package_id");
        this.stringAdapter.c(writer, postPackageRequestBody.f107388a);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(44, "GeneratedJsonAdapter(PostPackageRequestBody)");
    }
}
