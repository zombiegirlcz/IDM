package j83;

import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import i6j.q;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f172118a;

    public o(thf.g transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f172118a = transactionItemMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l((List) iii.c.f(domainState.f172106b, new j7b.l(6), new j7b.m(4), new j75.i(this, 1)), (TextLocalisedQuantityClause) iii.c.f(domainState.f172106b, new j7b.l(5), new j7b.m(3), new q(29)));
    }
}
