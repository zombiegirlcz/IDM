package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateSubaccountFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreateSubaccountFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateSubaccountFlowContract$SubaccountInfo f89018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f89019b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList arrayList = null;
            CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfoCreateFromParcel = parcel.readInt() == 0 ? null : CreateSubaccountFlowContract$SubaccountInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new CreateSubaccountFlowContract$State(createSubaccountFlowContract$SubaccountInfoCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreateSubaccountFlowContract$State[i];
        }
    }

    public CreateSubaccountFlowContract$State(CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo, List list) {
        this.f89018a = createSubaccountFlowContract$SubaccountInfo;
        this.f89019b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreateSubaccountFlowContract$State)) {
            return false;
        }
        CreateSubaccountFlowContract$State createSubaccountFlowContract$State = (CreateSubaccountFlowContract$State) obj2;
        return Intrinsics.f(this.f89018a, createSubaccountFlowContract$State.f89018a) && Intrinsics.f(this.f89019b, createSubaccountFlowContract$State.f89019b);
    }

    public final int hashCode() {
        CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo = this.f89018a;
        int iHashCode = (createSubaccountFlowContract$SubaccountInfo == null ? 0 : createSubaccountFlowContract$SubaccountInfo.hashCode()) * 31;
        List list = this.f89019b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo = this.f89018a;
        if (createSubaccountFlowContract$SubaccountInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            createSubaccountFlowContract$SubaccountInfo.writeToParcel(dest, i);
        }
        List list = this.f89019b;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeSerializable((Serializable) itQ.next());
        }
    }

    public CreateSubaccountFlowContract$State() {
        this(null, null);
    }
}
