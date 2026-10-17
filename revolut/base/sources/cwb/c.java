package cwb;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements a {

    @NotNull
    public static final b Companion = new b();
    public static final Type d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f109599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f109600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f109601c;

    static {
        Type type = new TypeToken<Set<? extends String>>() { // from class: com.revolut.feature.rev_points.giftcards.impl.data.repository.config.RevPointsGiftcardsConfigRepositoryImpl$Companion$LIST_STRING_BOOLEAN_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        d = type;
    }

    public c(j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f109599a = storage;
        this.f109600b = memoryCache;
        this.f109601c = q.b(0, 6, null);
    }
}
