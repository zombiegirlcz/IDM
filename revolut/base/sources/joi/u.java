package joi;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ValueAnimator f177132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f177133c;
    public final hoi.n d;
    public final ArrayList e;
    public final View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bib.b f177134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hoi.p f177135h;
    public final r10.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f177136j;
    public boolean k;

    public u(String sectionKey, ValueAnimator animator, List holders, hoi.n transition, ArrayList revealClipStates, View view, bib.b finalHeaderOutlinePositionProvider, hoi.p owner, r10.f headerOutlineScheduler, x sectionRevealClipper) {
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(holders, "holders");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(revealClipStates, "revealClipStates");
        Intrinsics.checkNotNullParameter(finalHeaderOutlinePositionProvider, "finalHeaderOutlinePositionProvider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(headerOutlineScheduler, "headerOutlineScheduler");
        Intrinsics.checkNotNullParameter(sectionRevealClipper, "sectionRevealClipper");
        this.f177131a = sectionKey;
        this.f177132b = animator;
        this.f177133c = holders;
        this.d = transition;
        this.e = revealClipStates;
        this.f = view;
        this.f177134g = finalHeaderOutlinePositionProvider;
        this.f177135h = owner;
        this.i = headerOutlineScheduler;
        this.f177136j = sectionRevealClipper;
    }

    public final void a(boolean z, boolean z3, boolean z4) {
        if (this.k) {
            return;
        }
        this.k = true;
        if (z) {
            ValueAnimator valueAnimator = this.f177132b;
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        this.i.O(this.f, this.f177131a, (qv0.c) this.f177134g.invoke());
        List list = this.f177133c;
        int size = list.size();
        int i = 0;
        while (true) {
            hoi.p pVar = this.f177135h;
            if (i >= size) {
                pVar.d(list);
                return;
            }
            View view = ((RecyclerView.ViewHolder) list.get(i)).itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            s clipState = (s) this.e.get(i);
            this.f177136j.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clipState, "clipState");
            view.setClipToOutline(clipState != null ? clipState.f177128b : false);
            view.setOutlineProvider(clipState != null ? clipState.f177129c : null);
            view.invalidateOutline();
            view.setClipBounds(clipState != null ? clipState.f177127a : null);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setAlpha(1.0f);
            if (z3) {
                this.d.a((RecyclerView.ViewHolder) list.get(i), pVar);
            }
            if (z4) {
                ((RecyclerView.ViewHolder) list.get(i)).setIsRecyclable(true);
            }
            i++;
        }
    }
}
