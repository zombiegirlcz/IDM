package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemActionsMode;", "Landroid/os/Parcelable;", "MultiAction", "SingleAction", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemActionsMode$MultiAction;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemActionsMode$SingleAction;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountWidgetItemActionsMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemActionsMode$MultiAction;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemActionsMode;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MultiAction implements AccountWidgetItemActionsMode {

        @NotNull
        public static final Parcelable.Creator<MultiAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f89482a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ProductAccountWidgetAction.CREATOR, parcel, arrayList, iA, 1);
                }
                return new MultiAction(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultiAction[i];
            }
        }

        public MultiAction(List actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f89482a = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MultiAction) && Intrinsics.f(this.f89482a, ((MultiAction) obj2).f89482a);
        }

        public final int hashCode() {
            return this.f89482a.hashCode();
        }

        @Override // com.revolut.feature.tab.accounts.api.model.AccountWidgetItemActionsMode
        /* JADX INFO: renamed from: o, reason: from getter */
        public final List getF89482a() {
            return this.f89482a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f89482a, dest);
            while (itV.hasNext()) {
                ((ProductAccountWidgetAction) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemActionsMode$SingleAction;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemActionsMode;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleAction implements AccountWidgetItemActionsMode {

        @NotNull
        public static final Parcelable.Creator<SingleAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductAccountWidgetAction f89483a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleAction(ProductAccountWidgetAction.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleAction[i];
            }
        }

        public SingleAction(ProductAccountWidgetAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f89483a = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SingleAction) && Intrinsics.f(this.f89483a, ((SingleAction) obj2).f89483a);
        }

        public final int hashCode() {
            return this.f89483a.hashCode();
        }

        @Override // com.revolut.feature.tab.accounts.api.model.AccountWidgetItemActionsMode
        /* JADX INFO: renamed from: o */
        public final List getF89482a() {
            return u.c(this.f89483a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89483a.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: o */
    List getF89482a();
}
