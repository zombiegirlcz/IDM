package com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.support.impl.R$id;
import com.revolut.feature.support.impl.R$layout;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.CardDeliveryActivity;
import com.revolut.retail.core.ui.activity.BaseDelegatesFragment;
import j90.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import o31.b;
import ob1.e;
import oee.i;
import oee.j;
import p.a;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/support/impl/ui/troubleshooting/carddelivery/details/DetailsStepFragment;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesFragment;", "Loee/i;", "Loee/j;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailsStepFragment extends BaseDelegatesFragment<i, j> implements j {
    public static final /* synthetic */ KProperty[] j0;
    public z4l.j f0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final c f89429b0 = u1.x(this, R$id.recyclerView);
    public final c c0 = u1.x(this, R$id.actionButton);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f89430d0 = w.y0(new e(20));

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f89431e0 = w.y0(new e(21));
    public final Object g0 = w.y0(new e(22));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f89432h0 = w.y0(new e(23));
    public final Object i0 = w.y0(new e(24));

    static {
        h0 h0Var = new h0(DetailsStepFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        p0 p0Var = o0.f186429a;
        j0 = new KProperty[]{p0Var.j(h0Var), a.y(DetailsStepFragment.class, "actionButton", "getActionButton()Lcom/revolut/core_ui_custom_font/TypefaceButton;", 0, p0Var)};
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.fragment_troubleshooting_card_details_step, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f0 = new z4l.j(7, v.k((RowDelegate) this.f89431e0.getValue(), (ListCellDelegate) this.f89430d0.getValue(), (CellDetailsChevronDelegate) this.i0.getValue(), new ListSubheaderDelegate()), false);
        KProperty[] kPropertyArr = j0;
        KProperty kProperty = kPropertyArr[0];
        c cVar = this.f89429b0;
        ((RecyclerView) cVar.getValue(this, kProperty)).addItemDecoration(new b());
        ((RecyclerView) cVar.getValue(this, kPropertyArr[0])).setLayoutManager(new LinearLayoutManager(getContext()));
        ((RecyclerView) cVar.getValue(this, kPropertyArr[0])).setAdapter(this.f0);
        FragmentActivity activity = getActivity();
        Intrinsics.i(activity, "null cannot be cast to non-null type com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.CardDeliveryActivity");
        ((CardDeliveryActivity) activity).c1().c().X(new o10.c(this, 15));
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        FragmentActivity activity = getActivity();
        Intrinsics.i(activity, "null cannot be cast to non-null type com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.CardDeliveryActivity");
        return ((CardDeliveryActivity) activity).c1().f0();
    }
}
