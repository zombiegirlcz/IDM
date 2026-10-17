package com.revolut.feature.incentive_reward.impl.model.lotteries;

import android.os.Parcel;
import android.os.Parcelable;
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
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/feature/incentive_reward/impl/model/lotteries/LotteryDrawDetails$ShareInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class LotteryDrawDetails$ShareInfo implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74853c;
    public final String d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<LotteryDrawDetails$ShareInfo> CREATOR = new c();

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74854a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f74854a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryDrawDetails.ShareInfo", aVar, 6);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("background", false);
            pluginGeneratedSerialDescriptor.j("imageBackground", false);
            pluginGeneratedSerialDescriptor.j("payoutInto", false);
            pluginGeneratedSerialDescriptor.j("date", false);
            pluginGeneratedSerialDescriptor.j("iconName", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, t0.f247706a, v1Var};
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
            String strDecodeStringElement5 = null;
            long jDecodeLongElement = 0;
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
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new LotteryDrawDetails$ShareInfo(jDecodeLongElement, i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            LotteryDrawDetails$ShareInfo value = (LotteryDrawDetails$ShareInfo) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f74851a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f74852b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f74853c);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.e);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryDrawDetails$ShareInfo$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f74854a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LotteryDrawDetails$ShareInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LotteryDrawDetails$ShareInfo[i];
        }
    }

    public /* synthetic */ LotteryDrawDetails$ShareInfo(long j2, int i, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            j1.f(a.f74854a.getDescriptor(), i, 63);
            throw null;
        }
        this.f74851a = str;
        this.f74852b = str2;
        this.f74853c = str3;
        this.d = str4;
        this.e = j2;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LotteryDrawDetails$ShareInfo)) {
            return false;
        }
        LotteryDrawDetails$ShareInfo lotteryDrawDetails$ShareInfo = (LotteryDrawDetails$ShareInfo) obj2;
        return Intrinsics.f(this.f74851a, lotteryDrawDetails$ShareInfo.f74851a) && Intrinsics.f(this.f74852b, lotteryDrawDetails$ShareInfo.f74852b) && Intrinsics.f(this.f74853c, lotteryDrawDetails$ShareInfo.f74853c) && Intrinsics.f(this.d, lotteryDrawDetails$ShareInfo.d) && this.e == lotteryDrawDetails$ShareInfo.e && Intrinsics.f(this.f, lotteryDrawDetails$ShareInfo.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a0.d.c(p.a.c(p.a.c(p.a.c(this.f74851a.hashCode() * 31, 31, this.f74852b), 31, this.f74853c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74851a);
        dest.writeString(this.f74852b);
        dest.writeString(this.f74853c);
        dest.writeString(this.d);
        dest.writeLong(this.e);
        dest.writeString(this.f);
    }

    public LotteryDrawDetails$ShareInfo(String title, String background, String imageBackground, String payoutInto, long j2, String iconName) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(imageBackground, "imageBackground");
        Intrinsics.checkNotNullParameter(payoutInto, "payoutInto");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        this.f74851a = title;
        this.f74852b = background;
        this.f74853c = imageBackground;
        this.d = payoutInto;
        this.e = j2;
        this.f = iconName;
    }
}
