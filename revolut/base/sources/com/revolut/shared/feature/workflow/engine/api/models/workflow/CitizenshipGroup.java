package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/CitizenshipGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CitizenshipGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CitizenshipGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f105578b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CitizenshipGroup(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CitizenshipGroup[i];
        }
    }

    public CitizenshipGroup(String title, ArrayList citizenships) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(citizenships, "citizenships");
        this.f105577a = title;
        this.f105578b = citizenships;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CitizenshipGroup)) {
            return false;
        }
        CitizenshipGroup citizenshipGroup = (CitizenshipGroup) obj2;
        return Intrinsics.f(this.f105577a, citizenshipGroup.f105577a) && this.f105578b.equals(citizenshipGroup.f105578b);
    }

    public final int hashCode() {
        return this.f105578b.hashCode() + (this.f105577a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105577a);
        Iterator itY = j6.a.y(this.f105578b, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
    }
}
