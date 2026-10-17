package g62;

import a12.o;
import a12.p;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.api.product.ApmIris;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.j f140834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.e f140835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f140836c;
    public final p d;
    public final ty9.b e;

    public n(a12.j apmAreaMapper, a12.e contactsMapper, o transactionsMapper, p backgroundMapper, ty9.b sendFromClipboardItemProvider) {
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(sendFromClipboardItemProvider, "sendFromClipboardItemProvider");
        this.f140834a = apmAreaMapper;
        this.f140835b = contactsMapper;
        this.f140836c = transactionsMapper;
        this.d = backgroundMapper;
        this.e = sendFromClipboardItemProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        a[] elements = {a.Send, a.Pay, a.AddContact};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.add(a12.j.a(this.f140834a, kotlin.collections.d.L(elements)));
        RowDelegate.Model modelA = ty9.b.a(this.e);
        if (modelA != null) {
            eVarB.add(modelA);
        }
        eVarB.addAll((List) iii.c.f(domainState.f140815a, new g3e.h(this, 29), new g5k.f(1), new fyg.b(domainState, this, 8)));
        return new g(u.a(eVarB), ((s12.l) this.d).a(ApmIris.f61811c));
    }
}
