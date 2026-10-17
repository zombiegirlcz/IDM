package com.revolut.feature.pricingplans.models.cancel;

import android.os.Parcel;
import android.os.Parcelable;
import iha.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0006\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"com/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content", "Liha/a0;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Info", "Button", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ValueOfferReminderResponse$Content implements a0, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ValueOfferReminderResponse$Content> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81179c;
    public final Info d;
    public final Button e;
    public final Button f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button;", "Landroid/os/Parcelable;", "Deeplink", "Continue", "Cancel", "Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button$Cancel;", "Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button$Continue;", "Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button$Deeplink;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Button extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button$Cancel;", "Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cancel implements Button {

            @NotNull
            public static final Parcelable.Creator<Cancel> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81180a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cancel(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cancel[i];
                }
            }

            public Cancel(String label) {
                Intrinsics.checkNotNullParameter(label, "label");
                this.f81180a = label;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Cancel) && Intrinsics.f(this.f81180a, ((Cancel) obj2).f81180a);
            }

            @Override // com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content.Button
            /* JADX INFO: renamed from: getLabel, reason: from getter */
            public final String getF81183b() {
                return this.f81180a;
            }

            public final int hashCode() {
                return this.f81180a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81180a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button$Continue;", "Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Continue implements Button {

            @NotNull
            public static final Parcelable.Creator<Continue> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81181a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Continue(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Continue[i];
                }
            }

            public Continue(String label) {
                Intrinsics.checkNotNullParameter(label, "label");
                this.f81181a = label;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Continue) && Intrinsics.f(this.f81181a, ((Continue) obj2).f81181a);
            }

            @Override // com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content.Button
            /* JADX INFO: renamed from: getLabel, reason: from getter */
            public final String getF81183b() {
                return this.f81181a;
            }

            public final int hashCode() {
                return this.f81181a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81181a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button$Deeplink;", "Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Button;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Deeplink implements Button {

            @NotNull
            public static final Parcelable.Creator<Deeplink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f81183b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Deeplink(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Deeplink[i];
                }
            }

            public Deeplink(String url2, String label) {
                Intrinsics.checkNotNullParameter(url2, "url");
                Intrinsics.checkNotNullParameter(label, "label");
                this.f81182a = url2;
                this.f81183b = label;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Deeplink)) {
                    return false;
                }
                Deeplink deeplink = (Deeplink) obj2;
                return Intrinsics.f(this.f81182a, deeplink.f81182a) && Intrinsics.f(this.f81183b, deeplink.f81183b);
            }

            @Override // com.revolut.feature.pricingplans.models.cancel.ValueOfferReminderResponse$Content.Button
            /* JADX INFO: renamed from: getLabel, reason: from getter */
            public final String getF81183b() {
                return this.f81183b;
            }

            public final int hashCode() {
                return this.f81183b.hashCode() + (this.f81182a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81182a);
                dest.writeString(this.f81183b);
            }
        }

        /* JADX INFO: renamed from: getLabel */
        String getF81183b();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/cancel/ValueOfferReminderResponse$Content$Info;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81185b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(String title, String subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.f81184a = title;
            this.f81185b = subtitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Info)) {
                return false;
            }
            Info info = (Info) obj2;
            return Intrinsics.f(this.f81184a, info.f81184a) && Intrinsics.f(this.f81185b, info.f81185b);
        }

        public final int hashCode() {
            return this.f81185b.hashCode() + (this.f81184a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81184a);
            dest.writeString(this.f81185b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ValueOfferReminderResponse$Content(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Info.CREATOR.createFromParcel(parcel), (Button) parcel.readParcelable(ValueOfferReminderResponse$Content.class.getClassLoader()), (Button) parcel.readParcelable(ValueOfferReminderResponse$Content.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ValueOfferReminderResponse$Content[i];
        }
    }

    public ValueOfferReminderResponse$Content(String str, String title, String text, Info info, Button primaryButton, Button button) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f81177a = str;
        this.f81178b = title;
        this.f81179c = text;
        this.d = info;
        this.e = primaryButton;
        this.f = button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ValueOfferReminderResponse$Content)) {
            return false;
        }
        ValueOfferReminderResponse$Content valueOfferReminderResponse$Content = (ValueOfferReminderResponse$Content) obj2;
        return Intrinsics.f(this.f81177a, valueOfferReminderResponse$Content.f81177a) && Intrinsics.f(this.f81178b, valueOfferReminderResponse$Content.f81178b) && Intrinsics.f(this.f81179c, valueOfferReminderResponse$Content.f81179c) && Intrinsics.f(this.d, valueOfferReminderResponse$Content.d) && Intrinsics.f(this.e, valueOfferReminderResponse$Content.e) && Intrinsics.f(this.f, valueOfferReminderResponse$Content.f);
    }

    public final int hashCode() {
        String str = this.f81177a;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f81178b), 31, this.f81179c);
        Info info = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (info == null ? 0 : info.hashCode())) * 31)) * 31;
        Button button = this.f;
        return iHashCode + (button != null ? button.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81177a);
        dest.writeString(this.f81178b);
        dest.writeString(this.f81179c);
        Info info = this.d;
        if (info == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            info.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
