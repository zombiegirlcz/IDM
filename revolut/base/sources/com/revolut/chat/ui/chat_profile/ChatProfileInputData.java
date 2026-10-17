package com.revolut.chat.ui.chat_profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.domain.model.ChatMode;
import com.revolut.kompot.common.IOData$Input;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.c0;
import v30.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Landroid/os/Parcelable;", "Assistant", "PrivateBanking", "Support", "Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData$Assistant;", "Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData$PrivateBanking;", "Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData$Support;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatProfileInputData extends IOData$Input, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData$Assistant;", "Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Assistant implements ChatProfileInputData {

        @NotNull
        public static final Parcelable.Creator<Assistant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f51116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ChatMode f51117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f51118c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(o40.a.valueOf(parcel.readString()));
                }
                return new Assistant(arrayList, (ChatMode) parcel.readParcelable(Assistant.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Assistant[i];
            }
        }

        public Assistant(AbstractList features, ChatMode chatMode, UUID uuid) {
            Intrinsics.checkNotNullParameter(features, "features");
            Intrinsics.checkNotNullParameter(chatMode, "chatMode");
            this.f51116a = features;
            this.f51117b = chatMode;
            this.f51118c = uuid;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: J9, reason: from getter */
        public final UUID getD() {
            return this.f51118c;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: P2 */
        public final AgentInfo getF51119a() {
            return null;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: V4 */
        public final s getF51123b() {
            return s.NONE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Assistant)) {
                return false;
            }
            Assistant assistant = (Assistant) obj2;
            return Intrinsics.f(this.f51116a, assistant.f51116a) && Intrinsics.f(this.f51117b, assistant.f51117b) && Intrinsics.f(this.f51118c, assistant.f51118c);
        }

        public final int hashCode() {
            int iHashCode = (this.f51117b.hashCode() + (this.f51116a.hashCode() * 31)) * 31;
            UUID uuid = this.f51118c;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        public final c0 s0() {
            return c0.ASSISTANT;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: u8, reason: from getter */
        public final ChatMode getF51124c() {
            return this.f51117b;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: w2, reason: from getter */
        public final List getF51122a() {
            return this.f51116a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f51116a, dest);
            while (itV.hasNext()) {
                dest.writeString(((o40.a) itV.next()).name());
            }
            dest.writeParcelable(this.f51117b, i);
            dest.writeSerializable(this.f51118c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData$PrivateBanking;", "Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrivateBanking implements ChatProfileInputData {

        @NotNull
        public static final Parcelable.Creator<PrivateBanking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AgentInfo f51119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f51120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s f51121c;
        public final ChatMode d;
        public final UUID e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                AgentInfo agentInfo = (AgentInfo) j6.a.f(parcel, "parcel", PrivateBanking.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(o40.a.valueOf(parcel.readString()));
                }
                return new PrivateBanking(agentInfo, arrayList, s.valueOf(parcel.readString()), (ChatMode) parcel.readParcelable(PrivateBanking.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBanking[i];
            }
        }

        public PrivateBanking(AgentInfo agentInfo, AbstractList features, s chatPricingPlan, ChatMode chatMode, UUID uuid) {
            Intrinsics.checkNotNullParameter(features, "features");
            Intrinsics.checkNotNullParameter(chatPricingPlan, "chatPricingPlan");
            Intrinsics.checkNotNullParameter(chatMode, "chatMode");
            this.f51119a = agentInfo;
            this.f51120b = features;
            this.f51121c = chatPricingPlan;
            this.d = chatMode;
            this.e = uuid;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: J9, reason: from getter */
        public final UUID getD() {
            return this.e;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: P2, reason: from getter */
        public final AgentInfo getF51119a() {
            return this.f51119a;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: V4, reason: from getter */
        public final s getF51123b() {
            return this.f51121c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrivateBanking)) {
                return false;
            }
            PrivateBanking privateBanking = (PrivateBanking) obj2;
            return Intrinsics.f(this.f51119a, privateBanking.f51119a) && Intrinsics.f(this.f51120b, privateBanking.f51120b) && this.f51121c == privateBanking.f51121c && Intrinsics.f(this.d, privateBanking.d) && Intrinsics.f(this.e, privateBanking.e);
        }

        public final int hashCode() {
            AgentInfo agentInfo = this.f51119a;
            int iHashCode = (this.d.hashCode() + ((this.f51121c.hashCode() + p.a.d((agentInfo == null ? 0 : agentInfo.hashCode()) * 31, 31, this.f51120b)) * 31)) * 31;
            UUID uuid = this.e;
            return iHashCode + (uuid != null ? uuid.hashCode() : 0);
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        public final c0 s0() {
            return c0.PRIVATE_BANKING;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: u8, reason: from getter */
        public final ChatMode getF51124c() {
            return this.d;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: w2, reason: from getter */
        public final List getF51122a() {
            return this.f51120b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f51119a, i);
            Iterator itV = p.a.v(this.f51120b, dest);
            while (itV.hasNext()) {
                dest.writeString(((o40.a) itV.next()).name());
            }
            dest.writeString(this.f51121c.name());
            dest.writeParcelable(this.d, i);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData$Support;", "Lcom/revolut/chat/ui/chat_profile/ChatProfileInputData;", "", "toString", "()Ljava/lang/String;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Support implements ChatProfileInputData {

        @NotNull
        public static final Parcelable.Creator<Support> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f51122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f51123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChatMode f51124c;
        public final UUID d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(o40.a.valueOf(parcel.readString()));
                }
                return new Support(arrayList, s.valueOf(parcel.readString()), (ChatMode) parcel.readParcelable(Support.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Support[i];
            }
        }

        public Support(AbstractList features, s chatPricingPlan, ChatMode chatMode, UUID uuid) {
            Intrinsics.checkNotNullParameter(features, "features");
            Intrinsics.checkNotNullParameter(chatPricingPlan, "chatPricingPlan");
            Intrinsics.checkNotNullParameter(chatMode, "chatMode");
            this.f51122a = features;
            this.f51123b = chatPricingPlan;
            this.f51124c = chatMode;
            this.d = uuid;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: J9, reason: from getter */
        public final UUID getD() {
            return this.d;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: P2 */
        public final AgentInfo getF51119a() {
            return null;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: V4, reason: from getter */
        public final s getF51123b() {
            return this.f51123b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Support)) {
                return false;
            }
            Support support = (Support) obj2;
            return Intrinsics.f(this.f51122a, support.f51122a) && this.f51123b == support.f51123b && Intrinsics.f(this.f51124c, support.f51124c) && Intrinsics.f(this.d, support.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f51124c.hashCode() + ((this.f51123b.hashCode() + (this.f51122a.hashCode() * 31)) * 31)) * 31;
            UUID uuid = this.d;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        public final c0 s0() {
            return c0.SUPPORT;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: u8, reason: from getter */
        public final ChatMode getF51124c() {
            return this.f51124c;
        }

        @Override // com.revolut.chat.ui.chat_profile.ChatProfileInputData
        /* JADX INFO: renamed from: w2, reason: from getter */
        public final List getF51122a() {
            return this.f51122a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f51122a, dest);
            while (itV.hasNext()) {
                dest.writeString(((o40.a) itV.next()).name());
            }
            dest.writeString(this.f51123b.name());
            dest.writeParcelable(this.f51124c, i);
            dest.writeSerializable(this.d);
        }
    }

    /* JADX INFO: renamed from: J9 */
    UUID getD();

    /* JADX INFO: renamed from: P2 */
    AgentInfo getF51119a();

    /* JADX INFO: renamed from: V4 */
    s getF51123b();

    c0 s0();

    /* JADX INFO: renamed from: u8 */
    ChatMode getF51124c();

    /* JADX INFO: renamed from: w2 */
    List getF51122a();
}
