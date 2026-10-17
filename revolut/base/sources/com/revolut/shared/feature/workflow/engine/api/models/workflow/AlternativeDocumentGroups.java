package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/AlternativeDocumentGroups;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AlternativeDocumentGroups implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AlternativeDocumentGroups> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f105570a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AlternativeDocumentSection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AlternativeDocumentGroups(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AlternativeDocumentGroups[i];
        }
    }

    public AlternativeDocumentGroups(ArrayList sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f105570a = sections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AlternativeDocumentGroups) && this.f105570a.equals(((AlternativeDocumentGroups) obj2).f105570a);
    }

    public final int hashCode() {
        return this.f105570a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f105570a, dest);
        while (itY.hasNext()) {
            ((AlternativeDocumentSection) itY.next()).writeToParcel(dest, i);
        }
    }
}
