package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.SimpleBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kkf.z5;
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
import mlm.b;
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaAvailabilityContainer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class MtaAvailabilityContainer implements Parcelable {
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f75235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f75236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleBanner f75237c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<MtaAvailabilityContainer> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75238a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75238a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer", aVar, 3);
            pluginGeneratedSerialDescriptor.j("mtaAvailability", false);
            pluginGeneratedSerialDescriptor.j("pendingMtas", false);
            pluginGeneratedSerialDescriptor.j("banner", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = MtaAvailabilityContainer.d;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), nlm.a.c(SimpleBanner.a.f75312a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = MtaAvailabilityContainer.d;
            dVarBeginStructure.getClass();
            List list = null;
            boolean z = true;
            int i = 0;
            List list2 = null;
            SimpleBanner simpleBanner = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else if (iD == 1) {
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), list2);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    simpleBanner = (SimpleBanner) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SimpleBanner.a.f75312a, simpleBanner);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new MtaAvailabilityContainer(i, list, list2, simpleBanner);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            MtaAvailabilityContainer value = (MtaAvailabilityContainer) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = MtaAvailabilityContainer.d;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), value.f75235a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f75236b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, SimpleBanner.a.f75312a, value.f75237c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75238a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(MtaAvailabilityItem.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PendingMta.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new MtaAvailabilityContainer(arrayList, arrayList2, parcel.readInt() == 0 ? null : SimpleBanner.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaAvailabilityContainer[i];
        }
    }

    static {
        k kVar = k.PUBLICATION;
        d = new Lazy[]{j.c(kVar, new z5(28)), j.c(kVar, new z5(29)), null};
    }

    public /* synthetic */ MtaAvailabilityContainer(int i, List list, List list2, SimpleBanner simpleBanner) {
        if (7 != (i & 7)) {
            j1.f(a.f75238a.getDescriptor(), i, 7);
            throw null;
        }
        this.f75235a = list;
        this.f75236b = list2;
        this.f75237c = simpleBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaAvailabilityContainer)) {
            return false;
        }
        MtaAvailabilityContainer mtaAvailabilityContainer = (MtaAvailabilityContainer) obj2;
        return Intrinsics.f(this.f75235a, mtaAvailabilityContainer.f75235a) && Intrinsics.f(this.f75236b, mtaAvailabilityContainer.f75236b) && Intrinsics.f(this.f75237c, mtaAvailabilityContainer.f75237c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f75235a.hashCode() * 31, 31, this.f75236b);
        SimpleBanner simpleBanner = this.f75237c;
        return iD + (simpleBanner == null ? 0 : simpleBanner.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f75235a, dest);
        while (itV.hasNext()) {
            ((MtaAvailabilityItem) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f75236b, dest);
        while (itV2.hasNext()) {
            ((PendingMta) itV2.next()).writeToParcel(dest, i);
        }
        SimpleBanner simpleBanner = this.f75237c;
        if (simpleBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            simpleBanner.writeToParcel(dest, i);
        }
    }

    public MtaAvailabilityContainer(ArrayList mtaAvailability, ArrayList pendingMtas, SimpleBanner simpleBanner) {
        Intrinsics.checkNotNullParameter(mtaAvailability, "mtaAvailability");
        Intrinsics.checkNotNullParameter(pendingMtas, "pendingMtas");
        this.f75235a = mtaAvailability;
        this.f75236b = pendingMtas;
        this.f75237c = simpleBanner;
    }
}
