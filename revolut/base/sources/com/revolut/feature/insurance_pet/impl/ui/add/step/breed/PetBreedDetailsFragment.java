package com.revolut.feature.insurance_pet.impl.ui.add.step.breed;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsFragment;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import efm.r;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import prk.o;
import rwg.e0;
import rx7.c;
import rx7.e;
import te0.w;
import v0.a;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/add/step/breed/PetBreedDetailsFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lrx7/c;", "Lrx7/e;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetBreedDetailsFragment extends BaseLayoutBuilderFragment<c, e> implements e {
    public static final /* synthetic */ int m0 = 0;
    public final Object f0;
    public final f g0 = a.d("create(...)");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f76235h0 = w.y0(new e0(4));
    public final Object i0 = w.y0(new e0(5));
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f76236k0;
    public final Object l0;

    public PetBreedDetailsFragment() {
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: rx7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetBreedDetailsFragment f258065b;

            {
                this.f258065b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetBreedDetailsFragment petBreedDetailsFragment = this.f258065b;
                switch (i2) {
                    case 0:
                        int i3 = PetBreedDetailsFragment.m0;
                        ox7.a aVar = (ox7.a) ((ox7.h) jb3.l.q(petBreedDetailsFragment));
                        return new ox7.e(aVar.f230644b, aVar.f230645c);
                    case 1:
                        int i5 = PetBreedDetailsFragment.m0;
                        return new InputTextDelegate(new rl8.d(petBreedDetailsFragment, 19));
                    case 2:
                        int i6 = PetBreedDetailsFragment.m0;
                        return new z4l.j(7, v.k((InputTextDelegate) petBreedDetailsFragment.j0.getValue(), (InputChecklistDelegate) petBreedDetailsFragment.f76235h0.getValue()), false);
                    default:
                        int i21 = PetBreedDetailsFragment.m0;
                        return u.c((RowDelegate) petBreedDetailsFragment.i0.getValue());
                }
            }
        });
        final int i2 = 1;
        this.j0 = w.y0(new Function0(this) { // from class: rx7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetBreedDetailsFragment f258065b;

            {
                this.f258065b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetBreedDetailsFragment petBreedDetailsFragment = this.f258065b;
                switch (i22) {
                    case 0:
                        int i3 = PetBreedDetailsFragment.m0;
                        ox7.a aVar = (ox7.a) ((ox7.h) jb3.l.q(petBreedDetailsFragment));
                        return new ox7.e(aVar.f230644b, aVar.f230645c);
                    case 1:
                        int i5 = PetBreedDetailsFragment.m0;
                        return new InputTextDelegate(new rl8.d(petBreedDetailsFragment, 19));
                    case 2:
                        int i6 = PetBreedDetailsFragment.m0;
                        return new z4l.j(7, v.k((InputTextDelegate) petBreedDetailsFragment.j0.getValue(), (InputChecklistDelegate) petBreedDetailsFragment.f76235h0.getValue()), false);
                    default:
                        int i21 = PetBreedDetailsFragment.m0;
                        return u.c((RowDelegate) petBreedDetailsFragment.i0.getValue());
                }
            }
        });
        final int i3 = 2;
        this.f76236k0 = w.y0(new Function0(this) { // from class: rx7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetBreedDetailsFragment f258065b;

            {
                this.f258065b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PetBreedDetailsFragment petBreedDetailsFragment = this.f258065b;
                switch (i22) {
                    case 0:
                        int i32 = PetBreedDetailsFragment.m0;
                        ox7.a aVar = (ox7.a) ((ox7.h) jb3.l.q(petBreedDetailsFragment));
                        return new ox7.e(aVar.f230644b, aVar.f230645c);
                    case 1:
                        int i5 = PetBreedDetailsFragment.m0;
                        return new InputTextDelegate(new rl8.d(petBreedDetailsFragment, 19));
                    case 2:
                        int i6 = PetBreedDetailsFragment.m0;
                        return new z4l.j(7, v.k((InputTextDelegate) petBreedDetailsFragment.j0.getValue(), (InputChecklistDelegate) petBreedDetailsFragment.f76235h0.getValue()), false);
                    default:
                        int i21 = PetBreedDetailsFragment.m0;
                        return u.c((RowDelegate) petBreedDetailsFragment.i0.getValue());
                }
            }
        });
        final int i5 = 3;
        this.l0 = w.y0(new Function0(this) { // from class: rx7.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetBreedDetailsFragment f258065b;

            {
                this.f258065b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PetBreedDetailsFragment petBreedDetailsFragment = this.f258065b;
                switch (i22) {
                    case 0:
                        int i32 = PetBreedDetailsFragment.m0;
                        ox7.a aVar = (ox7.a) ((ox7.h) jb3.l.q(petBreedDetailsFragment));
                        return new ox7.e(aVar.f230644b, aVar.f230645c);
                    case 1:
                        int i59 = PetBreedDetailsFragment.m0;
                        return new InputTextDelegate(new rl8.d(petBreedDetailsFragment, 19));
                    case 2:
                        int i6 = PetBreedDetailsFragment.m0;
                        return new z4l.j(7, v.k((InputTextDelegate) petBreedDetailsFragment.j0.getValue(), (InputChecklistDelegate) petBreedDetailsFragment.f76235h0.getValue()), false);
                    default:
                        int i21 = PetBreedDetailsFragment.m0;
                        return u.c((RowDelegate) petBreedDetailsFragment.i0.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a((j) this.f76236k0.getValue(), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 26);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // rx7.e
    public final f K0() {
        return ((RowDelegate) this.i0.getValue()).f53218h;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment, com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((b) ((ox7.e) this.f0.getValue()).f230683b.f230649l.get()).Y("BREED_SELECTION_DIALOG_DELEGATE_KEY", (List) this.l0.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // rx7.e
    public final f q1() {
        return ((InputChecklistDelegate) this.f76235h0.getValue()).f52518c;
    }

    @Override // rx7.e
    public final r t1() {
        r rVarDistinctUntilChanged = this.g0.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // rx7.e
    public final r y0() {
        ?? r06 = this.j0;
        r rVarMerge = r.merge(((InputTextDelegate) r06.getValue()).f52575g.f121375b, ((InputTextDelegate) r06.getValue()).i.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        return (c) ((ox7.e) this.f0.getValue()).f230684c.get();
    }
}
