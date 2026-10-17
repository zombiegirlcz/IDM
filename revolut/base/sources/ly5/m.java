package ly5;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f200704a;

    public m(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f200704a = uiKitResources;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f200700a, new lv9.c(this, 26), new lxi.g(4), new lk7.n(this, 11));
    }
}
