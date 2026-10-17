package com.revolut.feature.selfserve.sow.impl.ui.question;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import euf.a;
import f0d.c;
import f0d.f;
import jb3.l;
import kotlin.Metadata;
import pri.e;
import prk.o;
import te0.w;
import vzc.i;
import vzc.m;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/question/SowQuestionFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lf0d/c;", "Lf0d/f;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowQuestionFragment extends BaseLayoutBuilderFragment<c, f> implements f {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f85967h0 = 0;
    public final Object f0 = w.y0(new a(19));
    public final Object g0 = w.y0(new a(20));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a(new j(7, v.k((InputTextDelegate) this.f0.getValue(), (InputChecklistDelegate) this.g0.getValue()), false), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        vzc.c cVar = (vzc.c) ((m) l.q(this));
        return (c) new i(cVar.f293467b, cVar.f293468c, 1).f293500c.get();
    }
}
