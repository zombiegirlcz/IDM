package com.revolut.feature.freelancer.impl.ui.prompt.post_activation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/prompt/post_activation/ProPostActivationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProPostActivationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ProPostActivationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr6.a f74093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProPostActivationScreenContract$Action f74094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f74095c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProPostActivationScreenContract$InputData(dr6.a.valueOf(parcel.readString()), (ProPostActivationScreenContract$Action) parcel.readParcelable(ProPostActivationScreenContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ProPostActivationScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProPostActivationScreenContract$InputData[i];
        }
    }

    public ProPostActivationScreenContract$InputData(dr6.a onboardingArticleContext, ProPostActivationScreenContract$Action notNowAction, NaviCommand mainScreenCommand) {
        Intrinsics.checkNotNullParameter(onboardingArticleContext, "onboardingArticleContext");
        Intrinsics.checkNotNullParameter(notNowAction, "notNowAction");
        Intrinsics.checkNotNullParameter(mainScreenCommand, "mainScreenCommand");
        this.f74093a = onboardingArticleContext;
        this.f74094b = notNowAction;
        this.f74095c = mainScreenCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProPostActivationScreenContract$InputData)) {
            return false;
        }
        ProPostActivationScreenContract$InputData proPostActivationScreenContract$InputData = (ProPostActivationScreenContract$InputData) obj2;
        return this.f74093a == proPostActivationScreenContract$InputData.f74093a && Intrinsics.f(this.f74094b, proPostActivationScreenContract$InputData.f74094b) && Intrinsics.f(this.f74095c, proPostActivationScreenContract$InputData.f74095c);
    }

    public final int hashCode() {
        return this.f74095c.hashCode() + ((this.f74094b.hashCode() + (this.f74093a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74093a.name());
        dest.writeParcelable(this.f74094b, i);
        dest.writeParcelable(this.f74095c, i);
    }
}
