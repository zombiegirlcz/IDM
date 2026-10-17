package com.revolut.feature.insurance_pet.impl.ui.add.step.detail;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.insurance_pet.impl.ui.add.step.detail.PetBaseDetailsFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import efm.r;
import ihm.f;
import ipi.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import pri.e;
import prk.o;
import te0.w;
import ux7.b;
import ux7.d;
import ux7.g;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/add/step/detail/PetBaseDetailsFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lux7/b;", "Lux7/d;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetBaseDetailsFragment extends BaseLayoutBuilderFragment<b, d> implements d {
    public static final /* synthetic */ int j0 = 0;
    public final Object f0;
    public final Object g0 = w.y0(new us4.b(29));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f76237h0 = w.y0(new g(0));
    public final Object i0;

    public PetBaseDetailsFragment() {
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: ux7.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetBaseDetailsFragment f283895b;

            {
                this.f283895b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetBaseDetailsFragment petBaseDetailsFragment = this.f283895b;
                switch (i2) {
                    case 0:
                        int i3 = PetBaseDetailsFragment.j0;
                        ox7.a aVar = (ox7.a) ((ox7.h) jb3.l.q(petBaseDetailsFragment));
                        return new ox7.d(aVar.f230644b, aVar.f230645c);
                    default:
                        int i5 = PetBaseDetailsFragment.j0;
                        return new z4l.j(7, v.k((InputTextDelegate) petBaseDetailsFragment.g0.getValue(), (InputChecklistDelegate) petBaseDetailsFragment.f76237h0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.i0 = w.y0(new Function0(this) { // from class: ux7.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetBaseDetailsFragment f283895b;

            {
                this.f283895b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetBaseDetailsFragment petBaseDetailsFragment = this.f283895b;
                switch (i22) {
                    case 0:
                        int i3 = PetBaseDetailsFragment.j0;
                        ox7.a aVar = (ox7.a) ((ox7.h) jb3.l.q(petBaseDetailsFragment));
                        return new ox7.d(aVar.f230644b, aVar.f230645c);
                    default:
                        int i5 = PetBaseDetailsFragment.j0;
                        return new z4l.j(7, v.k((InputTextDelegate) petBaseDetailsFragment.g0.getValue(), (InputChecklistDelegate) petBaseDetailsFragment.f76237h0.getValue()), false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a((j) this.i0.getValue(), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 26);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ux7.d
    public final r X0() {
        return ((InputTextDelegate) this.g0.getValue()).e.f121375b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ux7.d
    public final f y1() {
        return ((InputChecklistDelegate) this.f76237h0.getValue()).f52518c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        return (b) ((ox7.d) this.f0.getValue()).f230681b.get();
    }
}
