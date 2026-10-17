package com.revolut.feature.payments.air.widget.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
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
import mlm.f;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource;", "Landroid/os/Parcelable;", "Companion", "Pocket", "SavingsAccount", "Portfolio", "a", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource$Pocket;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource$Portfolio;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource$SavingsAccount;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public interface WidgetTransferSource extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f79107a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource$Pocket;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Pocket implements WidgetTransferSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79100a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79101a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79101a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("POCKET", aVar, 1);
                pluginGeneratedSerialDescriptor.j("id", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new Pocket(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Pocket value = (Pocket) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f79100a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetTransferSource$Pocket$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79101a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pocket(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public /* synthetic */ Pocket(int i, String str) {
            if (1 == (i & 1)) {
                this.f79100a = str;
            } else {
                j1.f(a.f79101a.getDescriptor(), i, 1);
                throw null;
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
            return (obj2 instanceof Pocket) && Intrinsics.f(this.f79100a, ((Pocket) obj2).f79100a);
        }

        public final int hashCode() {
            return this.f79100a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79100a);
        }

        public Pocket(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f79100a = id10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource$Portfolio;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class Portfolio implements WidgetTransferSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79103b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Portfolio> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79104a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79104a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PORTFOLIO", aVar, 2);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("currency", false);
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
                return new Portfolio(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                Portfolio value = (Portfolio) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f79102a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f79103b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetTransferSource$Portfolio$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79104a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Portfolio(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Portfolio[i];
            }
        }

        public /* synthetic */ Portfolio(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f79104a.getDescriptor(), i, 3);
                throw null;
            }
            this.f79102a = str;
            this.f79103b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Portfolio)) {
                return false;
            }
            Portfolio portfolio = (Portfolio) obj2;
            return Intrinsics.f(this.f79102a, portfolio.f79102a) && Intrinsics.f(this.f79103b, portfolio.f79103b);
        }

        public final int hashCode() {
            return this.f79103b.hashCode() + (this.f79102a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79102a);
            dest.writeString(this.f79103b);
        }

        public Portfolio(String id10, String currency) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f79102a = id10;
            this.f79103b = currency;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource$SavingsAccount;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetTransferSource;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class SavingsAccount implements WidgetTransferSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79105a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<SavingsAccount> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79106a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79106a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SAVINGS_ACCOUNT", aVar, 1);
                pluginGeneratedSerialDescriptor.j("id", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a};
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
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new SavingsAccount(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                SavingsAccount value = (SavingsAccount) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f79105a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetTransferSource$SavingsAccount$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79106a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsAccount[i];
            }
        }

        public /* synthetic */ SavingsAccount(int i, String str) {
            if (1 == (i & 1)) {
                this.f79105a = str;
            } else {
                j1.f(a.f79106a.getDescriptor(), i, 1);
                throw null;
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
            return (obj2 instanceof SavingsAccount) && Intrinsics.f(this.f79105a, ((SavingsAccount) obj2).f79105a);
        }

        public final int hashCode() {
            return this.f79105a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79105a);
        }

        public SavingsAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f79105a = id10;
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetTransferSource$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f79107a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.payments.air.widget.impl.model.WidgetTransferSource", p0Var.b(WidgetTransferSource.class), new KClass[]{p0Var.b(Pocket.class), p0Var.b(Portfolio.class), p0Var.b(SavingsAccount.class)}, new KSerializer[]{Pocket.a.f79101a, Portfolio.a.f79104a, SavingsAccount.a.f79106a}, new Annotation[0]);
        }
    }
}
