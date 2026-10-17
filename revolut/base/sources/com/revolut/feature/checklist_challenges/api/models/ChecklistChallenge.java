package com.revolut.feature.checklist_challenges.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallenge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class ChecklistChallenge implements Parcelable {
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChecklistChallengeReward f65776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChecklistChallengeState f65777c;
    public final String d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ChecklistChallenge> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f65778a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f65778a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge", aVar, 4);
            pluginGeneratedSerialDescriptor.j("campaignId", false);
            pluginGeneratedSerialDescriptor.j("reward", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("screenId", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = ChecklistChallenge.e;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), lazyArr[2].getValue(), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = ChecklistChallenge.e;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            ChecklistChallengeReward checklistChallengeReward = null;
            ChecklistChallengeState checklistChallengeState = null;
            String str = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    checklistChallengeReward = (ChecklistChallengeReward) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), checklistChallengeReward);
                    i |= 2;
                } else if (iD == 2) {
                    checklistChallengeState = (ChecklistChallengeState) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), checklistChallengeState);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new ChecklistChallenge(i, strDecodeStringElement, checklistChallengeReward, checklistChallengeState, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            ChecklistChallenge value = (ChecklistChallenge) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = ChecklistChallenge.e;
            String str = value.f65775a;
            String str2 = value.d;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f65776b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f65777c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f65778a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChecklistChallenge(parcel.readString(), (ChecklistChallengeReward) parcel.readParcelable(ChecklistChallenge.class.getClassLoader()), (ChecklistChallengeState) parcel.readParcelable(ChecklistChallenge.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChecklistChallenge[i];
        }
    }

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{null, j.c(kVar, new mfl.b(2)), j.c(kVar, new mfl.b(3)), null};
    }

    public /* synthetic */ ChecklistChallenge(int i, String str, ChecklistChallengeReward checklistChallengeReward, ChecklistChallengeState checklistChallengeState, String str2) {
        if (7 != (i & 7)) {
            j1.f(a.f65778a.getDescriptor(), i, 7);
            throw null;
        }
        this.f65775a = str;
        this.f65776b = checklistChallengeReward;
        this.f65777c = checklistChallengeState;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChecklistChallenge)) {
            return false;
        }
        ChecklistChallenge checklistChallenge = (ChecklistChallenge) obj2;
        return Intrinsics.f(this.f65775a, checklistChallenge.f65775a) && Intrinsics.f(this.f65776b, checklistChallenge.f65776b) && Intrinsics.f(this.f65777c, checklistChallenge.f65777c) && Intrinsics.f(this.d, checklistChallenge.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f65777c.hashCode() + ((this.f65776b.hashCode() + (this.f65775a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65775a);
        dest.writeParcelable(this.f65776b, i);
        dest.writeParcelable(this.f65777c, i);
        dest.writeString(this.d);
    }

    public ChecklistChallenge(String campaignId, ChecklistChallengeReward reward, ChecklistChallengeState state, String str) {
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f65775a = campaignId;
        this.f65776b = reward;
        this.f65777c = state;
        this.d = str;
    }
}
