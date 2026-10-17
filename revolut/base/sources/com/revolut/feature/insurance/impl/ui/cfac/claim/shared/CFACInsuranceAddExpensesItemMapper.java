package com.revolut.feature.insurance.impl.ui.cfac.claim.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yp0.b;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class CFACInsuranceAddExpensesItemMapper {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/shared/CFACInsuranceAddExpensesItemMapper$AddExpenses;", "Landroid/os/Parcelable;", "<init>", "()V", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddExpenses implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddExpenses f75112a = new AddExpenses();

        @NotNull
        public static final Parcelable.Creator<AddExpenses> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddExpenses.f75112a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddExpenses[i];
            }
        }

        private AddExpenses() {
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

    public static final class a {
        private a() {
        }
    }

    public static List a() {
        RowDelegate.Model model = new RowDelegate.Model("ID_ADD_EXPENSES_ITEM", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.cfac_claim_claimed_expenses_add_expenses, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, AddExpenses.f75112a, null, 0, 0, 0, 0, 532676600);
        b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
