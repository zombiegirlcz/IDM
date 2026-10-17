package com.revolut.feature_rev_points_pocket_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dce.b;
import ddi.e;
import dj0.d;
import ie0.o;
import ip0.v7;
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
import m1c.n1;
import mlm.g;
import mlm.h;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/model/RevPointsPocketInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "ddi/e", "a", "b", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RevPointsPocketInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f97786c;
    public final long d;
    public final d e;
    public final RevPoints f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RevPoints f97787g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPointsPocketInfo> CREATOR = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f97783h = {null, null, j.c(k.PUBLICATION, new b(12)), null, null, null, null};

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97788a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f97788a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo", aVar, 7);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("name", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("createdDate", false);
            pluginGeneratedSerialDescriptor.j("balance", false);
            pluginGeneratedSerialDescriptor.j("totalPointsEarned", false);
            pluginGeneratedSerialDescriptor.j("pointsEarnedThisMonth", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = RevPointsPocketInfo.f97783h;
            v1 v1Var = v1.f247718a;
            n1 n1Var = n1.f201419a;
            return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), t0.f247706a, o.f160615a, nlm.a.c(n1Var), nlm.a.c(n1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RevPointsPocketInfo.f97783h;
            dVarBeginStructure.getClass();
            RevPoints revPoints = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            e eVar = null;
            d dVar = null;
            long jDecodeLongElement = 0;
            int i = 0;
            boolean z = true;
            RevPoints revPoints2 = null;
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
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), eVar);
                        i |= 4;
                        break;
                    case 3:
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, o.f160615a, dVar);
                        i |= 16;
                        break;
                    case 5:
                        revPoints = (RevPoints) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, n1.f201419a, revPoints);
                        i |= 32;
                        break;
                    case 6:
                        revPoints2 = (RevPoints) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, n1.f201419a, revPoints2);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new RevPointsPocketInfo(i, strDecodeStringElement, strDecodeStringElement2, eVar, jDecodeLongElement, dVar, revPoints, revPoints2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RevPointsPocketInfo value = (RevPointsPocketInfo) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = RevPointsPocketInfo.f97783h;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f97784a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f97785b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f97786c);
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, o.f160615a, value.e);
            n1 n1Var = n1.f201419a;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, n1Var, value.f);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, n1Var, value.f97787g);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f97788a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsPocketInfo(parcel.readString(), parcel.readString(), e.valueOf(parcel.readString()), parcel.readLong(), (d) parcel.readSerializable(), (RevPoints) parcel.readParcelable(RevPointsPocketInfo.class.getClassLoader()), (RevPoints) parcel.readParcelable(RevPointsPocketInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPocketInfo[i];
        }
    }

    public /* synthetic */ RevPointsPocketInfo(int i, String str, String str2, e eVar, long j2, d dVar, RevPoints revPoints, RevPoints revPoints2) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f97788a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f97784a = str;
        this.f97785b = str2;
        this.f97786c = eVar;
        this.d = j2;
        this.e = dVar;
        this.f = revPoints;
        this.f97787g = revPoints2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPocketInfo)) {
            return false;
        }
        RevPointsPocketInfo revPointsPocketInfo = (RevPointsPocketInfo) obj2;
        return Intrinsics.f(this.f97784a, revPointsPocketInfo.f97784a) && Intrinsics.f(this.f97785b, revPointsPocketInfo.f97785b) && this.f97786c == revPointsPocketInfo.f97786c && this.d == revPointsPocketInfo.d && Intrinsics.f(this.e, revPointsPocketInfo.e) && Intrinsics.f(this.f, revPointsPocketInfo.f) && Intrinsics.f(this.f97787g, revPointsPocketInfo.f97787g);
    }

    public final int hashCode() {
        int iC = v7.c(a0.d.c((this.f97786c.hashCode() + p.a.c(this.f97784a.hashCode() * 31, 31, this.f97785b)) * 31, 31, this.d), 31, this.e);
        RevPoints revPoints = this.f;
        int iHashCode = (iC + (revPoints == null ? 0 : revPoints.f83960a.hashCode())) * 31;
        RevPoints revPoints2 = this.f97787g;
        return iHashCode + (revPoints2 != null ? revPoints2.f83960a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97784a);
        dest.writeString(this.f97785b);
        dest.writeString(this.f97786c.name());
        dest.writeLong(this.d);
        dest.writeSerializable(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f97787g, i);
    }

    public RevPointsPocketInfo(String id10, String name, e state, long j2, d balance, RevPoints revPoints, RevPoints revPoints2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f97784a = id10;
        this.f97785b = name;
        this.f97786c = state;
        this.d = j2;
        this.e = balance;
        this.f = revPoints;
        this.f97787g = revPoints2;
    }
}
