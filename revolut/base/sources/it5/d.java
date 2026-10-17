package it5;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitAccountsItemGroup.RowItem f168344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f168345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SplitAccountsItemGroup.RowItem f168346c;

    public d(SplitAccountsItemGroup.RowItem baseItem, f data, SplitAccountsItemGroup.RowItem rowItem) {
        Intrinsics.checkNotNullParameter(baseItem, "baseItem");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f168344a = baseItem;
        this.f168345b = data;
        this.f168346c = rowItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f168344a, dVar.f168344a) && Intrinsics.f(this.f168345b, dVar.f168345b) && Intrinsics.f(this.f168346c, dVar.f168346c);
    }

    public final int hashCode() {
        int iHashCode = (this.f168345b.hashCode() + (this.f168344a.hashCode() * 31)) * 31;
        SplitAccountsItemGroup.RowItem rowItem = this.f168346c;
        return iHashCode + (rowItem == null ? 0 : rowItem.hashCode());
    }
}
