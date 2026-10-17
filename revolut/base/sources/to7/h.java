package to7;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends c {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f272530a;

    public h(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f272530a = countryInteractor;
    }

    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String listId = (String) zhm.d0.a0(ids);
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new j(com.bumptech.glide.d.c(kotlin.text.d0.z0(listId, "_", listId)));
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        efm.r rVarFromCallable = efm.r.fromCallable(new f(obj2, this, 0));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }
}
