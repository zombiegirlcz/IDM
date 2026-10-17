package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.ListingCardSmallDelegate;
import com.revolut.core.ui_kit.internal.views.revpoints.RevPointsPriceView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.av;
import ip0.bv;
import ip0.cv;
import ip0.hq;
import ip0.uu;
import ip0.vu;
import ip0.ws;
import ip0.wu;
import ip0.xu;
import ip0.yu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0003\u0002\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListingCardSmallDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/xu;", "Lip0/av;", "<init>", "()V", "ip0/zu", "ip0/uu", "ip0/wu", "ip0/vu", "ip0/yu", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListingCardSmallDelegate extends BaseRecyclerViewDelegate<xu, av> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52749c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f52750g;

    public ListingCardSmallDelegate() {
        super(R$layout.internal_delegate_listing_card_small, new hq(28));
        this.f52749c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f52750g = v0.a.d("create(...)");
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static void p(av avVar, uu uuVar) {
        if (uuVar instanceof wu) {
            kli.a.b(avVar.f163495j, ((wu) uuVar).f167063a, ty0.d.f275448a);
            avVar.k.setVisibility(8);
            avVar.f163496l.setVisibility(8);
            avVar.f163499p.setVisibility(8);
            return;
        }
        if (uuVar instanceof vu) {
            RevPointsPriceView revPointsPriceView = avVar.f163499p;
            revPointsPriceView.setVisibility(0);
            revPointsPriceView.setContent(((vu) uuVar).f166893a);
            avVar.k.setVisibility(8);
            avVar.f163495j.setVisibility(8);
            avVar.f163496l.setVisibility(8);
            return;
        }
        if (uuVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        avVar.k.setVisibility(8);
        avVar.f163495j.setVisibility(8);
        avVar.f163496l.setVisibility(8);
        avVar.f163499p.setVisibility(8);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new av(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_listing_card_small));
    }

    public final void q(ArrayList arrayList, av avVar) {
        avVar.f163497m.removeAllViews();
        if (arrayList != null) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                TagViewData tagViewData = (TagViewData) it8.next();
                Context context = avVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TagView tagView = new TagView(context, null, 6, 0);
                tagView.setContent(tagViewData);
                avVar.f163497m.addView(tagView);
                tagView.setOnClickListener(new ws(this, tagViewData, 2));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v7, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(av holder, final xu data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.o;
        ImageView imageView2 = holder.f163498n;
        TextView textView = holder.f163494h;
        TextView textView2 = holder.f163493g;
        TextView textView3 = holder.f;
        if (payloads.isEmpty()) {
            jb3.l.e(textView3, data.f167209c ? R$attr.internal_textAppearanceBody2 : R$attr.internal_textAppearanceEmphasis1);
            kli.a.b(textView3, data.f167208b, ty0.f.f275450a);
            kli.a.b(textView2, data.d, ty0.f.f275450a);
            kli.a.b(textView, null, ty0.f.f275450a);
            p(holder, data.f);
            zi0.c.g(imageView2, data.i);
            zi0.c.g(holder.i, data.e);
            q(data.f167210g, holder);
            zi0.c.g(imageView, data.f167211h);
            s(holder, data);
        } else {
            List list = payloads;
            ArrayList<yu> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ListingCardSmallDelegate.Payload");
                arrayList.add((yu) obj2);
            }
            for (yu yuVar : arrayList) {
                if (yuVar.f167352a) {
                    kli.a.b(textView3, data.f167208b, ty0.f.f275450a);
                }
                if (yuVar.f167353b) {
                    kli.a.b(textView2, data.d, ty0.f.f275450a);
                }
                if (yuVar.f) {
                    p(holder, data.f);
                }
                if (yuVar.f167354c) {
                    data.getClass();
                    kli.a.b(textView, null, ty0.d.f275448a);
                }
                if (yuVar.f167356h) {
                    zi0.c.g(imageView2, data.i);
                }
                if (yuVar.d) {
                    jb3.l.e(textView3, data.f167209c ? R$attr.internal_textAppearanceBody2 : R$attr.internal_textAppearanceEmphasis1);
                }
                if (yuVar.f167355g) {
                    q(data.f167210g, holder);
                }
                if (yuVar.i) {
                    zi0.c.g(imageView, data.f167211h);
                }
                if (yuVar.f167357j || yuVar.k) {
                    s(holder, data);
                }
            }
        }
        fp0.p pVar = holder.f163500q;
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        final int i2 = 0;
        view.setOnClickListener(new cv(this, data, i2));
        holder.k.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.tu

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListingCardSmallDelegate f166564b;

            {
                this.f166564b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        this.f166564b.e.onNext(data);
                        break;
                    default:
                        this.f166564b.f.onNext(data);
                        break;
                }
            }
        });
        final int i3 = 1;
        holder.f163496l.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.tu

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ListingCardSmallDelegate f166564b;

            {
                this.f166564b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        this.f166564b.e.onNext(data);
                        break;
                    default:
                        this.f166564b.f.onNext(data);
                        break;
                }
            }
        });
        fp0.p pVar2 = holder.f163501r;
        fp0.p.b(pVar2, true);
        View view2 = pVar2.f137029a;
        or0.m.a(view2);
        view2.setOnClickListener(new cv(this, data, 1));
    }

    public final void s(av avVar, xu xuVar) {
        dr0.i iVar;
        View itemView = avVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        int i = bv.f163657a[xuVar.f167212j.ordinal()];
        if (i == 1) {
            iVar = null;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = new dr0.i(new Color.Solid(R$attr.uikit_colorPopoverBackground));
        }
        or0.b.c(this, xuVar, itemView, false, iVar, 20);
    }
}
