package com.revolut.feature.payments.air.widget.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
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
import mlm.f;
import mlm.g;
import mlm.h;
import ok7.b;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0002\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient;", "Landroid/os/Parcelable;", "Companion", "CreatedRecipient", "P2P", "ExistingBeneficiary", "NewBeneficiary", "AccountField", "ExistingCard", "NewCard", "a", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$CreatedRecipient;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$P2P;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public interface WidgetRecipient extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f79099a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$AccountField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class AccountField implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79082b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<AccountField> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79083a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79083a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient.AccountField", aVar, 2);
                pluginGeneratedSerialDescriptor.j("type", false);
                pluginGeneratedSerialDescriptor.j("value", false);
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
                return new AccountField(i, strDecodeStringElement, strDecodeStringElement2);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                AccountField value = (AccountField) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f79081a);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f79082b);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$AccountField$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79083a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountField(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountField[i];
            }
        }

        public /* synthetic */ AccountField(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f79083a.getDescriptor(), i, 3);
                throw null;
            }
            this.f79081a = str;
            this.f79082b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountField)) {
                return false;
            }
            AccountField accountField = (AccountField) obj2;
            return Intrinsics.f(this.f79081a, accountField.f79081a) && Intrinsics.f(this.f79082b, accountField.f79082b);
        }

        public final int hashCode() {
            return this.f79082b.hashCode() + (this.f79081a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79081a);
            dest.writeString(this.f79082b);
        }

        public AccountField(String type, String value) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f79081a = type;
            this.f79082b = value;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$CreatedRecipient;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient;", "Companion", "a", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$ExistingBeneficiary;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$ExistingCard;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public interface CreatedRecipient extends WidgetRecipient {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f79084a;

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$CreatedRecipient$a, reason: from kotlin metadata */
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f79084a = new Companion();

            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                p0 p0Var = o0.f186429a;
                return new f("com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient.CreatedRecipient", p0Var.b(CreatedRecipient.class), new KClass[]{p0Var.b(ExistingBeneficiary.class), p0Var.b(ExistingCard.class)}, new KSerializer[]{ExistingBeneficiary.a.f79086a, ExistingCard.a.f79088a}, new Annotation[0]);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$ExistingBeneficiary;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$CreatedRecipient;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class ExistingBeneficiary implements CreatedRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79085a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<ExistingBeneficiary> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79086a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79086a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("EXISTING_BENEFICIARY", aVar, 1);
                pluginGeneratedSerialDescriptor.j("beneficiaryId", false);
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
                return new ExistingBeneficiary(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                ExistingBeneficiary value = (ExistingBeneficiary) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f79085a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$ExistingBeneficiary$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79086a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingBeneficiary(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingBeneficiary[i];
            }
        }

        public /* synthetic */ ExistingBeneficiary(int i, String str) {
            if (1 == (i & 1)) {
                this.f79085a = str;
            } else {
                j1.f(a.f79086a.getDescriptor(), i, 1);
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
            return (obj2 instanceof ExistingBeneficiary) && Intrinsics.f(this.f79085a, ((ExistingBeneficiary) obj2).f79085a);
        }

        public final int hashCode() {
            return this.f79085a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79085a);
        }

        public ExistingBeneficiary(String beneficiaryId) {
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.f79085a = beneficiaryId;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$ExistingCard;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$CreatedRecipient;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class ExistingCard implements CreatedRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79087a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<ExistingCard> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79088a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79088a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("EXISTING_CARD", aVar, 1);
                pluginGeneratedSerialDescriptor.j("cardOwnerId", false);
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
                return new ExistingCard(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                ExistingCard value = (ExistingCard) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f79087a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$ExistingCard$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79088a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingCard(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingCard[i];
            }
        }

        public /* synthetic */ ExistingCard(int i, String str) {
            if (1 == (i & 1)) {
                this.f79087a = str;
            } else {
                j1.f(a.f79088a.getDescriptor(), i, 1);
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
            return (obj2 instanceof ExistingCard) && Intrinsics.f(this.f79087a, ((ExistingCard) obj2).f79087a);
        }

        public final int hashCode() {
            return this.f79087a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79087a);
        }

        public ExistingCard(String cardOwnerId) {
            Intrinsics.checkNotNullParameter(cardOwnerId, "cardOwnerId");
            this.f79087a = cardOwnerId;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$NewBeneficiary;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class NewBeneficiary implements WidgetRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79091c;
        public final List d;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<NewBeneficiary> CREATOR = new c();
        public static final Lazy[] e = {null, null, null, j.c(k.PUBLICATION, new b(23))};

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79092a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79092a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("NEW_BENEFICIARY", aVar, 4);
                pluginGeneratedSerialDescriptor.j("firstName", false);
                pluginGeneratedSerialDescriptor.j("lastName", false);
                pluginGeneratedSerialDescriptor.j("country", false);
                pluginGeneratedSerialDescriptor.j("fields", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = NewBeneficiary.e;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, lazyArr[3].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = NewBeneficiary.e;
                dVarBeginStructure.getClass();
                int i = 0;
                String str = null;
                String str2 = null;
                String strDecodeStringElement = null;
                List list = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else if (iD == 1) {
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                    } else if (iD == 2) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new NewBeneficiary(i, str, str2, strDecodeStringElement, list);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                NewBeneficiary value = (NewBeneficiary) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = NewBeneficiary.e;
                v1 v1Var = v1.f247718a;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f79089a);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f79090b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f79091c);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (h) lazyArr[3].getValue(), value.d);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$NewBeneficiary$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79092a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(AccountField.CREATOR, parcel, arrayList, iA, 1);
                }
                return new NewBeneficiary(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewBeneficiary[i];
            }
        }

        public /* synthetic */ NewBeneficiary(int i, String str, String str2, String str3, List list) {
            if (15 != (i & 15)) {
                j1.f(a.f79092a.getDescriptor(), i, 15);
                throw null;
            }
            this.f79089a = str;
            this.f79090b = str2;
            this.f79091c = str3;
            this.d = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewBeneficiary)) {
                return false;
            }
            NewBeneficiary newBeneficiary = (NewBeneficiary) obj2;
            return Intrinsics.f(this.f79089a, newBeneficiary.f79089a) && Intrinsics.f(this.f79090b, newBeneficiary.f79090b) && Intrinsics.f(this.f79091c, newBeneficiary.f79091c) && Intrinsics.f(this.d, newBeneficiary.d);
        }

        public final int hashCode() {
            String str = this.f79089a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f79090b;
            return this.d.hashCode() + p.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f79091c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79089a);
            dest.writeString(this.f79090b);
            dest.writeString(this.f79091c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                ((AccountField) itV.next()).writeToParcel(dest, i);
            }
        }

        public NewBeneficiary(String str, String str2, String country, ArrayList fields) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.f79089a = str;
            this.f79090b = str2;
            this.f79091c = country;
            this.d = fields;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$NewCard;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class NewCard implements WidgetRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79095c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<NewCard> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79096a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79096a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("NEW_CARD", aVar, 3);
                pluginGeneratedSerialDescriptor.j("firstName", false);
                pluginGeneratedSerialDescriptor.j("lastName", false);
                pluginGeneratedSerialDescriptor.j("panNumber", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                String str2 = null;
                String strDecodeStringElement = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                    } else if (iD == 1) {
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new NewCard(i, str, str2, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                NewCard value = (NewCard) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                v1 v1Var = v1.f247718a;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f79093a);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f79094b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f79095c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$NewCard$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79096a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewCard(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewCard[i];
            }
        }

        public /* synthetic */ NewCard(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                j1.f(a.f79096a.getDescriptor(), i, 7);
                throw null;
            }
            this.f79093a = str;
            this.f79094b = str2;
            this.f79095c = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewCard)) {
                return false;
            }
            NewCard newCard = (NewCard) obj2;
            return Intrinsics.f(this.f79093a, newCard.f79093a) && Intrinsics.f(this.f79094b, newCard.f79094b) && Intrinsics.f(this.f79095c, newCard.f79095c);
        }

        public final int hashCode() {
            String str = this.f79093a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f79094b;
            return this.f79095c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79093a);
            dest.writeString(this.f79094b);
            dest.writeString(this.f79095c);
        }

        public NewCard(String str, String str2, String panNumber) {
            Intrinsics.checkNotNullParameter(panNumber, "panNumber");
            this.f79093a = str;
            this.f79094b = str2;
            this.f79095c = panNumber;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient$P2P;", "Lcom/revolut/feature/payments/air/widget/impl/model/WidgetRecipient;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class P2P implements WidgetRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79097a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<P2P> CREATOR = new c();

        public static final /* synthetic */ class a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f79098a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f79098a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("P2P", aVar, 1);
                pluginGeneratedSerialDescriptor.j("revtag", false);
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
                return new P2P(i, strDecodeStringElement);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                P2P value = (P2P) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f79097a);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$P2P$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f79098a;
            }
        }

        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new P2P(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new P2P[i];
            }
        }

        public /* synthetic */ P2P(int i, String str) {
            if (1 == (i & 1)) {
                this.f79097a = str;
            } else {
                j1.f(a.f79098a.getDescriptor(), i, 1);
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
            return (obj2 instanceof P2P) && Intrinsics.f(this.f79097a, ((P2P) obj2).f79097a);
        }

        public final int hashCode() {
            return this.f79097a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79097a);
        }

        public P2P(String revtag) {
            Intrinsics.checkNotNullParameter(revtag, "revtag");
            this.f79097a = revtag;
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f79099a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient", p0Var.b(WidgetRecipient.class), new KClass[]{p0Var.b(ExistingBeneficiary.class), p0Var.b(ExistingCard.class), p0Var.b(P2P.class), p0Var.b(NewBeneficiary.class), p0Var.b(NewCard.class)}, new KSerializer[]{ExistingBeneficiary.a.f79086a, ExistingCard.a.f79088a, P2P.a.f79098a, NewBeneficiary.a.f79092a, NewCard.a.f79096a}, new Annotation[0]);
        }
    }
}
