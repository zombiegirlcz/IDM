package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmAliasRegistrationMode;", "Landroid/os/Parcelable;", "Add", "AddAndReplace", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmAliasRegistrationMode$Add;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmAliasRegistrationMode$AddAndReplace;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ApmAliasRegistrationMode implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f62239a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmAliasRegistrationMode$Add;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmAliasRegistrationMode;", "<init>", "()V", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Add extends ApmAliasRegistrationMode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Add f62240b = new Add();

        @NotNull
        public static final Parcelable.Creator<Add> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Add.f62240b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Add[i];
            }
        }

        private Add() {
            super(new TextLocalisedClause(R$string.apm_new_contact_action, null, null, 14));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmAliasRegistrationMode$AddAndReplace;", "Lcom/revolut/feature/apm/core/ui/api/navigation/ApmAliasRegistrationMode;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddAndReplace extends ApmAliasRegistrationMode {

        @NotNull
        public static final Parcelable.Creator<AddAndReplace> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Alias f62241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f62242c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddAndReplace((Alias) parcel.readParcelable(AddAndReplace.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddAndReplace[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddAndReplace(Alias replacedAlias, int i) {
            super(new TextLocalisedClause(i, null, null, 14));
            Intrinsics.checkNotNullParameter(replacedAlias, "replacedAlias");
            this.f62241b = replacedAlias;
            this.f62242c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddAndReplace)) {
                return false;
            }
            AddAndReplace addAndReplace = (AddAndReplace) obj2;
            return Intrinsics.f(this.f62241b, addAndReplace.f62241b) && this.f62242c == addAndReplace.f62242c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f62242c) + (this.f62241b.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62241b, i);
            dest.writeInt(this.f62242c);
        }
    }

    public ApmAliasRegistrationMode(TextLocalisedClause textLocalisedClause) {
        this.f62239a = textLocalisedClause;
    }
}
