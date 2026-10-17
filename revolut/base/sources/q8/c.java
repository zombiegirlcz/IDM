package q8;

import c8.k;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import e8.e0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f242955b = new c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242956a;

    public /* synthetic */ c(int i) {
        this.f242956a = i;
    }

    @Override // q8.a
    public final e0 d(e0 e0Var, k kVar) {
        switch (this.f242956a) {
            case 0:
                return e0Var;
            default:
                return new k8.c(y8.b.d(((GifDrawable) e0Var.get()).f26125a.f233797a.a()));
        }
    }
}
