package com.revolut.feature.payments_migration.impl.models.providers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments_migration.impl.models.providers.BlockId;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.b;
import mlm.f;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.d1;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import rlm.g;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock;", "Landroid/os/Parcelable;", "Companion", "CardsHorizontalList", "Grid", "VerticalList", "ExpandableVerticalList", "CenterText", "MerchantNotFound", "NoResults", "Unknown", "a", "Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$CenterText;", "Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$MerchantNotFound;", "Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$NoResults;", "Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$Unknown;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "type")
@mlm.g
public interface ProviderBlock extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f80250a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$CenterText;", "Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock;", "", "toString", "()Ljava/lang/String;", "Companion", "Link", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class CenterText implements ProviderBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f80230b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<CenterText> CREATOR = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f80228c = {null, j.c(k.PUBLICATION, new x1e.g(28))};

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$CenterText$Link;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class Link implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f80231a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f80232b;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            public static final Parcelable.Creator<Link> CREATOR = new c();

            public static final /* synthetic */ class a implements f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f80233a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f80233a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock.CenterText.Link", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("text", false);
                    pluginGeneratedSerialDescriptor.j("url", false);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    v1 v1Var = v1.f247718a;
                    return new KSerializer[]{v1Var, v1Var};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    dVarBeginStructure.getClass();
                    String strDecodeStringElement = null;
                    boolean z = true;
                    int i = 0;
                    String strDecodeStringElement2 = null;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i |= 1;
                        } else {
                            if (iD != 1) {
                                throw new UnknownFieldException(iD);
                            }
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new Link(i, strDecodeStringElement, strDecodeStringElement2);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    Link value = (Link) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f80231a);
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f80232b);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock$CenterText$Link$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f80233a;
                }
            }

            public static final class c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Link(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Link[i];
                }
            }

            public /* synthetic */ Link(int i, String str, String str2) {
                if (3 != (i & 3)) {
                    j1.f(a.f80233a.getDescriptor(), i, 3);
                    throw null;
                }
                this.f80231a = str;
                this.f80232b = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Link)) {
                    return false;
                }
                Link link = (Link) obj2;
                return Intrinsics.f(this.f80231a, link.f80231a) && Intrinsics.f(this.f80232b, link.f80232b);
            }

            public final int hashCode() {
                return this.f80232b.hashCode() + (this.f80231a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f80231a);
                dest.writeString(this.f80232b);
            }

            public Link(String text, String url2) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f80231a = text;
                this.f80232b = url2;
            }
        }

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f80234a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f80234a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CENTER_TEXT", aVar, 2);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("links", false);
                pluginGeneratedSerialDescriptor.l(new hi9.g(27));
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, CenterText.f80228c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = CenterText.f80228c;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
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
                return new CenterText(i, strDecodeStringElement, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                CenterText value = (CenterText) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = CenterText.f80228c;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f80229a);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (h) lazyArr[1].getValue(), value.f80230b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock$CenterText$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f80234a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Link.CREATOR, parcel, arrayList, iA, 1);
                }
                return new CenterText(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CenterText[i];
            }
        }

        public /* synthetic */ CenterText(int i, String str, List list) {
            if (3 != (i & 3)) {
                j1.f(a.f80234a.getDescriptor(), i, 3);
                throw null;
            }
            this.f80229a = str;
            this.f80230b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CenterText)) {
                return false;
            }
            CenterText centerText = (CenterText) obj2;
            return Intrinsics.f(this.f80229a, centerText.f80229a) && Intrinsics.f(this.f80230b, centerText.f80230b);
        }

        public final int hashCode() {
            return this.f80230b.hashCode() + (this.f80229a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f80229a);
            Iterator itV = p.a.v(this.f80230b, dest);
            while (itV.hasNext()) {
                ((Link) itV.next()).writeToParcel(dest, i);
            }
        }

        public CenterText(String text, ArrayList links) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(links, "links");
            this.f80229a = text;
            this.f80230b = links;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$MerchantNotFound;", "Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class MerchantNotFound implements ProviderBlock {

        @NotNull
        public static final MerchantNotFound INSTANCE = new MerchantNotFound();

        @NotNull
        public static final Parcelable.Creator<MerchantNotFound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f80243a = j.c(k.PUBLICATION, new x5a.d(2));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MerchantNotFound.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MerchantNotFound[i];
            }
        }

        private MerchantNotFound() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f80243a.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$NoResults;", "Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class NoResults implements ProviderBlock {

        @NotNull
        public static final NoResults INSTANCE = new NoResults();

        @NotNull
        public static final Parcelable.Creator<NoResults> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f80244a = j.c(k.PUBLICATION, new x5a.d(3));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoResults.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoResults[i];
            }
        }

        private NoResults() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f80244a.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$Unknown;", "Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final class Unknown implements ProviderBlock {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Object f80245a = j.c(k.PUBLICATION, new x5a.d(4));

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) f80245a.getValue();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f80250a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock", p0Var.b(ProviderBlock.class), new KClass[]{p0Var.b(CenterText.class), p0Var.b(MerchantNotFound.class), p0Var.b(NoResults.class), p0Var.b(CardsHorizontalList.class), p0Var.b(ExpandableVerticalList.class), p0Var.b(Grid.class), p0Var.b(VerticalList.class), p0Var.b(Unknown.class)}, new KSerializer[]{CenterText.a.f80234a, new d1("MERCHANT_NOT_FOUND", MerchantNotFound.INSTANCE, new Annotation[]{new hi9.g(27)}), new d1("NO_RESULTS", NoResults.INSTANCE, new Annotation[]{new hi9.g(27)}), CardsHorizontalList.a.f80227a, ExpandableVerticalList.a.f80238a, Grid.a.f80242a, VerticalList.a.f80249a, new d1("com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock.Unknown", Unknown.INSTANCE, new Annotation[]{new hi9.g(27)})}, new Annotation[]{new hi9.g(27)});
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$CardsHorizontalList;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class CardsHorizontalList implements ProviderBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f80226c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<CardsHorizontalList> CREATOR = new c();
        public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new x1e.g(27))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f80227a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f80227a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CARDS_HORIZONTAL_LIST", aVar, 3);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("providers", false);
                pluginGeneratedSerialDescriptor.l(new hi9.g(27));
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{BlockId.a.f80209a, nlm.a.c(v1.f247718a), CardsHorizontalList.d[2].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = CardsHorizontalList.d;
                dVarBeginStructure.getClass();
                boolean z = true;
                int i = 0;
                String str = null;
                String str2 = null;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        BlockId blockId = (BlockId) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, BlockId.a.f80209a, str != null ? new BlockId(str) : null);
                        str = blockId != null ? blockId.f80208a : null;
                        i |= 1;
                    } else if (iD == 1) {
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (b) lazyArr[2].getValue(), list);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new CardsHorizontalList(i, str, str2, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                CardsHorizontalList value = (CardsHorizontalList) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = CardsHorizontalList.d;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, BlockId.a.f80209a, new BlockId(value.f80224a));
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f80225b);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f80226c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock$CardsHorizontalList$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f80227a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String str = BlockId.CREATOR.createFromParcel(parcel).f80208a;
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Provider.CREATOR, parcel, arrayList, iA, 1);
                }
                return new CardsHorizontalList(str, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardsHorizontalList[i];
            }
        }

        public CardsHorizontalList(String id10, String str, ArrayList providers) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(providers, "providers");
            this.f80224a = id10;
            this.f80225b = str;
            this.f80226c = providers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardsHorizontalList)) {
                return false;
            }
            CardsHorizontalList cardsHorizontalList = (CardsHorizontalList) obj2;
            return Intrinsics.f(this.f80224a, cardsHorizontalList.f80224a) && Intrinsics.f(this.f80225b, cardsHorizontalList.f80225b) && Intrinsics.f(this.f80226c, cardsHorizontalList.f80226c);
        }

        public final int hashCode() {
            int iHashCode = this.f80224a.hashCode() * 31;
            String str = this.f80225b;
            return this.f80226c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            BlockId.a(this.f80224a, dest);
            dest.writeString(this.f80225b);
            Iterator itV = p.a.v(this.f80226c, dest);
            while (itV.hasNext()) {
                ((Provider) itV.next()).writeToParcel(dest, i);
            }
        }

        public /* synthetic */ CardsHorizontalList(int i, String str, String str2, List list) {
            if (7 != (i & 7)) {
                j1.f(a.f80227a.getDescriptor(), i, 7);
                throw null;
            }
            this.f80224a = str;
            this.f80225b = str2;
            this.f80226c = list;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$Grid;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class Grid implements ProviderBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f80241c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Grid> CREATOR = new c();
        public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new x5a.d(1))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f80242a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f80242a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("GRID", aVar, 3);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("providers", false);
                pluginGeneratedSerialDescriptor.l(new hi9.g(27));
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{BlockId.a.f80209a, nlm.a.c(v1.f247718a), Grid.d[2].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Grid.d;
                dVarBeginStructure.getClass();
                boolean z = true;
                int i = 0;
                String str = null;
                String str2 = null;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        BlockId blockId = (BlockId) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, BlockId.a.f80209a, str != null ? new BlockId(str) : null);
                        str = blockId != null ? blockId.f80208a : null;
                        i |= 1;
                    } else if (iD == 1) {
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (b) lazyArr[2].getValue(), list);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Grid(i, str, str2, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Grid value = (Grid) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = Grid.d;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, BlockId.a.f80209a, new BlockId(value.f80239a));
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f80240b);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f80241c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock$Grid$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f80242a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String str = BlockId.CREATOR.createFromParcel(parcel).f80208a;
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Provider.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Grid(str, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Grid[i];
            }
        }

        public Grid(String id10, String str, ArrayList providers) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(providers, "providers");
            this.f80239a = id10;
            this.f80240b = str;
            this.f80241c = providers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Grid)) {
                return false;
            }
            Grid grid = (Grid) obj2;
            return Intrinsics.f(this.f80239a, grid.f80239a) && Intrinsics.f(this.f80240b, grid.f80240b) && Intrinsics.f(this.f80241c, grid.f80241c);
        }

        public final int hashCode() {
            int iHashCode = this.f80239a.hashCode() * 31;
            String str = this.f80240b;
            return this.f80241c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            BlockId.a(this.f80239a, dest);
            dest.writeString(this.f80240b);
            Iterator itV = p.a.v(this.f80241c, dest);
            while (itV.hasNext()) {
                ((Provider) itV.next()).writeToParcel(dest, i);
            }
        }

        public /* synthetic */ Grid(int i, String str, String str2, List list) {
            if (7 != (i & 7)) {
                j1.f(a.f80242a.getDescriptor(), i, 7);
                throw null;
            }
            this.f80239a = str;
            this.f80240b = str2;
            this.f80241c = list;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$VerticalList;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class VerticalList implements ProviderBlock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f80248c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<VerticalList> CREATOR = new c();
        public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new x5a.d(5))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f80249a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f80249a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("VERTICAL_LIST", aVar, 3);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("providers", false);
                pluginGeneratedSerialDescriptor.l(new hi9.g(27));
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{BlockId.a.f80209a, nlm.a.c(v1.f247718a), VerticalList.d[2].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = VerticalList.d;
                dVarBeginStructure.getClass();
                boolean z = true;
                int i = 0;
                String str = null;
                String str2 = null;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        BlockId blockId = (BlockId) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, BlockId.a.f80209a, str != null ? new BlockId(str) : null);
                        str = blockId != null ? blockId.f80208a : null;
                        i |= 1;
                    } else if (iD == 1) {
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (b) lazyArr[2].getValue(), list);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new VerticalList(i, str, str2, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                VerticalList value = (VerticalList) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = VerticalList.d;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, BlockId.a.f80209a, new BlockId(value.f80246a));
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f80247b);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f80248c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock$VerticalList$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f80249a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String str = BlockId.CREATOR.createFromParcel(parcel).f80208a;
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Provider.CREATOR, parcel, arrayList, iA, 1);
                }
                return new VerticalList(str, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerticalList[i];
            }
        }

        public VerticalList(String id10, String str, ArrayList providers) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(providers, "providers");
            this.f80246a = id10;
            this.f80247b = str;
            this.f80248c = providers;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VerticalList)) {
                return false;
            }
            VerticalList verticalList = (VerticalList) obj2;
            return Intrinsics.f(this.f80246a, verticalList.f80246a) && Intrinsics.f(this.f80247b, verticalList.f80247b) && Intrinsics.f(this.f80248c, verticalList.f80248c);
        }

        public final int hashCode() {
            int iHashCode = this.f80246a.hashCode() * 31;
            String str = this.f80247b;
            return this.f80248c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            BlockId.a(this.f80246a, dest);
            dest.writeString(this.f80247b);
            Iterator itV = p.a.v(this.f80248c, dest);
            while (itV.hasNext()) {
                ((Provider) itV.next()).writeToParcel(dest, i);
            }
        }

        public /* synthetic */ VerticalList(int i, String str, String str2, List list) {
            if (7 != (i & 7)) {
                j1.f(a.f80249a.getDescriptor(), i, 7);
                throw null;
            }
            this.f80246a = str;
            this.f80247b = str2;
            this.f80248c = list;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/providers/ProviderBlock$ExpandableVerticalList;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class ExpandableVerticalList implements ProviderBlock {
        public static final Lazy[] e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f80236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f80237c;
        public final List d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<ExpandableVerticalList> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f80238a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f80238a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("EXPANDABLE_VERTICAL_LIST", aVar, 4);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("providers", false);
                pluginGeneratedSerialDescriptor.j("expandedBlocks", false);
                pluginGeneratedSerialDescriptor.l(new hi9.g(27));
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = ExpandableVerticalList.e;
                return new KSerializer[]{BlockId.a.f80209a, v1.f247718a, lazyArr[2].getValue(), lazyArr[3].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = ExpandableVerticalList.e;
                dVarBeginStructure.getClass();
                boolean z = true;
                int i = 0;
                String str = null;
                String strDecodeStringElement = null;
                List list = null;
                List list2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        BlockId blockId = (BlockId) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, BlockId.a.f80209a, str != null ? new BlockId(str) : null);
                        str = blockId != null ? blockId.f80208a : null;
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (b) lazyArr[2].getValue(), list);
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
                return new ExpandableVerticalList(i, str, strDecodeStringElement, list, list2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                ExpandableVerticalList value = (ExpandableVerticalList) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = ExpandableVerticalList.e;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, BlockId.a.f80209a, new BlockId(value.f80235a));
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f80236b);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (h) lazyArr[2].getValue(), value.f80237c);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (h) lazyArr[3].getValue(), value.d);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock$ExpandableVerticalList$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f80238a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String str = BlockId.CREATOR.createFromParcel(parcel).f80208a;
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Provider.CREATOR, parcel, arrayList, iA, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(ExpandableVerticalList.class, parcel, arrayList2, iE, 1);
                }
                return new ExpandableVerticalList(str, string, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpandableVerticalList[i];
            }
        }

        static {
            k kVar = k.PUBLICATION;
            e = new Lazy[]{null, null, j.c(kVar, new x1e.g(29)), j.c(kVar, new x5a.d(0))};
        }

        public ExpandableVerticalList(String id10, String title, ArrayList providers, ArrayList expandedBlocks) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(providers, "providers");
            Intrinsics.checkNotNullParameter(expandedBlocks, "expandedBlocks");
            this.f80235a = id10;
            this.f80236b = title;
            this.f80237c = providers;
            this.d = expandedBlocks;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExpandableVerticalList)) {
                return false;
            }
            ExpandableVerticalList expandableVerticalList = (ExpandableVerticalList) obj2;
            return Intrinsics.f(this.f80235a, expandableVerticalList.f80235a) && Intrinsics.f(this.f80236b, expandableVerticalList.f80236b) && Intrinsics.f(this.f80237c, expandableVerticalList.f80237c) && Intrinsics.f(this.d, expandableVerticalList.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.d(p.a.c(this.f80235a.hashCode() * 31, 31, this.f80236b), 31, this.f80237c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            BlockId.a(this.f80235a, dest);
            dest.writeString(this.f80236b);
            Iterator itV = p.a.v(this.f80237c, dest);
            while (itV.hasNext()) {
                ((Provider) itV.next()).writeToParcel(dest, i);
            }
            Iterator itV2 = p.a.v(this.d, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
        }

        public /* synthetic */ ExpandableVerticalList(int i, String str, String str2, List list, List list2) {
            if (15 != (i & 15)) {
                j1.f(a.f80238a.getDescriptor(), i, 15);
                throw null;
            }
            this.f80235a = str;
            this.f80236b = str2;
            this.f80237c = list;
            this.d = list2;
        }
    }
}
