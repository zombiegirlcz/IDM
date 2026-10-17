package com.revolut.feature.apm.core.code.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor", "Landroid/os/Parcelable;", "Text", "Phone", "Email", "Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor$Email;", "Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor$Phone;", "Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor$Text;", "feature_apm_core_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmCodeControllerContract$CodeDescriptor extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor$Email;", "Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email implements ApmCodeControllerContract$CodeDescriptor {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61831a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f61831a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Email) && Intrinsics.f(this.f61831a, ((Email) obj2).f61831a);
        }

        public final int hashCode() {
            return this.f61831a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61831a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor$Phone;", "Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone implements ApmCodeControllerContract$CodeDescriptor {

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61832a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Phone(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Phone[i];
            }
        }

        public Phone(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f61832a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Phone) && Intrinsics.f(this.f61832a, ((Phone) obj2).f61832a);
        }

        public final int hashCode() {
            return this.f61832a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61832a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor$Text;", "Lcom/revolut/feature/apm/core/code/ui/ApmCodeControllerContract$CodeDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_code_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text implements ApmCodeControllerContract$CodeDescriptor {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f61833a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text((Clause) parcel.readParcelable(Text.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        public Text(Clause text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f61833a = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Text) && Intrinsics.f(this.f61833a, ((Text) obj2).f61833a);
        }

        public final int hashCode() {
            return this.f61833a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61833a, i);
        }
    }
}
