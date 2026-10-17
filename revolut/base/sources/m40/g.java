package m40;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements n {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f202618a;

    public g(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f202618a = uiKitResources;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(domainState.f202616a, new m30.c(21), new lxi.g(28), new lk7.n(this, 19)), new lw0.a(new TextLocalisedClause(R$string.chat_call_categorySelector_title, null, null, 14), null, null, null, false, 30));
    }
}
