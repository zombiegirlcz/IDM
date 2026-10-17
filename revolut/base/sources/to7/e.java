package to7;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll7.a f272523a;

    public e(ll7.a profileRepository) {
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        this.f272523a = profileRepository;
    }

    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new u((String) zhm.d0.a0(ids));
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
        String make = (String) obj2;
        ll7.h hVar = (ll7.h) this.f272523a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(make, "make");
        return rd0.e.c(nim.a.v(rd0.e.b(hVar.f.f(make, false)), new tlf.n(this, 18)), kotlin.coroutines.g.f186406a);
    }
}
