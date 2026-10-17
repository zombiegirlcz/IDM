package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import xl2.b0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/TransactionsSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/b0;", "Lcom/revolut/feature/backend_flow/domain/models/SelectableItem;", "Lcom/revolut/feature/backend_flow/domain/models/SelectedTransaction;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsSelectionItem implements InputItem, b0, SelectableItem<SelectedTransaction> {

    @NotNull
    public static final Parcelable.Creator<TransactionsSelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63706c;
    public final Set d;
    public final String e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SelectionStyle f63707g;

    public static final class a implements Parcelable.Creator {
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
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashSet.add(SelectedTransaction.CREATOR.createFromParcel(parcel));
            }
            String string3 = parcel.readString();
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i5);
            while (iA != i5) {
                iA = o.a(parcel, linkedHashSet2, iA, i);
            }
            return new TransactionsSelectionItem(string, z, string2, linkedHashSet, string3, linkedHashSet2, (SelectionStyle) parcel.readParcelable(TransactionsSelectionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionsSelectionItem[i];
        }
    }

    public TransactionsSelectionItem(String id10, boolean z, String searchHint, Set selected, String source, Set preselectedTransactionIds, SelectionStyle style) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(preselectedTransactionIds, "preselectedTransactionIds");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f63704a = id10;
        this.f63705b = z;
        this.f63706c = searchHint;
        this.d = selected;
        this.e = source;
        this.f = preselectedTransactionIds;
        this.f63707g = style;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectableItem
    public final SelectableItem D1(Set selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        String id10 = this.f63704a;
        Intrinsics.checkNotNullParameter(id10, "id");
        String searchHint = this.f63706c;
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(selected, "selected");
        String source = this.e;
        Intrinsics.checkNotNullParameter(source, "source");
        Set preselectedTransactionIds = this.f;
        Intrinsics.checkNotNullParameter(preselectedTransactionIds, "preselectedTransactionIds");
        SelectionStyle style = this.f63707g;
        Intrinsics.checkNotNullParameter(style, "style");
        return new TransactionsSelectionItem(id10, this.f63705b, searchHint, selected, source, preselectedTransactionIds, style);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63593a() {
        return this.f63704a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63594b() {
        return this.f63705b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionsSelectionItem)) {
            return false;
        }
        TransactionsSelectionItem transactionsSelectionItem = (TransactionsSelectionItem) obj2;
        return Intrinsics.f(this.f63704a, transactionsSelectionItem.f63704a) && this.f63705b == transactionsSelectionItem.f63705b && Intrinsics.f(this.f63706c, transactionsSelectionItem.f63706c) && Intrinsics.f(this.d, transactionsSelectionItem.d) && Intrinsics.f(this.e, transactionsSelectionItem.e) && Intrinsics.f(this.f, transactionsSelectionItem.f) && Intrinsics.f(this.f63707g, transactionsSelectionItem.f63707g);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63704a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectableItem
    /* JADX INFO: renamed from: h, reason: from getter */
    public final SelectionStyle getE() {
        return this.f63707g;
    }

    public final int hashCode() {
        return this.f63707g.hashCode() + p.a.f(p.a.c(p.a.f(p.a.c(j6.a.c(this.f63704a.hashCode() * 31, 31, this.f63705b), 31, this.f63706c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.SelectableItem
    /* JADX INFO: renamed from: p4, reason: from getter */
    public final Set getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63704a);
        dest.writeInt(this.f63705b ? 1 : 0);
        dest.writeString(this.f63706c);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            ((SelectedTransaction) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        Iterator itV2 = n.v(this.f, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        dest.writeParcelable(this.f63707g, i);
    }
}
