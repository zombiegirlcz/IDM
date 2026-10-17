package com.revolut.feature.insurance_home.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_home.impl.data.model.ProductSummary;
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
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "lw7/a", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class Action implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw7.a f76167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76169c;
    public final ProductSummary d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<Action> CREATOR = new c();
    public static final Lazy[] e = {j.c(k.PUBLICATION, new lv4.b(6)), null, null, null};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76170a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f76170a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_home.impl.data.model.Action", aVar, 4);
            pluginGeneratedSerialDescriptor.j("type", true);
            pluginGeneratedSerialDescriptor.j("articleId", true);
            pluginGeneratedSerialDescriptor.j("product", true);
            pluginGeneratedSerialDescriptor.j("productSummary", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{Action.e[0].getValue(), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(ProductSummary.a.f76205a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Action.e;
            dVarBeginStructure.getClass();
            int i = 0;
            lw7.a aVar = null;
            String str = null;
            String str2 = null;
            ProductSummary productSummary = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    aVar = (lw7.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), aVar);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else if (iD == 2) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    productSummary = (ProductSummary) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ProductSummary.a.f76205a, productSummary);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new Action(i, aVar, str, str2, productSummary);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            Action value = (Action) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = Action.e;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f76167a != lw7.a.UNKNOWN) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (h) lazyArr[0].getValue(), value.f76167a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f76168b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f76168b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f76169c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f76169c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ProductSummary.a.f76205a, value.d);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.Action$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f76170a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Action(lw7.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProductSummary.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Action[i];
        }
    }

    public /* synthetic */ Action(int i, lw7.a aVar, String str, String str2, ProductSummary productSummary) {
        this.f76167a = (i & 1) == 0 ? lw7.a.UNKNOWN : aVar;
        if ((i & 2) == 0) {
            this.f76168b = null;
        } else {
            this.f76168b = str;
        }
        if ((i & 4) == 0) {
            this.f76169c = null;
        } else {
            this.f76169c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = productSummary;
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
        if (!(obj2 instanceof Action)) {
            return false;
        }
        Action action = (Action) obj2;
        return this.f76167a == action.f76167a && Intrinsics.f(this.f76168b, action.f76168b) && Intrinsics.f(this.f76169c, action.f76169c) && Intrinsics.f(this.d, action.d);
    }

    public final int hashCode() {
        int iHashCode = this.f76167a.hashCode() * 31;
        String str = this.f76168b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f76169c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProductSummary productSummary = this.d;
        return iHashCode3 + (productSummary != null ? productSummary.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76167a.name());
        dest.writeString(this.f76168b);
        dest.writeString(this.f76169c);
        ProductSummary productSummary = this.d;
        if (productSummary == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productSummary.writeToParcel(dest, i);
        }
    }

    public Action(lw7.a type, String str, String str2, ProductSummary productSummary) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f76167a = type;
        this.f76168b = str;
        this.f76169c = str2;
        this.d = productSummary;
    }

    public Action() {
        this(lw7.a.UNKNOWN, null, null, null);
    }
}
