package com.revolut.feature.statements.impl.ui.consolidated;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.statements.api.StatementsMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/StatementsModeConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Warning", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementsModeConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StatementsModeConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementsMode f88295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f88296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f88297c;
    public final Warning d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/StatementsModeConfig$Warning;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Warning implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Warning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f88298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f88299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f88300c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Warning((Clause) parcel.readParcelable(Warning.class.getClassLoader()), (Clause) parcel.readParcelable(Warning.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Warning[i];
            }
        }

        public Warning(Clause title, Clause subtitle, String link, String clickId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(clickId, "clickId");
            this.f88298a = title;
            this.f88299b = subtitle;
            this.f88300c = link;
            this.d = clickId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Warning)) {
                return false;
            }
            Warning warning = (Warning) obj2;
            return Intrinsics.f(this.f88298a, warning.f88298a) && Intrinsics.f(this.f88299b, warning.f88299b) && Intrinsics.f(this.f88300c, warning.f88300c) && Intrinsics.f(this.d, warning.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.a(this.f88298a.hashCode() * 31, 31, this.f88299b), 31, this.f88300c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88298a, i);
            dest.writeParcelable(this.f88299b, i);
            dest.writeString(this.f88300c);
            dest.writeString(this.d);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StatementsModeConfig((StatementsMode) parcel.readParcelable(StatementsModeConfig.class.getClassLoader()), (Clause) parcel.readParcelable(StatementsModeConfig.class.getClassLoader()), (Clause) parcel.readParcelable(StatementsModeConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : Warning.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatementsModeConfig[i];
        }
    }

    public StatementsModeConfig(StatementsMode mode, Clause title, Clause clause, Warning warning) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f88295a = mode;
        this.f88296b = title;
        this.f88297c = clause;
        this.d = warning;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StatementsModeConfig)) {
            return false;
        }
        StatementsModeConfig statementsModeConfig = (StatementsModeConfig) obj2;
        return Intrinsics.f(this.f88295a, statementsModeConfig.f88295a) && Intrinsics.f(this.f88296b, statementsModeConfig.f88296b) && Intrinsics.f(this.f88297c, statementsModeConfig.f88297c) && Intrinsics.f(this.d, statementsModeConfig.d);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f88295a.hashCode() * 31, 31, this.f88296b);
        Clause clause = this.f88297c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Warning warning = this.d;
        return iHashCode + (warning != null ? warning.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88295a, i);
        dest.writeParcelable(this.f88296b, i);
        dest.writeParcelable(this.f88297c, i);
        Warning warning = this.d;
        if (warning == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            warning.writeToParcel(dest, i);
        }
    }
}
