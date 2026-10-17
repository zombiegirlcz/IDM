package eg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf.b f125465a;

    public m(cf.b transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f125465a = transportFactoryProvider;
    }

    public final void a(s0 sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        ((zb.q) ((wb.i) this.f125465a.get())).a("FIREBASE_APPQUALITY_SESSION", new wb.c("json"), new ag.j(this, 17)).a(new wb.a(sessionEvent, wb.e.DEFAULT, null), new pd.h(22));
    }
}
