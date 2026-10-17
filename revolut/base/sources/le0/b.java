package le0;

import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f194428a;

    public b(o baseGson) {
        Intrinsics.checkNotNullParameter(baseGson, "baseGson");
        this.f194428a = baseGson;
    }

    public final a a(o oVar) {
        if (oVar == null) {
            oVar = this.f194428a;
        }
        return new a(oVar);
    }
}
