package com.revolut.feature.selfserve.sot.impl.ui.status;

import androidx.recyclerview.widget.DefaultItemAnimator;
import bu7.y;
import bzc.c;
import bzc.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import jb3.l;
import kdh.b;
import kotlin.Metadata;
import pri.e;
import prk.o;
import te0.w;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/status/StatusFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lbzc/c;", "Lbzc/d;", "<init>", "()V", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatusFragment extends BaseLayoutBuilderFragment<c, d> implements d {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f85950h0 = 0;
    public final Object f0 = w.y0(new y(24));
    public final Object g0 = w.y0(new y(25));

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        koi.c cVar = new koi.c(0);
        cVar.a(new ListSubheaderDelegate());
        cVar.a(new PlainTextWarningDelegate());
        cVar.a(new PermissionDelegate());
        cVar.a(new RowLoadingDelegate());
        cVar.a(new TextDelegate());
        cVar.a((ErrorDelegate) this.g0.getValue());
        cVar.a((RowDelegate) this.f0.getValue());
        return new a(new j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        ryc.c cVar = (ryc.c) ((ryc.e) l.q(this));
        return (c) ((e4m.e) new b(cVar.f258309c, cVar.d).f182900c).get();
    }
}
