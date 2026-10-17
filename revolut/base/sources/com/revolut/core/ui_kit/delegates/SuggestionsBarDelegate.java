package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e70;
import ip0.je0;
import ip0.lh0;
import ip0.nh0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0002\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SuggestionsBarDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/nh;", "Lip0/nh0;", "<init>", "()V", "Suggestion", "ip0/lh0", "ip0/jh0", "ip0/kh0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuggestionsBarDelegate extends BaseRecyclerViewDelegate<nh, nh0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53491c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SuggestionsBarDelegate$Suggestion;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Suggestion implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f53494c;
        public final lh0 d;
        public final SuggestionViewStyle e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53495g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f53496h;
        public Parcelable i;

        public Suggestion(String listId, Clause text, ResourceImage resourceImage, lh0 style, SuggestionViewStyle suggestionViewStyle, boolean z, Object obj2, AnalyticsContext analyticsContext, int i) {
            Object obj3 = null;
            resourceImage = (i & 4) != 0 ? null : resourceImage;
            style = (i & 8) != 0 ? lh0.SEMIACCENT : style;
            if ((i & 16) != 0) {
                int i2 = oh.f54562a[style.ordinal()];
                if (i2 == 1) {
                    suggestionViewStyle = new SuggestionViewStyle.Accent(obj3);
                } else if (i2 == 2) {
                    suggestionViewStyle = new SuggestionViewStyle.Semiaccent(obj3);
                } else if (i2 == 3) {
                    suggestionViewStyle = new SuggestionViewStyle.Transparent(obj3);
                } else if (i2 == 4) {
                    suggestionViewStyle = new SuggestionViewStyle.Black(obj3);
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    suggestionViewStyle = new SuggestionViewStyle.Grey(obj3);
                }
            }
            z = (i & 64) != 0 ? true : z;
            obj2 = (i & 128) != 0 ? null : obj2;
            analyticsContext = (i & 256) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(suggestionViewStyle, "suggestionViewStyle");
            this.f53492a = listId;
            this.f53493b = text;
            this.f53494c = resourceImage;
            this.d = style;
            this.e = suggestionViewStyle;
            this.f = true;
            this.f53495g = z;
            this.f53496h = obj2;
            this.i = analyticsContext;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getO() {
            return this.f53496h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52311a() {
            return this.f53492a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) obj2;
            return Intrinsics.f(this.f53492a, suggestion.f53492a) && Intrinsics.f(this.f53493b, suggestion.f53493b) && Intrinsics.f(this.f53494c, suggestion.f53494c) && this.d == suggestion.d && Intrinsics.f(this.e, suggestion.e) && this.f == suggestion.f && this.f53495g == suggestion.f53495g && Intrinsics.f(this.f53496h, suggestion.f53496h) && Intrinsics.f(this.i, suggestion.i);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52313c() {
            return this.i;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f53492a.hashCode() * 31, 31, this.f53493b);
            Image image = this.f53494c;
            int iC = j6.a.c(j6.a.c((this.e.hashCode() + ((this.d.hashCode() + ((iA + (image == null ? 0 : image.hashCode())) * 31)) * 31)) * 31, 31, this.f), 31, this.f53495g);
            Object obj2 = this.f53496h;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.i;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }
    }

    public SuggestionsBarDelegate() {
        super(R$layout.internal_delegate_suggestions_bar, new je0(23));
        this.f53491c = te0.w.y0(new e70(12));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_suggestions_bar);
        z4l.j jVar = new z4l.j(new koi.c(zhm.u.c(p())), false, 14);
        ((RecyclerView) viewR.findViewById(R$id.suggestionsBarDelegate_recyclerView)).setAdapter(jVar);
        return new nh0(viewR, jVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final SuggestionDelegate p() {
        return (SuggestionDelegate) this.f53491c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.nh0 r8, com.revolut.core.ui_kit.delegates.nh r9, int r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate.p(ip0.nh0, com.revolut.core.ui_kit.delegates.nh, int, java.util.List):void");
    }
}
