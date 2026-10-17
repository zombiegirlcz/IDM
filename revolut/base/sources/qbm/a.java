package qbm;

import ao.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import lbm.j;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends CallAdapter.Factory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f244379c;
    public final jbm.c d;

    public a(j jVar, jbm.c cVar) {
        this.f244379c = jVar;
        this.d = cVar;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new h(this, retrofit.nextCallAdapter(this, type, annotationArr), 24);
    }
}
