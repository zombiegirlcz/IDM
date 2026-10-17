package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.a20;
import ip0.b20;
import ip0.c20;
import ip0.d20;
import ip0.e20;
import ip0.f20;
import ip0.ix;
import ip0.tz;
import ip0.w10;
import ip0.y10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0002\u0007\b\t\n\u0003\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlainTextWarningDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/sa;", "Lip0/e20;", "<init>", "()V", "Companion", "ip0/y10", "a", "ip0/x10", "ip0/d20", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlainTextWarningDelegate extends BaseRecyclerViewDelegate<sa, e20> {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52940c;
    public final e01.a d;
    public final Object e;
    public final Object f;

    public static abstract class a {
        private a() {
        }

        public abstract ActionsView.Item a();
    }

    public static final class b {
        private b() {
        }
    }

    public PlainTextWarningDelegate() {
        super(R$layout.internal_delegate_list_plain_text_warning, new tz(15));
        this.f52940c = v0.a.d("create(...)");
        this.d = new e01.a();
        yhm.k kVar = yhm.k.NONE;
        this.e = yhm.j.c(kVar, new il9.p(21));
        this.f = yhm.j.c(kVar, new il9.p(22));
    }

    public static void p(e20 e20Var, y10 y10Var, qv0.c cVar, boolean z) {
        int i;
        if (Intrinsics.f(cVar, c.d.f249513a)) {
            return;
        }
        int i2 = f20.f164186a[y10Var.ordinal()];
        if (i2 == 1) {
            i = z ? R$drawable.internal_box_background_ripple : R$drawable.internal_box_background;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = z ? R$drawable.internal_plain_text_warning_delegate_box_darker_background_ripple : R$drawable.internal_plain_text_warning_delegate_box_darker_background;
        }
        e20Var.f.setBackgroundResource(i);
    }

    public static void q(ActionsView actionsView, sa saVar) {
        List listC;
        a aVar = saVar.d;
        List list = saVar.e;
        actionsView.setVisibility((aVar == null && list.isEmpty()) ? 8 : 0);
        actionsView.setLayoutType(mx0.l.NON_SCROLLABLE_FILL);
        a aVar2 = saVar.d;
        if (aVar2 != null && (listC = zhm.u.c(aVar2.a())) != null) {
            list = listC;
        }
        actionsView.k(list, mx0.t.f210002a);
    }

    public static void r(sa saVar, e20 e20Var) {
        float f;
        Image image;
        int id10;
        View view;
        float f4;
        c20 c20Var = saVar.f54703g;
        if (c20Var instanceof a20) {
            image = ((a20) c20Var).f163371a;
            f = 24.0f;
        } else if (c20Var instanceof b20) {
            image = ((b20) c20Var).f163519a;
            f = 40.0f;
        } else {
            if (c20Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            f = BitmapDescriptorFactory.HUE_RED;
            image = null;
        }
        Float f5 = e20Var.k;
        ImageView imageView = e20Var.f164011j;
        boolean zA = Intrinsics.a(f, f5);
        if (!zA) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(e20Var.itemView, "getContext(...)", f);
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = iA;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = iA;
            imageView.setLayoutParams(layoutParams2);
            int i = -1;
            if (f == 40.0f) {
                id10 = imageView.getId();
                view = e20Var.itemView;
                f4 = 16.0f;
            } else {
                if (saVar.f54701b != null) {
                    i = 0;
                    id10 = -1;
                } else {
                    id10 = imageView.getId();
                }
                view = e20Var.itemView;
                f4 = 8.0f;
            }
            int iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", f4);
            TextView textView = e20Var.f164010h;
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.endToEnd = i;
            layoutParams4.endToStart = id10;
            layoutParams4.setMarginEnd(iA2);
            textView.setLayoutParams(layoutParams4);
        }
        if (!Intrinsics.f(image, e20Var.f164012l) || !zA) {
            zi0.c.g(imageView, image);
        }
        e20Var.k = Float.valueOf(f);
        e20Var.f164012l = image;
    }

    public static void w(sa saVar, e20 e20Var) {
        if (saVar.f54701b == null && saVar.f54702c != null) {
            TextView textView = e20Var.f164010h;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            textView.setLayoutParams(layoutParams);
            return;
        }
        TextView textView2 = e20Var.f164010h;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Context context = e20Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = kli.a.w(R$attr.uikit_dp8, context);
        textView2.setLayoutParams(layoutParams2);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new e20(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_list_plain_text_warning));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f s() {
        return (ihm.f) this.e.getValue();
    }

    public final efm.r t() {
        efm.r map = this.d.f121375b.map(new ix(25, new ip0.za(12)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void p(e20 holder, final sa data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f164011j;
        ActionsView actionsView = holder.i;
        TextView textView = holder.f164010h;
        TextView textView2 = holder.f164009g;
        ArrayList<d20> arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            d20 d20Var = next instanceof d20 ? (d20) next : null;
            if (d20Var != null) {
                arrayList.add(d20Var);
            }
        }
        int i2 = 8;
        int i3 = 12;
        if (arrayList.isEmpty()) {
            Clause clause = data.f54701b;
            boolean z = data.f;
            or0.b.e(this, clause, textView2, null, 12);
            or0.b.e(this, data.f54702c, textView, new i4g.g(1, s(), ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 27), 8);
            q(actionsView, data);
            if (z) {
                final int i5 = 1;
                holder.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.v10

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PlainTextWarningDelegate f166756b;

                    {
                        this.f166756b = this;
                    }

                    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i5) {
                            case 0:
                                ((ihm.f) this.f166756b.f.getValue()).onNext(data);
                                break;
                            default:
                                this.f166756b.f52940c.onNext(data);
                                break;
                        }
                    }
                });
            } else {
                holder.itemView.setOnClickListener(null);
                holder.itemView.setClickable(false);
            }
            v(data, holder);
            r(data, holder);
            if (imageView.getVisibility() == 0) {
                final int i6 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.v10

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ PlainTextWarningDelegate f166756b;

                    {
                        this.f166756b = this;
                    }

                    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i6) {
                            case 0:
                                ((ihm.f) this.f166756b.f.getValue()).onNext(data);
                                break;
                            default:
                                this.f166756b.f52940c.onNext(data);
                                break;
                        }
                    }
                });
            } else {
                imageView.setOnClickListener(null);
            }
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, data.f, null, 24);
            w(data, holder);
            p(holder, data.f54704h, data.f54705j, z);
            return;
        }
        for (d20 d20Var2 : arrayList) {
            boolean z3 = d20Var2.f163830a;
            boolean z4 = d20Var2.f;
            boolean z6 = d20Var2.f163831b;
            if (z3) {
                or0.b.e(this, data.f54701b, textView2, null, i3);
            }
            if (z6) {
                or0.b.e(this, data.f54702c, textView, new i4g.g(1, s(), ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 28), i2);
            }
            if (d20Var2.f163832c || d20Var2.d) {
                q(actionsView, data);
            }
            if (d20Var2.e) {
                if (data.f) {
                    final int i21 = 1;
                    holder.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.v10

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ PlainTextWarningDelegate f166756b;

                        {
                            this.f166756b = this;
                        }

                        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    ((ihm.f) this.f166756b.f.getValue()).onNext(data);
                                    break;
                                default:
                                    this.f166756b.f52940c.onNext(data);
                                    break;
                            }
                        }
                    });
                } else {
                    holder.itemView.setOnClickListener(null);
                    holder.itemView.setClickable(false);
                }
                v(data, holder);
            }
            if (z4) {
                r(data, holder);
                if (imageView.getVisibility() == 0) {
                    final int i22 = 0;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.v10

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ PlainTextWarningDelegate f166756b;

                        {
                            this.f166756b = this;
                        }

                        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    ((ihm.f) this.f166756b.f.getValue()).onNext(data);
                                    break;
                                default:
                                    this.f166756b.f52940c.onNext(data);
                                    break;
                            }
                        }
                    });
                } else {
                    imageView.setOnClickListener(null);
                }
            }
            if (d20Var2.f163830a || z4 || z6) {
                w(data, holder);
            }
            if (d20Var2.f163833g) {
                p(holder, data.f54704h, data.f54705j, data.f);
            }
            i2 = 8;
            i3 = 12;
        }
    }

    public final void v(sa saVar, e20 e20Var) {
        efm.r map = e20Var.i.f58296a.f121375b.map(new ix(26, new w10(saVar, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.d.a(map, e20Var);
    }
}
