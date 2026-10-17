package com.revolut.feature.selfserve.sot.impl.ui.evidencetypes;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import jb3.l;
import k7i.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import pri.e;
import prk.o;
import te0.w;
import wp0.b;
import wyc.c;
import wyc.d;
import wyc.u;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/evidencetypes/EvidenceTypesFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lwyc/c;", "Lwyc/d;", "<init>", "()V", "Companion", "a", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EvidenceTypesFragment extends BaseLayoutBuilderFragment<c, d> implements d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Object f0 = w.y0(new u(0));
    public final Object g0 = w.y0(new u(1));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f85908h0 = w.y0(new b(this, 12));

    /* JADX INFO: renamed from: com.revolut.feature.selfserve.sot.impl.ui.evidencetypes.EvidenceTypesFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        koi.c cVar = new koi.c(0);
        cVar.a(new ListSubheaderDelegate());
        cVar.a(new PlainTextWarningDelegate());
        cVar.a(new RowLoadingDelegate());
        cVar.a((RowDelegate) this.f0.getValue());
        cVar.a((SelectableDelegate) this.f85908h0.getValue());
        cVar.a((ErrorDelegate) this.g0.getValue());
        return new a(new j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), 88.0f, 2);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        ryc.c cVar = (ryc.c) ((ryc.e) l.q(this));
        return (c) ((e4m.e) new i(cVar.f258309c, cVar.d).f182070c).get();
    }
}
