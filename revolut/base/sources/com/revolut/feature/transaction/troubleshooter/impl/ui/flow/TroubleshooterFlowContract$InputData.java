package com.revolut.feature.transaction.troubleshooter.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "TroubleshooterList", "Details", "Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$InputData$Details;", "Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$InputData$TroubleshooterList;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TroubleshooterFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$InputData$TroubleshooterList;", "Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TroubleshooterList implements TroubleshooterFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<TroubleshooterList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f91866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f91867c;
        public final boolean d;
        public final Set e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f91868g;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string2 = parcel.readString();
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i2 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                    int iA = 0;
                    while (iA != i2) {
                        iA = o.a(parcel, linkedHashSet2, iA, i);
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new TroubleshooterList(string, arrayListCreateStringArrayList, string2, z, linkedHashSet, parcel.readInt() != 0 ? i : 0, (Clause) parcel.readParcelable(TroubleshooterList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TroubleshooterList[i];
            }
        }

        public TroubleshooterList(String entityId, List list, String str, boolean z, Set set, boolean z3, Clause clause) {
            Intrinsics.checkNotNullParameter(entityId, "entityId");
            this.f91865a = entityId;
            this.f91866b = list;
            this.f91867c = str;
            this.d = z;
            this.e = set;
            this.f = z3;
            this.f91868g = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TroubleshooterList)) {
                return false;
            }
            TroubleshooterList troubleshooterList = (TroubleshooterList) obj2;
            return Intrinsics.f(this.f91865a, troubleshooterList.f91865a) && Intrinsics.f(this.f91866b, troubleshooterList.f91866b) && Intrinsics.f(this.f91867c, troubleshooterList.f91867c) && this.d == troubleshooterList.d && Intrinsics.f(this.e, troubleshooterList.e) && this.f == troubleshooterList.f && Intrinsics.f(this.f91868g, troubleshooterList.f91868g);
        }

        public final int hashCode() {
            int iHashCode = this.f91865a.hashCode() * 31;
            List list = this.f91866b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f91867c;
            int iC = j6.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            Set set = this.e;
            int iC2 = j6.a.c((iC + (set == null ? 0 : set.hashCode())) * 31, 31, this.f);
            Clause clause = this.f91868g;
            return iC2 + (clause != null ? clause.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91865a);
            dest.writeStringList(this.f91866b);
            dest.writeString(this.f91867c);
            dest.writeInt(this.d ? 1 : 0);
            Set set = this.e;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString((String) itQ.next());
                }
            }
            dest.writeInt(this.f ? 1 : 0);
            dest.writeParcelable(this.f91868g, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$InputData$Details;", "Lcom/revolut/feature/transaction/troubleshooter/impl/ui/flow/TroubleshooterFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements TroubleshooterFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Troubleshooter f91863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f91864c;
        public final mff.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), (Troubleshooter) parcel.readParcelable(Details.class.getClassLoader()), parcel.readString(), mff.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String entityId, Troubleshooter troubleshooterModel, String str, mff.a troubleshooterEntityType) {
            Intrinsics.checkNotNullParameter(entityId, "entityId");
            Intrinsics.checkNotNullParameter(troubleshooterModel, "troubleshooterModel");
            Intrinsics.checkNotNullParameter(troubleshooterEntityType, "troubleshooterEntityType");
            this.f91862a = entityId;
            this.f91863b = troubleshooterModel;
            this.f91864c = str;
            this.d = troubleshooterEntityType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f91862a, details.f91862a) && Intrinsics.f(this.f91863b, details.f91863b) && Intrinsics.f(this.f91864c, details.f91864c) && this.d == details.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f91863b.hashCode() + (this.f91862a.hashCode() * 31)) * 31;
            String str = this.f91864c;
            return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91862a);
            dest.writeParcelable(this.f91863b, i);
            dest.writeString(this.f91864c);
            dest.writeString(this.d.name());
        }

        public /* synthetic */ Details(String str, Troubleshooter troubleshooter, mff.a aVar) {
            this(str, troubleshooter, null, aVar);
        }
    }
}
