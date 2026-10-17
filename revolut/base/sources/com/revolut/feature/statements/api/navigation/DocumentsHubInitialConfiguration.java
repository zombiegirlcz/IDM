package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.models.StatementPeriod;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration;", "Landroid/os/Parcelable;", "Companion", "Default", "Tab", "Custom", "a", "Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration$Custom;", "Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration$Default;", "Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration$Tab;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentsHubInitialConfiguration extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f88258a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration$Default;", "Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration;", "<init>", "()V", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default implements DocumentsHubInitialConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f88256a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f88256a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration$Tab;", "Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tab implements DocumentsHubInitialConfiguration {

        @NotNull
        public static final Parcelable.Creator<Tab> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88257a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tab(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tab[i];
            }
        }

        public Tab(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f88257a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Tab) && Intrinsics.f(this.f88257a, ((Tab) obj2).f88257a);
        }

        public final int hashCode() {
            return this.f88257a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88257a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f88258a = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration$Custom;", "Lcom/revolut/feature/statements/api/navigation/DocumentsHubInitialConfiguration;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom implements DocumentsHubInitialConfiguration {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f88254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StatementPeriod f88255b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
                return new Custom(linkedHashSet, parcel.readInt() == 0 ? null : StatementPeriod.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom() {
            this(h0.f322473a, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) obj2;
            return Intrinsics.f(this.f88254a, custom.f88254a) && Intrinsics.f(this.f88255b, custom.f88255b);
        }

        public final int hashCode() {
            int iHashCode = this.f88254a.hashCode() * 31;
            StatementPeriod statementPeriod = this.f88255b;
            return iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f88254a, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
            StatementPeriod statementPeriod = this.f88255b;
            if (statementPeriod == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                statementPeriod.writeToParcel(dest, i);
            }
        }

        public Custom(Set itemIds, StatementPeriod statementPeriod) {
            Intrinsics.checkNotNullParameter(itemIds, "itemIds");
            this.f88254a = itemIds;
            this.f88255b = statementPeriod;
        }
    }
}
