package retrofit2.converter.gson;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kg.l0;
import kg.o;
import mmm.h;
import mmm.j;
import okhttp3.RequestBody;
import qg.c;
import retrofit2.Converter;
import ulm.a1;
import ulm.b1;

/* JADX INFO: loaded from: classes13.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    static final b1 MEDIA_TYPE;
    private final l0 adapter;
    private final o gson;
    private final boolean streaming;

    static {
        b1.Companion.getClass();
        MEDIA_TYPE = a1.a("application/json; charset=UTF-8");
    }

    public GsonRequestBodyConverter(o oVar, l0 l0Var, boolean z) {
        this.gson = oVar;
        this.adapter = l0Var;
        this.streaming = z;
    }

    public static <T> void writeJson(j jVar, o oVar, l0 l0Var, T t2) throws IOException {
        c cVarJ = oVar.j(new OutputStreamWriter(jVar.W9(), StandardCharsets.UTF_8));
        l0Var.d(cVarJ, t2);
        cVarJ.close();
    }

    @Override // retrofit2.Converter
    public RequestBody convert(T t2) throws IOException {
        if (this.streaming) {
            return new GsonStreamingRequestBody(this.gson, this.adapter, t2);
        }
        h hVar = new h();
        writeJson(hVar, this.gson, this.adapter, t2);
        return RequestBody.create(MEDIA_TYPE, hVar.c(hVar.f207266b));
    }
}
