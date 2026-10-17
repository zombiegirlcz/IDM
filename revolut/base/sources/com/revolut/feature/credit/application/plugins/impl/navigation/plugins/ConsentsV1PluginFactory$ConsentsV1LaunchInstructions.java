package com.revolut.feature.credit.application.plugins.impl.navigation.plugins;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/navigation/plugins/ConsentsV1PluginFactory$ConsentsV1LaunchInstructions", "Lcom/revolut/feature/credit/application/models/initialization_contract/PluginLaunchInstructions;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentsV1PluginFactory$ConsentsV1LaunchInstructions implements PluginLaunchInstructions {

    @NotNull
    public static final Parcelable.Creator<ConsentsV1PluginFactory$ConsentsV1LaunchInstructions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final su3.a f66916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentViewerScreenConfig f66917b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentsV1PluginFactory$ConsentsV1LaunchInstructions((su3.a) parcel.readSerializable(), (DocumentViewerScreenConfig) parcel.readParcelable(ConsentsV1PluginFactory$ConsentsV1LaunchInstructions.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentsV1PluginFactory$ConsentsV1LaunchInstructions[i];
        }
    }

    public ConsentsV1PluginFactory$ConsentsV1LaunchInstructions(su3.a document, DocumentViewerScreenConfig screenConfig) {
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        this.f66916a = document;
        this.f66917b = screenConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentsV1PluginFactory$ConsentsV1LaunchInstructions)) {
            return false;
        }
        ConsentsV1PluginFactory$ConsentsV1LaunchInstructions consentsV1PluginFactory$ConsentsV1LaunchInstructions = (ConsentsV1PluginFactory$ConsentsV1LaunchInstructions) obj2;
        return Intrinsics.f(this.f66916a, consentsV1PluginFactory$ConsentsV1LaunchInstructions.f66916a) && Intrinsics.f(this.f66917b, consentsV1PluginFactory$ConsentsV1LaunchInstructions.f66917b);
    }

    public final int hashCode() {
        return this.f66917b.hashCode() + (this.f66916a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f66916a);
        dest.writeParcelable(this.f66917b, i);
    }
}
