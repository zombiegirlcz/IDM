package com.revolut.feature.credit.application.plugins.api.ui.prompts;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/ui/prompts/BEPromptApplicationCancellation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPromptApplicationCancellation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BEPromptApplicationCancellation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DropOutConfig.Action f66904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DropOutConfig.Action f66905b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BEPromptApplicationCancellation((DropOutConfig.Action) parcel.readParcelable(BEPromptApplicationCancellation.class.getClassLoader()), (DropOutConfig.Action) parcel.readParcelable(BEPromptApplicationCancellation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BEPromptApplicationCancellation[i];
        }
    }

    public BEPromptApplicationCancellation(DropOutConfig.Action primaryAction, DropOutConfig.Action secondaryAction) {
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        Intrinsics.checkNotNullParameter(secondaryAction, "secondaryAction");
        this.f66904a = primaryAction;
        this.f66905b = secondaryAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BEPromptApplicationCancellation)) {
            return false;
        }
        BEPromptApplicationCancellation bEPromptApplicationCancellation = (BEPromptApplicationCancellation) obj2;
        return Intrinsics.f(this.f66904a, bEPromptApplicationCancellation.f66904a) && Intrinsics.f(this.f66905b, bEPromptApplicationCancellation.f66905b);
    }

    public final int hashCode() {
        return this.f66905b.hashCode() + (this.f66904a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66904a, i);
        dest.writeParcelable(this.f66905b, i);
    }
}
