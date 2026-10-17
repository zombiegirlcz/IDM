package z8;

import androidx.core.util.Pools$SynchronizedPool;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dfm.c f320029a = new dfm.c(19);

    public static gpk.c a(int i, a aVar) {
        return new gpk.c(new Pools$SynchronizedPool(i), aVar, (c) f320029a);
    }
}
