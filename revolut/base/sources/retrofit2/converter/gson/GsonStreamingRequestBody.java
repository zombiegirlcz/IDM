package retrofit2.converter.gson;

import java.io.IOException;
import kg.l0;
import kg.o;
import mmm.j;
import okhttp3.RequestBody;
import ulm.b1;

/* JADX INFO: loaded from: classes14.dex */
final class GsonStreamingRequestBody<T> extends RequestBody {
    private final l0 adapter;
    private final o gson;
    private final T value;

    public GsonStreamingRequestBody(o oVar, l0 l0Var, T t2) {
        this.gson = oVar;
        this.adapter = l0Var;
        this.value = t2;
    }

    @Override // okhttp3.RequestBody
    public b1 contentType() {
        return GsonRequestBodyConverter.MEDIA_TYPE;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(j jVar) throws IOException {
        GsonRequestBodyConverter.writeJson(jVar, this.gson, this.adapter, this.value);
    }
}
