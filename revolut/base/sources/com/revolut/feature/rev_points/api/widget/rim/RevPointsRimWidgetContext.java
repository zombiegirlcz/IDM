package com.revolut.feature.rev_points.api.widget.rim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext;", "Lcom/revolut/feature/widgets/api/dependencies/WidgetContext;", "<init>", "()V", "contextKey", "", "Lcom/revolut/feature/widgets/api/model/WidgetContextKey;", "getContextKey", "()Ljava/lang/String;", "HomeTab", "LifestyleTab", "CreditCardTab", "Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext$CreditCardTab;", "Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext$HomeTab;", "Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext$LifestyleTab;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsRimWidgetContext extends WidgetContext {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext$CreditCardTab;", "Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardTab extends RevPointsRimWidgetContext {

        @NotNull
        public static final Parcelable.Creator<CreditCardTab> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83548a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCardTab(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardTab[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditCardTab(String contextKey) {
            super(null);
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            this.f83548a = contextKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreditCardTab) && Intrinsics.f(this.f83548a, ((CreditCardTab) obj2).f83548a);
        }

        @Override // com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext, com.revolut.feature.widgets.api.dependencies.WidgetContext
        /* JADX INFO: renamed from: getContextKey, reason: from getter */
        public final String getF83550a() {
            return this.f83548a;
        }

        public final int hashCode() {
            return this.f83548a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83548a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext$HomeTab;", "Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HomeTab extends RevPointsRimWidgetContext {

        @NotNull
        public static final Parcelable.Creator<HomeTab> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83549a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HomeTab(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeTab[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeTab(String contextKey) {
            super(null);
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            this.f83549a = contextKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HomeTab) && Intrinsics.f(this.f83549a, ((HomeTab) obj2).f83549a);
        }

        @Override // com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext, com.revolut.feature.widgets.api.dependencies.WidgetContext
        /* JADX INFO: renamed from: getContextKey, reason: from getter */
        public final String getF83550a() {
            return this.f83549a;
        }

        public final int hashCode() {
            return this.f83549a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83549a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext$LifestyleTab;", "Lcom/revolut/feature/rev_points/api/widget/rim/RevPointsRimWidgetContext;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LifestyleTab extends RevPointsRimWidgetContext {

        @NotNull
        public static final Parcelable.Creator<LifestyleTab> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83550a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LifestyleTab(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LifestyleTab[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LifestyleTab(String contextKey) {
            super(null);
            Intrinsics.checkNotNullParameter(contextKey, "contextKey");
            this.f83550a = contextKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LifestyleTab) && Intrinsics.f(this.f83550a, ((LifestyleTab) obj2).f83550a);
        }

        @Override // com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext, com.revolut.feature.widgets.api.dependencies.WidgetContext
        /* JADX INFO: renamed from: getContextKey, reason: from getter */
        public final String getF83550a() {
            return this.f83550a;
        }

        public final int hashCode() {
            return this.f83550a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83550a);
        }
    }

    public /* synthetic */ RevPointsRimWidgetContext(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.revolut.feature.widgets.api.dependencies.WidgetContext
    @NotNull
    /* JADX INFO: renamed from: getContextKey */
    public abstract String getF83550a();

    private RevPointsRimWidgetContext() {
    }
}
