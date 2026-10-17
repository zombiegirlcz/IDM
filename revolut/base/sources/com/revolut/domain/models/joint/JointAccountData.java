package com.revolut.domain.models.joint;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/joint/JointAccountData;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JointAccountData implements Serializable, Parcelable {

    @NotNull
    public static final Parcelable.Creator<JointAccountData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId.Joint f60312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f60313c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            AccountId.Joint joint = (AccountId.Joint) parcel.readParcelable(JointAccountData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new JointAccountData(string, joint, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JointAccountData[i];
        }
    }

    public JointAccountData(String peerUserId, AccountId.Joint accountId, List jointPockets) {
        Intrinsics.checkNotNullParameter(peerUserId, "peerUserId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(jointPockets, "jointPockets");
        this.f60311a = peerUserId;
        this.f60312b = accountId;
        this.f60313c = jointPockets;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JointAccountData)) {
            return false;
        }
        JointAccountData jointAccountData = (JointAccountData) obj2;
        return Intrinsics.f(this.f60311a, jointAccountData.f60311a) && Intrinsics.f(this.f60312b, jointAccountData.f60312b) && Intrinsics.f(this.f60313c, jointAccountData.f60313c);
    }

    public final int hashCode() {
        return this.f60313c.hashCode() + ((this.f60312b.hashCode() + (this.f60311a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60311a);
        dest.writeParcelable(this.f60312b, i);
        Iterator itV = p.a.v(this.f60313c, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
