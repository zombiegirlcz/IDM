package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/DataPoint;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ril/a", "Configuration", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DataPoint implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DataPoint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ril.a f105375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105377c;
    public final Configuration d;
    public final Integer e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataPoint(ril.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DataPoint[i];
        }
    }

    public DataPoint(ril.a name, String str, String str2, Configuration configuration, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f105375a = name;
        this.f105376b = str;
        this.f105377c = str2;
        this.d = configuration;
        this.e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DataPoint)) {
            return false;
        }
        DataPoint dataPoint = (DataPoint) obj2;
        return this.f105375a == dataPoint.f105375a && Intrinsics.f(this.f105376b, dataPoint.f105376b) && Intrinsics.f(this.f105377c, dataPoint.f105377c) && Intrinsics.f(this.d, dataPoint.d) && Intrinsics.f(this.e, dataPoint.e);
    }

    public final int hashCode() {
        int iHashCode = this.f105375a.hashCode() * 31;
        String str = this.f105376b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f105377c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Configuration configuration = this.d;
        int iHashCode4 = (iHashCode3 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105375a.name());
        dest.writeString(this.f105376b);
        dest.writeString(this.f105377c);
        Configuration configuration = this.d;
        if (configuration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            configuration.writeToParcel(dest, i);
        }
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/DataPoint$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Configuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f105379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f105380c;
        public final Boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Configuration(string, arrayListCreateStringArrayList, boolValueOf, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(String str, List list, Boolean bool, Boolean bool2) {
            this.f105378a = str;
            this.f105379b = list;
            this.f105380c = bool;
            this.d = bool2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj2;
            return Intrinsics.f(this.f105378a, configuration.f105378a) && Intrinsics.f(this.f105379b, configuration.f105379b) && Intrinsics.f(this.f105380c, configuration.f105380c) && Intrinsics.f(this.d, configuration.d);
        }

        public final int hashCode() {
            String str = this.f105378a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.f105379b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.f105380c;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.d;
            return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105378a);
            dest.writeStringList(this.f105379b);
            Boolean bool = this.f105380c;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            Boolean bool2 = this.d;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool2);
            }
        }

        public Configuration() {
            this(null, null, null, null);
        }
    }

    public /* synthetic */ DataPoint(ril.a aVar, String str) {
        this(aVar, str, null, null, null);
    }
}
