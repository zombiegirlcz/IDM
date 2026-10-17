package ore;

import com.revolut.feature.terms.impl.network.UserDocumentsService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f implements e4m.e {
    public static UserDocumentsService a(e eVar, Retrofit retrofit, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitBuild = retrofit.newBuilder().addConverterFactory(converterFactory).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        Object objCreate = retrofitBuild.create(UserDocumentsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        UserDocumentsService userDocumentsService = (UserDocumentsService) objCreate;
        s.k(userDocumentsService);
        return userDocumentsService;
    }
}
