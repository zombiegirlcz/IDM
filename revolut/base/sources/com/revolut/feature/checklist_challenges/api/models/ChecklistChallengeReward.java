package com.revolut.feature.checklist_challenges.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
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
import plm.d;
import qlm.d1;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import rlm.g;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward;", "Landroid/os/Parcelable;", "Companion", "VirtualAsset", "PhysicalCard", "Unknown", "a", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward$PhysicalCard;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward$Unknown;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward$VirtualAsset;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "type")
@mlm.g
public interface ChecklistChallengeReward extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f65796a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward$PhysicalCard;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class PhysicalCard implements ChecklistChallengeReward {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65789c;
        public final String d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<PhysicalCard> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65790a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f65790a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PHYSICAL_CARD", aVar, 4);
                pluginGeneratedSerialDescriptor.j("design", false);
                pluginGeneratedSerialDescriptor.j("designGroup", false);
                pluginGeneratedSerialDescriptor.j("brand", false);
                pluginGeneratedSerialDescriptor.j("thumbnailUrl", false);
                pluginGeneratedSerialDescriptor.l(new b());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, v1Var, v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                String strDecodeStringElement3 = null;
                String strDecodeStringElement4 = null;
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
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new PhysicalCard(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                PhysicalCard value = (PhysicalCard) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f65787a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f65788b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f65789c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward$PhysicalCard$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f65790a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhysicalCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhysicalCard[i];
            }
        }

        public /* synthetic */ PhysicalCard(int i, String str, String str2, String str3, String str4) {
            if (15 != (i & 15)) {
                j1.f(a.f65790a.getDescriptor(), i, 15);
                throw null;
            }
            this.f65787a = str;
            this.f65788b = str2;
            this.f65789c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PhysicalCard)) {
                return false;
            }
            PhysicalCard physicalCard = (PhysicalCard) obj2;
            return Intrinsics.f(this.f65787a, physicalCard.f65787a) && Intrinsics.f(this.f65788b, physicalCard.f65788b) && Intrinsics.f(this.f65789c, physicalCard.f65789c) && Intrinsics.f(this.d, physicalCard.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f65787a.hashCode() * 31, 31, this.f65788b), 31, this.f65789c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65787a);
            dest.writeString(this.f65788b);
            dest.writeString(this.f65789c);
            dest.writeString(this.d);
        }

        public PhysicalCard(String design, String designGroup, String brand, String thumbnailUrl) {
            Intrinsics.checkNotNullParameter(design, "design");
            Intrinsics.checkNotNullParameter(designGroup, "designGroup");
            Intrinsics.checkNotNullParameter(brand, "brand");
            Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
            this.f65787a = design;
            this.f65788b = designGroup;
            this.f65789c = brand;
            this.d = thumbnailUrl;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward$Unknown;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Unknown implements ChecklistChallengeReward {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f65791a = j.c(k.PUBLICATION, new mfl.b(6));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f65791a.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f65796a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward", p0Var.b(ChecklistChallengeReward.class), new KClass[]{p0Var.b(PhysicalCard.class), p0Var.b(Unknown.class), p0Var.b(VirtualAsset.class)}, new KSerializer[]{PhysicalCard.a.f65790a, new d1("com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward.Unknown", Unknown.INSTANCE, new Annotation[]{new b()}), VirtualAsset.a.f65795a}, new Annotation[]{new b()});
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward$VirtualAsset;", "Lcom/revolut/feature/checklist_challenges/api/models/ChecklistChallengeReward;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class VirtualAsset implements ChecklistChallengeReward {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f65792c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f65793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f65794b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<VirtualAsset> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65795a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f65795a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("VIRTUAL_ASSET", aVar, 2);
                pluginGeneratedSerialDescriptor.j("cardDesignNames", false);
                pluginGeneratedSerialDescriptor.j("appThemeNames", false);
                pluginGeneratedSerialDescriptor.l(new b());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = VirtualAsset.f65792c;
                return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = VirtualAsset.f65792c;
                dVarBeginStructure.getClass();
                List list = null;
                boolean z = true;
                int i = 0;
                List list2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new VirtualAsset(list, i, list2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                VirtualAsset value = (VirtualAsset) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = VirtualAsset.f65792c;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), value.f65793a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f65794b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.checklist_challenges.api.models.ChecklistChallengeReward$VirtualAsset$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f65795a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VirtualAsset(parcel.createStringArrayList(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VirtualAsset[i];
            }
        }

        static {
            k kVar = k.PUBLICATION;
            f65792c = new Lazy[]{j.c(kVar, new mfl.b(7)), j.c(kVar, new mfl.b(8))};
        }

        public VirtualAsset(ArrayList cardDesignNames, ArrayList appThemeNames) {
            Intrinsics.checkNotNullParameter(cardDesignNames, "cardDesignNames");
            Intrinsics.checkNotNullParameter(appThemeNames, "appThemeNames");
            this.f65793a = cardDesignNames;
            this.f65794b = appThemeNames;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VirtualAsset)) {
                return false;
            }
            VirtualAsset virtualAsset = (VirtualAsset) obj2;
            return Intrinsics.f(this.f65793a, virtualAsset.f65793a) && Intrinsics.f(this.f65794b, virtualAsset.f65794b);
        }

        public final int hashCode() {
            return this.f65794b.hashCode() + (this.f65793a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f65793a);
            dest.writeStringList(this.f65794b);
        }

        public /* synthetic */ VirtualAsset(List list, int i, List list2) {
            if (3 != (i & 3)) {
                j1.f(a.f65795a.getDescriptor(), i, 3);
                throw null;
            }
            this.f65793a = list;
            this.f65794b = list2;
        }
    }
}
