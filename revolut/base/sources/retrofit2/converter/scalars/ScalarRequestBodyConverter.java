package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.RequestBody;
import retrofit2.Converter;
import ulm.a1;
import ulm.b1;

/* JADX INFO: loaded from: classes14.dex */
final class ScalarRequestBodyConverter<T> implements Converter<T, RequestBody> {
    static final ScalarRequestBodyConverter<Object> INSTANCE = new ScalarRequestBodyConverter<>();
    private static final b1 MEDIA_TYPE;

    static {
        b1.Companion.getClass();
        MEDIA_TYPE = a1.a("text/plain; charset=UTF-8");
    }

    private ScalarRequestBodyConverter() {
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t2) throws IOException {
        return RequestBody.create(MEDIA_TYPE, String.valueOf(t2));
    }
}
