package qtg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public abstract void a(String str);

    public abstract stg.b b(String str);

    public abstract void c(stg.b bVar);

    public void d(stg.b entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        a(entity.f265586c);
        c(entity);
    }
}
