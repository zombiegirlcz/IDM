package com.revolut.retail.feature.pda.impl.ui.confirmation;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import kotlin.Lazy;
import kotlin.Metadata;
import maa.r;
import mak.b;
import mak.d;
import pri.e;
import prk.o;
import wp5.y;
import yhm.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pda/impl/ui/confirmation/ConfirmationPdaFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lmak/d;", "Lmak/b;", "<init>", "()V", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmationPdaFragment extends BaseLayoutBuilderFragment<d, b> implements b {
    public static final /* synthetic */ int g0 = 0;
    public final Lazy f0 = j.b(new r(this, 2));

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a(new z4l.j(7, y.w(), false), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        return (d) ((jak.a) ((nak.a) this.f0.getValue())).B.get();
    }
}
