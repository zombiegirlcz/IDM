package com.revolut.retail.feature.pda.impl.ui.selection;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import kotlin.Lazy;
import kotlin.Metadata;
import os2.a;
import pak.b;
import pak.c;
import pri.e;
import prk.o;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pda/impl/ui/selection/SelectionPdaFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lpak/b;", "Lpak/c;", "<init>", "()V", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectionPdaFragment extends BaseLayoutBuilderFragment<b, c> implements c {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f102392h0 = 0;
    public final Lazy f0 = j.b(new a(this, 21));
    public final Lazy g0 = j.b(new p0l.a(25));

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a(new z4l.j(7, v.k(new ListSubheaderDelegate(), (RowDelegate) this.g0.getValue()), false), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        return (b) ((jak.a) ((nak.a) this.f0.getValue())).A.get();
    }
}
