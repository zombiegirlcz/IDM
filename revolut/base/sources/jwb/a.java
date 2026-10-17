package jwb;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cwb.a f178946a;

    public a(cwb.a revPointsGiftcardsConfigRepository) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsConfigRepository, "revPointsGiftcardsConfigRepository");
        this.f178946a = revPointsGiftcardsConfigRepository;
    }

    public final void a(Set config) {
        Intrinsics.checkNotNullParameter(config, "config");
        cwb.c cVar = (cwb.c) this.f178946a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        cVar.f109600b.f("KEY_GIFTCARDS_CONFIG", config);
        cVar.f109599a.G(config, "KEY_GIFTCARDS_CONFIG", kii.e.o(String.class, KTypeProjection.INSTANCE, Set.class));
        cVar.f109601c.k(config);
    }
}
