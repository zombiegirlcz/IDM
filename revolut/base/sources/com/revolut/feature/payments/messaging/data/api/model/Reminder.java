package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.messaging.data.api.model.GroupMessageAuthor;
import dv9.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.t;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/Reminder;", "Lcom/revolut/feature/payments/messaging/data/api/model/GroupChatItem;", "", "toString", "()Ljava/lang/String;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Reminder implements GroupChatItem {

    @NotNull
    public static final Parcelable.Creator<Reminder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f79568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f79569c;
    public final t d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Reminder(parcel.readString(), (DateTime) parcel.readSerializable(), n.valueOf(parcel.readString()), (t) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Reminder[i];
        }
    }

    public Reminder(String id10, DateTime date, n direction, t reminder) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(reminder, "reminder");
        this.f79567a = id10;
        this.f79568b = date;
        this.f79569c = direction;
        this.d = reminder;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.GroupChatItem
    public final GroupMessageAuthor a0() {
        return GroupMessageAuthor.CurrentUser.f79520a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Reminder)) {
            return false;
        }
        Reminder reminder = (Reminder) obj2;
        return Intrinsics.f(this.f79567a, reminder.f79567a) && Intrinsics.f(this.f79568b, reminder.f79568b) && this.f79569c == reminder.f79569c && Intrinsics.f(this.d, reminder.d);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: getDate, reason: from getter */
    public final DateTime getF79568b() {
        return this.f79568b;
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.GroupChatItem
    public final String h9() {
        return null;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f79569c.hashCode() + m72.b.f(this.f79568b, this.f79567a.hashCode() * 31, 31)) * 31);
    }

    @Override // com.revolut.feature.payments.messaging.data.api.model.ChatItem
    /* JADX INFO: renamed from: k, reason: from getter */
    public final n getF79569c() {
        return this.f79569c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79567a);
        dest.writeSerializable(this.f79568b);
        dest.writeString(this.f79569c.name());
        dest.writeSerializable(this.d);
    }
}
