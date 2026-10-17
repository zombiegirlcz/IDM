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
import qlm.v1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature_rev_points_pocket_api/model/RevPointsPocketThreshold;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_rev_points_pocket_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class RevPointsPocketThreshold implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f97794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f97795c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPointsPocketThreshold> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97796a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f97796a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold", aVar, 3);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("pointsYearly", false);
            pluginGeneratedSerialDescriptor.j("minBalance", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, n1.f201419a, o.f160615a};
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
            RevPoints revPoints = null;
            d dVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    revPoints = (RevPoints) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, n1.f201419a, revPoints);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, o.f160615a, dVar);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new RevPointsPocketThreshold(i, strDecodeStringElement, revPoints, dVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            RevPointsPocketThreshold value = (RevPointsPocketThreshold) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f97793a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, n1.f201419a, value.f97794b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, o.f160615a, value.f97795c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f97796a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsPocketThreshold(parcel.readString(), (RevPoints) parcel.readParcelable(RevPointsPocketThreshold.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPocketThreshold[i];
        }
    }

    public /* synthetic */ RevPointsPocketThreshold(int i, String str, RevPoints revPoints, d dVar) {
        if (7 != (i & 7)) {
            j1.f(a.f97796a.getDescriptor(), i, 7);
            throw null;
        }
        this.f97793a = str;
        this.f97794b = revPoints;
        this.f97795c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPocketThreshold)) {
            return false;
        }
        RevPointsPocketThreshold revPointsPocketThreshold = (RevPointsPocketThreshold) obj2;
        return Intrinsics.f(this.f97793a, revPointsPocketThreshold.f97793a) && Intrinsics.f(this.f97794b, revPointsPocketThreshold.f97794b) && Intrinsics.f(this.f97795c, revPointsPocketThreshold.f97795c);
    }

    public final int hashCode() {
        return this.f97795c.hashCode() + v7.c(this.f97793a.hashCode() * 31, 31, this.f97794b.f83960a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97793a);
        dest.writeParcelable(this.f97794b, i);
        dest.writeSerializable(this.f97795c);
    }

    public RevPointsPocketThreshold(String id10, RevPoints pointsYearly, d minBalance) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pointsYearly, "pointsYearly");
        Intrinsics.checkNotNullParameter(minBalance, "minBalance");
        this.f97793a = id10;
        this.f97794b = pointsYearly;
        this.f97795c = minBalance;
    }
}
