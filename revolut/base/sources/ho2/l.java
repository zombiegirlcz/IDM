package ho2;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit_resources.R$attr;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f154217a;

    public l(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f154217a = phoneToolsProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f154206c;
        fj0.a aVar = fj0.b.Companion;
        String str2 = domainState.f154205b;
        aVar.getClass();
        Serializable serializableB = fj0.a.b(str2);
        yhm.o.b(serializableB);
        wi0.b bVar = domainState.f154204a;
        ka kaVar = new ka("ID_ITEM_PHONE", str, new Pair(serializableB, bVar), null, null, null, false, true, 7928);
        int i = R$attr.uikit_dp0;
        yp0.b.l(kaVar, 0, 0, i, i, null, false, 51);
        return new h(u.c(kaVar), this.f154217a.k(domainState.f154206c, bVar.f297794a));
    }
}
