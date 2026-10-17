package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/ChipsSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "Chip", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChipsSelectionItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<ChipsSelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63359c;
    public final List d;
    public final Set e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/ChipsSelectionItem$Chip;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chip implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Chip> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63361b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chip(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chip[i];
            }
        }

        public Chip(String id10, String label) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f63360a = id10;
            this.f63361b = label;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) obj2;
            return Intrinsics.f(this.f63360a, chip.f63360a) && Intrinsics.f(this.f63361b, chip.f63361b);
        }

        public final int hashCode() {
            return this.f63361b.hashCode() + (this.f63360a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63360a);
            dest.writeString(this.f63361b);
        }
    }

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Chip.CREATOR, parcel, arrayList, iA2, i);
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
            while (iA != i3) {
                iA = o.a(parcel, linkedHashSet, iA, i);
            }
            return new ChipsSelectionItem(string, z, z3, arrayList, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChipsSelectionItem[i];
        }
    }

    public ChipsSelectionItem(String id10, boolean z, boolean z3, List chips, Set selected) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f63357a = id10;
        this.f63358b = z;
        this.f63359c = z3;
        this.d = chips;
        this.e = selected;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63357a() {
        return this.f63357a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63358b() {
        return this.f63358b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChipsSelectionItem)) {
            return false;
        }
        ChipsSelectionItem chipsSelectionItem = (ChipsSelectionItem) obj2;
        return Intrinsics.f(this.f63357a, chipsSelectionItem.f63357a) && this.f63358b == chipsSelectionItem.f63358b && this.f63359c == chipsSelectionItem.f63359c && Intrinsics.f(this.d, chipsSelectionItem.d) && Intrinsics.f(this.e, chipsSelectionItem.e);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63357a;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(j6.a.c(j6.a.c(this.f63357a.hashCode() * 31, 31, this.f63358b), 31, this.f63359c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63357a);
        dest.writeInt(this.f63358b ? 1 : 0);
        dest.writeInt(this.f63359c ? 1 : 0);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((Chip) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = n.v(this.e, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
    }
}
