package le0;

import java.io.Serializable;
import java.lang.reflect.Type;
import je0.d;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f194426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f194427b;

    public a(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f194426a = gson;
        this.f194427b = w.y0(new af0.a(29));
    }

    @Override // je0.b
    public final Object b(Serializable serializable, Type type) {
        String item = (String) serializable;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        Object objD = this.f194426a.d(item, type);
        Intrinsics.checkNotNullExpressionValue(objD, "also(...)");
        return objD;
    }

    @Override // je0.b
    public final Object c(Object item, Type type) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        String strK = this.f194426a.k(item);
        Intrinsics.checkNotNullExpressionValue(strK, "toJson(...)");
        return strK;
    }
}
