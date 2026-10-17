package com.revolut.shared.feature.selfserve.entity.config.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "InputData", "a", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EntityConfigDestination extends InternalDestination<InputData> implements KompotDestination {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f104885b;

    @NotNull
    public static final Parcelable.Creator<EntityConfigDestination> CREATOR = new b();

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Config", "Ticket", "ScreenContent", "Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData$Config;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData$ScreenContent;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData$Ticket;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class InputData implements IOData$Input {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104886a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData$Config;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Config extends InputData {

            @NotNull
            public static final Parcelable.Creator<Config> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104887b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final HashMap f104888c;
            public final boolean d;

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
                    return new Config(string, linkedHashMap, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Config[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Config(String flowName, HashMap params, boolean z) {
                super(z);
                Intrinsics.checkNotNullParameter(flowName, "flowName");
                Intrinsics.checkNotNullParameter(params, "params");
                this.f104887b = flowName;
                this.f104888c = params;
                this.d = z;
            }

            @Override // com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination.InputData
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF104886a() {
                return this.d;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF104887b() {
                return this.f104887b;
            }

            public final Map c() {
                return this.f104888c;
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
                return Intrinsics.f(this.f104887b, config.f104887b) && this.f104888c.equals(config.f104888c) && this.d == config.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + ((this.f104888c.hashCode() + (this.f104887b.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104887b);
                HashMap map = this.f104888c;
                dest.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData$ScreenContent;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ScreenContent extends InputData {

            @NotNull
            public static final Parcelable.Creator<ScreenContent> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final FincrimeHomeScreen$V2 f104889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f104890c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ScreenContent(FincrimeHomeScreen$V2.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ScreenContent[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenContent(FincrimeHomeScreen$V2 screen, boolean z) {
                super(z);
                Intrinsics.checkNotNullParameter(screen, "screen");
                this.f104889b = screen;
                this.f104890c = z;
            }

            @Override // com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination.InputData
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF104886a() {
                return this.f104890c;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final FincrimeHomeScreen$V2 getF104889b() {
                return this.f104889b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ScreenContent)) {
                    return false;
                }
                ScreenContent screenContent = (ScreenContent) obj2;
                return Intrinsics.f(this.f104889b, screenContent.f104889b) && this.f104890c == screenContent.f104890c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f104890c) + (this.f104889b.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f104889b.writeToParcel(dest, i);
                dest.writeInt(this.f104890c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData$Ticket;", "Lcom/revolut/shared/feature/selfserve/entity/config/api/navigation/EntityConfigDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Ticket extends InputData {

            @NotNull
            public static final Parcelable.Creator<Ticket> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f104891b;

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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ticket(String ticketId) {
                super(true);
                Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                this.f104891b = ticketId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF104891b() {
                return this.f104891b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Ticket) && Intrinsics.f(this.f104891b, ((Ticket) obj2).f104891b);
            }

            public final int hashCode() {
                return this.f104891b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104891b);
            }
        }

        public InputData(boolean z) {
            this.f104886a = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getF104886a() {
            return this.f104886a;
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EntityConfigDestination((InputData) parcel.readParcelable(EntityConfigDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EntityConfigDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityConfigDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f104885b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f104885b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EntityConfigDestination) && Intrinsics.f(this.f104885b, ((EntityConfigDestination) obj2).f104885b);
    }

    public final int hashCode() {
        return this.f104885b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104885b, i);
    }
}
