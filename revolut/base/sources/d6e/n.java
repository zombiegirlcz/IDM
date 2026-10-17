package d6e;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExtendedSubaccountType f111522c;
    public final AccountListItemModel d;
    public final ProductAccountValue e;

    public n(String id10, String name, ExtendedSubaccountType type, AccountListItemModel listItemModel, ProductAccountValue value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listItemModel, "listItemModel");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f111520a = id10;
        this.f111521b = name;
        this.f111522c = type;
        this.d = listItemModel;
        this.e = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f111520a, nVar.f111520a) && Intrinsics.f(this.f111521b, nVar.f111521b) && Intrinsics.f(this.f111522c, nVar.f111522c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f111522c.hashCode() + p.a.c(this.f111520a.hashCode() * 31, 31, this.f111521b)) * 31)) * 31);
    }
}
