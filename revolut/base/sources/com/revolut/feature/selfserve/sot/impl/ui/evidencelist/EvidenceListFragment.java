package com.revolut.feature.selfserve.sot.impl.ui.evidencelist;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import jb3.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pak.h;
import pri.e;
import prk.o;
import te0.w;
import ux7.g;
import uyc.b;
import uyc.c;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/evidencelist/EvidenceListFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Luyc/b;", "Luyc/c;", "<init>", "()V", "Companion", "a", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EvidenceListFragment extends BaseLayoutBuilderFragment<b, c> implements c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Object f0 = w.y0(new g(1));

    /* JADX INFO: renamed from: com.revolut.feature.selfserve.sot.impl.ui.evidencelist.EvidenceListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        koi.c cVar = new koi.c(0);
        cVar.a(new ListSubheaderDelegate());
        cVar.a(new RowLoadingDelegate());
        cVar.a(new PlainTextDelegate());
        cVar.a((RowDelegate) this.f0.getValue());
        return new a(new j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), 88.0f, 2);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        ryc.c cVar = (ryc.c) ((ryc.e) l.q(this));
        ryc.b bVar = cVar.f258309c;
        ryc.c cVar2 = cVar.d;
        h hVar = new h();
        int i = 4;
        hVar.f234573b = e4m.b.b(new r7d.w(bVar, cVar2, hVar, 1, i));
        return (b) e4m.b.b(new r7d.w(bVar, cVar2, hVar, 0, i)).get();
    }
}
