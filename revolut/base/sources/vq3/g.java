package vq3;

import kg.p;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public abstract class g implements e4m.e {
    public static Converter.Factory a(e eVar) {
        GsonConverterFactory gsonConverterFactoryCreate = GsonConverterFactory.create(new p().b());
        Intrinsics.checkNotNullExpressionValue(gsonConverterFactoryCreate, "create(...)");
        s.k(gsonConverterFactoryCreate);
        return gsonConverterFactoryCreate;
    }
}
