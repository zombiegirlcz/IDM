package com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transaction/troubleshooter/impl/ui/flow/screen/list/TroubleshooterListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TroubleshooterListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TroubleshooterListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f91893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91894c;
    public final boolean d;
    public final Set e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f91895g;

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
            return new TroubleshooterListScreenContract$InputData(string, arrayListCreateStringArrayList, string2, z, linkedHashSet, parcel.readInt() != 0 ? i : 0, (Clause) parcel.readParcelable(TroubleshooterListScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TroubleshooterListScreenContract$InputData[i];
        }
    }

    public TroubleshooterListScreenContract$InputData(String entityId, List list, String str, boolean z, Set set, boolean z3, Clause clause) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f91892a = entityId;
        this.f91893b = list;
        this.f91894c = str;
        this.d = z;
        this.e = set;
        this.f = z3;
        this.f91895g = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TroubleshooterListScreenContract$InputData)) {
            return false;
        }
        TroubleshooterListScreenContract$InputData troubleshooterListScreenContract$InputData = (TroubleshooterListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91892a, troubleshooterListScreenContract$InputData.f91892a) && Intrinsics.f(this.f91893b, troubleshooterListScreenContract$InputData.f91893b) && Intrinsics.f(this.f91894c, troubleshooterListScreenContract$InputData.f91894c) && this.d == troubleshooterListScreenContract$InputData.d && Intrinsics.f(this.e, troubleshooterListScreenContract$InputData.e) && this.f == troubleshooterListScreenContract$InputData.f && Intrinsics.f(this.f91895g, troubleshooterListScreenContract$InputData.f91895g);
    }

    public final int hashCode() {
        int iHashCode = this.f91892a.hashCode() * 31;
        List list = this.f91893b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f91894c;
        int iC = j6.a.c((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Set set = this.e;
        int iC2 = j6.a.c((iC + (set == null ? 0 : set.hashCode())) * 31, 31, this.f);
        Clause clause = this.f91895g;
        return iC2 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91892a);
        dest.writeStringList(this.f91893b);
        dest.writeString(this.f91894c);
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
        dest.writeParcelable(this.f91895g, i);
    }
}
