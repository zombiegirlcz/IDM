package jw3;

import com.revolut.feature.credit.application.plugins.impl.repositories.documents_upload.DocumentsUploadRepositoryImpl$getDocumentsType$1;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import n1g.p;
import n24.c;
import ue0.e;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f178924a;

    public a(c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f178924a = repository;
    }

    public final p a(String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = this.f178924a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        ve0.c cVar2 = cVar.f211444a;
        String strA = c.a(context);
        Type type = new DocumentsUploadRepositoryImpl$getDocumentsType$1().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getDocumentsType(...)");
        return new p(e.R(cVar2, strA, type), cVar, 1);
    }
}
