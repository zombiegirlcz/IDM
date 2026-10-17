package com.revolut.feature.slot_manager.api.model.prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.slot_manager.api.model.prompt.SlotAdoptionJourneyPrompt;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.feature.slot_manager.api.model.prompt.SlotFincrimeChecklistPrompt;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.f;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import rlm.g;
import yhm.j;
import yhm.k;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotPrompt;", "Landroid/os/Parcelable;", "Companion", "Meta", "a", "Lcom/revolut/feature/slot_manager/api/model/prompt/SlotAdoptionJourneyPrompt;", "Lcom/revolut/feature/slot_manager/api/model/prompt/SlotDefaultPrompt;", "Lcom/revolut/feature/slot_manager/api/model/prompt/SlotFincrimeChecklistPrompt;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "contentType")
@mlm.g
public interface SlotPrompt extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f87343a;

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f87343a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            KClass kClassB = p0Var.b(SlotPrompt.class);
            KClass[] kClassArr = {p0Var.b(SlotAdoptionJourneyPrompt.class), p0Var.b(SlotDefaultPrompt.class), p0Var.b(SlotFincrimeChecklistPrompt.class)};
            KSerializer[] kSerializerArr = {SlotAdoptionJourneyPrompt.a.f87318a, SlotDefaultPrompt.a.f87336a, SlotFincrimeChecklistPrompt.a.f87338a};
            Intrinsics.checkNotNullParameter("contentType", "discriminator");
            return new f("com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt", kClassB, kClassArr, kSerializerArr, new Annotation[]{new e()});
        }
    }

    /* JADX INFO: renamed from: H */
    Meta getF87317a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/prompt/SlotPrompt$Meta;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Meta implements Parcelable {
        public static final Lazy[] e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f87341c;
        public final Map d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Meta> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87342a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87342a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt.Meta", aVar, 4);
                pluginGeneratedSerialDescriptor.j("crossScreenId", true);
                pluginGeneratedSerialDescriptor.j("campaignId", false);
                pluginGeneratedSerialDescriptor.j("analyticParams", true);
                pluginGeneratedSerialDescriptor.j("feedbackParams", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Meta.e;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), lazyArr[3].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Meta.e;
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                Map map = null;
                Map map2 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), map);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), map2);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Meta(i, strDecodeStringElement, strDecodeStringElement2, map, map2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Meta value = (Meta) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Meta.e;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(value.f87339a, "")) {
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f87339a);
                }
                String str = value.f87340b;
                Map map = value.d;
                Map map2 = value.f87341c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(map2, r0.g())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), map2);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(map, r0.g())) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (h) lazyArr[3].getValue(), map);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.prompt.SlotPrompt$Meta$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87342a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                int iD2 = 0;
                while (iD2 != i) {
                    iD2 = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD2, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                while (iD != i2) {
                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, 1);
                }
                return new Meta(string, string2, linkedHashMap, linkedHashMap2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Meta[i];
            }
        }

        static {
            k kVar = k.PUBLICATION;
            e = new Lazy[]{null, null, j.c(kVar, new dkd.a(3)), j.c(kVar, new dkd.a(4))};
        }

        public /* synthetic */ Meta(int i, String str, String str2, Map map, Map map2) {
            if (2 != (i & 2)) {
                j1.f(a.f87342a.getDescriptor(), i, 2);
                throw null;
            }
            this.f87339a = (i & 1) == 0 ? "" : str;
            this.f87340b = str2;
            if ((i & 4) == 0) {
                this.f87341c = r0.g();
            } else {
                this.f87341c = map;
            }
            if ((i & 8) == 0) {
                this.d = r0.g();
            } else {
                this.d = map2;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF87340b() {
            return this.f87340b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Map getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Meta)) {
                return false;
            }
            Meta meta = (Meta) obj2;
            return Intrinsics.f(this.f87339a, meta.f87339a) && Intrinsics.f(this.f87340b, meta.f87340b) && Intrinsics.f(this.f87341c, meta.f87341c) && Intrinsics.f(this.d, meta.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.e(p.a.c(this.f87339a.hashCode() * 31, 31, this.f87340b), 31, this.f87341c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87339a);
            dest.writeString(this.f87340b);
            Iterator itZ = j6.a.z(this.f87341c, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            Iterator itZ2 = j6.a.z(this.d, dest);
            while (itZ2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZ2.next();
                dest.writeString((String) entry2.getKey());
                dest.writeString((String) entry2.getValue());
            }
        }

        public Meta(String crossScreenId, String campaignId, LinkedHashMap analyticParams, LinkedHashMap feedbackParams) {
            Intrinsics.checkNotNullParameter(crossScreenId, "crossScreenId");
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            Intrinsics.checkNotNullParameter(analyticParams, "analyticParams");
            Intrinsics.checkNotNullParameter(feedbackParams, "feedbackParams");
            this.f87339a = crossScreenId;
            this.f87340b = campaignId;
            this.f87341c = analyticParams;
            this.d = feedbackParams;
        }
    }
}
