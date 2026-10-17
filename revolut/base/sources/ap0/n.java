package ap0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ap0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import com.revolut.core.ui_kit.chat.prompt.ChatSuggestionRowDelegate;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq0.r;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ro0.g0;
import yhm.m;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends FrameLayout implements oq0.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f8043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatSuggestionRowDelegate f8044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final koi.h f8045c;
    public final RecyclerView d;
    public final boolean e;
    public RenderEffect[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AnimatorSet f8046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8047h;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(n nVar, ChatPromptSuggestion chatPromptSuggestion) {
        g gVar;
        Intrinsics.h(chatPromptSuggestion);
        List<g> rowHolders = nVar.getRowHolders();
        int size = rowHolders.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = rowHolders.get(i2);
            ChatPromptSuggestion chatPromptSuggestion2 = gVar.i;
            if (Intrinsics.f(chatPromptSuggestion2 != null ? chatPromptSuggestion2.f51531a : null, chatPromptSuggestion.f51531a)) {
                break;
            }
            i2++;
        }
        g gVar2 = gVar;
        View view = gVar2 != null ? gVar2.itemView : null;
        AnimatorSet animatorSet = nVar.f8046g;
        if ((animatorSet != null ? animatorSet.isStarted() : false) || view == null) {
            nVar.f8043a.onNext(chatPromptSuggestion);
        } else {
            Interpolator interpolator = r.e;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getScaleX(), 1.05f);
            valueAnimatorOfFloat.setDuration(150L);
            Interpolator interpolator2 = interpolator;
            valueAnimatorOfFloat.setInterpolator(interpolator2);
            p pVar = new p(valueAnimatorOfFloat, view, i);
            valueAnimatorOfFloat.addListener(pVar);
            valueAnimatorOfFloat.addUpdateListener(pVar);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.05f, 1.0f);
            valueAnimatorOfFloat2.setDuration(150L);
            valueAnimatorOfFloat2.setInterpolator(interpolator2);
            q qVar = new q(valueAnimatorOfFloat2, nVar, chatPromptSuggestion, view, 0);
            valueAnimatorOfFloat2.addListener(qVar);
            valueAnimatorOfFloat2.addUpdateListener(qVar);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            AnimatorSet animatorSet3 = nVar.f8046g;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            nVar.f8046g = animatorSet2;
            animatorSet2.start();
        }
        return Unit.f186387a;
    }

    private final List<g> getRowHolders() {
        RecyclerView recyclerView = this.d;
        ArrayList arrayList = new ArrayList(recyclerView.getChildCount());
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
            if (childViewHolder.getBindingAdapterPosition() != -1 && (childViewHolder instanceof g)) {
                arrayList.add(childViewHolder);
            }
        }
        return arrayList;
    }

    public final void b(g gVar, int i) {
        int i2;
        int i3;
        if (this.e) {
            if (this.f == null) {
                this.f = new RenderEffect[11];
            }
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr == null || gVar.f8030h == (i3 = (i2 = i / 2) * 2)) {
                return;
            }
            RenderEffect renderEffectCreateBlurEffect = renderEffectArr[i2];
            if (renderEffectCreateBlurEffect == null && i3 != 0) {
                float f = i3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP);
                RenderEffect[] renderEffectArr2 = this.f;
                Intrinsics.h(renderEffectArr2);
                renderEffectArr2[i2] = renderEffectCreateBlurEffect;
            }
            gVar.f8030h = i3;
            gVar.itemView.setRenderEffect(renderEffectCreateBlurEffect);
        }
    }

    public final void c(hoi.f fVar) {
        if (this.f8047h) {
            this.f8047h = false;
            List<g> rowHolders = getRowHolders();
            long j2 = !isLaidOut() ? 0L : 200L;
            List<g> list = rowHolders;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                final g gVar = (g) obj2;
                long j3 = (long) (((long) i) * j2 * 0.4f);
                ArrayList arrayList2 = arrayList;
                final View itemView = gVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                valueAnimatorOfFloat.setDuration(j2);
                valueAnimatorOfFloat.setStartDelay(j3);
                valueAnimatorOfFloat.setInterpolator(r.e);
                final float alpha = itemView.getAlpha();
                final int i3 = gVar.f8030h;
                final float translationY = itemView.getTranslationY();
                final float scaleX = itemView.getScaleX();
                final float scaleY = itemView.getScaleY();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                final float fL = kli.a.l(context, 20.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ap0.l
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        n.a aVar = n.Companion;
                        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
                        float fLerp = AnimationUtils.lerp(alpha, BitmapDescriptorFactory.HUE_RED, fFloatValue);
                        View view = itemView;
                        view.setAlpha(fLerp);
                        view.setTranslationY(AnimationUtils.lerp(translationY, fL, fFloatValue));
                        view.setScaleX(AnimationUtils.lerp(scaleX, 1.0f, fFloatValue));
                        view.setScaleY(AnimationUtils.lerp(scaleY, 0.9f, fFloatValue));
                        this.b(gVar, AnimationUtils.lerp(i3, 20, fFloatValue));
                    }
                });
                arrayList2.add(valueAnimatorOfFloat);
                arrayList = arrayList2;
                i = i2;
            }
            ArrayList arrayList3 = arrayList;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new o(this, 1));
            animatorSet.addListener(new o(this, 0));
            animatorSet.playTogether(arrayList3);
            if (arrayList3.isEmpty()) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                valueAnimatorOfFloat2.setDuration(0L);
                Unit unit = Unit.f186387a;
                animatorSet.playTogether(valueAnimatorOfFloat2);
            }
            if (fVar != null) {
                animatorSet.addListener(fVar);
            }
            AnimatorSet animatorSet2 = this.f8046g;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.f8046g = animatorSet;
            animatorSet.start();
        }
    }

    public final void d() {
        float f;
        if (this.f8047h) {
            return;
        }
        int i = 1;
        this.f8047h = true;
        List<g> rowHolders = getRowHolders();
        long j2 = !isLaidOut() ? 0L : 230L;
        List<g> list = rowHolders;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        int i2 = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            g gVar = (g) next;
            long j3 = ((long) (v.j(rowHolders) - i2)) * 100;
            View itemView = gVar.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            int i5 = i;
            if (getVisibility() == 4) {
                itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
                itemView.setScaleX(0.99f);
                itemView.setScaleY(0.99f);
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                f = 0.0f;
                itemView.setTranslationY(kli.a.l(context, 30.0f));
                b(gVar, 20);
            } else {
                f = 0.0f;
            }
            float alpha = itemView.getAlpha();
            float scaleY = itemView.getScaleY();
            float translationY = itemView.getTranslationY();
            int i6 = gVar.f8030h;
            Interpolator interpolator = r.f;
            float[] fArr = new float[2];
            fArr[0] = alpha;
            fArr[i5] = 1.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            valueAnimatorOfFloat.setDuration(j2);
            Interpolator interpolator2 = interpolator;
            valueAnimatorOfFloat.setInterpolator(interpolator2);
            List<g> list2 = rowHolders;
            Iterator it9 = it8;
            valueAnimatorOfFloat.addUpdateListener(new m(itemView, 4));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i6, 0);
            valueAnimatorOfInt.setDuration(j2);
            valueAnimatorOfInt.setInterpolator(interpolator2);
            valueAnimatorOfInt.addUpdateListener(new androidx.core.view.j(this, gVar, i5));
            Interpolator interpolator3 = r.e;
            Interpolator interpolator4 = r.f177394c;
            float[] fArr2 = new float[2];
            fArr2[0] = scaleY;
            fArr2[i5] = 1.01f;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
            valueAnimatorOfFloat2.setDuration(j2);
            Interpolator interpolator5 = interpolator3;
            valueAnimatorOfFloat2.setInterpolator(interpolator5);
            valueAnimatorOfFloat2.addUpdateListener(new m(itemView, 5));
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.01f, 0.99f);
            valueAnimatorOfFloat3.setDuration(j2);
            valueAnimatorOfFloat3.setInterpolator(interpolator5);
            valueAnimatorOfFloat3.addUpdateListener(new m(itemView, 6));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.99f, 1.0f);
            valueAnimatorOfFloat4.setDuration(j2);
            Interpolator interpolator6 = interpolator4;
            valueAnimatorOfFloat4.setInterpolator(interpolator6);
            valueAnimatorOfFloat4.addUpdateListener(new m(itemView, 7));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            float f4 = -kli.a.l(context2, 6.0f);
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(translationY, f4);
            valueAnimatorOfFloat5.setDuration(j2);
            valueAnimatorOfFloat5.setInterpolator(interpolator5);
            valueAnimatorOfFloat5.addUpdateListener(new m(itemView, 8));
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(f4, f);
            float f5 = j2;
            valueAnimatorOfFloat6.setStartDelay((long) (0.43f * f5));
            valueAnimatorOfFloat6.setDuration((long) (f5 * 1.4f));
            valueAnimatorOfFloat6.setInterpolator(interpolator6);
            valueAnimatorOfFloat6.addUpdateListener(new m(itemView, 9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(valueAnimatorOfFloat5, valueAnimatorOfFloat6);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setStartDelay(j3);
            animatorSet3.playTogether(valueAnimatorOfFloat, valueAnimatorOfInt, animatorSet, animatorSet2);
            arrayList.add(animatorSet3);
            i2 = i3;
            rowHolders = list2;
            it8 = it9;
            i = 1;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(arrayList);
        if (arrayList.isEmpty()) {
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            valueAnimatorOfFloat7.setDuration(0L);
            Unit unit = Unit.f186387a;
            animatorSet4.playTogether(valueAnimatorOfFloat7);
        }
        animatorSet4.addListener(new o(this, 2));
        AnimatorSet animatorSet5 = this.f8046g;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        this.f8046g = animatorSet4;
        animatorSet4.start();
    }

    public final void e() {
        AnimatorSet animatorSet = this.f8046g;
        int i = 0;
        if (animatorSet != null ? animatorSet.isStarted() : false) {
            return;
        }
        List<g> rowHolders = getRowHolders();
        if (rowHolders.isEmpty()) {
            return;
        }
        List<g> list = rowHolders;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        int i2 = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            int iJ = v.j(rowHolders);
            View itemView = ((g) next).itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            Interpolator interpolator = r.e;
            Interpolator interpolator2 = r.f177394c;
            float[] fArr = new float[2];
            fArr[i] = itemView.getScaleY();
            fArr[1] = 1.01f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            valueAnimatorOfFloat.setDuration(150L);
            Interpolator interpolator3 = interpolator;
            valueAnimatorOfFloat.setInterpolator(interpolator3);
            valueAnimatorOfFloat.addUpdateListener(new m(itemView, i));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.01f, 1.0f);
            int i5 = i;
            Iterator it9 = it8;
            valueAnimatorOfFloat2.setDuration(300L);
            valueAnimatorOfFloat2.setInterpolator(interpolator3);
            valueAnimatorOfFloat2.addUpdateListener(new m(itemView, 1));
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float fL = kli.a.l(context, 2.0f) * (i2 - iJ);
            float[] fArr2 = new float[2];
            fArr2[i5] = 0.0f;
            fArr2[1] = fL;
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fArr2);
            valueAnimatorOfFloat3.setDuration(150L);
            valueAnimatorOfFloat3.setInterpolator(interpolator3);
            valueAnimatorOfFloat3.addUpdateListener(new m(itemView, 2));
            float[] fArr3 = new float[2];
            fArr3[i5] = fL;
            fArr3[1] = 0.0f;
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(fArr3);
            valueAnimatorOfFloat4.setDuration(300L);
            valueAnimatorOfFloat4.setInterpolator(interpolator2);
            valueAnimatorOfFloat4.addUpdateListener(new m(itemView, 3));
            AnimatorSet animatorSet2 = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            animatorArr[i5] = valueAnimatorOfFloat3;
            animatorArr[1] = valueAnimatorOfFloat4;
            animatorSet2.playSequentially(animatorArr);
            AnimatorSet animatorSet3 = new AnimatorSet();
            Animator[] animatorArr2 = new Animator[2];
            animatorArr2[i5] = valueAnimatorOfFloat;
            animatorArr2[1] = valueAnimatorOfFloat2;
            animatorSet3.playSequentially(animatorArr2);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setStartDelay(((long) i2) * 100);
            Animator[] animatorArr3 = new Animator[2];
            animatorArr3[i5] = animatorSet2;
            animatorArr3[1] = animatorSet3;
            animatorSet4.playTogether(animatorArr3);
            arrayList.add(animatorSet4);
            i2 = i3;
            it8 = it9;
            i = i5;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playTogether(arrayList);
        AnimatorSet animatorSet6 = this.f8046g;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        this.f8046g = animatorSet5;
        animatorSet5.start();
    }

    public final int getDividerCount() {
        koi.h hVar = this.f8045c;
        if (hVar.getItemCount() <= 1) {
            return 0;
        }
        return hVar.getItemCount() - 1;
    }

    public final boolean getExpanded() {
        return this.f8047h;
    }

    public final int getSuggestionCount() {
        return this.f8045c.getItemCount();
    }

    public final void setSuggestions(@NotNull List<ChatPromptSuggestion> suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        AnimatorSet animatorSet = this.f8046g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f8046g = null;
        List<g> rowHolders = getRowHolders();
        int size = rowHolders.size();
        for (int i = 0; i < size; i++) {
            g gVar = rowHolders.get(i);
            View itemView = gVar.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setAlpha(1.0f);
            itemView.setScaleX(1.0f);
            itemView.setScaleY(1.0f);
            itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            b(gVar, 0);
        }
        List<ChatPromptSuggestion> list = suggestions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new d((ChatPromptSuggestion) it8.next()));
        }
        this.f8045c.c(arrayList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context, AttributeSet attributeSet, int i) {
        Object objA;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8043a = v0.a.d("create(...)");
        ChatSuggestionRowDelegate chatSuggestionRowDelegate = new ChatSuggestionRowDelegate();
        this.f8044b = chatSuggestionRowDelegate;
        koi.c cVar = new koi.c(0);
        cVar.a(chatSuggestionRowDelegate);
        this.f8045c = new koi.h(cVar, false, false, 4);
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = Boolean.valueOf(g0.a(context));
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        this.e = ((Boolean) (objA instanceof yhm.n ? Boolean.FALSE : objA)).booleanValue();
        int iK = kli.a.k(context, 16.0f);
        int iK2 = kli.a.k(context, 16.0f);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setPaddingRelative(iK, iK2, iK, 0);
        UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(context);
        recyclerView.setAdapter(this.f8045c);
        recyclerView.setLayoutManager(uIKitLinearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.addRecyclerListener(new RecyclerView.RecyclerListener() { // from class: ap0.k
            @Override // androidx.recyclerview.widget.RecyclerView.RecyclerListener
            public final void onViewRecycled(RecyclerView.ViewHolder holder) {
                n.a aVar = n.Companion;
                Intrinsics.checkNotNullParameter(holder, "holder");
                if (holder instanceof g) {
                    g gVar = (g) holder;
                    View itemView = gVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    itemView.setAlpha(1.0f);
                    itemView.setScaleX(1.0f);
                    itemView.setScaleY(1.0f);
                    itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    this.f8035a.b(gVar, 0);
                }
            }
        });
        this.d = recyclerView;
        addView(recyclerView);
        this.f8044b.f51548c.subscribe(new aoa.h(new an4.f(this, 18), 3));
        setVisibility(4);
    }

    public /* synthetic */ n(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
