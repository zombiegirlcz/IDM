package com.revolut.core.ui_kit.delegates;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.EmojiImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.b80;
import ip0.d80;
import ip0.k80;
import ip0.l40;
import ip0.l80;
import ip0.m80;
import ip0.n80;
import ip0.o80;
import ip0.p80;
import ip0.q80;
import ip0.r80;
import ip0.s80;
import ip0.t80;
import ip0.v80;
import ip0.w80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0002\u0007\b\t\u0003\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RateEmojiDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/t80;", "Lip0/w80;", "<init>", "()V", "Companion", "ip0/u80", "ip0/v80", "ip0/l80", "ip0/m80", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class RateEmojiDelegate extends BaseRecyclerViewDelegate<t80, w80> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53143c;
    public final ihm.f d;
    public final ihm.f e;

    public RateEmojiDelegate() {
        super(R$layout.internal_delegate_rate_emoji, new l40(23));
        this.f53143c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    public static void p(w80 w80Var, s80 s80Var) {
        Object emojiImage;
        Clause clause;
        for (Pair pair : zhm.d0.l1(w80Var.F(), s80Var.c())) {
            m80 m80Var = (m80) pair.f186385a;
            p80 p80Var = (p80) pair.f186386b;
            yy0.f fVarQ = or0.u.k(m80Var.f165338b).Q();
            l80 l80VarA = p80Var.a();
            if (l80VarA instanceof k80) {
                emojiImage = new EmojiImage(s80Var.a(), s80Var.b(), R$attr.uikit_colorTransparent, null, ((k80) l80VarA).getCode());
            } else {
                if (!(l80VarA instanceof d80)) {
                    throw new NoWhenBranchMatchedException();
                }
                emojiImage = ((d80) l80VarA).f163856a;
            }
            yy0.f.e(fVarQ, emojiImage, m80Var.f165338b, null, null, 12);
            if (p80Var instanceof n80) {
                clause = ((n80) p80Var).f165472a;
            } else {
                if (!(p80Var instanceof o80)) {
                    throw new NoWhenBranchMatchedException();
                }
                clause = null;
            }
            m80Var.f165338b.setVisibility(0);
            kli.a.b(m80Var.f165337a, clause, ty0.f.f275450a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void r(java.util.ArrayList r6, ip0.s80 r7, boolean r8) {
        /*
            java.util.Iterator r0 = r6.iterator()
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L3d
            ip0.m80 r3 = (ip0.m80) r3
            boolean r5 = r7 instanceof ip0.r80
            if (r5 == 0) goto L1e
            r5 = 3
            if (r2 >= r5) goto L35
            goto L2a
        L1e:
            boolean r5 = r7 instanceof ip0.q80
            if (r5 == 0) goto L37
            if (r2 == 0) goto L2a
            int r5 = zhm.v.j(r6)
            if (r2 != r5) goto L35
        L2a:
            android.widget.TextView r2 = r3.f165337a
            if (r8 == 0) goto L30
            r3 = r1
            goto L32
        L30:
            r3 = 8
        L32:
            r2.setVisibility(r3)
        L35:
            r2 = r4
            goto L6
        L37:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L3d:
            zhm.v.s()
            r6 = 0
            throw r6
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.RateEmojiDelegate.r(java.util.ArrayList, ip0.s80, boolean):void");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new w80(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.revolut.core.ui_kit.models.Clause] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(w80 holder, final t80 data, int i, List list) throws Throwable {
        Throwable th10;
        int i2;
        final RateEmojiDelegate rateEmojiDelegate;
        int i3;
        int i5;
        Iterator it8;
        List<v80> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        View view = holder.f166956m;
        TextView textView = holder.f166955l;
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it9 = list2.iterator();
            while (true) {
                if (it9.hasNext()) {
                    if (!(it9.next() instanceof v80)) {
                        payloads = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.RateEmojiDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (v80 v80Var : payloads) {
            zIsEmpty = zIsEmpty || v80Var.f166787a;
            z = z || v80Var.f166788b;
            z3 = z3 || v80Var.f166789c;
            z4 = z4 || v80Var.d;
            z6 = z6 || v80Var.e;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f, data.f166479b, ty0.f.f275450a);
        }
        if (z) {
            s80 s80Var = data.f166480c;
            boolean z11 = s80Var instanceof r80;
            if (z11) {
                th10 = null;
                p(holder, (r80) s80Var);
                i2 = 2;
                i3 = 1;
                i5 = 0;
                Iterator it10 = zhm.v.k(holder.i, holder.f166953h, holder.k, holder.f166954j).iterator();
                while (it10.hasNext()) {
                    ((View) it10.next()).setVisibility(8);
                }
            } else {
                th10 = null;
                i2 = 2;
                i3 = 1;
                i5 = 0;
                if (!(s80Var instanceof q80)) {
                    throw new NoWhenBranchMatchedException();
                }
                p(holder, (q80) s80Var);
            }
            View view2 = holder.itemView;
            ImageView imageView = holder.f166952g;
            Context context = view2.getContext();
            Intrinsics.h(context);
            int iK = kli.a.k(context, s80Var.b());
            int iK2 = kli.a.k(context, 72.0f);
            List<ImageView> list3 = holder.f166957n;
            for (ImageView imageView2 : list3) {
                imageView2.getLayoutParams().width = iK;
                imageView2.getLayoutParams().height = iK;
            }
            View view3 = holder.itemView;
            Intrinsics.i(view3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) view3;
            ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
            if (z11) {
                constraintSetL.setHorizontalChainStyle(imageView.getId(), i5);
            } else {
                if (!(s80Var instanceof q80)) {
                    throw new NoWhenBranchMatchedException();
                }
                constraintSetL.setHorizontalChainStyle(imageView.getId(), i3);
                int i6 = (iK2 - iK) / 2;
                Iterator it11 = list3.iterator();
                int i21 = 0;
                while (it11.hasNext()) {
                    Object next = it11.next();
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        zhm.v.s();
                        throw th10;
                    }
                    ImageView imageView3 = (ImageView) next;
                    if (i21 == 0) {
                        constraintSetL.setMargin(imageView3.getId(), 6, i6);
                        constraintSetL.setMargin(imageView3.getId(), 7, 0);
                        it8 = it11;
                    } else {
                        it8 = it11;
                        if (i21 == 4) {
                            constraintSetL.setMargin(imageView3.getId(), 6, 0);
                            constraintSetL.setMargin(imageView3.getId(), 7, i6);
                        } else {
                            constraintSetL.setMargin(imageView3.getId(), 6, 0);
                            constraintSetL.setMargin(imageView3.getId(), 7, 0);
                        }
                    }
                    i21 = i22;
                    it11 = it8;
                }
            }
            constraintSetL.applyTo(constraintLayout);
            holder.itemView.requestLayout();
        } else {
            th10 = null;
            i2 = 2;
        }
        if (z || z3) {
            s80 s80Var2 = data.f166480c;
            Integer num = data.d;
            ArrayList arrayListF = holder.F();
            if (s80Var2 instanceof r80) {
                r(arrayListF, s80Var2, true);
                textView.setVisibility(8);
            } else {
                if (!(s80Var2 instanceof q80)) {
                    throw new NoWhenBranchMatchedException();
                }
                Clause clause = ((q80) s80Var2).f;
                r(arrayListF, s80Var2, num == null);
                ?? r4 = clause;
                if (clause == null || num == null) {
                    r4 = th10;
                }
                kli.a.b(textView, r4, ty0.f.f275450a);
            }
            int i32 = 0;
            for (Object obj2 : arrayListF) {
                int i33 = i32 + 1;
                if (i32 < 0) {
                    zhm.v.s();
                    throw th10;
                }
                m80 m80Var = (m80) obj2;
                float f = ((num != null && num.intValue() == i32) || num == null) ? 1.0f : 0.4f;
                m80Var.getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(200L);
                ImageView imageView4 = m80Var.f165338b;
                Property property = View.ALPHA;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property, f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(m80Var.f165337a, (Property<TextView, Float>) property, f);
                Animator[] animatorArr = new Animator[i2];
                animatorArr[0] = objectAnimatorOfFloat;
                animatorArr[1] = objectAnimatorOfFloat2;
                animatorSet.playTogether(animatorArr);
                animatorSet.start();
                i32 = i33;
            }
        }
        if (z4) {
            view.setVisibility(data.e ? 0 : 8);
        }
        if (z6) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            rateEmojiDelegate = this;
            or0.b.c(rateEmojiDelegate, data, itemView, false, null, 28);
        } else {
            rateEmojiDelegate = this;
        }
        final int i43 = 0;
        textView.setOnClickListener(new View.OnClickListener(rateEmojiDelegate) { // from class: ip0.a80

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RateEmojiDelegate f163409b;

            {
                this.f163409b = rateEmojiDelegate;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i43) {
                    case 0:
                        this.f163409b.d.onNext(data);
                        break;
                    default:
                        this.f163409b.e.onNext(data);
                        break;
                }
            }
        });
        final int i59 = 1;
        view.setOnClickListener(new View.OnClickListener(rateEmojiDelegate) { // from class: ip0.a80

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RateEmojiDelegate f163409b;

            {
                this.f163409b = rateEmojiDelegate;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (i59) {
                    case 0:
                        this.f163409b.d.onNext(data);
                        break;
                    default:
                        this.f163409b.e.onNext(data);
                        break;
                }
            }
        });
        String str = data.f166478a;
        int i66 = 0;
        for (Object obj3 : holder.F()) {
            int i74 = i66 + 1;
            if (i66 < 0) {
                zhm.v.s();
                throw th10;
            }
            m80 m80Var2 = (m80) obj3;
            b80 listener = new b80(rateEmojiDelegate, str, i66);
            m80Var2.getClass();
            Intrinsics.checkNotNullParameter(listener, "listener");
            m80Var2.f165337a.setOnClickListener(listener);
            m80Var2.f165338b.setOnClickListener(listener);
            i66 = i74;
        }
    }
}
