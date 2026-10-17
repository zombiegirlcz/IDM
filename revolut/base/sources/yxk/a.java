package yxk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public abstract void a();

    public abstract byk.b b();

    public abstract void c(byk.b bVar);

    public void d(byk.b entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        a();
        c(entity);
    }
}
