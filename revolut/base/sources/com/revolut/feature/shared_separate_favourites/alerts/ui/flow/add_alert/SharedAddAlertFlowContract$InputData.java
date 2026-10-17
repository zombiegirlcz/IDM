package com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.kompot.common.IOData$Input;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Create", "Edit", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$InputData$Create;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$InputData$Edit;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SharedAddAlertFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$InputData$Create;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Create implements SharedAddAlertFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Create> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AddSharedAlertsConfiguration f86692a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Create((AddSharedAlertsConfiguration) parcel.readParcelable(Create.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Create[i];
            }
        }

        public Create(AddSharedAlertsConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f86692a = configuration;
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData
        public final List Q3() {
            return this.f86692a.f86760a;
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData
        public final b Z1() {
            return this.f86692a.f86761b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Create) && Intrinsics.f(this.f86692a, ((Create) obj2).f86692a);
        }

        public final int hashCode() {
            return this.f86692a.hashCode();
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData
        public final AssetIdWithSymbol i7() {
            return this.f86692a.f86762c;
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData
        public final boolean s1() {
            return this.f86692a.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86692a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$InputData$Edit;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/flow/add_alert/SharedAddAlertFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements SharedAddAlertFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertItem f86693a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit((AlertItem) parcel.readParcelable(Edit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(AlertItem alertItem) {
            Intrinsics.checkNotNullParameter(alertItem, "alertItem");
            this.f86693a = alertItem;
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData
        public final List Q3() {
            return u.c(this.f86693a.getF86877b().d);
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData
        public final b Z1() {
            xi0.a aVar = b.Companion;
            String f86878c = this.f86693a.getF86878c();
            aVar.getClass();
            return xi0.a.a(f86878c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Edit) && Intrinsics.f(this.f86693a, ((Edit) obj2).f86693a);
        }

        public final int hashCode() {
            return this.f86693a.hashCode();
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData
        public final AssetIdWithSymbol i7() {
            AlertItem alertItem = this.f86693a;
            return new AssetIdWithSymbol(alertItem.getF86877b().f86863a, alertItem.getF86877b().f86864b);
        }

        @Override // com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData
        public final boolean s1() {
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86693a, i);
        }
    }

    List Q3();

    b Z1();

    AssetIdWithSymbol i7();

    boolean s1();
}
