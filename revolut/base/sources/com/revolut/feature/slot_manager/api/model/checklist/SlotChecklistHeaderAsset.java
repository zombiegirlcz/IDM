package com.revolut.feature.slot_manager.api.model.checklist;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
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
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeaderAsset;", "Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeader;", "", "toString", "()Ljava/lang/String;", "Companion", "Asset", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class SlotChecklistHeaderAsset implements SlotChecklistHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Asset f87303c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<SlotChecklistHeaderAsset> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/checklist/SlotChecklistHeaderAsset$Asset;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Asset implements Parcelable {
        public static final Lazy[] d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SlotIconAsset f87305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SlotIconAsset f87306c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Asset> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f87307a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f87307a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderAsset.Asset", aVar, 3);
                pluginGeneratedSerialDescriptor.j("url", false);
                pluginGeneratedSerialDescriptor.j("image", true);
                pluginGeneratedSerialDescriptor.j("badge", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = Asset.d;
                return new KSerializer[]{v1.f247718a, nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c((KSerializer) lazyArr[2].getValue())};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Asset.d;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                SlotIconAsset slotIconAsset = null;
                SlotIconAsset slotIconAsset2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        slotIconAsset = (SlotIconAsset) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), slotIconAsset);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        slotIconAsset2 = (SlotIconAsset) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), slotIconAsset2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Asset(i, strDecodeStringElement, slotIconAsset, slotIconAsset2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Asset value = (Asset) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Asset.d;
                String str = value.f87304a;
                SlotIconAsset slotIconAsset = value.f87306c;
                SlotIconAsset slotIconAsset2 = value.f87305b;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || slotIconAsset2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), slotIconAsset2);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || slotIconAsset != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), slotIconAsset);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderAsset$Asset$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f87307a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Asset(parcel.readString(), (SlotIconAsset) parcel.readParcelable(Asset.class.getClassLoader()), (SlotIconAsset) parcel.readParcelable(Asset.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Asset[i];
            }
        }

        static {
            k kVar = k.PUBLICATION;
            d = new Lazy[]{null, j.c(kVar, new bkd.a(4)), j.c(kVar, new bkd.a(5))};
        }

        public /* synthetic */ Asset(int i, String str, SlotIconAsset slotIconAsset, SlotIconAsset slotIconAsset2) {
            if (1 != (i & 1)) {
                j1.f(a.f87307a.getDescriptor(), i, 1);
                throw null;
            }
            this.f87304a = str;
            if ((i & 2) == 0) {
                this.f87305b = null;
            } else {
                this.f87305b = slotIconAsset;
            }
            if ((i & 4) == 0) {
                this.f87306c = null;
            } else {
                this.f87306c = slotIconAsset2;
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
            if (!(obj2 instanceof Asset)) {
                return false;
            }
            Asset asset = (Asset) obj2;
            return Intrinsics.f(this.f87304a, asset.f87304a) && Intrinsics.f(this.f87305b, asset.f87305b) && Intrinsics.f(this.f87306c, asset.f87306c);
        }

        public final int hashCode() {
            int iHashCode = this.f87304a.hashCode() * 31;
            SlotIconAsset slotIconAsset = this.f87305b;
            int iHashCode2 = (iHashCode + (slotIconAsset == null ? 0 : slotIconAsset.hashCode())) * 31;
            SlotIconAsset slotIconAsset2 = this.f87306c;
            return iHashCode2 + (slotIconAsset2 != null ? slotIconAsset2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f87304a);
            dest.writeParcelable(this.f87305b, i);
            dest.writeParcelable(this.f87306c, i);
        }

        public Asset(String url2, SlotIconAsset slotIconAsset, SlotIconAsset slotIconAsset2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f87304a = url2;
            this.f87305b = slotIconAsset;
            this.f87306c = slotIconAsset2;
        }

        public /* synthetic */ Asset(SlotIconAsset.Symbol symbol) {
            this("", symbol, null);
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87308a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f87308a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ASSET", aVar, 3);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("subtitle", true);
            pluginGeneratedSerialDescriptor.j("asset", false);
            Intrinsics.checkNotNullParameter("type", "discriminator");
            pluginGeneratedSerialDescriptor.l(new d());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, nlm.a.c(v1Var), Asset.a.f87307a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            String str = null;
            Asset asset = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    asset = (Asset) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, Asset.a.f87307a, asset);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new SlotChecklistHeaderAsset(i, strDecodeStringElement, str, asset);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            SlotChecklistHeaderAsset value = (SlotChecklistHeaderAsset) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            String str = value.f87301a;
            String str2 = value.f87302b;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
            }
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, Asset.a.f87307a, value.f87303c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderAsset$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f87308a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotChecklistHeaderAsset(parcel.readString(), parcel.readString(), Asset.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotChecklistHeaderAsset[i];
        }
    }

    public /* synthetic */ SlotChecklistHeaderAsset(int i, String str, String str2, Asset asset) {
        if (5 != (i & 5)) {
            j1.f(a.f87308a.getDescriptor(), i, 5);
            throw null;
        }
        this.f87301a = str;
        if ((i & 2) == 0) {
            this.f87302b = null;
        } else {
            this.f87302b = str2;
        }
        this.f87303c = asset;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotChecklistHeaderAsset)) {
            return false;
        }
        SlotChecklistHeaderAsset slotChecklistHeaderAsset = (SlotChecklistHeaderAsset) obj2;
        return Intrinsics.f(this.f87301a, slotChecklistHeaderAsset.f87301a) && Intrinsics.f(this.f87302b, slotChecklistHeaderAsset.f87302b) && Intrinsics.f(this.f87303c, slotChecklistHeaderAsset.f87303c);
    }

    public final int hashCode() {
        int iHashCode = this.f87301a.hashCode() * 31;
        String str = this.f87302b;
        return this.f87303c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87301a);
        dest.writeString(this.f87302b);
        this.f87303c.writeToParcel(dest, i);
    }

    public SlotChecklistHeaderAsset(String title, String str, Asset asset) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f87301a = title;
        this.f87302b = str;
        this.f87303c = asset;
    }
}
