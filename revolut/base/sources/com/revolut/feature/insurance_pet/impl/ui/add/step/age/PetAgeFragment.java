package com.revolut.feature.insurance_pet.impl.ui.add.step.age;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.insurance_pet.impl.ui.add.step.age.PetAgeFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import efm.r;
import ihm.f;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import prk.o;
import pu4.d;
import px7.c;
import px7.h;
import te0.w;
import v0.a;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/add/step/age/PetAgeFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lpx7/h;", "Lpx7/c;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetAgeFragment extends BaseLayoutBuilderFragment<h, c> implements c {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f76230k0 = 0;
    public final Object f0;
    public final f g0 = a.d("create(...)");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final d f76231h0 = new d(this, 10);
    public final Object i0;
    public final Object j0;

    public PetAgeFragment() {
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: px7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetAgeFragment f240572b;

            {
                this.f240572b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetAgeFragment petAgeFragment = this.f240572b;
                switch (i2) {
                    case 0:
                        int i3 = PetAgeFragment.f76230k0;
                        ox7.a aVar = (ox7.a) ((ox7.h) l.q(petAgeFragment));
                        return new ox7.c(aVar.f230644b, aVar.f230645c);
                    case 1:
                        return new InputTextDelegate(petAgeFragment.f76231h0);
                    default:
                        return new j(7, u.c((InputTextDelegate) petAgeFragment.i0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.i0 = w.y0(new Function0(this) { // from class: px7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetAgeFragment f240572b;

            {
                this.f240572b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetAgeFragment petAgeFragment = this.f240572b;
                switch (i22) {
                    case 0:
                        int i3 = PetAgeFragment.f76230k0;
                        ox7.a aVar = (ox7.a) ((ox7.h) l.q(petAgeFragment));
                        return new ox7.c(aVar.f230644b, aVar.f230645c);
                    case 1:
                        return new InputTextDelegate(petAgeFragment.f76231h0);
                    default:
                        return new j(7, u.c((InputTextDelegate) petAgeFragment.i0.getValue()), false);
                }
            }
        });
        final int i3 = 2;
        this.j0 = w.y0(new Function0(this) { // from class: px7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetAgeFragment f240572b;

            {
                this.f240572b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PetAgeFragment petAgeFragment = this.f240572b;
                switch (i22) {
                    case 0:
                        int i32 = PetAgeFragment.f76230k0;
                        ox7.a aVar = (ox7.a) ((ox7.h) l.q(petAgeFragment));
                        return new ox7.c(aVar.f230644b, aVar.f230645c);
                    case 1:
                        return new InputTextDelegate(petAgeFragment.f76231h0);
                    default:
                        return new j(7, u.c((InputTextDelegate) petAgeFragment.i0.getValue()), false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a((j) this.j0.getValue(), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 26);
    }

    @Override // px7.c
    public final r s0() {
        r rVarDistinctUntilChanged = this.g0.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        return (h) ((ox7.c) this.f0.getValue()).f230679c.get();
    }
}
