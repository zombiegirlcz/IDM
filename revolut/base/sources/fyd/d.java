package fyd;

import com.revolut.feature.statements.impl.documents_hub.service.DocumentsHubService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements e {
    public static DocumentsHubService a(Retrofit retrofit, Converter.Factory converterFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        builderNewBuilder.converterFactories().clear();
        Object objCreate = builderNewBuilder.addConverterFactory(converterFactory).build().create(DocumentsHubService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        DocumentsHubService documentsHubService = (DocumentsHubService) objCreate;
        s.k(documentsHubService);
        return documentsHubService;
    }
}
