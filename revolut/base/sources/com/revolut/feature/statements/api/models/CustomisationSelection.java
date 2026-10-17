package com.revolut.feature.statements.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import prk.o;
import xi0.b;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001GBi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b,\u0010)J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b-\u0010)J\u0082\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b0\u0010\u0017J\u001a\u00103\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010+R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bE\u0010)R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bF\u0010)¨\u0006H"}, d2 = {"Lcom/revolut/feature/statements/api/models/CustomisationSelection;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/statements/api/documents_hub/period/StatementPeriodSelection;", "period", "Ljava/util/Locale;", "language", "Lxi0/b;", "currency", "", "hideBalances", "Lcom/revolut/feature/statements/api/models/StatementsFormat;", "format", "", "", "expandedProducts", "Lcom/revolut/feature/statements/api/models/ProductSelection;", "productSelection", "selectedCategories", "selectedTransactionDirections", "<init>", "(Lcom/revolut/feature/statements/api/documents_hub/period/StatementPeriodSelection;Ljava/util/Locale;Lxi0/b;ZLcom/revolut/feature/statements/api/models/StatementsFormat;Ljava/util/Set;Lcom/revolut/feature/statements/api/models/ProductSelection;Ljava/util/Set;Ljava/util/Set;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/revolut/feature/statements/api/documents_hub/period/StatementPeriodSelection;", "component2", "()Ljava/util/Locale;", "component3", "()Lxi0/b;", "component4", "()Z", "component5", "()Lcom/revolut/feature/statements/api/models/StatementsFormat;", "component6", "()Ljava/util/Set;", "component7", "()Lcom/revolut/feature/statements/api/models/ProductSelection;", "component8", "component9", "copy", "(Lcom/revolut/feature/statements/api/documents_hub/period/StatementPeriodSelection;Ljava/util/Locale;Lxi0/b;ZLcom/revolut/feature/statements/api/models/StatementsFormat;Ljava/util/Set;Lcom/revolut/feature/statements/api/models/ProductSelection;Ljava/util/Set;Ljava/util/Set;)Lcom/revolut/feature/statements/api/models/CustomisationSelection;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/statements/api/documents_hub/period/StatementPeriodSelection;", "getPeriod", "Ljava/util/Locale;", "getLanguage", "Lxi0/b;", "getCurrency", "Z", "getHideBalances", "Lcom/revolut/feature/statements/api/models/StatementsFormat;", "getFormat", "Ljava/util/Set;", "getExpandedProducts", "Lcom/revolut/feature/statements/api/models/ProductSelection;", "getProductSelection", "getSelectedCategories", "getSelectedTransactionDirections", "Companion", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomisationSelection implements Parcelable {

    @NotNull
    private static final CustomisationSelection EMPTY;
    private final b currency;

    @NotNull
    private final Set<String> expandedProducts;

    @NotNull
    private final StatementsFormat format;
    private final boolean hideBalances;
    private final Locale language;
    private final StatementPeriodSelection period;

    @NotNull
    private final ProductSelection productSelection;

    @NotNull
    private final Set<String> selectedCategories;

    @NotNull
    private final Set<String> selectedTransactionDirections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CustomisationSelection> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/statements/api/models/CustomisationSelection$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/revolut/feature/statements/api/models/CustomisationSelection;", "getEMPTY", "()Lcom/revolut/feature/statements/api/models/CustomisationSelection;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CustomisationSelection getEMPTY() {
            return CustomisationSelection.EMPTY;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomisationSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomisationSelection createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StatementPeriodSelection statementPeriodSelectionCreateFromParcel = parcel.readInt() == 0 ? null : StatementPeriodSelection.CREATOR.createFromParcel(parcel);
            Locale locale = (Locale) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            StatementsFormat statementsFormatValueOf = StatementsFormat.valueOf(parcel.readString());
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = o.a(parcel, linkedHashSet, iA2, i);
            }
            ProductSelection productSelectionCreateFromParcel = ProductSelection.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            int iA3 = 0;
            while (iA3 != i3) {
                iA3 = o.a(parcel, linkedHashSet2, iA3, i);
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i5);
            while (iA != i5) {
                iA = o.a(parcel, linkedHashSet3, iA, i);
            }
            return new CustomisationSelection(statementPeriodSelectionCreateFromParcel, locale, bVar, z, statementsFormatValueOf, linkedHashSet, productSelectionCreateFromParcel, linkedHashSet2, linkedHashSet3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomisationSelection[] newArray(int i) {
            return new CustomisationSelection[i];
        }
    }

    static {
        h0 h0Var = h0.f322473a;
        EMPTY = new CustomisationSelection(null, null, null, false, null, h0Var, ProductSelection.INSTANCE.getEMPTY(), h0Var, h0Var, 16, null);
    }

    public CustomisationSelection(StatementPeriodSelection statementPeriodSelection, Locale locale, b bVar, boolean z, @NotNull StatementsFormat format, @NotNull Set<String> expandedProducts, @NotNull ProductSelection productSelection, @NotNull Set<String> selectedCategories, @NotNull Set<String> selectedTransactionDirections) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(expandedProducts, "expandedProducts");
        Intrinsics.checkNotNullParameter(productSelection, "productSelection");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedTransactionDirections, "selectedTransactionDirections");
        this.period = statementPeriodSelection;
        this.language = locale;
        this.currency = bVar;
        this.hideBalances = z;
        this.format = format;
        this.expandedProducts = expandedProducts;
        this.productSelection = productSelection;
        this.selectedCategories = selectedCategories;
        this.selectedTransactionDirections = selectedTransactionDirections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomisationSelection copy$default(CustomisationSelection customisationSelection, StatementPeriodSelection statementPeriodSelection, Locale locale, b bVar, boolean z, StatementsFormat statementsFormat, Set set, ProductSelection productSelection, Set set2, Set set3, int i, Object obj2) {
        if ((i & 1) != 0) {
            statementPeriodSelection = customisationSelection.period;
        }
        if ((i & 2) != 0) {
            locale = customisationSelection.language;
        }
        if ((i & 4) != 0) {
            bVar = customisationSelection.currency;
        }
        if ((i & 8) != 0) {
            z = customisationSelection.hideBalances;
        }
        if ((i & 16) != 0) {
            statementsFormat = customisationSelection.format;
        }
        if ((i & 32) != 0) {
            set = customisationSelection.expandedProducts;
        }
        if ((i & 64) != 0) {
            productSelection = customisationSelection.productSelection;
        }
        if ((i & 128) != 0) {
            set2 = customisationSelection.selectedCategories;
        }
        if ((i & 256) != 0) {
            set3 = customisationSelection.selectedTransactionDirections;
        }
        Set set4 = set2;
        Set set5 = set3;
        Set set6 = set;
        ProductSelection productSelection2 = productSelection;
        StatementsFormat statementsFormat2 = statementsFormat;
        b bVar2 = bVar;
        return customisationSelection.copy(statementPeriodSelection, locale, bVar2, z, statementsFormat2, set6, productSelection2, set4, set5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StatementPeriodSelection getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Locale getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final b getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHideBalances() {
        return this.hideBalances;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final StatementsFormat getFormat() {
        return this.format;
    }

    @NotNull
    public final Set<String> component6() {
        return this.expandedProducts;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ProductSelection getProductSelection() {
        return this.productSelection;
    }

    @NotNull
    public final Set<String> component8() {
        return this.selectedCategories;
    }

    @NotNull
    public final Set<String> component9() {
        return this.selectedTransactionDirections;
    }

    @NotNull
    public final CustomisationSelection copy(StatementPeriodSelection period, Locale language, b currency, boolean hideBalances, @NotNull StatementsFormat format, @NotNull Set<String> expandedProducts, @NotNull ProductSelection productSelection, @NotNull Set<String> selectedCategories, @NotNull Set<String> selectedTransactionDirections) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(expandedProducts, "expandedProducts");
        Intrinsics.checkNotNullParameter(productSelection, "productSelection");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedTransactionDirections, "selectedTransactionDirections");
        return new CustomisationSelection(period, language, currency, hideBalances, format, expandedProducts, productSelection, selectedCategories, selectedTransactionDirections);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomisationSelection)) {
            return false;
        }
        CustomisationSelection customisationSelection = (CustomisationSelection) other;
        return Intrinsics.f(this.period, customisationSelection.period) && Intrinsics.f(this.language, customisationSelection.language) && Intrinsics.f(this.currency, customisationSelection.currency) && this.hideBalances == customisationSelection.hideBalances && this.format == customisationSelection.format && Intrinsics.f(this.expandedProducts, customisationSelection.expandedProducts) && Intrinsics.f(this.productSelection, customisationSelection.productSelection) && Intrinsics.f(this.selectedCategories, customisationSelection.selectedCategories) && Intrinsics.f(this.selectedTransactionDirections, customisationSelection.selectedTransactionDirections);
    }

    public final b getCurrency() {
        return this.currency;
    }

    @NotNull
    public final Set<String> getExpandedProducts() {
        return this.expandedProducts;
    }

    @NotNull
    public final StatementsFormat getFormat() {
        return this.format;
    }

    public final boolean getHideBalances() {
        return this.hideBalances;
    }

    public final Locale getLanguage() {
        return this.language;
    }

    public final StatementPeriodSelection getPeriod() {
        return this.period;
    }

    @NotNull
    public final ProductSelection getProductSelection() {
        return this.productSelection;
    }

    @NotNull
    public final Set<String> getSelectedCategories() {
        return this.selectedCategories;
    }

    @NotNull
    public final Set<String> getSelectedTransactionDirections() {
        return this.selectedTransactionDirections;
    }

    public int hashCode() {
        StatementPeriodSelection statementPeriodSelection = this.period;
        int iHashCode = (statementPeriodSelection == null ? 0 : statementPeriodSelection.hashCode()) * 31;
        Locale locale = this.language;
        int iHashCode2 = (iHashCode + (locale == null ? 0 : locale.hashCode())) * 31;
        b bVar = this.currency;
        return this.selectedTransactionDirections.hashCode() + a.f((this.productSelection.hashCode() + a.f((this.format.hashCode() + j6.a.c((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.hideBalances)) * 31, 31, this.expandedProducts)) * 31, 31, this.selectedCategories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        StatementPeriodSelection statementPeriodSelection = this.period;
        if (statementPeriodSelection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            statementPeriodSelection.writeToParcel(dest, flags);
        }
        dest.writeSerializable(this.language);
        dest.writeSerializable(this.currency);
        dest.writeInt(this.hideBalances ? 1 : 0);
        dest.writeString(this.format.name());
        Iterator itV = n.v(this.expandedProducts, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        this.productSelection.writeToParcel(dest, flags);
        Iterator itV2 = n.v(this.selectedCategories, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        Iterator itV3 = n.v(this.selectedTransactionDirections, dest);
        while (itV3.hasNext()) {
            dest.writeString((String) itV3.next());
        }
    }

    public /* synthetic */ CustomisationSelection(StatementPeriodSelection statementPeriodSelection, Locale locale, b bVar, boolean z, StatementsFormat statementsFormat, Set set, ProductSelection productSelection, Set set2, Set set3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(statementPeriodSelection, locale, bVar, z, (i & 16) != 0 ? StatementsFormat.PDF : statementsFormat, set, productSelection, set2, set3);
    }
}
