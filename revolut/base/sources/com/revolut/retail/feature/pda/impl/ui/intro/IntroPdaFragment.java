package com.revolut.retail.feature.pda.impl.ui.intro;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import oak.b;
import oak.c;
import pri.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pda/impl/ui/intro/IntroPdaFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Loak/b;", "Loak/c;", "<init>", "()V", "feature_pda_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntroPdaFragment extends BaseLayoutBuilderFragment<b, c> implements c {
    public static final /* synthetic */ int g0 = 0;
    public final Lazy f0 = j.b(new o10.c(this, 11));

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a(new z4l.j(7, u.c(new FullScreenStateDelegate()), false), (DefaultItemAnimator) null, (List) null, BitmapDescriptorFactory.HUE_RED, 14);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        return (b) ((jak.a) ((nak.a) this.f0.getValue())).z.get();
    }
}
