package com.revolut.feature.crypto.exchange.fees.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ie0.o;
import ip0.v7;
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
import qlm.x;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/model/CryptoExchangeFeesFacade;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class CryptoExchangeFeesFacade implements Parcelable {
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f70824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f70825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f70826c;
    public final List d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeFeesFacade> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70827a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f70827a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacade", aVar, 4);
            pluginGeneratedSerialDescriptor.j("planIds", false);
            pluginGeneratedSerialDescriptor.j("usageVolume", false);
            pluginGeneratedSerialDescriptor.j("feeOnCurrentVolume", false);
            pluginGeneratedSerialDescriptor.j("tiers", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = CryptoExchangeFeesFacade.e;
            return new KSerializer[]{lazyArr[0].getValue(), o.f160615a, x.f247723a, lazyArr[3].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = CryptoExchangeFeesFacade.e;
            dVarBeginStructure.getClass();
            int i = 0;
            List list = null;
            d dVar = null;
            List list2 = null;
            double dDecodeDoubleElement = 0.0d;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else if (iD == 1) {
                    dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, o.f160615a, dVar);
                    i |= 2;
                } else if (iD == 2) {
                    dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (b) lazyArr[3].getValue(), list2);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new CryptoExchangeFeesFacade(i, list, dVar, dDecodeDoubleElement, list2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            CryptoExchangeFeesFacade value = (CryptoExchangeFeesFacade) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = CryptoExchangeFeesFacade.e;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), value.f70824a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, o.f160615a, value.f70825b);
            compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 2, value.f70826c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (h) lazyArr[3].getValue(), value.d);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto.exchange.fees.impl.model.CryptoExchangeFeesFacade$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f70827a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            d dVar = (d) parcel.readSerializable();
            double d = parcel.readDouble();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CryptoExchangeFeesFacade.class, parcel, arrayList, iE, 1);
            }
            return new CryptoExchangeFeesFacade(arrayListCreateStringArrayList, dVar, d, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeFeesFacade[i];
        }
    }

    static {
        k kVar = k.PUBLICATION;
        e = new Lazy[]{j.c(kVar, new wf5.a(0)), null, null, j.c(kVar, new wf5.a(1))};
    }

    public /* synthetic */ CryptoExchangeFeesFacade(int i, List list, d dVar, double d, List list2) {
        if (15 != (i & 15)) {
            j1.f(a.f70827a.getDescriptor(), i, 15);
            throw null;
        }
        this.f70824a = list;
        this.f70825b = dVar;
        this.f70826c = d;
        this.d = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeFeesFacade)) {
            return false;
        }
        CryptoExchangeFeesFacade cryptoExchangeFeesFacade = (CryptoExchangeFeesFacade) obj2;
        return Intrinsics.f(this.f70824a, cryptoExchangeFeesFacade.f70824a) && Intrinsics.f(this.f70825b, cryptoExchangeFeesFacade.f70825b) && Double.compare(this.f70826c, cryptoExchangeFeesFacade.f70826c) == 0 && Intrinsics.f(this.d, cryptoExchangeFeesFacade.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + m72.b.c(v7.c(this.f70824a.hashCode() * 31, 31, this.f70825b), this.f70826c, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f70824a);
        dest.writeSerializable(this.f70825b);
        dest.writeDouble(this.f70826c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public CryptoExchangeFeesFacade(ArrayList planIds, d usageVolume, double d, ArrayList tiers) {
        Intrinsics.checkNotNullParameter(planIds, "planIds");
        Intrinsics.checkNotNullParameter(usageVolume, "usageVolume");
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        this.f70824a = planIds;
        this.f70825b = usageVolume;
        this.f70826c = d;
        this.d = tiers;
    }
}
