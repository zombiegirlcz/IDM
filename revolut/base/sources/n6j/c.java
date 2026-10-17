package n6j;

import hlm.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f212830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hlm.c f212831b;

    static {
        Intrinsics.checkNotNullParameter("COMMODITY_ORDER_FLOW_CLOSED_POPUPS", "id");
    }

    public c(mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f212830a = personalisationStorage;
        this.f212831b = d.a();
    }
}
