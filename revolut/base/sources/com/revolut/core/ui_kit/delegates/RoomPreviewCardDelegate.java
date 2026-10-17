package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.eb0;
import ip0.fb0;
import ip0.t90;
import ip0.ws;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RoomPreviewCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ve;", "Lip0/fb0;", "<init>", "()V", "ip0/eb0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoomPreviewCardDelegate extends BaseRecyclerViewDelegate<ve, fb0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53211c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate$a$a, reason: collision with other inner class name */
        public static final class C0422a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0422a f53212a = new C0422a();

            private C0422a() {
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f53213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f53214b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f53215c;

            public b() {
                this(false, false, 7);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return this.f53213a == bVar.f53213a && this.f53214b == bVar.f53214b && this.f53215c == bVar.f53215c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f53215c) + j6.a.c(Boolean.hashCode(this.f53213a) * 31, 31, this.f53214b);
            }

            public b(boolean z, boolean z3, int i) {
                z = (i & 1) != 0 ? true : z;
                z3 = (i & 2) != 0 ? true : z3;
                this.f53213a = z;
                this.f53214b = z3;
                this.f53215c = true;
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f53216a = new c();

            private c() {
            }
        }

        private a() {
        }
    }

    public RoomPreviewCardDelegate() {
        super(R$layout.internal_delegate_room_preview_card, new t90(13));
        this.f53211c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        v0.a.d("create(...)");
        v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new fb0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_room_preview_card));
    }

    public final void p(fb0 fb0Var, ve veVar) {
        veVar.getClass();
        fb0Var.f164239q.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.revolut.core.ui_kit.models.Clause, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(fb0 holder, final ve data, int i, List payloads) {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        fb0 fb0Var;
        String str;
        a.C0422a c0422a;
        ImageView imageView2;
        Iterator it8;
        int i2;
        ?? r62;
        a.C0422a c0422a2;
        TextView textView3;
        TextView textView4;
        String str2;
        TextView textView5;
        TextView textView6;
        ImageView imageView3;
        final RoomPreviewCardDelegate roomPreviewCardDelegate = this;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView7 = holder.f164238p;
        TextView textView8 = holder.o;
        TextView textView9 = holder.f164236m;
        TextView textView10 = holder.k;
        TextView textView11 = holder.f164234j;
        TextView textView12 = holder.f164233h;
        TextView textView13 = holder.f164232g;
        TextView textView14 = holder.f164237n;
        TextView textView15 = holder.i;
        ImageView imageView4 = holder.f;
        TextView textView16 = holder.f164235l;
        boolean zIsEmpty = payloads.isEmpty();
        a.C0422a c0422a3 = a.C0422a.f53212a;
        if (zIsEmpty) {
            imageView = imageView4;
            textView = textView16;
            or0.b.f(roomPreviewCardDelegate, data.f54868b, imageView);
            or0.b.e(roomPreviewCardDelegate, data.f54869c, textView13, null, 12);
            or0.b.e(roomPreviewCardDelegate, data.d, textView12, null, 12);
            or0.b.e(roomPreviewCardDelegate, data.e, textView15, null, 12);
            or0.b.e(roomPreviewCardDelegate, data.f, textView11, null, 12);
            or0.b.e(roomPreviewCardDelegate, data.f54871h, textView10, null, 12);
            or0.b.e(roomPreviewCardDelegate, data.f54870g, textView, null, 12);
            or0.b.e(roomPreviewCardDelegate, null, textView9, null, 12);
            textView2 = textView14;
            or0.b.e(roomPreviewCardDelegate, null, textView2, null, 12);
            or0.b.e(roomPreviewCardDelegate, null, textView7, null, 12);
            kli.a.b(textView8, null, ty0.f.f275450a);
            p(holder, data);
            fb0Var = holder;
            View view = fb0Var.itemView;
            str = "itemView";
            Intrinsics.checkNotNullExpressionValue(view, str);
            c0422a = c0422a3;
            or0.b.c(roomPreviewCardDelegate, data, view, Intrinsics.f(data.i, c0422a), null, 24);
        } else {
            a.C0422a c0422a4 = c0422a3;
            List list = payloads;
            String str3 = "itemView";
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Iterator it9 = list.iterator(); it9.hasNext(); it9 = it9) {
                Object next = it9.next();
                Intrinsics.i(next, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate.Payload");
                arrayList.add((eb0) next);
            }
            for (Iterator it10 = arrayList.iterator(); it10.hasNext(); it10 = it8) {
                eb0 eb0Var = (eb0) it10.next();
                if (eb0Var.f164049a) {
                    or0.b.f(roomPreviewCardDelegate, data.f54868b, imageView4);
                }
                if (eb0Var.f164050b) {
                    imageView2 = imageView4;
                    it8 = it10;
                    i2 = 12;
                    r62 = 0;
                    or0.b.e(roomPreviewCardDelegate, data.f54869c, textView13, null, 12);
                } else {
                    imageView2 = imageView4;
                    it8 = it10;
                    i2 = 12;
                    r62 = 0;
                }
                if (eb0Var.f164051c) {
                    or0.b.e(roomPreviewCardDelegate, data.d, textView12, r62, i2);
                }
                if (eb0Var.d) {
                    or0.b.e(roomPreviewCardDelegate, data.e, textView15, r62, i2);
                }
                if (eb0Var.k) {
                    or0.b.e(roomPreviewCardDelegate, data.f, textView11, r62, i2);
                }
                if (eb0Var.f164056m) {
                    or0.b.e(roomPreviewCardDelegate, data.f54871h, textView10, r62, i2);
                }
                if (eb0Var.f164055l) {
                    or0.b.e(roomPreviewCardDelegate, data.f54870g, textView16, r62, i2);
                }
                if (eb0Var.e) {
                    data.getClass();
                    or0.b.e(roomPreviewCardDelegate, r62, textView9, r62, i2);
                }
                if (eb0Var.f || eb0Var.f164052g) {
                    data.getClass();
                    or0.b.e(roomPreviewCardDelegate, r62, textView14, r62, i2);
                }
                if (eb0Var.f164053h) {
                    data.getClass();
                    kli.a.b(textView8, r62, ty0.f.f275450a);
                }
                if (eb0Var.i) {
                    data.getClass();
                    or0.b.e(roomPreviewCardDelegate, r62, textView7, r62, i2);
                }
                if (eb0Var.f164054j) {
                    p(holder, data);
                }
                if (eb0Var.f164057n) {
                    View view2 = holder.itemView;
                    String str4 = str3;
                    Intrinsics.checkNotNullExpressionValue(view2, str4);
                    a.C0422a c0422a5 = c0422a4;
                    boolean zF = Intrinsics.f(data.i, c0422a5);
                    c0422a2 = c0422a5;
                    str2 = str4;
                    textView3 = textView7;
                    textView4 = textView8;
                    textView5 = textView16;
                    imageView3 = imageView2;
                    roomPreviewCardDelegate = this;
                    textView6 = textView14;
                    or0.b.c(roomPreviewCardDelegate, data, view2, zF, null, 24);
                } else {
                    c0422a2 = c0422a4;
                    textView3 = textView7;
                    textView4 = textView8;
                    str2 = str3;
                    textView5 = textView16;
                    textView6 = textView14;
                    imageView3 = imageView2;
                }
                imageView4 = imageView3;
                textView16 = textView5;
                textView8 = textView4;
                textView7 = textView3;
                textView14 = textView6;
                c0422a4 = c0422a2;
                str3 = str2;
            }
            imageView = imageView4;
            textView = textView16;
            fb0Var = holder;
            c0422a = c0422a4;
            textView2 = textView14;
            str = str3;
        }
        a aVar = data.i;
        int i3 = 20;
        final int i5 = 0;
        final int i6 = 1;
        if ((aVar instanceof a.b) && ((a.b) aVar).f53213a) {
            textView.setOnClickListener(new ws(roomPreviewCardDelegate.d, data, i3));
            textView.setOnTouchListener(new j01.e(new View[]{textView}));
        } else {
            or0.u.o(textView);
        }
        or0.u.n(textView, textView.isClickable());
        boolean z = aVar instanceof a.b;
        if (z && ((a.b) aVar).f53214b) {
            imageView.setOnClickListener(new View.OnClickListener(roomPreviewCardDelegate) { // from class: ip0.db0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RoomPreviewCardDelegate f163865b;

                {
                    this.f163865b = roomPreviewCardDelegate;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i5) {
                        case 0:
                            this.f163865b.f53211c.onNext(data);
                            break;
                        default:
                            this.f163865b.e.onNext(data);
                            break;
                    }
                }
            });
        } else {
            or0.u.o(imageView);
        }
        if (z && ((a.b) aVar).f53215c) {
            textView15.setOnClickListener(new ws(roomPreviewCardDelegate.f, data, i3));
            textView15.setOnTouchListener(new j01.e(new View[]{textView15}));
        } else {
            or0.u.o(textView15);
        }
        or0.u.n(textView15, textView15.isClickable());
        if (Intrinsics.f(aVar, c0422a)) {
            fb0Var.itemView.setOnClickListener(new View.OnClickListener(roomPreviewCardDelegate) { // from class: ip0.db0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ RoomPreviewCardDelegate f163865b;

                {
                    this.f163865b = roomPreviewCardDelegate;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i6) {
                        case 0:
                            this.f163865b.f53211c.onNext(data);
                            break;
                        default:
                            this.f163865b.e.onNext(data);
                            break;
                    }
                }
            });
        } else {
            View view3 = fb0Var.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, str);
            or0.u.o(view3);
        }
        or0.u.o(textView2);
    }
}
