package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig;
import com.revolut.kompot.common.IOData$Input;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreateSubaccountFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreateSubaccountFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f89015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreateSubaccountProductArticleConfig f89016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89017c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(CreateSubaccountFlowContract$InputData.class, parcel, linkedHashSet2, iE, 1);
                }
                linkedHashSet = linkedHashSet2;
            }
            return new CreateSubaccountFlowContract$InputData((CreateSubaccountProductArticleConfig) parcel.readParcelable(CreateSubaccountFlowContract$InputData.class.getClassLoader()), parcel.readString(), linkedHashSet, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreateSubaccountFlowContract$InputData[i];
        }
    }

    public CreateSubaccountFlowContract$InputData(CreateSubaccountProductArticleConfig createSubaccountProductArticleConfig, String str, Set set, boolean z) {
        this.f89015a = set;
        this.f89016b = createSubaccountProductArticleConfig;
        this.f89017c = z;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreateSubaccountFlowContract$InputData)) {
            return false;
        }
        CreateSubaccountFlowContract$InputData createSubaccountFlowContract$InputData = (CreateSubaccountFlowContract$InputData) obj2;
        return Intrinsics.f(this.f89015a, createSubaccountFlowContract$InputData.f89015a) && Intrinsics.f(this.f89016b, createSubaccountFlowContract$InputData.f89016b) && this.f89017c == createSubaccountFlowContract$InputData.f89017c && Intrinsics.f(this.d, createSubaccountFlowContract$InputData.d);
    }

    public final int hashCode() {
        Set set = this.f89015a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        CreateSubaccountProductArticleConfig createSubaccountProductArticleConfig = this.f89016b;
        int iC = j6.a.c((iHashCode + (createSubaccountProductArticleConfig == null ? 0 : createSubaccountProductArticleConfig.hashCode())) * 31, 31, this.f89017c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Set set = this.f89015a;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        dest.writeParcelable(this.f89016b, i);
        dest.writeInt(this.f89017c ? 1 : 0);
        dest.writeString(this.d);
    }

    public /* synthetic */ CreateSubaccountFlowContract$InputData(Set set, CreateSubaccountProductArticleConfig createSubaccountProductArticleConfig, String str, int i) {
        this((i & 2) != 0 ? null : createSubaccountProductArticleConfig, str, set, (i & 4) == 0);
    }
}
