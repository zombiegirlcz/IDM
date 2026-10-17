package wik;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f297914a;

    static {
        Intrinsics.checkNotNullParameter("PLAN_HUB_PRESENTED_MODALS", "id");
    }

    public g(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f297914a = personalisationStorage;
    }
}
