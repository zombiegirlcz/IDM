package dja;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GsonConverterFactory f115271a;

    public h(GsonConverterFactory delegateFactory) {
        Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
        this.f115271a = delegateFactory;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Converter<ResponseBody, ?> converterResponseBodyConverter;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (Intrinsics.f(type, fja.g.class) && (converterResponseBodyConverter = this.f115271a.responseBodyConverter(type, annotations, retrofit)) != null) {
            return new g(converterResponseBodyConverter);
        }
        return null;
    }
}
