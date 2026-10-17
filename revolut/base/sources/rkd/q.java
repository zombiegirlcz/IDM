package rkd;

import com.revolut.feature.slot_manager.impl.network.SlotManagerService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import retrofit2.Converter;
import retrofit2.Retrofit;
import ulm.a1;
import ulm.b1;

/* JADX INFO: loaded from: classes13.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q f254832a = new q();

    private q() {
    }

    public static SlotManagerService a(Retrofit retrofit, Json json) {
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        List<Converter.Factory> listConverterFactories = builderNewBuilder.converterFactories();
        listConverterFactories.clear();
        b1.Companion.getClass();
        listConverterFactories.add(ek.b.a(json, a1.a("application/json")));
        Retrofit retrofitBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        Object objCreate = retrofitBuild.create(SlotManagerService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (SlotManagerService) objCreate;
    }
}
