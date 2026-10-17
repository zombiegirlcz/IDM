package ek;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import mlm.j;
import mp.p;
import qk.d;
import retrofit2.Converter;
import retrofit2.Retrofit;
import ulm.b1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f126916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a31.a f126917b;

    public a(b1 contentType, a31.a serializer) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f126916a = contentType;
        this.f126917b = serializer;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        Intrinsics.checkNotNullParameter(methodAnnotations, "methodAnnotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        a31.a aVar = this.f126917b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return new p(this.f126916a, d.q(((Json) ((j) aVar.f955b)).f187949b, type), aVar);
    }

    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        a31.a aVar = this.f126917b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        return new r10.a((mlm.b) d.q(((Json) ((j) aVar.f955b)).f187949b, type), aVar);
    }
}
