package e1d;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.semi_independent_onboarding.impl.R$string;
import dt4.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf8.b f121972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f121973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z80.b f121974c;

    public j(hf8.b juniorErrorResolver, f01.c uiKitResources, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(juniorErrorResolver, "juniorErrorResolver");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f121972a = juniorErrorResolver;
        this.f121973b = uiKitResources;
        this.f121974c = phoneToolsProvider;
    }

    public static f a() {
        return new f(new TextLocalisedClause(R$string.guardian_invitation_details_header_title, null, null, 14), new TextLocalisedClause(R$string.guardian_invitation_details_header_subtitle, null, null, 14));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(t1.t(domainState.f121965b, domainState.f121964a), new h(this, 0), new p(this, 21), new dbg.b(this, 20));
    }
}
