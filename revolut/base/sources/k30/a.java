package k30;

import be7.l;
import e30.b;
import efm.r;
import java.util.UUID;
import jyk.g0;
import kotlin.jvm.internal.Intrinsics;
import s20.d;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f180613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f180614b;

    public a(d dataSource, b webSocketDelegate) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(webSocketDelegate, "webSocketDelegate");
        this.f180613a = dataSource;
        this.f180614b = webSocketDelegate;
    }

    public final r a(UUID id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        r rVarMergeWith = this.f180613a.c(id10, true).mergeWith(this.f180614b.a(false).filter(new g0(new l(4, id10), 23)).switchMapCompletable(new g0(new k1.a(this, id10, 8), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }
}
