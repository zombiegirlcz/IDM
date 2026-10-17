package y6h;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f311306b = new TypeToken<o>() { // from class: com.revolut.feature.wealth.impl.data.cache.collections.CollectionsConfigStorage$Companion$COLLECTION_CONFIG_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f311307a;

    public n(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f311307a = storage;
    }

    public final o a(xzg.o param) {
        Intrinsics.checkNotNullParameter(param, "param");
        String strV = nz8.d.v(param);
        Type COLLECTION_CONFIG_TYPE = f311306b;
        Intrinsics.checkNotNullExpressionValue(COLLECTION_CONFIG_TYPE, "COLLECTION_CONFIG_TYPE");
        Object objT2 = this.f311307a.T2(strV, COLLECTION_CONFIG_TYPE);
        o oVar = (o) objT2;
        if ((oVar != null ? oVar.getLayout() : null) == null) {
            objT2 = null;
        }
        return (o) objT2;
    }
}
