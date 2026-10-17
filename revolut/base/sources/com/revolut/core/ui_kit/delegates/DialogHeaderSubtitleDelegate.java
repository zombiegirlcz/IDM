package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DialogHeaderSubtitleDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/DialogHeaderSubtitleDelegate$Model;", "Lip0/ie;", "<init>", "()V", "Model", "ip0/he", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class DialogHeaderSubtitleDelegate extends BaseRecyclerViewDelegate<Model, ip0.ie> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52189c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DialogHeaderSubtitleDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52192c;
        public Parcelable d;

        public Model(int i, Clause label, String listId, boolean z) {
            z = (i & 8) != 0 ? true : z;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f52190a = listId;
            this.f52191b = label;
            this.f52192c = z;
            this.d = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new DialogHeaderSubtitleDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getE() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52903a() {
            return this.f52190a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52190a, model.f52190a) && Intrinsics.f(this.f52191b, model.f52191b) && this.f52192c == model.f52192c && Intrinsics.f(this.d, model.d);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.d;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(p.a.a(this.f52190a.hashCode() * 31, 31, this.f52191b), 31, false), 961, this.f52192c);
            Parcelable parcelable = this.d;
            return iC + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new ip0.he(!Intrinsics.f(r5.f52191b, this.f52191b), ((Model) oldItem).f52192c != this.f52192c);
        }
    }

    public DialogHeaderSubtitleDelegate() {
        super(R$layout.internal_delegate_dialog_header_subtitle, new ip0.lb(19));
        v0.a.d("create(...)");
        this.f52189c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.ie(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_dialog_header_subtitle));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.ie holder, Model data, int i, List list) {
        List<ip0.he> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        data.getClass();
        Clause clause = data.f52191b;
        View view = holder.itemView;
        ty0.c cVarX = h30.l.x(view, "itemView", view);
        TextView textView = holder.f;
        textView.setMovementMethod(((bp0.y) cVarX).g(clause) ? ix0.c0.f169220a : null);
        holder.itemView.setOnClickListener(null);
        holder.itemView.setClickable(false);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.he)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean zIsEmpty2 = payloads.isEmpty();
        for (ip0.he heVar : payloads) {
            zIsEmpty = zIsEmpty || heVar.f164540a;
            zIsEmpty2 = zIsEmpty2 || heVar.f164541b;
        }
        if (zIsEmpty) {
            kli.a.d(textView, clause, data, new j5(1, 0, ihm.f.class, this.f52189c, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
            if (textView.getText() instanceof Spanned) {
                SpannableString spannableString = new SpannableString(textView.getText());
                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class);
                Intrinsics.h(foregroundColorSpanArr);
                if (foregroundColorSpanArr.length != 0) {
                    for (int length = foregroundColorSpanArr.length - 1; -1 < length; length--) {
                        spannableString.removeSpan(foregroundColorSpanArr[length]);
                    }
                    textView.setText(spannableString);
                }
            }
        }
        if (zIsEmpty2) {
            Context context = holder.itemView.getContext();
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            Intrinsics.h(context);
            knm.b.v(kli.a.w(data.f52192c ? R$attr.uikit_dp16 : R$attr.uikit_dp0, context), itemView);
        }
    }
}
