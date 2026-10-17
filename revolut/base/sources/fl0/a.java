package fl0;

import java.io.Serializable;
import java.lang.reflect.Type;
import je0.d;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135876a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f135877b;

    public a(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f135877b = gson;
    }

    @Override // je0.b
    public final Object b(Serializable serializable, Type type) {
        switch (this.f135876a) {
            case 0:
                String item = (String) serializable;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(type, "type");
                Object objD = ((o) this.f135877b).d(item, type);
                Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                return objD;
            default:
                String item2 = (String) serializable;
                Intrinsics.checkNotNullParameter(item2, "item");
                Intrinsics.checkNotNullParameter(type, "type");
                Json json = (Json) this.f135877b;
                Object objB = json.b(qk.d.q(json.f187949b, type), item2);
                Intrinsics.i(objB, "null cannot be cast to non-null type T of com.revolut.core.data.mapper.json.JsonObjectMapper.mapFrom");
                return objB;
        }
    }

    @Override // je0.b
    public final Object c(Object item, Type type) {
        switch (this.f135876a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(type, "type");
                String strK = ((o) this.f135877b).k(item);
                Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
                return strK;
            default:
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(type, "type");
                Json json = (Json) this.f135877b;
                return json.c(qk.d.q(json.f187949b, type), item);
        }
    }

    public a(Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f135877b = json;
    }
}
