package pqj;

import dja.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends Converter.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Converter.Factory f238795a;

    public a(Converter.Factory defaultConverterFactory) {
        Intrinsics.checkNotNullParameter(defaultConverterFactory, "defaultConverterFactory");
        this.f238795a = defaultConverterFactory;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        return new g(this, this.f238795a.responseBodyConverter(type, annotations, retrofit));
    }
}
