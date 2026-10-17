package com.revolut.core.ui_kit.storiesdelegates;

import android.os.Parcelable;
import bx0.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel;", "Lqv0/p;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "<init>", "()V", "Content", "Loading", "Error", "bx0/y", "Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel$Content;", "Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel$Error;", "Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel$Loading;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoriesDelegateModel implements p, j, TrackableItem {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel$Content;", "Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content extends StoriesDelegateModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f58266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f58267c;
        public final ArrayList d;
        public final int e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f58268g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(Clause title, boolean z, ArrayList items, int i, boolean z3) {
            super(0);
            Intrinsics.checkNotNullParameter("", "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f58265a = "";
            this.f58266b = title;
            this.f58267c = z;
            this.d = items;
            this.e = i;
            this.f = z3;
            this.f58268g = null;
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF58266b() {
            return this.f58266b;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getE() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58192a() {
            return this.f58265a;
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getF58275c() {
            return this.f58267c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Content)) {
                return false;
            }
            Content content = (Content) obj2;
            return Intrinsics.f(this.f58265a, content.f58265a) && Intrinsics.f(this.f58266b, content.f58266b) && this.f58267c == content.f58267c && Intrinsics.f(this.d, content.d) && this.e == content.e && this.f == content.f && Intrinsics.f(this.f58268g, content.f58268g);
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: f */
        public final List getE() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f58268g;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, j6.a.c(p.a.a(this.f58265a.hashCode() * 31, 31, this.f58266b), 31, this.f58267c), 31), 31), 961, this.f);
            Parcelable parcelable = this.f58268g;
            return iC + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f58268g = parcelable;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel$Error;", "Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends StoriesDelegateModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextClause f58270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f58271c;
        public final TextLocalisedClause d;
        public final TextLocalisedClause e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f58272g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(TextClause title, TextLocalisedClause errorTitle, TextLocalisedClause actionButtonTitle) {
            super(0);
            Intrinsics.checkNotNullParameter("error", "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
            Intrinsics.checkNotNullParameter(actionButtonTitle, "actionButtonTitle");
            this.f58269a = "error";
            this.f58270b = title;
            this.f58271c = true;
            this.d = errorTitle;
            this.e = actionButtonTitle;
            this.f = null;
            this.f58272g = u.c(new ErrorStoriesModel(errorTitle, actionButtonTitle));
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: G */
        public final Clause getF58266b() {
            return this.f58270b;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getE() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58192a() {
            return this.f58269a;
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getF58275c() {
            return this.f58271c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Error)) {
                return false;
            }
            Error error = (Error) obj2;
            return Intrinsics.f(this.f58269a, error.f58269a) && Intrinsics.f(this.f58270b, error.f58270b) && this.f58271c == error.f58271c && Intrinsics.f(this.d, error.d) && Intrinsics.f(this.e, error.e) && Intrinsics.f(this.f, error.f);
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final List getE() {
            return this.f58272g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f;
        }

        public final int hashCode() {
            int iA = t61.a.a(t61.a.a(j6.a.c(v7.b(this.f58269a.hashCode() * 31, 31, this.f58270b), 961, this.f58271c), 31, this.d), 31, this.e);
            Parcelable parcelable = this.f;
            return iA + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel$Loading;", "Lcom/revolut/core/ui_kit/storiesdelegates/StoriesDelegateModel;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading extends StoriesDelegateModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextClause f58274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f58275c;
        public Parcelable d;
        public final List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(TextClause title) {
            super(0);
            Intrinsics.checkNotNullParameter("shimmer", "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f58273a = "shimmer";
            this.f58274b = title;
            this.f58275c = true;
            this.d = null;
            this.e = v.k(new LoadingStoriesModel("shimmer1"), new LoadingStoriesModel("shimmer2"));
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: G */
        public final Clause getF58266b() {
            return this.f58274b;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getE() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58192a() {
            return this.f58273a;
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getF58275c() {
            return this.f58275c;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj2;
            return Intrinsics.f(this.f58273a, loading.f58273a) && Intrinsics.f(this.f58274b, loading.f58274b) && this.f58275c == loading.f58275c && Intrinsics.f(this.d, loading.d);
        }

        @Override // com.revolut.core.ui_kit.storiesdelegates.StoriesDelegateModel
        /* JADX INFO: renamed from: f, reason: from getter */
        public final List getE() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.d;
        }

        public final int hashCode() {
            int iC = j6.a.c(v7.b(this.f58273a.hashCode() * 31, 31, this.f58274b), 961, this.f58275c);
            Parcelable parcelable = this.d;
            return iC + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }
    }

    public /* synthetic */ StoriesDelegateModel(int i) {
        this();
    }

    /* JADX INFO: renamed from: G */
    public abstract Clause getF58266b();

    /* JADX INFO: renamed from: e */
    public abstract boolean getF58275c();

    /* JADX INFO: renamed from: f */
    public abstract List getE();

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem.getClass().equals(getClass())) {
            if ((oldItem instanceof StoriesDelegateModel ? (StoriesDelegateModel) oldItem : null) != null) {
                return new y(!Intrinsics.f(r6.getE(), getE()), !Intrinsics.f(r6.getF58266b(), getF58266b()), ((StoriesDelegateModel) oldItem).getF58275c() != getF58275c());
            }
        }
        return null;
    }

    private StoriesDelegateModel() {
    }
}
