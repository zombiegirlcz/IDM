package retrofit2.converter.gson;

import com.google.gson.JsonIOException;
import java.io.IOException;
import java.io.Reader;
import kg.e0;
import kg.l0;
import kg.o;
import okhttp3.ResponseBody;
import qg.a;
import qg.b;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes13.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final l0 adapter;
    private final o gson;

    public GsonResponseBodyConverter(o oVar, l0 l0Var) {
        this.gson = oVar;
        this.adapter = l0Var;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        o oVar = this.gson;
        Reader readerCharStream = responseBody.charStream();
        oVar.getClass();
        a aVar = new a(readerCharStream);
        aVar.D(e0.LEGACY_STRICT);
        try {
            T t2 = (T) this.adapter.c(aVar);
            if (aVar.A() == b.END_DOCUMENT) {
                return t2;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
