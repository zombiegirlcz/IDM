package com.revolut.core.ui_kit.internal.delegates.gridselector;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.j5;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import tj9.d;
import tq0.a;
import tq0.b;
import tq0.e;
import tq0.f;
import vf0.h;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0002\u0006\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/gridselector/GridCellDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Ltq0/a;", "Ltq0/f;", "<init>", "()V", "tq0/e", "tq0/d", "tq0/b", "tq0/c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GridCellDelegate extends BaseRecyclerViewDelegate<a, f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f55868c;

    public GridCellDelegate() {
        super(R$layout.internal_delegate_grid_cell, new d(28));
        this.f55868c = v0.a.d("create(...)");
    }

    public static void p(a aVar, f fVar) {
        h hVar = aVar.f273448h;
        if (hVar == null) {
            fVar.f273455g.setVisibility(8);
            fVar.f273456h.setVisibility(8);
            fVar.i.setVisibility(8);
            fVar.f273457j.setVisibility(8);
            return;
        }
        jw0.a aVar2 = (jw0.a) hVar.f288433a;
        jw0.a aVar3 = (jw0.a) hVar.f288434b;
        jw0.a aVar4 = (jw0.a) hVar.f288435c;
        jw0.a aVar5 = (jw0.a) hVar.d;
        if (aVar2 != null) {
            fVar.f273455g.setVisibility(0);
            View view = fVar.f273455g;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackground(q(aVar2.f178917a, context));
        } else {
            fVar.f273455g.setVisibility(8);
        }
        if (aVar3 != null) {
            fVar.f273456h.setVisibility(0);
            View view2 = fVar.f273456h;
            Context context2 = view2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            view2.setBackground(q(aVar3.f178917a, context2));
        } else {
            fVar.f273456h.setVisibility(8);
        }
        if (aVar4 != null) {
            fVar.i.setVisibility(0);
            View view3 = fVar.i;
            Context context3 = view3.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            view3.setBackground(q(aVar4.f178917a, context3));
        } else {
            fVar.i.setVisibility(8);
        }
        if (aVar5 == null) {
            fVar.f273457j.setVisibility(8);
            return;
        }
        fVar.f273457j.setVisibility(0);
        View view4 = fVar.k;
        Context context4 = fVar.f273457j.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        view4.setBackground(q(aVar5.f178917a, context4));
    }

    public static Drawable q(int i, Context context) {
        Drawable drawable = context.getDrawable(R$drawable.internal_grid_bottom_dot);
        if (drawable == null) {
            throw new IllegalStateException("Can't find resource");
        }
        DrawableCompat.setTint(DrawableCompat.wrap(drawable.mutate()), kli.a.s(i, context));
        return drawable;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f(s.r(parent, R$layout.internal_delegate_grid_cell));
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void p(f holder, a data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        AppCompatTextView appCompatTextView = holder.f;
        if (payloads.isEmpty()) {
            l.e(appCompatTextView, data.f273446c.a());
            kli.a.b(appCompatTextView, data.f273445b, ty0.f.f275450a);
            if (data.e) {
                holder.itemView.setOnClickListener(new j5(this, 8, data, holder));
            } else {
                holder.itemView.setOnClickListener(null);
            }
            appCompatTextView.setSelected(data.d);
            tq0.d dVar = data.f;
            if (dVar != null) {
                holder.itemView.setBackgroundResource(dVar.a());
            } else {
                holder.itemView.setBackground(null);
            }
            appCompatTextView.setActivated(data.f273447g);
            p(data, holder);
        } else {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.delegates.gridselector.GridCellDelegate.Payload");
                e eVar = (e) obj2;
                boolean z = eVar.f273453c;
                if (eVar.f273452b) {
                    l.e(appCompatTextView, data.f273446c.a());
                }
                if (eVar.f273451a) {
                    kli.a.b(appCompatTextView, data.f273445b, ty0.f.f275450a);
                }
                if (eVar.d) {
                    if (data.e) {
                        holder.itemView.setOnClickListener(new j5(this, 8, data, holder));
                    } else {
                        holder.itemView.setOnClickListener(null);
                    }
                }
                if (z) {
                    appCompatTextView.setSelected(data.d);
                }
                if (eVar.e) {
                    tq0.d dVar2 = data.f;
                    if (dVar2 != null) {
                        holder.itemView.setBackgroundResource(dVar2.a());
                    } else {
                        holder.itemView.setBackground(null);
                    }
                }
                if (eVar.f || z) {
                    appCompatTextView.setActivated(data.f273447g);
                }
                if (eVar.f273454g) {
                    p(data, holder);
                }
            }
        }
        if (data.f273446c == b.TITLE) {
            appCompatTextView.setPadding(0, 0, 0, 0);
            return;
        }
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 6.0f);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), iK, appCompatTextView.getPaddingRight(), iK);
    }
}
