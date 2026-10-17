package to7;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll7.a f272516a;

    public b(ll7.a profileRepository) {
        Intrinsics.checkNotNullParameter(profileRepository, "profileRepository");
        this.f272516a = profileRepository;
    }

    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new u((String) zhm.d0.a0(ids));
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        return rd0.e.c(nim.a.v(rd0.e.b(((ll7.h) this.f272516a).e.f(Unit.f186387a, false)), new tlf.n(this, 17)), kotlin.coroutines.g.f186406a);
    }
}
