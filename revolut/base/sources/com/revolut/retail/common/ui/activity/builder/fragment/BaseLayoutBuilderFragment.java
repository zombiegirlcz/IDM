package com.revolut.retail.common.ui.activity.builder.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import le.u1;
import pri.e;
import rri.a;
import te0.w;
import w01.k;
import z4l.j;
import zqi.a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\f\b\u0001\u0010\u0005*\u00020\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u00020\u0004B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lpri/e;", "P", "Lrri/a;", "Lzqi/a;", "V", "Lcom/revolut/retail/core/mvp/BaseMvpFragment;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseLayoutBuilderFragment<P extends e, V extends a & zqi.a> extends BaseMvpFragment<P, V> implements zqi.a {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f98556e0 = {o0.f186429a.j(new h0(BaseLayoutBuilderFragment.class, "fullScreenView", "getFullScreenView()Lcom/revolut/core/ui_kit/views/state/FullScreenStateView;", 0))};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ScreenContentRecyclerView f98557b0;
    public j c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f98558d0;

    public BaseLayoutBuilderFragment() {
        u1.x(this, R$id.fullScreenView);
        this.f98558d0 = w.y0(new ie7.a(this, 25));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ipi.a D() {
        return (ipi.a) this.f98558d0.getValue();
    }

    public final RecyclerView E() {
        ScreenContentRecyclerView screenContentRecyclerView = this.f98557b0;
        if (screenContentRecyclerView != null) {
            return screenContentRecyclerView;
        }
        Intrinsics.r("recyclerView");
        throw null;
    }

    public abstract ipi.a F();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ScreenContentRecyclerView screenContentRecyclerView = new ScreenContentRecyclerView(context, null, 6, 0);
        screenContentRecyclerView.setId(D().e ? com.revolut.uicomponent.R$id.recyclerView : R$id.recycler_view);
        screenContentRecyclerView.setOverScrollMode(2);
        screenContentRecyclerView.setLayoutParams(layoutParams);
        if (Float.compare(D().d, 0) != 0) {
            k.c(screenContentRecyclerView, kli.a.k(context, D().d));
            screenContentRecyclerView.setClipToPadding(false);
        }
        Intrinsics.checkNotNullParameter(screenContentRecyclerView, "<set-?>");
        this.f98557b0 = screenContentRecyclerView;
        D().getClass();
        return screenContentRecyclerView;
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ipi.a aVarD = D();
        j jVar = aVarD.f167750a;
        RecyclerView.ItemAnimator itemAnimator = aVarD.f167751b;
        List list = aVarD.f167752c;
        this.c0 = jVar;
        vyl.a.a(E(), jVar, itemAnimator, list, null, 24);
        D().getClass();
    }

    public void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        D().getClass();
        j jVar = this.c0;
        if (jVar == null) {
            Intrinsics.r("adapter");
            throw null;
        }
        getActivity();
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        jVar.c(items);
    }
}
