package ljl;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes12.dex */
public abstract class v1 implements e4m.e {
    public static Converter.Factory a(kg.o gson) {
        t1.Companion.getClass();
        Intrinsics.checkNotNullParameter(gson, "gson");
        GsonConverterFactory gsonConverterFactoryCreate = GsonConverterFactory.create(gson);
        Intrinsics.checkNotNullExpressionValue(gsonConverterFactoryCreate, "create(...)");
        vc.s.k(gsonConverterFactoryCreate);
        return gsonConverterFactoryCreate;
    }
}
