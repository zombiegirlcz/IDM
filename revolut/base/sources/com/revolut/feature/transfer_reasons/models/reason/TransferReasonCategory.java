package com.revolut.feature.transfer_reasons.models.reason;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ttf.c;
import ttf.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonCategory;", "Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonNode;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonCategory implements TransferReasonNode {

    @NotNull
    public static final Parcelable.Creator<TransferReasonCategory> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f92436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92437c;
    public final List d;
    public final e e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferReasonCategory.class, parcel, arrayList, iE, 1);
            }
            return new TransferReasonCategory(string, cVarValueOf, string2, arrayList, e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonCategory[i];
        }
    }

    public TransferReasonCategory(String id10, c type, String str, List children, e selectionMode) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        this.f92435a = id10;
        this.f92436b = type;
        this.f92437c = str;
        this.d = children;
        this.e = selectionMode;
    }

    public static TransferReasonCategory a(TransferReasonCategory transferReasonCategory, List children) {
        String id10 = transferReasonCategory.f92435a;
        c type = transferReasonCategory.f92436b;
        String str = transferReasonCategory.f92437c;
        e selectionMode = transferReasonCategory.e;
        transferReasonCategory.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(children, "children");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        return new TransferReasonCategory(id10, type, str, children, selectionMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonCategory)) {
            return false;
        }
        TransferReasonCategory transferReasonCategory = (TransferReasonCategory) obj2;
        return Intrinsics.f(this.f92435a, transferReasonCategory.f92435a) && this.f92436b == transferReasonCategory.f92436b && Intrinsics.f(this.f92437c, transferReasonCategory.f92437c) && Intrinsics.f(this.d, transferReasonCategory.d) && this.e == transferReasonCategory.e;
    }

    @Override // com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF92435a() {
        return this.f92435a;
    }

    @Override // com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF92437c() {
        return this.f92437c;
    }

    @Override // com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final c getF92436b() {
        return this.f92436b;
    }

    public final int hashCode() {
        int iHashCode = (this.f92436b.hashCode() + (this.f92435a.hashCode() * 31)) * 31;
        String str = this.f92437c;
        return this.e.hashCode() + p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92435a);
        dest.writeString(this.f92436b.name());
        dest.writeString(this.f92437c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.e.name());
    }

    public /* synthetic */ TransferReasonCategory(String str, String str2, List list, e eVar, int i) {
        this(str, c.CATEGORY, str2, list, (i & 16) != 0 ? e.MULTIPLE : eVar);
    }
}
