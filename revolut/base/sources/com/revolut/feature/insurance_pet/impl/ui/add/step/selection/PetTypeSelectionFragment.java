package com.revolut.feature.insurance_pet.impl.ui.add.step.selection;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.insurance_pet.impl.ui.add.step.selection.PetTypeSelectionFragment;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ox7.g;
import pri.e;
import prk.o;
import te0.w;
import wq1.a;
import wx7.c;
import wx7.j;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/add/step/selection/PetTypeSelectionFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lwx7/j;", "Lwx7/c;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetTypeSelectionFragment extends BaseLayoutBuilderFragment<j, c> implements c {
    public static final /* synthetic */ int i0 = 0;
    public final Object f0;
    public final Object g0 = w.y0(new a(29));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f76238h0;

    public PetTypeSelectionFragment() {
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: wx7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetTypeSelectionFragment f300773b;

            {
                this.f300773b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PetTypeSelectionFragment petTypeSelectionFragment = this.f300773b;
                switch (i2) {
                    case 0:
                        int i3 = PetTypeSelectionFragment.i0;
                        ox7.a aVar = (ox7.a) ((ox7.h) l.q(petTypeSelectionFragment));
                        return new ox7.g(aVar.f230644b, aVar.f230645c);
                    default:
                        int i5 = PetTypeSelectionFragment.i0;
                        return new z4l.j(7, u.c((ProductSelectionDelegate) petTypeSelectionFragment.g0.getValue()), false);
                }
            }
        });
        final int i2 = 1;
        this.f76238h0 = w.y0(new Function0(this) { // from class: wx7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PetTypeSelectionFragment f300773b;

            {
                this.f300773b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PetTypeSelectionFragment petTypeSelectionFragment = this.f300773b;
                switch (i22) {
                    case 0:
                        int i3 = PetTypeSelectionFragment.i0;
                        ox7.a aVar = (ox7.a) ((ox7.h) l.q(petTypeSelectionFragment));
                        return new ox7.g(aVar.f230644b, aVar.f230645c);
                    default:
                        int i5 = PetTypeSelectionFragment.i0;
                        return new z4l.j(7, u.c((ProductSelectionDelegate) petTypeSelectionFragment.g0.getValue()), false);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a((z4l.j) this.f76238h0.getValue(), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 26);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment, com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(contextRequireContext, 2, 12);
        z4l.j adapter = (z4l.j) this.f76238h0.getValue();
        Intrinsics.checkNotNullParameter(screenGridLayoutManager, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        screenGridLayoutManager.setSpanSizeLookup(new bx7.a(adapter, screenGridLayoutManager, screenGridLayoutManager));
        E().setLayoutManager(screenGridLayoutManager);
        RecyclerView recyclerViewE = E();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        int iK = kli.a.k(contextRequireContext2, 12.0f);
        Intrinsics.checkNotNullParameter(recyclerViewE, "<this>");
        recyclerViewE.setPadding(iK, recyclerViewE.getPaddingTop(), recyclerViewE.getPaddingRight(), recyclerViewE.getPaddingBottom());
        RecyclerView recyclerViewE2 = E();
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        int iK2 = kli.a.k(contextRequireContext3, 12.0f);
        Intrinsics.checkNotNullParameter(recyclerViewE2, "<this>");
        recyclerViewE2.setPadding(recyclerViewE2.getPaddingLeft(), recyclerViewE2.getPaddingTop(), iK2, recyclerViewE2.getPaddingBottom());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        return (j) ((g) this.f0.getValue()).f230699c.get();
    }
}
