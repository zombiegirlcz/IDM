package com.revolut.feature.insurance_embedded.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_embedded.impl.data.model.Website;
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
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/data/model/ActivateCoverageWidget;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class ActivateCoverageWidget implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75870c;
    public final String d;
    public final List e;
    public final Website f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ActivateCoverageWidget> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f75867g = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new gr2.j0(22)), null};

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f75871a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f75871a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.ActivateCoverageWidget", aVar, 6);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("text", false);
            pluginGeneratedSerialDescriptor.j("primaryButtonText", false);
            pluginGeneratedSerialDescriptor.j("cardSelectionStepText", false);
            pluginGeneratedSerialDescriptor.j("eligibleCardsIds", false);
            pluginGeneratedSerialDescriptor.j("website", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = ActivateCoverageWidget.f75867g;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, lazyArr[4].getValue(), Website.a.f75974a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = ActivateCoverageWidget.f75867g;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            List list = null;
            Website website = null;
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
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                        i |= 16;
                        break;
                    case 5:
                        website = (Website) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, Website.a.f75974a, website);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new ActivateCoverageWidget(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, list, website);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            ActivateCoverageWidget value = (ActivateCoverageWidget) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = ActivateCoverageWidget.f75867g;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f75868a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f75869b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f75870c);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, Website.a.f75974a, value.f);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_embedded.impl.data.model.ActivateCoverageWidget$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f75871a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivateCoverageWidget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), Website.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivateCoverageWidget[i];
        }
    }

    public /* synthetic */ ActivateCoverageWidget(int i, String str, String str2, String str3, String str4, List list, Website website) {
        if (63 != (i & 63)) {
            j1.f(a.f75871a.getDescriptor(), i, 63);
            throw null;
        }
        this.f75868a = str;
        this.f75869b = str2;
        this.f75870c = str3;
        this.d = str4;
        this.e = list;
        this.f = website;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivateCoverageWidget)) {
            return false;
        }
        ActivateCoverageWidget activateCoverageWidget = (ActivateCoverageWidget) obj2;
        return Intrinsics.f(this.f75868a, activateCoverageWidget.f75868a) && Intrinsics.f(this.f75869b, activateCoverageWidget.f75869b) && Intrinsics.f(this.f75870c, activateCoverageWidget.f75870c) && Intrinsics.f(this.d, activateCoverageWidget.d) && Intrinsics.f(this.e, activateCoverageWidget.e) && Intrinsics.f(this.f, activateCoverageWidget.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.c(p.a.c(p.a.c(this.f75868a.hashCode() * 31, 31, this.f75869b), 31, this.f75870c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75868a);
        dest.writeString(this.f75869b);
        dest.writeString(this.f75870c);
        dest.writeString(this.d);
        dest.writeStringList(this.e);
        this.f.writeToParcel(dest, i);
    }

    public ActivateCoverageWidget(String title, String text, String primaryButtonText, String cardSelectionStepText, List eligibleCardsIds, Website website) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(cardSelectionStepText, "cardSelectionStepText");
        Intrinsics.checkNotNullParameter(eligibleCardsIds, "eligibleCardsIds");
        Intrinsics.checkNotNullParameter(website, "website");
        this.f75868a = title;
        this.f75869b = text;
        this.f75870c = primaryButtonText;
        this.d = cardSelectionStepText;
        this.e = eligibleCardsIds;
        this.f = website;
    }
}
