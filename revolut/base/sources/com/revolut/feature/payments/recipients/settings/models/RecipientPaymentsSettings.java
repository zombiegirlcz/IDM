package com.revolut.feature.payments.recipients.settings.models;

import android.os.Parcel;
import android.os.Parcelable;
import iy9.c;
import iy9.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "iy9/d", "Setting", "iy9/c", "a", "feature_payments_recipients_settings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientPaymentsSettings implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f79673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f79674c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RecipientPaymentsSettings> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings$Setting;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Value", "feature_payments_recipients_settings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Setting implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Setting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f79675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Value f79676b;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings$Setting$Value;", "Landroid/os/Parcelable;", "LongNumber", "Binary", "Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings$Setting$Value$Binary;", "Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings$Setting$Value$LongNumber;", "feature_payments_recipients_settings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Value extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings$Setting$Value$Binary;", "Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings$Setting$Value;", "", "toString", "()Ljava/lang/String;", "feature_payments_recipients_settings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Binary implements Value {

                @NotNull
                public static final Parcelable.Creator<Binary> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f79677a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Binary(parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Binary[i];
                    }
                }

                public Binary(boolean z) {
                    this.f79677a = z;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Binary) && this.f79677a == ((Binary) obj2).f79677a;
                }

                @Override // com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings.Setting.Value
                public final Object getValue() {
                    return Boolean.valueOf(this.f79677a);
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f79677a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(this.f79677a ? 1 : 0);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings$Setting$Value$LongNumber;", "Lcom/revolut/feature/payments/recipients/settings/models/RecipientPaymentsSettings$Setting$Value;", "", "toString", "()Ljava/lang/String;", "feature_payments_recipients_settings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class LongNumber implements Value {

                @NotNull
                public static final Parcelable.Creator<LongNumber> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final long f79678a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new LongNumber(parcel.readLong());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new LongNumber[i];
                    }
                }

                public LongNumber(long j2) {
                    this.f79678a = j2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof LongNumber) && this.f79678a == ((LongNumber) obj2).f79678a;
                }

                @Override // com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings.Setting.Value
                public final Object getValue() {
                    return Long.valueOf(this.f79678a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.f79678a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeLong(this.f79678a);
                }
            }

            Object getValue();
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Setting(c.valueOf(parcel.readString()), (Value) parcel.readParcelable(Setting.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Setting[i];
            }
        }

        public Setting(c name, Value value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f79675a = name;
            this.f79676b = value;
        }

        public static Setting a(Setting setting, Value.Binary value) {
            c name = setting.f79675a;
            setting.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Setting(name, value);
        }

        public final boolean b() {
            Value value = this.f79676b;
            Value.Binary binary = value instanceof Value.Binary ? (Value.Binary) value : null;
            if (binary != null) {
                return binary.f79677a;
            }
            return false;
        }

        public final Boolean c() {
            Value value = this.f79676b;
            Value.Binary binary = value instanceof Value.Binary ? (Value.Binary) value : null;
            if (binary != null) {
                return Boolean.valueOf(binary.f79677a);
            }
            return null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Setting)) {
                return false;
            }
            Setting setting = (Setting) obj2;
            return this.f79675a == setting.f79675a && Intrinsics.f(this.f79676b, setting.f79676b);
        }

        public final int hashCode() {
            return this.f79676b.hashCode() + (this.f79675a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79675a.name());
            dest.writeParcelable(this.f79676b, i);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static Setting a() {
            return new Setting(c.TWO_FA_REQUIRED, new Setting.Value.Binary(true));
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            d dVarValueOf = d.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Setting.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RecipientPaymentsSettings(string, dVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecipientPaymentsSettings[i];
        }
    }

    public RecipientPaymentsSettings(String id10, d type, List settings) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f79672a = id10;
        this.f79673b = type;
        this.f79674c = settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecipientPaymentsSettings)) {
            return false;
        }
        RecipientPaymentsSettings recipientPaymentsSettings = (RecipientPaymentsSettings) obj2;
        return Intrinsics.f(this.f79672a, recipientPaymentsSettings.f79672a) && this.f79673b == recipientPaymentsSettings.f79673b && Intrinsics.f(this.f79674c, recipientPaymentsSettings.f79674c);
    }

    public final int hashCode() {
        return this.f79674c.hashCode() + ((this.f79673b.hashCode() + (this.f79672a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79672a);
        dest.writeString(this.f79673b.name());
        Iterator itV = p.a.v(this.f79674c, dest);
        while (itV.hasNext()) {
            ((Setting) itV.next()).writeToParcel(dest, i);
        }
    }
}
