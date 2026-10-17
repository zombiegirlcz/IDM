package vh2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.api.product.ApmWero;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vgg.a0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.j f289295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a12.e f289296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a12.o f289297c;
    public final xh2.b d;
    public final a12.p e;
    public final ty9.b f;

    public q(a12.j apmAreaMapper, a12.e contactsMapper, a12.o transactionsMapper, xh2.d requestLinksMapper, xh2.b disputesMapper, a12.p backgroundMapper, ty9.b sendFromClipboardItemProvider) {
        Intrinsics.checkNotNullParameter(apmAreaMapper, "apmAreaMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(requestLinksMapper, "requestLinksMapper");
        Intrinsics.checkNotNullParameter(disputesMapper, "disputesMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(sendFromClipboardItemProvider, "sendFromClipboardItemProvider");
        this.f289295a = apmAreaMapper;
        this.f289296b = contactsMapper;
        this.f289297c = transactionsMapper;
        this.d = disputesMapper;
        this.e = backgroundMapper;
        this.f = sendFromClipboardItemProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        a[] elements = {a.Send, a.Request, a.Pay, a.AddContact};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.add(a12.j.a(this.f289295a, kotlin.collections.d.L(elements)));
        RowDelegate.Model modelA = ty9.b.a(this.f);
        if (modelA != null) {
            eVarB.add(modelA);
        }
        eVarB.addAll((List) iii.c.f(domainState.f289270a, new vgk.g(this, 3), new a0(4), new o(domainState, this, 0)));
        return new f(u.a(eVarB), ((s12.l) this.e).a(ApmWero.f61829c));
    }
}
