package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.k9;
import c12.a0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.kompot.common.IOData$Input;
import hrf.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/ui/api/navigation/ApmRecipientListInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmRecipientListInputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f62262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f62263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f62264c;
    public final Clause d;
    public final Clause e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f62265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f62266h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f62267j;
    public final k9 k;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ApmRecipientListInputData> CREATOR = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TextLocalisedClause f62260l = new TextLocalisedClause(R$string.apm_select_contact_title_send, null, null, 14);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TextLocalisedClause f62261m = new TextLocalisedClause(R$string.apm_select_contact_title_request, null, null, 14);

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f fVarValueOf = f.valueOf(parcel.readString());
            Clause clause = (Clause) parcel.readParcelable(ApmRecipientListInputData.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(ApmRecipientListInputData.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(ApmRecipientListInputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(ApmRecipientListInputData.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(ApmRecipientListInputData.class.getClassLoader());
            Clause clause4 = (Clause) parcel.readParcelable(ApmRecipientListInputData.class.getClassLoader());
            Clause clause5 = (Clause) parcel.readParcelable(ApmRecipientListInputData.class.getClassLoader());
            Clause clause6 = (Clause) parcel.readParcelable(ApmRecipientListInputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ApmRecipientListInputData.class, parcel, arrayList, iE, 1);
            }
            return new ApmRecipientListInputData(fVarValueOf, clause, image, clause2, clause3, image2, clause4, clause5, clause6, arrayList, (k9) parcel.readValue(ApmRecipientListInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmRecipientListInputData[i];
        }
    }

    public ApmRecipientListInputData(f transferDirection, Clause title, Image icon, Clause searchHint, Clause newContactAction, Image newContactIcon, Clause emptyStateTitle, Clause emptyStateSearchAction, Clause permissionWidgetApmName, List menuItems, k9 searchFieldActionButtons) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(newContactAction, "newContactAction");
        Intrinsics.checkNotNullParameter(newContactIcon, "newContactIcon");
        Intrinsics.checkNotNullParameter(emptyStateTitle, "emptyStateTitle");
        Intrinsics.checkNotNullParameter(emptyStateSearchAction, "emptyStateSearchAction");
        Intrinsics.checkNotNullParameter(permissionWidgetApmName, "permissionWidgetApmName");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(searchFieldActionButtons, "searchFieldActionButtons");
        this.f62262a = transferDirection;
        this.f62263b = title;
        this.f62264c = icon;
        this.d = searchHint;
        this.e = newContactAction;
        this.f = newContactIcon;
        this.f62265g = emptyStateTitle;
        this.f62266h = emptyStateSearchAction;
        this.i = permissionWidgetApmName;
        this.f62267j = menuItems;
        this.k = searchFieldActionButtons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmRecipientListInputData)) {
            return false;
        }
        ApmRecipientListInputData apmRecipientListInputData = (ApmRecipientListInputData) obj2;
        return this.f62262a == apmRecipientListInputData.f62262a && Intrinsics.f(this.f62263b, apmRecipientListInputData.f62263b) && Intrinsics.f(this.f62264c, apmRecipientListInputData.f62264c) && Intrinsics.f(this.d, apmRecipientListInputData.d) && Intrinsics.f(this.e, apmRecipientListInputData.e) && Intrinsics.f(this.f, apmRecipientListInputData.f) && Intrinsics.f(this.f62265g, apmRecipientListInputData.f62265g) && Intrinsics.f(this.f62266h, apmRecipientListInputData.f62266h) && Intrinsics.f(this.i, apmRecipientListInputData.i) && Intrinsics.f(this.f62267j, apmRecipientListInputData.f62267j) && Intrinsics.f(this.k, apmRecipientListInputData.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + p.a.d(p.a.a(p.a.a(p.a.a(a10.b.c(this.f, p.a.a(p.a.a(a10.b.c(this.f62264c, p.a.a(this.f62262a.hashCode() * 31, 31, this.f62263b), 31), 31, this.d), 31, this.e), 31), 31, this.f62265g), 31, this.f62266h), 31, this.i), 31, this.f62267j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62262a.name());
        dest.writeParcelable(this.f62263b, i);
        dest.writeParcelable(this.f62264c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f62265g, i);
        dest.writeParcelable(this.f62266h, i);
        dest.writeParcelable(this.i, i);
        Iterator itV = p.a.v(this.f62267j, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeValue(this.k);
    }

    public ApmRecipientListInputData(ApmProduct apmProduct, f transferDirection, TextLocalisedClause title, TextLocalisedClause searchHint, List menuItems) {
        k9 searchFieldActionButtons = new k9(null, null, 3);
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(searchFieldActionButtons, "searchFieldActionButtons");
        this(transferDirection, title, new GlyphImage(apmProduct.d(), null, null, 6), searchHint, new TextLocalisedClause(R$string.apm_select_contact_new_contact, u.c(apmProduct.e()), null, 12), new TextLocalisedClause(R$string.apm_select_contact_no_contacts, u.c(apmProduct.e()), null, 12), new TextLocalisedClause(R$string.apm_select_contact_search_new_contact, u.c(apmProduct.e()), null, 12), apmProduct.e(), menuItems, searchFieldActionButtons, 32);
    }

    public ApmRecipientListInputData(ApmProduct apmProduct, f transferDirection, TextLocalisedClause searchHint) {
        TextLocalisedClause textLocalisedClause;
        f0 menuItems = f0.f322471a;
        k9 searchFieldActionButtons = new k9(null, null, 3);
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(searchFieldActionButtons, "searchFieldActionButtons");
        int i = a0.f20319a[transferDirection.ordinal()];
        if (i == 1) {
            textLocalisedClause = f62260l;
        } else if (i == 2) {
            textLocalisedClause = f62261m;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this(transferDirection, textLocalisedClause, new GlyphImage(apmProduct.d(), null, null, 6), searchHint, new TextLocalisedClause(R$string.apm_select_contact_new_contact, u.c(apmProduct.e()), null, 12), new TextLocalisedClause(R$string.apm_select_contact_no_contacts, u.c(apmProduct.e()), null, 12), new TextLocalisedClause(R$string.apm_select_contact_search_new_contact, u.c(apmProduct.e()), null, 12), apmProduct.e(), menuItems, searchFieldActionButtons, 32);
    }

    public ApmRecipientListInputData(f fVar, Clause clause, GlyphImage glyphImage, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, TextLocalisedClause textLocalisedClause4, Clause clause2, List list, k9 k9Var, int i) {
        this(fVar, clause, glyphImage, textLocalisedClause, textLocalisedClause2, glyphImage, textLocalisedClause3, textLocalisedClause4, clause2, (i & 512) != 0 ? f0.f322471a : list, k9Var);
    }
}
