package com.revolut.feature.contacts_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "ContactChooserScreenBridgeDestination", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactsChooserFeatureConfig extends KompotBridgeFeatureConfig {

    @NotNull
    public static final Parcelable.Creator<ContactsChooserFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ContactsChooserConfiguration f66059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f66060h;

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/navigation/ContactsChooserFeatureConfig$ContactChooserScreenBridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactChooserScreenBridgeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ContactChooserScreenBridgeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContactsChooserConfiguration f66061a;

        /* JADX INFO: loaded from: classes21.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContactChooserScreenBridgeDestination(ContactsChooserConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactChooserScreenBridgeDestination[i];
            }
        }

        public ContactChooserScreenBridgeDestination(ContactsChooserConfiguration chooserConfiguration) {
            Intrinsics.checkNotNullParameter(chooserConfiguration, "chooserConfiguration");
            this.f66061a = chooserConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContactChooserScreenBridgeDestination) && Intrinsics.f(this.f66061a, ((ContactChooserScreenBridgeDestination) obj2).f66061a);
        }

        public final int hashCode() {
            return this.f66061a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f66061a.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContactsChooserFeatureConfig(ContactsChooserConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ContactsChooserFeatureConfig[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsChooserFeatureConfig(ContactsChooserConfiguration configuration, Integer num) {
        super((ActivityAnimation) null, (ParcelableDestination) new ContactChooserScreenBridgeDestination(configuration), false, num, 0, 53);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f66059g = configuration;
        this.f66060h = num;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getF66060h() {
        return this.f66060h;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ContactsChooserFeatureConfig)) {
            return false;
        }
        ContactsChooserFeatureConfig contactsChooserFeatureConfig = (ContactsChooserFeatureConfig) obj2;
        return Intrinsics.f(this.f66059g, contactsChooserFeatureConfig.f66059g) && Intrinsics.f(this.f66060h, contactsChooserFeatureConfig.f66060h);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iHashCode = this.f66059g.hashCode() * 31;
        Integer num = this.f66060h;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f66059g.writeToParcel(dest, i);
        Integer num = this.f66060h;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
