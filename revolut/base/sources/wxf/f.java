package wxf;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public abstract void a();

    public abstract List b();

    public abstract void c(oxf.c... cVarArr);

    public void d(oxf.c... travelFavoriteEntities) {
        Intrinsics.checkNotNullParameter(travelFavoriteEntities, "travelFavoriteEntities");
        a();
        c((oxf.c[]) Arrays.copyOf(travelFavoriteEntities, travelFavoriteEntities.length));
    }
}
