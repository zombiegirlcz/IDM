package com.revolut.shared.feature.selfserve.entity.config.api.repository;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/shared/feature/selfserve/entity/config/api/repository/EntityConfigRepository$Params", "Landroid/os/Parcelable;", "<init>", "()V", "Config", "Ticket", "Lcom/revolut/shared/feature/selfserve/entity/config/api/repository/EntityConfigRepository$Params$Config;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/repository/EntityConfigRepository$Params$Ticket;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EntityConfigRepository$Params implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/selfserve/entity/config/api/repository/EntityConfigRepository$Params$Config;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/repository/EntityConfigRepository$Params;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Config extends EntityConfigRepository$Params {

        @NotNull
        public static final Parcelable.Creator<Config> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f104893b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Config(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Config[i];
            }
        }

        public Config(String flowName, Map params) {
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f104892a = flowName;
            this.f104893b = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Config)) {
                return false;
            }
            Config config = (Config) obj2;
            return Intrinsics.f(this.f104892a, config.f104892a) && Intrinsics.f(this.f104893b, config.f104893b);
        }

        public final int hashCode() {
            return this.f104893b.hashCode() + (this.f104892a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104892a);
            Iterator itZ = j6.a.z(this.f104893b, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/selfserve/entity/config/api/repository/EntityConfigRepository$Params$Ticket;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/repository/EntityConfigRepository$Params;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Ticket extends EntityConfigRepository$Params {

        @NotNull
        public static final Parcelable.Creator<Ticket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104894a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Ticket(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Ticket[i];
            }
        }

        public Ticket(String ticketId) {
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            this.f104894a = ticketId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Ticket) && Intrinsics.f(this.f104894a, ((Ticket) obj2).f104894a);
        }

        public final int hashCode() {
            return this.f104894a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104894a);
        }
    }

    private EntityConfigRepository$Params() {
    }
}
