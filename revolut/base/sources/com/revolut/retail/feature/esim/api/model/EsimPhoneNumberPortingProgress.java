package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingProgress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingProgress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f100384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f100385c;
    public final Action d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Data", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Data f100387b;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data;", "Landroid/os/Parcelable;", "Url", "CreatePorting", "UpdatePorting", "Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data$CreatePorting;", "Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data$UpdatePorting;", "Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data$Url;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Data extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data$CreatePorting;", "Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class CreatePorting implements Data {

                @NotNull
                public static final Parcelable.Creator<CreatePorting> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f100388a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f100389b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new CreatePorting(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new CreatePorting[i];
                    }
                }

                public CreatePorting(String subscriptionId, String mobilePlanId) {
                    Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
                    Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
                    this.f100388a = subscriptionId;
                    this.f100389b = mobilePlanId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof CreatePorting)) {
                        return false;
                    }
                    CreatePorting createPorting = (CreatePorting) obj2;
                    return Intrinsics.f(this.f100388a, createPorting.f100388a) && Intrinsics.f(this.f100389b, createPorting.f100389b);
                }

                public final int hashCode() {
                    return this.f100389b.hashCode() + (this.f100388a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f100388a);
                    dest.writeString(this.f100389b);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data$UpdatePorting;", "Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class UpdatePorting implements Data {

                @NotNull
                public static final Parcelable.Creator<UpdatePorting> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f100390a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f100391b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f100392c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new UpdatePorting(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new UpdatePorting[i];
                    }
                }

                public UpdatePorting(String subscriptionId, String portingId, String mobilePlanId) {
                    Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
                    Intrinsics.checkNotNullParameter(portingId, "portingId");
                    Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
                    this.f100390a = subscriptionId;
                    this.f100391b = portingId;
                    this.f100392c = mobilePlanId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof UpdatePorting)) {
                        return false;
                    }
                    UpdatePorting updatePorting = (UpdatePorting) obj2;
                    return Intrinsics.f(this.f100390a, updatePorting.f100390a) && Intrinsics.f(this.f100391b, updatePorting.f100391b) && Intrinsics.f(this.f100392c, updatePorting.f100392c);
                }

                public final int hashCode() {
                    return this.f100392c.hashCode() + p.a.c(this.f100390a.hashCode() * 31, 31, this.f100391b);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f100390a);
                    dest.writeString(this.f100391b);
                    dest.writeString(this.f100392c);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data$Url;", "Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingProgress$Action$Data;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Url implements Data {

                @NotNull
                public static final Parcelable.Creator<Url> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f100393a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Url(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Url[i];
                    }
                }

                public Url(String url2) {
                    Intrinsics.checkNotNullParameter(url2, "url");
                    this.f100393a = url2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Url) && Intrinsics.f(this.f100393a, ((Url) obj2).f100393a);
                }

                public final int hashCode() {
                    return this.f100393a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f100393a);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(parcel.readString(), (Data) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(String label, Data data) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f100386a = label;
            this.f100387b = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Action)) {
                return false;
            }
            Action action = (Action) obj2;
            return Intrinsics.f(this.f100386a, action.f100386a) && Intrinsics.f(this.f100387b, action.f100387b);
        }

        public final int hashCode() {
            return this.f100387b.hashCode() + (this.f100386a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100386a);
            dest.writeParcelable(this.f100387b, i);
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
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(EsimPortingStep.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Action.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new EsimPhoneNumberPortingProgress(string, arrayList, arrayList2, parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingProgress[i];
        }
    }

    public EsimPhoneNumberPortingProgress(String title, List steps, List inlineActions, Action action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(inlineActions, "inlineActions");
        this.f100383a = title;
        this.f100384b = steps;
        this.f100385c = inlineActions;
        this.d = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingProgress)) {
            return false;
        }
        EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress = (EsimPhoneNumberPortingProgress) obj2;
        return Intrinsics.f(this.f100383a, esimPhoneNumberPortingProgress.f100383a) && Intrinsics.f(this.f100384b, esimPhoneNumberPortingProgress.f100384b) && Intrinsics.f(this.f100385c, esimPhoneNumberPortingProgress.f100385c) && Intrinsics.f(this.d, esimPhoneNumberPortingProgress.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f100383a.hashCode() * 31, 31, this.f100384b), 31, this.f100385c);
        Action action = this.d;
        return iD + (action == null ? 0 : action.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100383a);
        Iterator itV = p.a.v(this.f100384b, dest);
        while (itV.hasNext()) {
            ((EsimPortingStep) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f100385c, dest);
        while (itV2.hasNext()) {
            ((Action) itV2.next()).writeToParcel(dest, i);
        }
        Action action = this.d;
        if (action == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            action.writeToParcel(dest, i);
        }
    }
}
