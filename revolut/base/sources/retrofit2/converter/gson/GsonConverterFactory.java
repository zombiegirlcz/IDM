package retrofit2.converter.gson;

import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kg.o;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final o gson;
    private final boolean streaming;

    private GsonConverterFactory(o oVar, boolean z) {
        this.gson = oVar;
        this.streaming = z;
    }

    public static GsonConverterFactory create() {
        return create(new o());
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.g(TypeToken.get(type)), this.streaming);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.g(TypeToken.get(type)));
    }

    public GsonConverterFactory withStreaming() {
        return new GsonConverterFactory(this.gson, true);
    }

    public static GsonConverterFactory create(o oVar) {
        if (oVar != null) {
            return new GsonConverterFactory(oVar, false);
        }
        throw new NullPointerException("gson == null");
    }
}
