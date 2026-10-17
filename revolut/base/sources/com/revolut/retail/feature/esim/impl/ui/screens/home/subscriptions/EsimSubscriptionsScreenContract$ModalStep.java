package com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreenContract$GiftRecipientData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ViewSelection", "EsimInstallation", "SubscriptionActivationConfirmation", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep$SubscriptionActivationConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep$ViewSelection;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimSubscriptionsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimInstallation implements EsimSubscriptionsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimInstallation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimProfile f101036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101037b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimInstallation((EsimProfile) parcel.readParcelable(EsimInstallation.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimInstallation[i];
            }
        }

        public EsimInstallation(EsimProfile esimProfile, boolean z) {
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            this.f101036a = esimProfile;
            this.f101037b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EsimInstallation)) {
                return false;
            }
            EsimInstallation esimInstallation = (EsimInstallation) obj2;
            return Intrinsics.f(this.f101036a, esimInstallation.f101036a) && this.f101037b == esimInstallation.f101037b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101037b) + (this.f101036a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101036a, i);
            dest.writeInt(this.f101037b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep$SubscriptionActivationConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionActivationConfirmation implements EsimSubscriptionsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SubscriptionActivationConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101038a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionActivationConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionActivationConfirmation[i];
            }
        }

        public SubscriptionActivationConfirmation(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f101038a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SubscriptionActivationConfirmation) && Intrinsics.f(this.f101038a, ((SubscriptionActivationConfirmation) obj2).f101038a);
        }

        public final int hashCode() {
            return this.f101038a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101038a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep$ViewSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/home/subscriptions/EsimSubscriptionsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewSelection implements EsimSubscriptionsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ViewSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f101039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f101040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101041c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ViewSelection.class, parcel, arrayList, iE, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimDevicePickerControllerScreenContract$GiftRecipientData.CREATOR, parcel, arrayList2, iA, 1);
                }
                return new ViewSelection(parcel.readString(), arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewSelection[i];
            }
        }

        public ViewSelection(String selectedOptionId, ArrayList devices, List giftRecipients) {
            Intrinsics.checkNotNullParameter(devices, "devices");
            Intrinsics.checkNotNullParameter(giftRecipients, "giftRecipients");
            Intrinsics.checkNotNullParameter(selectedOptionId, "selectedOptionId");
            this.f101039a = devices;
            this.f101040b = giftRecipients;
            this.f101041c = selectedOptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ViewSelection)) {
                return false;
            }
            ViewSelection viewSelection = (ViewSelection) obj2;
            return this.f101039a.equals(viewSelection.f101039a) && this.f101040b.equals(viewSelection.f101040b) && Intrinsics.f(this.f101041c, viewSelection.f101041c);
        }

        public final int hashCode() {
            return this.f101041c.hashCode() + p.a.b(this.f101039a.hashCode() * 31, 31, this.f101040b);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f101039a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            ?? r06 = this.f101040b;
            dest.writeInt(r06.size());
            Iterator it8 = r06.iterator();
            while (it8.hasNext()) {
                ((EsimDevicePickerControllerScreenContract$GiftRecipientData) it8.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f101041c);
        }
    }
}
