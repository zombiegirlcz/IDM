package kp0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 extends koi.b {
    public final j0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fp0.p f187981g;

    public c0(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LottieAnimationView itemView = new LottieAnimationView(parent.getContext());
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 16.0f);
        itemView.setLayoutParams(new RecyclerView.LayoutParams(iK, iK));
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        super(itemView);
        View view = this.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
        pd.b.h(lottieAnimationView, true);
        this.f = new j0(lottieAnimationView);
        fp0.m mVar = fp0.p.Companion;
        gp0.h hVar = new gp0.h(new gp0.f((gp0.c) null, 3), fp0.f.f137022a);
        mVar.getClass();
        this.f187981g = fp0.m.a(lottieAnimationView, hVar);
    }
}
