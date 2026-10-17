package com.revolut.sso.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import djl.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/sso/api/navigation/RevolutSsoOperationBoundAuthenticationDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoOperationBoundAuthenticationDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoOperationBoundAuthenticationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106010c;
    public final List d;
    public final c e;
    public final TransitionAnimation f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoOperationBoundAuthenticationDestination(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), c.valueOf(parcel.readString()), (TransitionAnimation) parcel.readParcelable(RevolutSsoOperationBoundAuthenticationDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoOperationBoundAuthenticationDestination[i];
        }
    }

    public /* synthetic */ RevolutSsoOperationBoundAuthenticationDestination(String str, String str2, List list, c cVar) {
        this(str, str2, list, cVar, TransitionAnimation.FADE.f98392a);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF106010c() {
        return this.f106010c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutSsoOperationBoundAuthenticationDestination)) {
            return false;
        }
        RevolutSsoOperationBoundAuthenticationDestination revolutSsoOperationBoundAuthenticationDestination = (RevolutSsoOperationBoundAuthenticationDestination) obj2;
        return Intrinsics.f(this.f106009b, revolutSsoOperationBoundAuthenticationDestination.f106009b) && Intrinsics.f(this.f106010c, revolutSsoOperationBoundAuthenticationDestination.f106010c) && Intrinsics.f(this.d, revolutSsoOperationBoundAuthenticationDestination.d) && this.e == revolutSsoOperationBoundAuthenticationDestination.e && Intrinsics.f(this.f, revolutSsoOperationBoundAuthenticationDestination.f);
    }

    /* JADX INFO: renamed from: getUrl, reason: from getter */
    public final String getF106009b() {
        return this.f106009b;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + p.a.d(p.a.c(this.f106009b.hashCode() * 31, 31, this.f106010c), 31, this.d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106009b);
        dest.writeString(this.f106010c);
        dest.writeStringList(this.d);
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutSsoOperationBoundAuthenticationDestination(String url2, String state, List securityProfiles, c finishConfig, TransitionAnimation animation) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(securityProfiles, "securityProfiles");
        Intrinsics.checkNotNullParameter(finishConfig, "finishConfig");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f106009b = url2;
        this.f106010c = state;
        this.d = securityProfiles;
        this.e = finishConfig;
        this.f = animation;
    }
}
