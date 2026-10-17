package lz1;

import kg.o;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i implements e4m.e {
    public static Converter.Factory a(g gVar, o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        GsonConverterFactory gsonConverterFactoryCreate = GsonConverterFactory.create(gson);
        Intrinsics.checkNotNullExpressionValue(gsonConverterFactoryCreate, "create(...)");
        s.k(gsonConverterFactoryCreate);
        return gsonConverterFactoryCreate;
    }
}
