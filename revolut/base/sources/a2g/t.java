package a2g;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements jki.p {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2g.a f857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2g.c f858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2g.g f859c;
    public final c2g.f d;

    public t(c2g.a descriptionItemsMapper, c2g.c featureItemsMapper, c2g.g tourSnapshotItemsMapper, c2g.f reviewsMapper) {
        Intrinsics.checkNotNullParameter(descriptionItemsMapper, "descriptionItemsMapper");
        Intrinsics.checkNotNullParameter(featureItemsMapper, "featureItemsMapper");
        Intrinsics.checkNotNullParameter(tourSnapshotItemsMapper, "tourSnapshotItemsMapper");
        Intrinsics.checkNotNullParameter(reviewsMapper, "reviewsMapper");
        this.f857a = descriptionItemsMapper;
        this.f858b = featureItemsMapper;
        this.f859c = tourSnapshotItemsMapper;
        this.d = reviewsMapper;
    }

    public static l b(boolean z) {
        f0 f0Var = f0.f322471a;
        m70.a.c(t0.f186434a);
        return new l(f0Var, new i(u.c(new UrlImage("", null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286))), z);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f834a, new a0.c(this, domainState, 8), new a09.b(this, domainState, 7), new a15.n(this, domainState, 1));
    }
}
