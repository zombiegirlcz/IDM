package com.revolut.feature.junior_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import do3.c;
import hha.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_transfer/api/navigation/JuniorBlockInboundTransferNavigation$Sender", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorBlockInboundTransferNavigation$Sender implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorBlockInboundTransferNavigation$Sender> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77415c;
    public final String d;
    public final String e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0 f77416g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorBlockInboundTransferNavigation$Sender(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : w0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorBlockInboundTransferNavigation$Sender[i];
        }
    }

    public JuniorBlockInboundTransferNavigation$Sender(String id10, String firstName, String lastName, String code, String username, c type, w0 w0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f77413a = id10;
        this.f77414b = firstName;
        this.f77415c = lastName;
        this.d = code;
        this.e = username;
        this.f = type;
        this.f77416g = w0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorBlockInboundTransferNavigation$Sender)) {
            return false;
        }
        JuniorBlockInboundTransferNavigation$Sender juniorBlockInboundTransferNavigation$Sender = (JuniorBlockInboundTransferNavigation$Sender) obj2;
        return Intrinsics.f(this.f77413a, juniorBlockInboundTransferNavigation$Sender.f77413a) && Intrinsics.f(this.f77414b, juniorBlockInboundTransferNavigation$Sender.f77414b) && Intrinsics.f(this.f77415c, juniorBlockInboundTransferNavigation$Sender.f77415c) && Intrinsics.f(this.d, juniorBlockInboundTransferNavigation$Sender.d) && Intrinsics.f(this.e, juniorBlockInboundTransferNavigation$Sender.e) && this.f == juniorBlockInboundTransferNavigation$Sender.f && this.f77416g == juniorBlockInboundTransferNavigation$Sender.f77416g;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f77413a.hashCode() * 31, 31, this.f77414b), 31, this.f77415c), 31, this.d), 31, this.e)) * 31;
        w0 w0Var = this.f77416g;
        return iHashCode + (w0Var == null ? 0 : w0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77413a);
        dest.writeString(this.f77414b);
        dest.writeString(this.f77415c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        w0 w0Var = this.f77416g;
        if (w0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(w0Var.name());
        }
    }
}
