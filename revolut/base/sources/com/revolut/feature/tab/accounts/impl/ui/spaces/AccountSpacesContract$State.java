package com.revolut.feature.tab.accounts.impl.ui.spaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tab/accounts/impl/ui/spaces/AccountSpacesContract$State", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountSpacesContract$State implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<AccountSpacesContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f89607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f89608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductAccountDescriptor$Value f89609c;
    public final aie.e d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AccountSpacesContract$State.class, parcel, arrayList, iE, 1);
            }
            return new AccountSpacesContract$State(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountSpacesContract$State[i];
        }
    }

    public AccountSpacesContract$State(List spacesContentModels, Data legalEntityContext, ProductAccountDescriptor$Value productAccountDescriptor$Value, aie.e eVar, List hiddenAccountsItems) {
        Intrinsics.checkNotNullParameter(spacesContentModels, "spacesContentModels");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(hiddenAccountsItems, "hiddenAccountsItems");
        this.f89607a = spacesContentModels;
        this.f89608b = legalEntityContext;
        this.f89609c = productAccountDescriptor$Value;
        this.d = eVar;
        this.e = hiddenAccountsItems;
    }

    public static AccountSpacesContract$State a(AccountSpacesContract$State accountSpacesContract$State, List list, Data data, ProductAccountDescriptor$Value productAccountDescriptor$Value, aie.e eVar, List list2, int i) {
        if ((i & 1) != 0) {
            list = accountSpacesContract$State.f89607a;
        }
        List spacesContentModels = list;
        if ((i & 2) != 0) {
            data = accountSpacesContract$State.f89608b;
        }
        Data legalEntityContext = data;
        if ((i & 4) != 0) {
            productAccountDescriptor$Value = accountSpacesContract$State.f89609c;
        }
        ProductAccountDescriptor$Value productAccountDescriptor$Value2 = productAccountDescriptor$Value;
        if ((i & 8) != 0) {
            eVar = accountSpacesContract$State.d;
        }
        aie.e eVar2 = eVar;
        if ((i & 16) != 0) {
            list2 = accountSpacesContract$State.e;
        }
        List hiddenAccountsItems = list2;
        accountSpacesContract$State.getClass();
        Intrinsics.checkNotNullParameter(spacesContentModels, "spacesContentModels");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(hiddenAccountsItems, "hiddenAccountsItems");
        return new AccountSpacesContract$State(spacesContentModels, legalEntityContext, productAccountDescriptor$Value2, eVar2, hiddenAccountsItems);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountSpacesContract$State)) {
            return false;
        }
        AccountSpacesContract$State accountSpacesContract$State = (AccountSpacesContract$State) obj2;
        return Intrinsics.f(this.f89607a, accountSpacesContract$State.f89607a) && Intrinsics.f(this.f89608b, accountSpacesContract$State.f89608b) && Intrinsics.f(this.f89609c, accountSpacesContract$State.f89609c) && Intrinsics.f(this.d, accountSpacesContract$State.d) && Intrinsics.f(this.e, accountSpacesContract$State.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f89608b, this.f89607a.hashCode() * 31, 31);
        ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f89609c;
        int iHashCode = (iC + (productAccountDescriptor$Value == null ? 0 : productAccountDescriptor$Value.hashCode())) * 31;
        aie.e eVar = this.d;
        return this.e.hashCode() + ((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f89607a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public AccountSpacesContract$State(List list) {
        this(list, new Data(null, null, true, 3, null), null, null, f0.f322471a);
    }
}
