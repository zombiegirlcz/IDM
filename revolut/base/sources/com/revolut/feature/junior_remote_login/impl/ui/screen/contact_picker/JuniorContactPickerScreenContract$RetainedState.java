package com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_remote_login/impl/ui/screen/contact_picker/JuniorContactPickerScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorContactPickerScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<JuniorContactPickerScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f77217c;
    public final f d;
    public final f e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iC = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iC2 = 0;
                while (iC2 != i) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
            }
            return new JuniorContactPickerScreenContract$RetainedState(string, arrayList, arrayList2, (f) parcel.readSerializable(), (f) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorContactPickerScreenContract$RetainedState[i];
        }
    }

    public JuniorContactPickerScreenContract$RetainedState(String searchQuery, List list, List list2, f fVar, f fVar2) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f77215a = searchQuery;
        this.f77216b = list;
        this.f77217c = list2;
        this.d = fVar;
        this.e = fVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorContactPickerScreenContract$RetainedState)) {
            return false;
        }
        JuniorContactPickerScreenContract$RetainedState juniorContactPickerScreenContract$RetainedState = (JuniorContactPickerScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f77215a, juniorContactPickerScreenContract$RetainedState.f77215a) && Intrinsics.f(this.f77216b, juniorContactPickerScreenContract$RetainedState.f77216b) && Intrinsics.f(this.f77217c, juniorContactPickerScreenContract$RetainedState.f77217c) && Intrinsics.f(this.d, juniorContactPickerScreenContract$RetainedState.d) && Intrinsics.f(this.e, juniorContactPickerScreenContract$RetainedState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f77215a.hashCode() * 31;
        List list = this.f77216b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f77217c;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        f fVar = this.d;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.e;
        return iHashCode4 + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77215a);
        List list = this.f77216b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        List list2 = this.f77217c;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeSerializable((Serializable) itQ2.next());
            }
        }
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
