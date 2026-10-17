package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.qn0;
import ip0.so0;
import ip0.wk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WalletWidgetDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/WalletWidgetDelegate$Model;", "Lip0/so0;", "<init>", "()V", "Companion", "Model", "com/revolut/core/ui_kit/delegates/jj", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletWidgetDelegate extends BaseRecyclerViewDelegate<Model, so0> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53629c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WalletWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/ij", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final aw0.kb f53630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f53631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnimationRequest f53632c;
        public Parcelable d;

        public Model(aw0.kb content, Clause buttonTitle, AnimationRequest animationRequest, int i) {
            animationRequest = (i & 8) != 0 ? null : animationRequest;
            Intrinsics.checkNotNullParameter("ID_PASS_ITEM", "listId");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            this.f53630a = content;
            this.f53631b = buttonTitle;
            this.f53632c = animationRequest;
            this.d = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new WalletWidgetDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF55194b() {
            return "ID_PASS_ITEM";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f53630a.equals(model.f53630a) && this.f53631b.equals(model.f53631b) && Intrinsics.f(this.f53632c, model.f53632c) && Intrinsics.f(this.d, model.d);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52618j() {
            return this.d;
        }

        public final int hashCode() {
            int iB = p.a.b((this.f53630a.hashCode() - 961692861) * 31, 31, this.f53631b);
            AnimationRequest animationRequest = this.f53632c;
            int iHashCode = (iB + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
            Parcelable parcelable = this.d;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean zEquals = model.f53630a.equals(this.f53630a);
            boolean z = !zEquals;
            boolean zEquals2 = model.f53631b.equals(this.f53631b);
            boolean z3 = !zEquals2;
            boolean zF = Intrinsics.f(model.f53632c, this.f53632c);
            boolean z4 = !zF;
            if (zEquals && zEquals2 && zF) {
                return null;
            }
            return new ij(z, z3, z4);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public WalletWidgetDelegate() {
        super(R$id.internal_wallet_widget_delegate_type, new qn0(5));
        this.f53629c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        nv0.l lVar = new nv0.l(context, null, 6, 0);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 16.0f);
        Context context3 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iK2 = kli.a.k(context3, 8.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMarginStart(iK);
        marginLayoutParams.setMarginEnd(iK);
        marginLayoutParams.topMargin = iK2;
        marginLayoutParams.bottomMargin = iK2;
        lVar.setLayoutParams(marginLayoutParams);
        return new so0(lVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        nv0.l lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        so0 so0Var = holder instanceof so0 ? (so0) holder : null;
        if (so0Var == null || (lVar = so0Var.f) == null) {
            return;
        }
        lVar.Q();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(so0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        holder.f.setModel(new nv0.n(data.f53630a, data.f53631b, data.f53632c, data, new ip0.md(this, data, 10), new wk(data, this, 13)));
    }
}
