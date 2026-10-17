package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.messaging.data.api.model.GroupMessageAuthor;
import dv9.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.c0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/Settlement;", "Lcom/revolut/feature/payments/messaging/data/api/model/GroupChatItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Settlement implements GroupChatItem {

    @NotNull
    public static final Parcelable.Creator<Settlement> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f79571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f79572c;
    public final boolean d;
    public final c0 e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Settlement(parcel.readString(), (DateTime) parcel.readSerializable(), n.valueOf(parcel.readString()), parcel.readInt() != 0, (c0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Settlement[i];
        }
    }

    public Settlement(String id10, DateTime date, n direction, boolean z, c0 settlement) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        this.f79570a = id10;
        this.f79571b = date;
        this.f79572c = direction;
        this.d = z;
        this.e = settlement;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.GroupChatItem
    public final GroupMessageAuthor a0() {
        return this.f79572c == n.OUTGOING ? GroupMessageAuthor.CurrentUser.f79520a : new GroupMessageAuthor.Person(oi0.d.k(this.e.b()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Settlement)) {
            return false;
        }
        Settlement settlement = (Settlement) obj2;
        return Intrinsics.f(this.f79570a, settlement.f79570a) && Intrinsics.f(this.f79571b, settlement.f79571b) && this.f79572c == settlement.f79572c && this.d == settlement.d && Intrinsics.f(this.e, settlement.e);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getDate, reason: from getter */
    public final DateTime getF79562b() {
        return this.f79571b;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.GroupChatItem
    public final String h9() {
        if (this.f79572c == n.OUTGOING) {
            return null;
        }
        return oi0.d.p(this.e.b());
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c((this.f79572c.hashCode() + m72.b.f(this.f79571b, this.f79570a.hashCode() * 31, 31)) * 31, 31, this.d);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getF79563c() {
        return this.f79572c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79570a);
        dest.writeSerializable(this.f79571b);
        dest.writeString(this.f79572c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeSerializable(this.e);
    }
}
