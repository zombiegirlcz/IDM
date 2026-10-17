package com.revolut.feature.insurance_embedded.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import gu7.v1;
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
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/PricingPlanBanner;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class PricingPlanBanner implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f75958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75959c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<PricingPlanBanner> CREATOR = new c();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(17)), null};

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75960a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75960a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner", aVar, 3);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("planIds", false);
            pluginGeneratedSerialDescriptor.j("selectedPlanId", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = PricingPlanBanner.d;
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{v1Var, lazyArr[1].getValue(), v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = PricingPlanBanner.d;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            List list = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new PricingPlanBanner(i, strDecodeStringElement, strDecodeStringElement2, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            PricingPlanBanner value = (PricingPlanBanner) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = PricingPlanBanner.d;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75957a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f75958b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f75959c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.PricingPlanBanner$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75960a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanBanner(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanBanner[i];
        }
    }

    public /* synthetic */ PricingPlanBanner(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(a.f75960a.getDescriptor(), i, 7);
            throw null;
        }
        this.f75957a = str;
        this.f75958b = list;
        this.f75959c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanBanner)) {
            return false;
        }
        PricingPlanBanner pricingPlanBanner = (PricingPlanBanner) obj2;
        return Intrinsics.f(this.f75957a, pricingPlanBanner.f75957a) && Intrinsics.f(this.f75958b, pricingPlanBanner.f75958b) && Intrinsics.f(this.f75959c, pricingPlanBanner.f75959c);
    }

    public final int hashCode() {
        return this.f75959c.hashCode() + p.a.d(this.f75957a.hashCode() * 31, 31, this.f75958b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75957a);
        dest.writeStringList(this.f75958b);
        dest.writeString(this.f75959c);
    }

    public PricingPlanBanner(String title, List planIds, String selectedPlanId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(planIds, "planIds");
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        this.f75957a = title;
        this.f75958b = planIds;
        this.f75959c = selectedPlanId;
    }
}
