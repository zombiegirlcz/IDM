package com.revolut.feature.insurance_pet.impl.ui.hub.screen.loader;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionLoadingDelegate;
import com.revolut.feature.insurance_pet.impl.ui.hub.screen.loader.PetHubLoaderFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import pri.e;
import prk.o;
import pz7.b;
import pz7.c;
import te0.w;
import wy7.g;
import wy7.i;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/hub/screen/loader/PetHubLoaderFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lpz7/b;", "Lpz7/c;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetHubLoaderFragment extends BaseLayoutBuilderFragment<b, c> implements c {
    public static final /* synthetic */ int i0 = 0;
    public final Object f0;
    public final FullScreenStateDelegate g0 = new FullScreenStateDelegate();

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f76344h0;

    public PetHubLoaderFragment() {
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: pz7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetHubLoaderFragment f240903b;

            {
                this.f240903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetHubLoaderFragment petHubLoaderFragment = this.f240903b;
                switch (i2) {
                    case 0:
                        int i3 = PetHubLoaderFragment.i0;
                        wy7.e eVar = (wy7.e) ((i) l.q(petHubLoaderFragment));
                        return new wy7.g(eVar.f301128b, eVar.f301129c);
                    default:
                        int i5 = PetHubLoaderFragment.i0;
                        return new j(7, v.k(new ListSubheaderLoadingDelegate(), new ProductSelectionLoadingDelegate(), petHubLoaderFragment.g0), false);
                }
            }
        });
        final int i2 = 1;
        this.f76344h0 = w.y0(new Function0(this) { // from class: pz7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetHubLoaderFragment f240903b;

            {
                this.f240903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetHubLoaderFragment petHubLoaderFragment = this.f240903b;
                switch (i22) {
                    case 0:
                        int i3 = PetHubLoaderFragment.i0;
                        wy7.e eVar = (wy7.e) ((i) l.q(petHubLoaderFragment));
                        return new wy7.g(eVar.f301128b, eVar.f301129c);
                    default:
                        int i5 = PetHubLoaderFragment.i0;
                        return new j(7, v.k(new ListSubheaderLoadingDelegate(), new ProductSelectionLoadingDelegate(), petHubLoaderFragment.g0), false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a((j) this.f76344h0.getValue(), new DefaultItemAnimator(), o.u(), BitmapDescriptorFactory.HUE_RED, 24);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        return (b) ((g) this.f0.getValue()).f301162b.get();
    }
}
