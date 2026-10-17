package com.revolut.feature.selfserve.sot.impl.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.selfserve.sot.impl.R$id;
import com.revolut.feature.selfserve.sot.impl.R$layout;
import com.revolut.retail.core.mvp.BaseMvpFragment;
import j90.c;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import org.jetbrains.annotations.NotNull;
import p.a;
import pri.e;
import te0.w;
import w01.k;
import z4l.j;
import zh0.b;
import zx0.h;
import zyc.d;
import zyc.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/home/SotHomeFragment;", "Lcom/revolut/retail/core/mvp/BaseMvpFragment;", "Lzyc/d;", "Lzyc/f;", "<init>", "()V", "Companion", "a", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SotHomeFragment extends BaseMvpFragment<d, f> implements f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty[] f0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final c f85947b0 = u1.x(this, R$id.recyclerView);
    public final c c0 = u1.x(this, R$id.navBarWithBigTile);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f85948d0 = w.y0(new h(3));

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f85949e0 = w.y0(new b(this, 23));

    /* JADX INFO: renamed from: com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        h0 h0Var = new h0(SotHomeFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        p0 p0Var = o0.f186429a;
        f0 = new KProperty[]{p0Var.j(h0Var), a.y(SotHomeFragment.class, "navBarWithBigTile", "getNavBarWithBigTile()Lcom/revolut/core/ui_kit/views/navbar/NavBarWithBigTile;", 0, p0Var)};
        INSTANCE = new Companion();
    }

    public final NavBarWithBigTile D() {
        return (NavBarWithBigTile) this.c0.getValue(this, f0[1]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_sot_home, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        KProperty[] kPropertyArr = f0;
        KProperty kProperty = kPropertyArr[0];
        c cVar = this.f85947b0;
        vyl.a.b((RecyclerView) cVar.getValue(this, kProperty), (j) this.f85949e0.getValue(), null, new o31.b(), 10);
        RecyclerView recyclerView = (RecyclerView) cVar.getValue(this, kPropertyArr[0]);
        Context context = getContext();
        k.c(recyclerView, context != null ? kli.a.k(context, 88.0f) : 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.f85949e0.getValue()).c(items);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        ryc.c cVar = (ryc.c) ((ryc.e) l.q(this));
        return (d) ((e4m.e) new jpc.e(cVar.f258309c, cVar.d).d).get();
    }
}
