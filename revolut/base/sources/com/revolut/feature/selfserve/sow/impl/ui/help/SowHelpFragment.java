package com.revolut.feature.selfserve.sow.impl.ui.help;

import androidx.recyclerview.widget.DefaultItemAnimator;
import c0d.c;
import c0d.e;
import c0d.k;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import jb3.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import prk.o;
import te0.w;
import vzc.i;
import vzc.m;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/help/SowHelpFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lc0d/k;", "Lc0d/c;", "<init>", "()V", "Companion", "a", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowHelpFragment extends BaseLayoutBuilderFragment<k, c> implements c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Object f0 = w.y0(new e(0));

    /* JADX INFO: renamed from: com.revolut.feature.selfserve.sow.impl.ui.help.SowHelpFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a(new j(7, u.c((ListCellDelegate) this.f0.getValue()), false), (DefaultItemAnimator) null, o.u(), 88.0f, 2);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        vzc.c cVar = (vzc.c) ((m) l.q(this));
        return (k) new i(cVar.f293467b, cVar.f293468c, 0).f293500c.get();
    }
}
