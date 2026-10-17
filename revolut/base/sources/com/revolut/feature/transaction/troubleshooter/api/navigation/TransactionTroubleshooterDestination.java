package com.revolut.feature.transaction.troubleshooter.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
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

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0007\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "TroubleshooterList", "Details", "feature_troubleshooter_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionTroubleshooterDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TransactionTroubleshooterDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f91854b;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination$Details;", "Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements InputData {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Troubleshooter f91856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mff.a f91857c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), Troubleshooter.CREATOR.createFromParcel(parcel), mff.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String entityId, Troubleshooter troubleshooterModel, mff.a troubleshooterEntityType) {
            Intrinsics.checkNotNullParameter(entityId, "entityId");
            Intrinsics.checkNotNullParameter(troubleshooterModel, "troubleshooterModel");
            Intrinsics.checkNotNullParameter(troubleshooterEntityType, "troubleshooterEntityType");
            this.f91855a = entityId;
            this.f91856b = troubleshooterModel;
            this.f91857c = troubleshooterEntityType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF91855a() {
            return this.f91855a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final mff.a getF91857c() {
            return this.f91857c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Troubleshooter getF91856b() {
            return this.f91856b;
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
            return Intrinsics.f(this.f91855a, details.f91855a) && Intrinsics.f(this.f91856b, details.f91856b) && this.f91857c == details.f91857c;
        }

        public final int hashCode() {
            return this.f91857c.hashCode() + ((this.f91856b.hashCode() + (this.f91855a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91855a);
            this.f91856b.writeToParcel(dest, i);
            dest.writeString(this.f91857c.name());
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination$Details;", "Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination$TroubleshooterList;", "feature_troubleshooter_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InputData extends IOData$Input {
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionTroubleshooterDestination((InputData) parcel.readParcelable(TransactionTroubleshooterDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionTroubleshooterDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionTroubleshooterDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f91854b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f91854b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransactionTroubleshooterDestination) && Intrinsics.f(this.f91854b, ((TransactionTroubleshooterDestination) obj2).f91854b);
    }

    public final int hashCode() {
        return this.f91854b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91854b, i);
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination$TroubleshooterList;", "Lcom/revolut/feature/transaction/troubleshooter/api/navigation/TransactionTroubleshooterDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TroubleshooterList implements InputData {

        @NotNull
        public static final Parcelable.Creator<TroubleshooterList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f91859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f91860c;
        public final boolean d;
        public final Set e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f91861g;

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
            this.f91858a = entityId;
            this.f91859b = list;
            this.f91860c = str;
            this.d = z;
            this.e = set;
            this.f = z3;
            this.f91861g = clause;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final Clause getF91861g() {
            return this.f91861g;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF91858a() {
            return this.f91858a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF91860c() {
            return this.f91860c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Set getE() {
            return this.e;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final List getF91859b() {
            return this.f91859b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TroubleshooterList)) {
                return false;
            }
            TroubleshooterList troubleshooterList = (TroubleshooterList) obj2;
            return Intrinsics.f(this.f91858a, troubleshooterList.f91858a) && Intrinsics.f(this.f91859b, troubleshooterList.f91859b) && Intrinsics.f(this.f91860c, troubleshooterList.f91860c) && this.d == troubleshooterList.d && Intrinsics.f(this.e, troubleshooterList.e) && this.f == troubleshooterList.f && Intrinsics.f(this.f91861g, troubleshooterList.f91861g);
        }

        public final int hashCode() {
            int iHashCode = this.f91858a.hashCode() * 31;
            List list = this.f91859b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f91860c;
            int iC = j6.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            Set set = this.e;
            int iC2 = j6.a.c((iC + (set == null ? 0 : set.hashCode())) * 31, 31, this.f);
            Clause clause = this.f91861g;
            return iC2 + (clause != null ? clause.hashCode() : 0);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91858a);
            dest.writeStringList(this.f91859b);
            dest.writeString(this.f91860c);
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
            dest.writeParcelable(this.f91861g, i);
        }

        public /* synthetic */ TroubleshooterList(String str, List list, String str2, boolean z, Set set, int i) {
            this(str, list, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : set, (i & 32) == 0, null);
        }
    }
}
