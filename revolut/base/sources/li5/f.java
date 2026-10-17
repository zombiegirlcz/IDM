package li5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f195418a;

    static {
        Intrinsics.checkNotNullParameter("CRYPTO_TAB_VISIBILITY", "id");
    }

    public f(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f195418a = personalisationStorage;
    }
}
