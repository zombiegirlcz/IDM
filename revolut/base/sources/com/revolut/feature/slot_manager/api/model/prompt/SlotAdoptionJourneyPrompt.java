package com.revolut.feature.slot_manager.api.model.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt;
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
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotAdoptionJourneyPrompt;", "Lcom/revolut/feature/slot_manager/api/model/prompt/SlotPrompt;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class SlotAdoptionJourneyPrompt implements SlotPrompt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotPrompt.Meta f87317a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<SlotAdoptionJourneyPrompt> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87318a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f87318a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ADOPTION_JOURNEY", aVar, 1);
            pluginGeneratedSerialDescriptor.j("metaInformation", false);
            Intrinsics.checkNotNullParameter("contentType", "discriminator");
            pluginGeneratedSerialDescriptor.l(new com.revolut.feature.slot_manager.api.model.prompt.a());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{SlotPrompt.Meta.a.f87342a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            SlotPrompt.Meta meta = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else {
                    if (iD != 0) {
                        throw new UnknownFieldException(iD);
                    }
                    meta = (SlotPrompt.Meta) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, SlotPrompt.Meta.a.f87342a, meta);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new SlotAdoptionJourneyPrompt(i, meta);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            SlotAdoptionJourneyPrompt value = (SlotAdoptionJourneyPrompt) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, SlotPrompt.Meta.a.f87342a, value.f87317a);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotAdoptionJourneyPrompt$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f87318a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotAdoptionJourneyPrompt(SlotPrompt.Meta.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotAdoptionJourneyPrompt[i];
        }
    }

    public /* synthetic */ SlotAdoptionJourneyPrompt(int i, SlotPrompt.Meta meta) {
        if (1 == (i & 1)) {
            this.f87317a = meta;
        } else {
            j1.f(a.f87318a.getDescriptor(), i, 1);
            throw null;
        }
    }

    @Override // com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt
    /* JADX INFO: renamed from: H, reason: from getter */
    public final SlotPrompt.Meta getF87317a() {
        return this.f87317a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SlotAdoptionJourneyPrompt) && Intrinsics.f(this.f87317a, ((SlotAdoptionJourneyPrompt) obj2).f87317a);
    }

    public final int hashCode() {
        return this.f87317a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f87317a.writeToParcel(dest, i);
    }

    public SlotAdoptionJourneyPrompt(SlotPrompt.Meta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.f87317a = meta;
    }
}
