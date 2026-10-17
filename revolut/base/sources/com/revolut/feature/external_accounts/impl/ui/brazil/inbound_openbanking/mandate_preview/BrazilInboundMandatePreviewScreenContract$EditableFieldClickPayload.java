package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload", "Landroid/os/Parcelable;", "MoneyField", "DateField", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload$DateField;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload$MoneyField;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload$DateField;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateField implements BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload {

        @NotNull
        public static final Parcelable.Creator<DateField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f72603c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateField(parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateField[i];
            }
        }

        public DateField(String id10, String title, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f72601a = id10;
            this.f72602b = title;
            this.f72603c = localDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DateField)) {
                return false;
            }
            DateField dateField = (DateField) obj2;
            return Intrinsics.f(this.f72601a, dateField.f72601a) && Intrinsics.f(this.f72602b, dateField.f72602b) && Intrinsics.f(this.f72603c, dateField.f72603c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f72601a.hashCode() * 31, 31, this.f72602b);
            LocalDate localDate = this.f72603c;
            return iC + (localDate == null ? 0 : localDate.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72601a);
            dest.writeString(this.f72602b);
            dest.writeSerializable(this.f72603c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload$MoneyField;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_openbanking/mandate_preview/BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoneyField implements BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload {

        @NotNull
        public static final Parcelable.Creator<MoneyField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f72606c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoneyField((d) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyField[i];
            }
        }

        public MoneyField(d dVar, String id10, String title) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f72604a = id10;
            this.f72605b = title;
            this.f72606c = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoneyField)) {
                return false;
            }
            MoneyField moneyField = (MoneyField) obj2;
            return Intrinsics.f(this.f72604a, moneyField.f72604a) && Intrinsics.f(this.f72605b, moneyField.f72605b) && Intrinsics.f(this.f72606c, moneyField.f72606c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f72604a.hashCode() * 31, 31, this.f72605b);
            d dVar = this.f72606c;
            return iC + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72604a);
            dest.writeString(this.f72605b);
            dest.writeSerializable(this.f72606c);
        }
    }
}
