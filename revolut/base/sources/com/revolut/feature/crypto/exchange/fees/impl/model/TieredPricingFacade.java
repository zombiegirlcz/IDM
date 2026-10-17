package com.revolut.feature.crypto.exchange.fees.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ie0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import qlm.f0;
import qlm.j1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/model/TieredPricingFacade;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class TieredPricingFacade implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f70832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f70833b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TieredPricingFacade> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f70831c = {null, j.c(k.PUBLICATION, new wf5.a(2))};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70834a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f70834a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.exchange.fees.impl.model.TieredPricingFacade", aVar, 2);
            pluginGeneratedSerialDescriptor.j("usageVolume", false);
            pluginGeneratedSerialDescriptor.j("tiers", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{o.f160615a, TieredPricingFacade.f70831c[1].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = TieredPricingFacade.f70831c;
            dVarBeginStructure.getClass();
            d dVar = null;
            boolean z = true;
            int i = 0;
            List list = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, o.f160615a, dVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (b) lazyArr[1].getValue(), list);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new TieredPricingFacade(i, dVar, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            TieredPricingFacade value = (TieredPricingFacade) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = TieredPricingFacade.f70831c;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, o.f160615a, value.f70832a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f70833b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto.exchange.fees.impl.model.TieredPricingFacade$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f70834a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TieredPricingFacade.class, parcel, arrayList, iE, 1);
            }
            return new TieredPricingFacade(dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TieredPricingFacade[i];
        }
    }

    public /* synthetic */ TieredPricingFacade(int i, d dVar, List list) {
        if (3 != (i & 3)) {
            j1.f(a.f70834a.getDescriptor(), i, 3);
            throw null;
        }
        this.f70832a = dVar;
        this.f70833b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TieredPricingFacade)) {
            return false;
        }
        TieredPricingFacade tieredPricingFacade = (TieredPricingFacade) obj2;
        return Intrinsics.f(this.f70832a, tieredPricingFacade.f70832a) && Intrinsics.f(this.f70833b, tieredPricingFacade.f70833b);
    }

    public final int hashCode() {
        return this.f70833b.hashCode() + (this.f70832a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70832a);
        Iterator itV = p.a.v(this.f70833b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public TieredPricingFacade(d usageVolume, ArrayList tiers) {
        Intrinsics.checkNotNullParameter(usageVolume, "usageVolume");
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        this.f70832a = usageVolume;
        this.f70833b = tiers;
    }
}
