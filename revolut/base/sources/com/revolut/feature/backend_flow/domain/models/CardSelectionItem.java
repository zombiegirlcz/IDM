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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/CardSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardSelectionItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<CardSelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63347c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(BackendCard.CREATOR, parcel, arrayList2, iA2, 1);
                }
                arrayList = arrayList2;
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            while (iA != i2) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new CardSelectionItem(string, z, arrayList, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardSelectionItem[i];
        }
    }

    public CardSelectionItem(String id10, boolean z, List list, Set selected) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f63345a = id10;
        this.f63346b = z;
        this.f63347c = list;
        this.d = selected;
    }

    public static CardSelectionItem d(CardSelectionItem cardSelectionItem, List list, LinkedHashSet linkedHashSet, int i) {
        String id10 = cardSelectionItem.f63345a;
        boolean z = cardSelectionItem.f63346b;
        if ((i & 4) != 0) {
            list = cardSelectionItem.f63347c;
        }
        Set selected = linkedHashSet;
        if ((i & 8) != 0) {
            selected = cardSelectionItem.d;
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(selected, "selected");
        return new CardSelectionItem(id10, z, list, selected);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63345a() {
        return this.f63345a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63346b() {
        return this.f63346b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardSelectionItem)) {
            return false;
        }
        CardSelectionItem cardSelectionItem = (CardSelectionItem) obj2;
        return Intrinsics.f(this.f63345a, cardSelectionItem.f63345a) && this.f63346b == cardSelectionItem.f63346b && Intrinsics.f(this.f63347c, cardSelectionItem.f63347c) && Intrinsics.f(this.d, cardSelectionItem.d);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63345a;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f63345a.hashCode() * 31, 31, this.f63346b);
        List list = this.f63347c;
        return this.d.hashCode() + ((iC + (list == null ? 0 : list.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63345a);
        dest.writeInt(this.f63346b ? 1 : 0);
        List list = this.f63347c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((BackendCard) itQ.next()).writeToParcel(dest, i);
            }
        }
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
