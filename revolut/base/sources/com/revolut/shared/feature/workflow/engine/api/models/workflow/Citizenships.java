package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Citizenships;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Citizenships implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Citizenships> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f105579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f105580b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CitizenshipGroup.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Citizenships(arrayList, bVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Citizenships[i];
        }
    }

    public Citizenships(ArrayList groups, b bVar) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f105579a = bVar;
        this.f105580b = groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Citizenships)) {
            return false;
        }
        Citizenships citizenships = (Citizenships) obj2;
        return Intrinsics.f(this.f105579a, citizenships.f105579a) && this.f105580b.equals(citizenships.f105580b);
    }

    public final int hashCode() {
        b bVar = this.f105579a;
        return this.f105580b.hashCode() + ((bVar == null ? 0 : bVar.f297794a.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105579a);
        Iterator itY = j6.a.y(this.f105580b, dest);
        while (itY.hasNext()) {
            ((CitizenshipGroup) itY.next()).writeToParcel(dest, i);
        }
    }
}
