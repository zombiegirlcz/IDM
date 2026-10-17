package wxc;

import com.revolut.feature.selfserve.entity.config.shared.services.EntityConfigService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements e4m.e {
    public static EntityConfigService a(ek.a converterFactory, qxc.b deps) {
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(deps, "deps");
        Retrofit retrofit = (Retrofit) deps.f250068a.f134704c.get();
        s.j(retrofit);
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        builderNewBuilder.converterFactories().clear();
        builderNewBuilder.addConverterFactory(converterFactory);
        Object objCreate = builderNewBuilder.build().create(EntityConfigService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        EntityConfigService entityConfigService = (EntityConfigService) objCreate;
        s.k(entityConfigService);
        return entityConfigService;
    }
}
