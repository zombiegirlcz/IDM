package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.sa0;
import ip0.t90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0002\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RewardLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/pe;", "Lcom/revolut/core/ui_kit/delegates/qe;", "<init>", "()V", "Companion", "b", "ip0/sa0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardLoadingDelegate extends BaseRecyclerViewDelegate<pe, qe> {

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f53198a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.RewardLoadingDelegate$b$b, reason: collision with other inner class name */
        public static final class C0421b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0421b f53199a = new C0421b();

            private C0421b() {
            }
        }

        public static final class c extends b {
            private c() {
            }
        }

        private b() {
        }
    }

    public RewardLoadingDelegate() {
        super(R$id.internal_reward_loading_delegate_view_type, new t90(7));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), R$drawable.internal_rectangle_gradient_grey, context.getTheme());
        View view = new View(context);
        view.setBackground(drawable);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, kli.a.k(context, 16.0f)));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(kli.a.k(context2, 56.0f), kli.a.k(context2, 56.0f)));
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(kli.a.k(context3, 8.0f), kli.a.k(context3, 8.0f), kli.a.k(context3, 8.0f), marginLayoutParams.bottomMargin);
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(context3);
        shimmerFrameLayout.setLayoutParams(marginLayoutParams);
        shimmerFrameLayout.addView(view);
        Context context4 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        LinearLayout linearLayout = new LinearLayout(context4);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(appCompatImageView);
        linearLayout.addView(shimmerFrameLayout);
        return new qe(linearLayout, appCompatImageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(qe holder, pe data, int i, List payloads) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        if (payloads != null) {
            arrayList = new ArrayList();
            for (Object obj2 : payloads) {
                if (obj2 instanceof sa0) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        if (arrayList.isEmpty()) {
            holder.F(data.f54586b);
            return;
        }
        Iterator it8 = ((Iterable) arrayList).iterator();
        while (it8.hasNext()) {
            if (((sa0) it8.next()).f166332a) {
                holder.F(data.f54586b);
            }
        }
    }
}
