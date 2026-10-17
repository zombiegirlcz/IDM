package x0i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f301649a;

    static {
        Intrinsics.checkNotNullParameter("BUY_TAKE_PROFIT_STOP_LOSS_ENABLED", "id");
    }

    public l(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f301649a = personalisationStorage;
    }

    public final boolean a() {
        Boolean bool = (Boolean) this.f301649a.a(new tk0.b("BUY_TAKE_PROFIT_STOP_LOSS_ENABLED"));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
