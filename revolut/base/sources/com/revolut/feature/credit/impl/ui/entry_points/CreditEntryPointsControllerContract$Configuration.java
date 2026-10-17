package com.revolut.feature.credit.impl.ui.entry_points;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsControllerContract$Configuration", "Landroid/os/Parcelable;", "<init>", "()V", "All", "Specified", "Lcom/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsControllerContract$Configuration$All;", "Lcom/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsControllerContract$Configuration$Specified;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditEntryPointsControllerContract$Configuration implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsControllerContract$Configuration$All;", "Lcom/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsControllerContract$Configuration;", "<init>", "()V", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class All extends CreditEntryPointsControllerContract$Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final All f70055a = new All();

        @NotNull
        public static final Parcelable.Creator<All> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return All.f70055a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new All[i];
            }
        }

        private All() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsControllerContract$Configuration$Specified;", "Lcom/revolut/feature/credit/impl/ui/entry_points/CreditEntryPointsControllerContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Specified extends CreditEntryPointsControllerContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<Specified> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f70056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f70057b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", Specified.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Specified.class, parcel, arrayList, iE, 1);
                }
                return new Specified(clause, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Specified[i];
            }
        }

        public Specified(Clause title, List entryPoints) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
            this.f70056a = title;
            this.f70057b = entryPoints;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Specified)) {
                return false;
            }
            Specified specified = (Specified) obj2;
            return Intrinsics.f(this.f70056a, specified.f70056a) && Intrinsics.f(this.f70057b, specified.f70057b);
        }

        public final int hashCode() {
            return this.f70057b.hashCode() + (this.f70056a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70056a, i);
            Iterator itV = p.a.v(this.f70057b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private CreditEntryPointsControllerContract$Configuration() {
    }
}
