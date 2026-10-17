package ahe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements f {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f5005a;

    static {
        Intrinsics.checkNotNullParameter("HOME_TOTAL_WEALTH_TILE_ORDER", "id");
    }

    public j(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f5005a = personalisationStorage;
    }
}
