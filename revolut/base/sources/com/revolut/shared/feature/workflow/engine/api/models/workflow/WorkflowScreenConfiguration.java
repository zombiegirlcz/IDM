package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/WorkflowScreenConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowScreenConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WorkflowScreenConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105670c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ScreenConfigurationItem.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new WorkflowScreenConfiguration(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowScreenConfiguration[i];
        }
    }

    public WorkflowScreenConfiguration(String str, String str2, String str3, ArrayList arrayList) {
        this.f105668a = str;
        this.f105669b = str2;
        this.f105670c = str3;
        this.d = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WorkflowScreenConfiguration)) {
            return false;
        }
        WorkflowScreenConfiguration workflowScreenConfiguration = (WorkflowScreenConfiguration) obj2;
        return Intrinsics.f(this.f105668a, workflowScreenConfiguration.f105668a) && Intrinsics.f(this.f105669b, workflowScreenConfiguration.f105669b) && Intrinsics.f(this.f105670c, workflowScreenConfiguration.f105670c) && Intrinsics.f(this.d, workflowScreenConfiguration.d);
    }

    public final int hashCode() {
        String str = this.f105668a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f105669b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f105670c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105668a);
        dest.writeString(this.f105669b);
        dest.writeString(this.f105670c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((ScreenConfigurationItem) itQ.next()).writeToParcel(dest, i);
        }
    }
}
