package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ContextualBarChartDelegate;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate;", "Lcom/revolut/core/ui_kit/delegates/ContextualBarChartDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/j4;", "<init>", "()V", "Model", "com/revolut/core/ui_kit/delegates/i4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContextualBarChartDelegate extends BaseChatBubbleDelegate<Model, j4> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f52126l = 0;
    public final ihm.f k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ContextualBarChartDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/chat/BaseChatBubbleDelegate$BaseModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements BaseChatBubbleDelegate.BaseModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.x2 f52128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cam.f f52129c;
        public final Object d;
        public final ChatBubbleDelegate.c e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52130g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final gw0.q f52131h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52132j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52133l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52134m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52135n;

        public Model(String listId, aw0.x2 data, cam.f position, Object obj2, ChatBubbleDelegate.c style, Image image, boolean z, gw0.q qVar, boolean z3, Parcelable parcelable, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f52127a = listId;
            this.f52128b = data;
            this.f52129c = position;
            this.d = obj2;
            this.e = style;
            this.f = image;
            this.f52130g = z;
            this.f52131h = qVar;
            this.i = z3;
            this.f52132j = parcelable;
            this.k = i;
            this.f52133l = i2;
            this.f52134m = i3;
            this.f52135n = i5;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final boolean T(BaseChatBubbleDelegate.BaseModel other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof Model) {
                return Intrinsics.f(this.f52128b, ((Model) other).f52128b);
            }
            return false;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ContextualBarChartDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getD() {
            return this.d;
        }

        @Override // oq0.b
        public final boolean a2() {
            return true;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52127a() {
            return this.f52127a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52127a, model.f52127a) && Intrinsics.f(this.f52128b, model.f52128b) && Intrinsics.f(this.f52129c, model.f52129c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52130g == model.f52130g && Intrinsics.f(this.f52131h, model.f52131h) && this.i == model.i && Intrinsics.f(this.f52132j, model.f52132j) && this.k == model.k && this.f52133l == model.f52133l && this.f52134m == model.f52134m && this.f52135n == model.f52135n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52132j() {
            return this.f52132j;
        }

        @Override // oq0.b
        /* JADX INFO: renamed from: getPosition, reason: from getter */
        public final cam.f getF52129c() {
            return this.f52129c;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        public final Clause getTimestamp() {
            return null;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ChatBubbleDelegate.c getE() {
            return this.e;
        }

        public final int hashCode() {
            int iE = ip0.v7.e(this.f52129c, (this.f52128b.hashCode() + (this.f52127a.hashCode() * 31)) * 31, 31);
            Object obj2 = this.d;
            int iHashCode = (this.e.hashCode() + ((iE + (obj2 == null ? 0 : obj2.hashCode())) * 31)) * 31;
            Image image = this.f;
            int iC = j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f52130g);
            gw0.q qVar = this.f52131h;
            int iC2 = j6.a.c((iC + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.i);
            Parcelable parcelable = this.f52132j;
            return Integer.hashCode(this.f52135n) + j6.a.b(this.f52134m, j6.a.b(this.f52133l, j6.a.b(this.k, (iC2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: isLongClickable, reason: from getter */
        public final boolean getI() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52133l() {
            return this.f52133l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52135n() {
            return this.f52135n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52133l = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: o1, reason: from getter */
        public final boolean getF52130g() {
            return this.f52130g;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel
        /* JADX INFO: renamed from: q1, reason: from getter */
        public final gw0.q getF52131h() {
            return this.f52131h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52132j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52134m() {
            return this.f52134m;
        }

        @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel, oq0.b
        /* JADX INFO: renamed from: v, reason: from getter */
        public final Image getF() {
            return this.f;
        }
    }

    public ContextualBarChartDelegate() {
        super(R$id.internal_contextualBarChartView, new ip0.lb(7));
        this.k = v0.a.d("create(...)");
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final et0.m0 r(BaseChatBubbleDelegate.BaseModel baseModel) {
        Model data = (Model) baseModel;
        Intrinsics.checkNotNullParameter(data, "data");
        return et0.k0.f129059a;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final void t(com.revolut.core.ui_kit.delegates.chat.a aVar, BaseChatBubbleDelegate.BaseModel baseModel, BaseChatBubbleDelegate.BaseModel baseModel2, boolean z) {
        aw0.y2 y2Var;
        j4 holder = (j4) aVar;
        Model data = (Model) baseModel;
        Model model = (Model) baseModel2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zF = Intrinsics.f(data.f52129c, model != null ? model.f52129c : null);
        int iK = 0;
        if (z) {
            aw0.x2 data2 = data.f52128b;
            holder.getClass();
            Intrinsics.checkNotNullParameter(data2, "data");
            if (!Intrinsics.f(data2, holder.f54321r)) {
                holder.f54321r = data2;
                aw0.y2 y2Var2 = data2.f10594a;
                ArrayList arrayList = data2.f10595b;
                LinkedHashMap linkedHashMap = data2.d;
                String str = data2.f10596c;
                int i = -1;
                if (str != null && (y2Var = (aw0.y2) linkedHashMap.get(str)) != null) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        if (Intrinsics.f(((aw0.e5) arrayList.get(i2)).f10289a, str)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    y2Var2 = y2Var;
                }
                holder.o.setHeaderData(y2Var2);
                holder.o.setChartData(arrayList, linkedHashMap, i, !linkedHashMap.isEmpty(), null, data2.e);
            }
        }
        if (!zF) {
            if (!(data.f52129c instanceof gw0.k)) {
                Context context = holder.o.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 12.0f);
            }
            holder.o.setPaddingRelative(iK, iK, iK, iK);
        }
        holder.f54320q = this.k;
    }

    @Override // com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate
    public final com.revolut.core.ui_kit.delegates.chat.a x(ChatSwipeToReplyLayout itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ms0.d0 d0Var = new ms0.d0(context, null, 6, 0);
        d0Var.setId(R$id.internal_contextualBarChartView);
        d0Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new j4(itemView, d0Var);
    }
}
