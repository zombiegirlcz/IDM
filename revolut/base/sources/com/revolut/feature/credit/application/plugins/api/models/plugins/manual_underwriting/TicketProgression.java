package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/TicketProgression;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Step", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TicketProgression implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TicketProgression> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f66490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66491c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/TicketProgression$Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "com/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/c", "com/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/a", "com/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/b", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Step implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Step> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f66494c;
        public final c d;
        public final b e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Action f66495g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a f66496h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/plugins/manual_underwriting/TicketProgression$Step$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Action implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Action> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66497a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Action(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Action[i];
                }
            }

            public Action(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f66497a = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Action) && Intrinsics.f(this.f66497a, ((Action) obj2).f66497a);
            }

            public final int hashCode() {
                return this.f66497a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f66497a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Step(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Step[i];
            }
        }

        public Step(String title, String str, Long l2, c cVar, b bVar, String str2, Action action, com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a aVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f66492a = title;
            this.f66493b = str;
            this.f66494c = l2;
            this.d = cVar;
            this.e = bVar;
            this.f = str2;
            this.f66495g = action;
            this.f66496h = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Step)) {
                return false;
            }
            Step step = (Step) obj2;
            return Intrinsics.f(this.f66492a, step.f66492a) && Intrinsics.f(this.f66493b, step.f66493b) && Intrinsics.f(this.f66494c, step.f66494c) && this.d == step.d && this.e == step.e && Intrinsics.f(this.f, step.f) && Intrinsics.f(this.f66495g, step.f66495g) && this.f66496h == step.f66496h;
        }

        public final int hashCode() {
            int iHashCode = this.f66492a.hashCode() * 31;
            String str = this.f66493b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l2 = this.f66494c;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            c cVar = this.d;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.e;
            int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.f66495g;
            int iHashCode7 = (iHashCode6 + (action == null ? 0 : action.f66497a.hashCode())) * 31;
            com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a aVar = this.f66496h;
            return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66492a);
            dest.writeString(this.f66493b);
            Long l2 = this.f66494c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            c cVar = this.d;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            b bVar = this.e;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeString(this.f);
            Action action = this.f66495g;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
            com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a aVar = this.f66496h;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Step.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TicketProgression(parcel.readInt(), string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TicketProgression[i];
        }
    }

    public TicketProgression(int i, String headerTitle, ArrayList steps) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f66489a = headerTitle;
        this.f66490b = steps;
        this.f66491c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TicketProgression)) {
            return false;
        }
        TicketProgression ticketProgression = (TicketProgression) obj2;
        return Intrinsics.f(this.f66489a, ticketProgression.f66489a) && this.f66490b.equals(ticketProgression.f66490b) && this.f66491c == ticketProgression.f66491c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66491c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f66490b, this.f66489a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66489a);
        Iterator itY = j6.a.y(this.f66490b, dest);
        while (itY.hasNext()) {
            ((Step) itY.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f66491c);
    }
}
