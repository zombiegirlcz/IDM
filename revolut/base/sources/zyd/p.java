package zyd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zul.l0;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f326452a;

    public p(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f326452a = uiKitResources;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(domainState.f326437a, new l0(20), new zs4.d(20), new zhl.l(domainState, this, 12)), domainState.f326439c != null);
    }
}
