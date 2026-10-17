package b8;

import i8.b0;
import i8.u;
import i8.v;
import okhttp3.OkHttpClient;
import ulm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile OkHttpClient f13073b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f13074a;

    public c(o oVar) {
        this.f13074a = oVar;
    }

    @Override // i8.v
    public final u a(b0 b0Var) {
        return new d(this.f13074a, 0);
    }
}
