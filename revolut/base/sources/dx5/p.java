package dx5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements jki.p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f120890a;

    public p(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f120890a = uiKitResources;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        sh5.c cVar = domainState.e;
        Data data = domainState.f120873c;
        return new h(new MoneyClause(domainState.f120871a.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), (Clause) iii.c.f(data, new dwi.f(17), new dug.d(8), new dob.a(5)), (PairedImage) iii.c.f(data, new dwi.f(16), new dug.d(7), new dn8.k(this, domainState, 3)), zi0.c.E(data), cVar != null ? cVar.f263435a : null, domainState.f, (List) iii.c.f(data, new dwi.f(this, 15), new dug.d(6), new dbg.b(this, domainState, 14)));
    }
}
