package com.revolut.feature.insurance_home.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_home.impl.data.model.Footer;
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
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/ProductSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Coverage", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class ProductSummary implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76200c;
    public final Footer d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ProductSummary> CREATOR = new c();
    public static final Lazy[] e = {null, null, j.c(k.PUBLICATION, new lv4.b(15)), null};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/data/model/ProductSummary$Coverage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Coverage implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76203c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Coverage> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f76204a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f76204a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_home.impl.data.model.ProductSummary.Coverage", aVar, 3);
                pluginGeneratedSerialDescriptor.j("icon", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("description", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, v1Var};
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
                String strDecodeStringElement2 = null;
                String strDecodeStringElement3 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Coverage(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Coverage value = (Coverage) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76201a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f76202b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f76203c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.ProductSummary$Coverage$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f76204a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Coverage(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Coverage[i];
            }
        }

        public /* synthetic */ Coverage(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                j1.f(a.f76204a.getDescriptor(), i, 7);
                throw null;
            }
            this.f76201a = str;
            this.f76202b = str2;
            this.f76203c = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Coverage)) {
                return false;
            }
            Coverage coverage = (Coverage) obj2;
            return Intrinsics.f(this.f76201a, coverage.f76201a) && Intrinsics.f(this.f76202b, coverage.f76202b) && Intrinsics.f(this.f76203c, coverage.f76203c);
        }

        public final int hashCode() {
            return this.f76203c.hashCode() + p.a.c(this.f76201a.hashCode() * 31, 31, this.f76202b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76201a);
            dest.writeString(this.f76202b);
            dest.writeString(this.f76203c);
        }

        public Coverage(String icon, String title, String description) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f76201a = icon;
            this.f76202b = title;
            this.f76203c = description;
        }
    }

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76205a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f76205a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_home.impl.data.model.ProductSummary", aVar, 4);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("subtitle", false);
            pluginGeneratedSerialDescriptor.j("coverages", false);
            pluginGeneratedSerialDescriptor.j("footer", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = ProductSummary.e;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue(), Footer.a.f76172a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = ProductSummary.e;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            List list = null;
            Footer footer = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    footer = (Footer) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, Footer.a.f76172a, footer);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new ProductSummary(i, strDecodeStringElement, strDecodeStringElement2, list, footer);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            ProductSummary value = (ProductSummary) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = ProductSummary.e;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f76198a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f76199b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f76200c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, Footer.a.f76172a, value.d);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_home.impl.data.model.ProductSummary$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f76205a;
        }
    }

    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Coverage.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ProductSummary(string, string2, arrayList, Footer.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductSummary[i];
        }
    }

    public /* synthetic */ ProductSummary(int i, String str, String str2, List list, Footer footer) {
        if (15 != (i & 15)) {
            j1.f(a.f76205a.getDescriptor(), i, 15);
            throw null;
        }
        this.f76198a = str;
        this.f76199b = str2;
        this.f76200c = list;
        this.d = footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductSummary)) {
            return false;
        }
        ProductSummary productSummary = (ProductSummary) obj2;
        return Intrinsics.f(this.f76198a, productSummary.f76198a) && Intrinsics.f(this.f76199b, productSummary.f76199b) && Intrinsics.f(this.f76200c, productSummary.f76200c) && Intrinsics.f(this.d, productSummary.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f76198a.hashCode() * 31, 31, this.f76199b), 31, this.f76200c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76198a);
        dest.writeString(this.f76199b);
        Iterator itV = p.a.v(this.f76200c, dest);
        while (itV.hasNext()) {
            ((Coverage) itV.next()).writeToParcel(dest, i);
        }
        this.d.writeToParcel(dest, i);
    }

    public ProductSummary(String title, String subtitle, ArrayList coverages, Footer footer) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(coverages, "coverages");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f76198a = title;
        this.f76199b = subtitle;
        this.f76200c = coverages;
        this.d = footer;
    }
}
