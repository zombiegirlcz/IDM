package com.revolut.core.ui_kit.delegates;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\t\u0005\u0006\u0002\u0007\b\t\u0003\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AmountDualEditDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/v;", "Lip0/p0;", "Companion", "ip0/l0", "a", "ip0/k0", "ip0/n0", "ip0/m0", "ip0/i0", "ip0/j0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountDualEditDelegate extends BaseRecyclerViewDelegate<v, ip0.p0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f51612c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f51613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f51614h;
    public final e01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e01.a f51615j;
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f51616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e01.a f51617m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e01.a f51618n;
    public final e01.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f51619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f51620q;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.AmountDualEditDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static final ip0.i0 a(Companion companion, AmountEditDelegate.Model model) {
            companion.getClass();
            return new ip0.i0(model.f51624a, model.f51625b, model.f51626c, model.d, model.e, model.f, model.f51627g, model.f51628h, model.i, null, 512);
        }
    }

    public AmountDualEditDelegate() {
        this(null);
    }

    public static void q(ip0.j0 j0Var, nx0.a aVar, ip0.i0 i0Var) {
        boolean z = j0Var.d;
        bw0.h hVar = j0Var.i;
        if (z && (!hVar.f19183h || hVar.equals(i0Var.f164617c))) {
            aVar.setAmountInput(hVar);
        }
        if (j0Var.f164765a) {
            aVar.setAmountType(i0Var.f164616b);
        }
        if (j0Var.f164766b) {
            aVar.setAmountTypeImage(i0Var.i);
        }
        if (j0Var.f164767c) {
            aVar.setAmountTypeE2ECustomId(i0Var.f164620j);
        }
        if (z) {
            aVar.setAmountInput(i0Var.f164617c);
        }
        if (j0Var.f164768g) {
            aVar.setHint(i0Var.f, bw0.n.START);
        }
        if (j0Var.f164769h) {
            aVar.setHint(i0Var.f164618g, bw0.n.END);
        }
        if (j0Var.e) {
            aVar.setChevron(i0Var.d);
        }
        if (j0Var.f) {
            aVar.setSwitcher(i0Var.e);
        }
        if (j0Var.f164770j) {
            boolean z3 = i0Var.f164619h;
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            aVar.F().setEnabled(z3);
        }
    }

    public static void r(nx0.a aVar, ip0.i0 i0Var) {
        aVar.setAmountType(i0Var.f164616b);
        aVar.setAmountTypeImage(i0Var.i);
        aVar.setAmountTypeE2ECustomId(i0Var.f164620j);
        aVar.setAmountInput(i0Var.f164617c);
        aVar.setHint(i0Var.f, bw0.n.START);
        aVar.setHint(i0Var.f164618g, bw0.n.END);
        aVar.setChevron(i0Var.d);
        aVar.setSwitcher(i0Var.e);
        boolean z = i0Var.f164619h;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.F().setEnabled(z);
    }

    public static void t(ImageView imageView, ip0.k0 k0Var) {
        int i;
        int i2 = ip0.q0.f165906a[k0Var.ordinal()];
        if (i2 == 1) {
            i = R$drawable.uikit_icn_24_arrow_thin_down;
        } else if (i2 == 2) {
            i = R$drawable.uikit_icn_24_arrow_thin_up;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_arrow_top_down;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), i));
    }

    public static void v(ImageView imageView, v vVar) {
        int i = R$attr.uikit_colorOnAccentNeutral;
        int i2 = vVar.e ? R$attr.uikit_colorAccentNeutral : R$attr.uikit_colorGreyTone50;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rd0.e.q(imageView, Integer.valueOf(kli.a.s(i, context)));
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewCompat.setBackgroundTintList(imageView, kli.a.u(i2, context2));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.p0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_amount_dual_edit));
    }

    public final void p(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, BitmapDescriptorFactory.HUE_RED);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator((PathInterpolator) this.f51619p.getValue());
        objectAnimatorOfFloat.start();
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.p0 holder, v data, int i, List payloads) {
        nx0.a aVar;
        nx0.a aVar2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ip0.n0 style = ((Boolean) jo0.g.f176837w.getValue()).booleanValue() ? ip0.n0.FACELIFT : data.f54840h;
        ImageView imageView = holder.f165748j;
        Intrinsics.checkNotNullParameter(style, "style");
        int[] iArr = ip0.o0.f165598a;
        int i2 = iArr[style.ordinal()];
        if (i2 == 1) {
            aVar = holder.f;
            if (aVar == null) {
                KeyEvent.Callback callbackInflate = ((ViewStub) holder.itemView.findViewById(R$id.amountDualEdit_amount_1_stub)).inflate();
                Intrinsics.i(callbackInflate, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.amount.AmountEditBaseView");
                aVar = (nx0.a) callbackInflate;
                holder.f = aVar;
                ip0.p0.F(aVar);
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = holder.f165747h;
            if (aVar == null) {
                KeyEvent.Callback callbackInflate2 = ((ViewStub) holder.itemView.findViewById(R$id.amountDualEdit_amount_1_facelifted_stub)).inflate();
                Intrinsics.i(callbackInflate2, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.amount.AmountEditBaseView");
                aVar = (nx0.a) callbackInflate2;
                holder.f165747h = aVar;
                ip0.p0.F(aVar);
            }
        }
        Intrinsics.checkNotNullParameter(style, "style");
        int i3 = iArr[style.ordinal()];
        if (i3 == 1) {
            aVar2 = holder.f165746g;
            if (aVar2 == null) {
                KeyEvent.Callback callbackInflate3 = ((ViewStub) holder.itemView.findViewById(R$id.amountDualEdit_amount_2_stub)).inflate();
                Intrinsics.i(callbackInflate3, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.amount.AmountEditBaseView");
                aVar2 = (nx0.a) callbackInflate3;
                holder.f165746g = aVar2;
                ip0.p0.F(aVar2);
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = holder.i;
            if (aVar2 == null) {
                KeyEvent.Callback callbackInflate4 = ((ViewStub) holder.itemView.findViewById(R$id.amountDualEdit_amount_2_facelifted_stub)).inflate();
                Intrinsics.i(callbackInflate4, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.amount.AmountEditBaseView");
                aVar2 = (nx0.a) callbackInflate4;
                holder.i = aVar2;
                ip0.p0.F(aVar2);
            }
        }
        Intrinsics.checkNotNullParameter(style, "style");
        int i5 = iArr[style.ordinal()];
        if (i5 == 1) {
            nx0.a aVar3 = holder.f;
            if (aVar3 != null) {
                zh9.u0.G(aVar3, true);
            }
            nx0.a aVar4 = holder.f165746g;
            if (aVar4 != null) {
                zh9.u0.G(aVar4, true);
            }
            nx0.a aVar5 = holder.f165747h;
            if (aVar5 != null) {
                zh9.u0.G(aVar5, false);
            }
            nx0.a aVar6 = holder.i;
            if (aVar6 != null) {
                zh9.u0.G(aVar6, false);
            }
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            nx0.a aVar7 = holder.f;
            if (aVar7 != null) {
                zh9.u0.G(aVar7, false);
            }
            nx0.a aVar8 = holder.f165746g;
            if (aVar8 != null) {
                zh9.u0.G(aVar8, false);
            }
            nx0.a aVar9 = holder.f165747h;
            if (aVar9 != null) {
                zh9.u0.G(aVar9, true);
            }
            nx0.a aVar10 = holder.i;
            if (aVar10 != null) {
                zh9.u0.G(aVar10, true);
            }
        }
        if (payloads.isEmpty()) {
            ip0.l0 l0Var = ip0.l0.TOP;
            w(aVar, data, l0Var);
            ip0.l0 l0Var2 = ip0.l0.BOTTOM;
            w(aVar2, data, l0Var2);
            r(aVar, data.f54837b);
            r(aVar2, data.f54838c);
            aVar.setInputPosition(l0Var);
            aVar2.setInputPosition(l0Var2);
            t(imageView, data.d);
            v(imageView, data);
            u(imageView, data.e);
            hx7.b.v(imageView, "AmountDualInputGroup.directionButton");
            this.d.a(aVar.s(), holder);
            this.e.a(aVar.k(), holder);
            this.f.a(aVar.getF58932b(), holder);
            this.f51613g.a(aVar.I(), holder);
            this.f51615j.a(aVar2.s(), holder);
            this.k.a(aVar2.k(), holder);
            this.f51616l.a(aVar2.getF58932b(), holder);
            this.f51617m.a(aVar2.I(), holder);
            break;
        }
        List list = payloads;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AmountDualEditDelegate.Payload");
                if (((ip0.m0) obj2).f165286h) {
                    ip0.l0 l0Var3 = ip0.l0.TOP;
                    w(aVar, data, l0Var3);
                    ip0.l0 l0Var22 = ip0.l0.BOTTOM;
                    w(aVar2, data, l0Var22);
                    r(aVar, data.f54837b);
                    r(aVar2, data.f54838c);
                    aVar.setInputPosition(l0Var3);
                    aVar2.setInputPosition(l0Var22);
                    t(imageView, data.d);
                    v(imageView, data);
                    u(imageView, data.e);
                    hx7.b.v(imageView, "AmountDualInputGroup.directionButton");
                    this.d.a(aVar.s(), holder);
                    this.e.a(aVar.k(), holder);
                    this.f.a(aVar.getF58932b(), holder);
                    this.f51613g.a(aVar.I(), holder);
                    this.f51615j.a(aVar2.s(), holder);
                    this.k.a(aVar2.k(), holder);
                    this.f51616l.a(aVar2.getF58932b(), holder);
                    this.f51617m.a(aVar2.I(), holder);
                    break;
                }
            }
        }
        for (Object obj3 : list) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AmountDualEditDelegate.Payload");
            ip0.m0 m0Var = (ip0.m0) obj3;
            boolean z = m0Var.f;
            boolean z3 = m0Var.f165284c;
            if (m0Var.d) {
                w(aVar, data, ip0.l0.TOP);
            }
            if (m0Var.e) {
                w(aVar2, data, ip0.l0.BOTTOM);
            }
            ip0.j0 j0Var = m0Var.f165282a;
            ip0.i0 i0Var = data.f54837b;
            ip0.k0 k0Var = data.d;
            q(j0Var, aVar, i0Var);
            q(m0Var.f165283b, aVar2, data.f54838c);
            if (m0Var.f165285g) {
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                int top = aVar2.F().getTop();
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                float top2 = top - aVar.F().getTop();
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                aVar.F().setTranslationY(top2);
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                aVar2.F().setTranslationY(-top2);
                p(aVar.F());
                p(aVar2.F());
            }
            if (z3) {
                t(imageView, k0Var);
                int i6 = ip0.q0.f165906a[k0Var.ordinal()];
                if (i6 == 1) {
                    aVar.u(kli.a.s(R$attr.uikit_colorPink_30, zh9.u0.q(aVar)));
                    aVar2.u(kli.a.s(R$attr.uikit_colorAccent_30, zh9.u0.q(aVar2)));
                    aVar.M();
                    aVar2.M();
                } else if (i6 == 2) {
                    aVar.u(kli.a.s(R$attr.uikit_colorAccent_30, zh9.u0.q(aVar)));
                    aVar2.u(kli.a.s(R$attr.uikit_colorPink_30, zh9.u0.q(aVar2)));
                    aVar.M();
                    aVar2.M();
                } else if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (z) {
                u(imageView, data.e);
            }
            if (z3 || z) {
                v(imageView, data);
            }
        }
        int i21 = 1;
        efm.r rVarSwitchMap = aVar.I().switchMap(new ip0.w(new ip0.h0(data, 0), i21));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        this.f51614h.a(rVarSwitchMap, holder);
        efm.r rVarSwitchMap2 = aVar.I().switchMap(new ip0.w(new ip0.h0(data, i21), 2));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        this.i.a(rVarSwitchMap2, holder);
        efm.r rVarSwitchMap3 = aVar2.I().switchMap(new ip0.w(new ip0.h0(data, 2), 3));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap3, "switchMap(...)");
        this.f51618n.a(rVarSwitchMap3, holder);
        efm.r rVarSwitchMap4 = aVar2.I().switchMap(new ip0.w(new ip0.h0(data, 3), 4));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap4, "switchMap(...)");
        this.o.a(rVarSwitchMap4, holder);
    }

    public final void u(ImageView imageView, boolean z) {
        if (z) {
            imageView.setOnClickListener(new ip0.g0(this, 0));
            imageView.setOnTouchListener(new j01.e(new View[]{imageView}));
        } else {
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
        }
    }

    public final void w(nx0.a aVar, v vVar, ip0.l0 l0Var) {
        Function3 function3 = this.f51612c;
        if (function3 == null) {
            return;
        }
        aVar.setMaskingDelegate((yz0.b) function3.invoke(vVar, l0Var, aVar));
    }

    public AmountDualEditDelegate(Function3 function3) {
        super(R$layout.internal_delegate_amount_dual_edit, new ip0.c(9));
        this.f51612c = function3;
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f51613g = new e01.a();
        this.f51614h = new e01.a();
        this.i = new e01.a();
        this.f51615j = new e01.a();
        this.k = new e01.a();
        this.f51616l = new e01.a();
        this.f51617m = new e01.a();
        this.f51618n = new e01.a();
        this.o = new e01.a();
        this.f51619p = yhm.j.b(new il9.p(12));
        this.f51620q = v0.a.d("create(...)");
    }
}
