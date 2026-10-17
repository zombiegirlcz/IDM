package com.revolut.feature.junior_profile.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_profile/api/models/WorkflowConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WorkflowConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77113c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkflowConfiguration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowConfiguration[i];
        }
    }

    public WorkflowConfiguration(String flowName, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        this.f77111a = flowName;
        this.f77112b = str;
        this.f77113c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowConfiguration)) {
            return false;
        }
        WorkflowConfiguration workflowConfiguration = (WorkflowConfiguration) obj2;
        return Intrinsics.f(this.f77111a, workflowConfiguration.f77111a) && Intrinsics.f(this.f77112b, workflowConfiguration.f77112b) && Intrinsics.f(this.f77113c, workflowConfiguration.f77113c) && Intrinsics.f(this.d, workflowConfiguration.d) && Intrinsics.f(this.e, workflowConfiguration.e) && Intrinsics.f(this.f, workflowConfiguration.f);
    }

    public final int hashCode() {
        int iHashCode = this.f77111a.hashCode() * 31;
        String str = this.f77112b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f77113c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77111a);
        dest.writeString(this.f77112b);
        dest.writeString(this.f77113c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
