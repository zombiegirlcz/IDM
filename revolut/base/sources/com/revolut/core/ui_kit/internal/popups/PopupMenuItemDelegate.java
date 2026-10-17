package com.revolut.core.ui_kit.internal.popups;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import au0.r2;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.NewBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import fp0.p;
import h30.l;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mw0.g;
import mw0.i;
import mw0.j;
import op0.r3;
import or0.b;
import or0.m;
import or0.u;
import ty0.f;
import ypg.h;
import yr0.c;
import yr0.k;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/popups/PopupMenuItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;", "Lyr0/c;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PopupMenuItemDelegate extends BaseRecyclerViewDelegate<PopupMenuItem, c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f56052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMenuItemDelegate(k menuView) {
        super(R$layout.internal_delegate_popup_menu_item, new h(5));
        Intrinsics.checkNotNullParameter(menuView, "menuView");
        this.f56052c = menuView;
    }

    public static void q(c cVar, j jVar) {
        if (Intrinsics.f(jVar, mw0.h.f209288a)) {
            cVar.itemView.setEnabled(false);
            TextView textView = cVar.f316053h;
            Context context = cVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(a.s(R$attr.uikit_colorGreyTone50, context));
            TextView textView2 = cVar.i;
            Context context2 = cVar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView2.setTextColor(a.s(R$attr.uikit_colorGreyTone20, context2));
            return;
        }
        if (!Intrinsics.f(jVar, i.f209289a)) {
            throw new NoWhenBranchMatchedException();
        }
        cVar.itemView.setEnabled(true);
        TextView textView3 = cVar.f316053h;
        Context context3 = cVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView3.setTextColor(a.s(R$attr.uikit_colorForeground, context3));
        TextView textView4 = cVar.i;
        Context context4 = cVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        textView4.setTextColor(a.s(R$attr.uikit_colorGreyTone50, context4));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new c(parent);
    }

    public final void p(c holder, PopupMenuItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        qv0.c f53017p = item.getF52665j();
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        boolean z = true;
        if (item instanceof PopupMenuItem.Cell) {
            j jVar = ((PopupMenuItem.Cell) item).f58124g;
            if (!Intrinsics.f(jVar, i.f209289a)) {
                if (!Intrinsics.f(jVar, mw0.h.f209288a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
        } else if (!(item instanceof PopupMenuItem.NestedParent)) {
            throw new NoWhenBranchMatchedException();
        }
        b.b(this, f53017p, itemView, z, null, null, null, 56);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(c holder, PopupMenuItem data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        p pVar = holder.f316056m;
        NewBadgeView newBadgeView = holder.k;
        ImageView imageView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof mw0.k)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        int i3 = 0;
        while (i3 < size2) {
            mw0.k kVar = (mw0.k) payloads.get(i3);
            z = z || kVar.f209290a;
            z4 = z4 || kVar.f209291b;
            z11 = z11 || kVar.f209292c;
            z12 = z12 || kVar.d;
            z6 = z6 || kVar.e;
            z3 = z3 || kVar.f;
            List list2 = payloads;
            z29 = z29 || kVar.f209293g;
            z31 = z31 || kVar.f209294h;
            zIsEmpty = zIsEmpty || kVar.i;
            i3++;
            payloads = list2;
        }
        if (zIsEmpty || z3) {
            p(holder, data);
        }
        if (z) {
            View view = holder.itemView;
            ty0.c.b(l.x(view, "itemView", view), data.getF58135b(), holder.f316053h, null, null, 12);
        }
        if (z4) {
            zi0.c.g(holder.f316052g, data.getF58136c());
        }
        if (z6) {
            a.b(holder.i, data.getD(), f.f275450a);
        }
        boolean z41 = data instanceof PopupMenuItem.Cell;
        i iVar = i.f209289a;
        if (z41) {
            if (z3) {
                q(holder, ((PopupMenuItem.Cell) data).f58124g);
            }
            if (z29 || z3) {
                PopupMenuItem.Cell cell = (PopupMenuItem.Cell) data;
                g gVar = cell.f58125h;
                j jVar = cell.f58124g;
                int i5 = gVar == null ? -1 : yr0.b.f316051a[gVar.ordinal()];
                if (i5 == 1) {
                    zi0.c.g(imageView, new ResourceImage(R$drawable.uikit_icn_16_check, (Integer) null, (Integer) null, Intrinsics.f(jVar, mw0.h.f209288a) ? Integer.valueOf(R$attr.uikit_colorGreyTone50) : null, (List) null, (ImageTransformations) null, (Clause) null, 246));
                } else if (i5 != 2) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(4);
                    View itemView = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    u.k(itemView).Q().b(imageView);
                }
            }
            if (z12) {
                NewBadgeContent newBadgeContent = ((PopupMenuItem.Cell) data).e;
                newBadgeView.setVisibility(newBadgeContent != null ? 0 : 8);
                if (newBadgeContent != null) {
                    newBadgeView.setContent(newBadgeContent);
                }
            }
            if (z11) {
                holder.F(((PopupMenuItem.Cell) data).d);
            }
        } else {
            if (!(data instanceof PopupMenuItem.NestedParent)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z3) {
                q(holder, iVar);
            }
            if (z31) {
                if (((PopupMenuItem.NestedParent) data).f58138h) {
                    imageView.setVisibility(4);
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    u.k(itemView2).Q().b(imageView);
                } else {
                    imageView.setVisibility(8);
                }
            }
            if (z12) {
                newBadgeView.setVisibility(8);
            }
            if (z11) {
                holder.F(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            }
        }
        if (!z41) {
            if (!(data instanceof PopupMenuItem.NestedParent)) {
                throw new NoWhenBranchMatchedException();
            }
            p.b(pVar, true);
            View view2 = pVar.f137029a;
            m.a(view2);
            view2.setOnClickListener(new r2(this, data, 26));
            return;
        }
        PopupMenuItem.Cell cell2 = (PopupMenuItem.Cell) data;
        boolean zF = Intrinsics.f(cell2.f58124g, iVar);
        Clause clause = cell2.f58122b;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        p.b(pVar, zF);
        View view3 = pVar.f137029a;
        m.a(view3);
        if (zF) {
            view3.setOnClickListener(new r3(data, cVar, this, data, 5));
        } else {
            u.o(view3);
        }
    }
}
