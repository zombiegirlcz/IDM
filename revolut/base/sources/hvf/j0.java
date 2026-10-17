package hvf;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes9.dex */
public abstract class j0 implements e4m.e {
    public static Converter.Factory a(h0 h0Var, kg.o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        GsonConverterFactory gsonConverterFactoryCreate = GsonConverterFactory.create(gson);
        Intrinsics.checkNotNullExpressionValue(gsonConverterFactoryCreate, "create(...)");
        vc.s.k(gsonConverterFactoryCreate);
        return gsonConverterFactoryCreate;
    }
}
