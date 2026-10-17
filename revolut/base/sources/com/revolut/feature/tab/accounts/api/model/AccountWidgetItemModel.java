package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemActionsMode;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ola.c;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "EmptyStateStories", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountWidgetItemModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountWidgetItemModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWidgetItemActionsMode f89484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainerBackground f89485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EmptyStateStories f89486c;
    public final Clause d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProductAccountSubtitle f89487g;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories;", "Landroid/os/Parcelable;", "V1", "V2", "Sequence", "DelayedStories", "NotApplicable", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$DelayedStories;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$NotApplicable;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$Sequence;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$V1;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$V2;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface EmptyStateStories extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$DelayedStories;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories;", "<init>", "()V", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @d
        public static final class DelayedStories implements EmptyStateStories {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final DelayedStories f89488a = new DelayedStories();

            @NotNull
            public static final Parcelable.Creator<DelayedStories> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DelayedStories.f89488a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DelayedStories[i];
                }
            }

            private DelayedStories() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$NotApplicable;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories;", "<init>", "()V", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NotApplicable implements EmptyStateStories {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NotApplicable f89489a = new NotApplicable();

            @NotNull
            public static final Parcelable.Creator<NotApplicable> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NotApplicable.f89489a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NotApplicable[i];
                }
            }

            private NotApplicable() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$Sequence;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Sequence implements EmptyStateStories {

            @NotNull
            public static final Parcelable.Creator<Sequence> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f89490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AnimatedBackgroundType f89491b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(V2.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new Sequence(arrayList, (AnimatedBackgroundType) parcel.readParcelable(Sequence.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Sequence[i];
                }
            }

            public Sequence(ArrayList emptyStates, AnimatedBackgroundType animatedBackgroundType) {
                Intrinsics.checkNotNullParameter(emptyStates, "emptyStates");
                this.f89490a = emptyStates;
                this.f89491b = animatedBackgroundType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Sequence)) {
                    return false;
                }
                Sequence sequence = (Sequence) obj2;
                return this.f89490a.equals(sequence.f89490a) && Intrinsics.f(this.f89491b, sequence.f89491b);
            }

            public final int hashCode() {
                int iHashCode = this.f89490a.hashCode() * 31;
                AnimatedBackgroundType animatedBackgroundType = this.f89491b;
                return iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itY = j6.a.y(this.f89490a, dest);
                while (itY.hasNext()) {
                    ((V2) itY.next()).writeToParcel(dest, i);
                }
                dest.writeParcelable(this.f89491b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$V1;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class V1 implements EmptyStateStories {

            @NotNull
            public static final Parcelable.Creator<V1> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f89492a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(V1.class, parcel, arrayList, iE, 1);
                    }
                    return new V1(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new V1[i];
                }
            }

            public V1(List stories) {
                Intrinsics.checkNotNullParameter(stories, "stories");
                this.f89492a = stories;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof V1) && Intrinsics.f(this.f89492a, ((V1) obj2).f89492a);
            }

            public final int hashCode() {
                return this.f89492a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f89492a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories$V2;", "Lcom/revolut/feature/tab/accounts/api/model/AccountWidgetItemModel$EmptyStateStories;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class V2 implements EmptyStateStories {

            @NotNull
            public static final Parcelable.Creator<V2> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f89493a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f89494b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iE = 0;
                    while (iE != i) {
                        iE = j6.a.e(V2.class, parcel, arrayList, iE, 1);
                    }
                    return new V2(arrayList, parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new V2[i];
                }
            }

            public V2(List stories, c cVar) {
                Intrinsics.checkNotNullParameter(stories, "stories");
                this.f89493a = stories;
                this.f89494b = cVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof V2)) {
                    return false;
                }
                V2 v2 = (V2) obj2;
                return Intrinsics.f(this.f89493a, v2.f89493a) && this.f89494b == v2.f89494b;
            }

            public final int hashCode() {
                int iHashCode = this.f89493a.hashCode() * 31;
                c cVar = this.f89494b;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f89493a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
                c cVar = this.f89494b;
                if (cVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(cVar.name());
                }
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountWidgetItemModel((AccountWidgetItemActionsMode) parcel.readParcelable(AccountWidgetItemModel.class.getClassLoader()), (NavBarWithContainerBackground) parcel.readParcelable(AccountWidgetItemModel.class.getClassLoader()), (EmptyStateStories) parcel.readParcelable(AccountWidgetItemModel.class.getClassLoader()), (Clause) parcel.readParcelable(AccountWidgetItemModel.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (ProductAccountSubtitle) parcel.readParcelable(AccountWidgetItemModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountWidgetItemModel[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountWidgetItemModel(List actions, NavBarWithContainerBackground navBarWithContainerBackground, EmptyStateStories emptyStateStories, Clause clause, boolean z, ProductAccountSubtitle productAccountSubtitle, int i) {
        NavBarWithContainerBackground navBarWithContainerBackground2 = (i & 2) != 0 ? null : navBarWithContainerBackground;
        Clause clause2 = (i & 8) != 0 ? null : clause;
        boolean z3 = (i & 32) != 0 ? false : z;
        ProductAccountSubtitle productAccountSubtitle2 = (i & 64) != 0 ? null : productAccountSubtitle;
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(emptyStateStories, "emptyStateStories");
        this((AccountWidgetItemActionsMode) new AccountWidgetItemActionsMode.MultiAction(actions), navBarWithContainerBackground2, emptyStateStories, clause2, false, z3, productAccountSubtitle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountWidgetItemModel)) {
            return false;
        }
        AccountWidgetItemModel accountWidgetItemModel = (AccountWidgetItemModel) obj2;
        return Intrinsics.f(this.f89484a, accountWidgetItemModel.f89484a) && Intrinsics.f(this.f89485b, accountWidgetItemModel.f89485b) && Intrinsics.f(this.f89486c, accountWidgetItemModel.f89486c) && Intrinsics.f(this.d, accountWidgetItemModel.d) && this.e == accountWidgetItemModel.e && this.f == accountWidgetItemModel.f && Intrinsics.f(this.f89487g, accountWidgetItemModel.f89487g);
    }

    public final int hashCode() {
        int iHashCode = this.f89484a.hashCode() * 31;
        NavBarWithContainerBackground navBarWithContainerBackground = this.f89485b;
        int iHashCode2 = (this.f89486c.hashCode() + ((iHashCode + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode())) * 31)) * 31;
        Clause clause = this.d;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e), 31, this.f);
        ProductAccountSubtitle productAccountSubtitle = this.f89487g;
        return iC + (productAccountSubtitle != null ? productAccountSubtitle.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89484a, i);
        dest.writeParcelable(this.f89485b, i);
        dest.writeParcelable(this.f89486c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeParcelable(this.f89487g, i);
    }

    public AccountWidgetItemModel(AccountWidgetItemActionsMode actionsMode, NavBarWithContainerBackground navBarWithContainerBackground, EmptyStateStories emptyStateStories, Clause clause, boolean z, boolean z3, ProductAccountSubtitle productAccountSubtitle) {
        Intrinsics.checkNotNullParameter(actionsMode, "actionsMode");
        Intrinsics.checkNotNullParameter(emptyStateStories, "emptyStateStories");
        this.f89484a = actionsMode;
        this.f89485b = navBarWithContainerBackground;
        this.f89486c = emptyStateStories;
        this.d = clause;
        this.e = z;
        this.f = z3;
        this.f89487g = productAccountSubtitle;
    }

    public /* synthetic */ AccountWidgetItemModel(AccountWidgetItemActionsMode.SingleAction singleAction, Clause clause, ProductAccountSubtitle.Text text) {
        this((AccountWidgetItemActionsMode) singleAction, (NavBarWithContainerBackground) null, (EmptyStateStories) EmptyStateStories.NotApplicable.f89489a, clause, false, false, (ProductAccountSubtitle) text);
    }
}
