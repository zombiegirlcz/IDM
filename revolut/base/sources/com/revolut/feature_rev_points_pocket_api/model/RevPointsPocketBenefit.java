package com.revolut.feature_rev_points_pocket_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import ie0.o;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m1c.n1;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/model/RevPointsPocketBenefit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RevPointsPocketBenefit implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f97780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f97781c;
    public final int d;
    public final d e;
    public final String f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPointsPocketBenefit> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97782a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f97782a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit", aVar, 6);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("pointsYearly", false);
            pluginGeneratedSerialDescriptor.j("minBalance", false);
            pluginGeneratedSerialDescriptor.j("milesEquivalent", false);
            pluginGeneratedSerialDescriptor.j("staysDiscount", false);
            pluginGeneratedSerialDescriptor.j("imageUri", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            o oVar = o.f160615a;
            return new KSerializer[]{v1Var, n1.f201419a, oVar, n0.f247680a, oVar, v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            int iDecodeIntElement = 0;
            String strDecodeStringElement = null;
            RevPoints revPoints = null;
            d dVar = null;
            d dVar2 = null;
            String strDecodeStringElement2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        revPoints = (RevPoints) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, n1.f201419a, revPoints);
                        i |= 2;
                        break;
                    case 2:
                        dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, o.f160615a, dVar);
                        i |= 4;
                        break;
                    case 3:
                        iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        dVar2 = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, o.f160615a, dVar2);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new RevPointsPocketBenefit(i, strDecodeStringElement, revPoints, dVar, iDecodeIntElement, dVar2, strDecodeStringElement2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RevPointsPocketBenefit value = (RevPointsPocketBenefit) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f97779a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, n1.f201419a, value.f97780b);
            o oVar = o.f160615a;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, oVar, value.f97781c);
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, oVar, value.e);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f97782a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsPocketBenefit(parcel.readString(), (RevPoints) parcel.readParcelable(RevPointsPocketBenefit.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readInt(), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPocketBenefit[i];
        }
    }

    public /* synthetic */ RevPointsPocketBenefit(int i, String str, RevPoints revPoints, d dVar, int i2, d dVar2, String str2) {
        if (63 != (i & 63)) {
            j1.f(a.f97782a.getDescriptor(), i, 63);
            throw null;
        }
        this.f97779a = str;
        this.f97780b = revPoints;
        this.f97781c = dVar;
        this.d = i2;
        this.e = dVar2;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPocketBenefit)) {
            return false;
        }
        RevPointsPocketBenefit revPointsPocketBenefit = (RevPointsPocketBenefit) obj2;
        return Intrinsics.f(this.f97779a, revPointsPocketBenefit.f97779a) && Intrinsics.f(this.f97780b, revPointsPocketBenefit.f97780b) && Intrinsics.f(this.f97781c, revPointsPocketBenefit.f97781c) && this.d == revPointsPocketBenefit.d && Intrinsics.f(this.e, revPointsPocketBenefit.e) && Intrinsics.f(this.f, revPointsPocketBenefit.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + v7.c(j6.a.b(this.d, v7.c(v7.c(this.f97779a.hashCode() * 31, 31, this.f97780b.f83960a), 31, this.f97781c), 31), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97779a);
        dest.writeParcelable(this.f97780b, i);
        dest.writeSerializable(this.f97781c);
        dest.writeInt(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
    }

    public RevPointsPocketBenefit(String id10, RevPoints pointsYearly, d minBalance, int i, d staysDiscount, String imageUri) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pointsYearly, "pointsYearly");
        Intrinsics.checkNotNullParameter(minBalance, "minBalance");
        Intrinsics.checkNotNullParameter(staysDiscount, "staysDiscount");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        this.f97779a = id10;
        this.f97780b = pointsYearly;
        this.f97781c = minBalance;
        this.d = i;
        this.e = staysDiscount;
        this.f = imageUri;
    }
}
