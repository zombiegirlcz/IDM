package wx3;

import a44.d;
import com.revolut.feature.credit.application.plugins.impl.repositories.impl.plugins.photo_upload.PhotosUploadRepositoryImpl$getDocumentsType$1;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f300751a;

    public c(d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f300751a = repository;
    }

    public final a44.c a(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        d dVar = this.f300751a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        ve0.c cVar = dVar.f;
        String strA = d.a(applicationId);
        Type type = new PhotosUploadRepositoryImpl$getDocumentsType$1().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getDocumentsType(...)");
        return new a44.c(e.R(cVar, strA, type), 0);
    }
}
