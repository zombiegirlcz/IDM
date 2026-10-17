package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.tz;
import ip0.u00;
import ip0.ws;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PhotoDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/na;", "Lcom/revolut/core/ui_kit/delegates/oa;", "<init>", "()V", "a", "ip0/u00", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhotoDelegate extends BaseRecyclerViewDelegate<na, oa> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52920c;
    public final ArrayList d;

    public static abstract class a {
        private a() {
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.PhotoDelegate$a$a, reason: collision with other inner class name */
        public static final class C0417a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final u00 f52921a;

            public C0417a(u00 cameraSide) {
                Intrinsics.checkNotNullParameter(cameraSide, "cameraSide");
                this.f52921a = cameraSide;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0417a) && this.f52921a == ((C0417a) obj2).f52921a;
            }

            public final int hashCode() {
                return this.f52921a.hashCode();
            }

            public C0417a() {
                this(u00.BACK);
            }
        }
    }

    public PhotoDelegate() {
        super(R$layout.internal_delegate_photo, new tz(9));
        this.f52920c = v0.a.d("create(...)");
        this.d = new ArrayList();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new oa(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(oa holder, na data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        a.C0417a source = data.f54501b;
        AppCompatImageView appCompatImageView = holder.f54537g;
        AppCompatImageView appCompatImageView2 = holder.f;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!source.equals(holder.f54540l)) {
            holder.f54540l = source;
            appCompatImageView2.setVisibility(0);
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            appCompatImageView2.setVisibility(0);
            pd.b.p(appCompatImageView2, new TextLocalisedClause(R$string.uikit_common_accessibility_custom_action_use_camera, null, null, 14));
            holder.f54538h.setVisibility(0);
            appCompatImageView.setVisibility(8);
            if (holder.f54540l != null && holder.f54541m != null) {
                holder.I();
                holder.H();
            }
            holder.F();
        }
        holder.itemView.setOnClickListener(new ws(this, data, 6));
        Intrinsics.checkNotNullParameter(this, "delegate");
        if (!Intrinsics.f(holder.f54545r.get(), this)) {
            ArrayList arrayList = this.d;
            arrayList.remove(holder);
            holder.f54545r = new WeakReference(this);
            if (holder.f54546s) {
                arrayList.add(holder);
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
