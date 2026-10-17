package com.revolut.feature.statements.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b!\u0010\u0010J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u001cR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lcom/revolut/feature/statements/api/models/CustomisationParameters;", "Landroid/os/Parcelable;", "Ljava/util/Locale;", "defaultLanguage", "Lxi0/b;", "defaultCurrency", "", "Lcom/revolut/feature/statements/api/models/Product;", "products", "Lcom/revolut/feature/statements/api/models/SelectableOption;", "transactionDirections", "transactionCategories", "<init>", "(Ljava/util/Locale;Lxi0/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/Locale;", "component2", "()Lxi0/b;", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/util/Locale;Lxi0/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/revolut/feature/statements/api/models/CustomisationParameters;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljava/util/Locale;", "getDefaultLanguage", "Lxi0/b;", "getDefaultCurrency", "Ljava/util/List;", "getProducts", "getTransactionDirections", "getTransactionCategories", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomisationParameters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomisationParameters> CREATOR = new Creator();

    @NotNull
    private final b defaultCurrency;

    @NotNull
    private final Locale defaultLanguage;

    @NotNull
    private final List<Product> products;

    @NotNull
    private final List<SelectableOption> transactionCategories;

    @NotNull
    private final List<SelectableOption> transactionDirections;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CustomisationParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomisationParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Locale locale = (Locale) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = a.a(Product.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = a.a(SelectableOption.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            while (iA != i3) {
                iA = a.a(SelectableOption.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new CustomisationParameters(locale, bVar, arrayList, arrayList2, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomisationParameters[] newArray(int i) {
            return new CustomisationParameters[i];
        }
    }

    public CustomisationParameters(@NotNull Locale defaultLanguage, @NotNull b defaultCurrency, @NotNull List<Product> products, @NotNull List<SelectableOption> transactionDirections, @NotNull List<SelectableOption> transactionCategories) {
        Intrinsics.checkNotNullParameter(defaultLanguage, "defaultLanguage");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(transactionDirections, "transactionDirections");
        Intrinsics.checkNotNullParameter(transactionCategories, "transactionCategories");
        this.defaultLanguage = defaultLanguage;
        this.defaultCurrency = defaultCurrency;
        this.products = products;
        this.transactionDirections = transactionDirections;
        this.transactionCategories = transactionCategories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomisationParameters copy$default(CustomisationParameters customisationParameters, Locale locale, b bVar, List list, List list2, List list3, int i, Object obj2) {
        if ((i & 1) != 0) {
            locale = customisationParameters.defaultLanguage;
        }
        if ((i & 2) != 0) {
            bVar = customisationParameters.defaultCurrency;
        }
        if ((i & 4) != 0) {
            list = customisationParameters.products;
        }
        if ((i & 8) != 0) {
            list2 = customisationParameters.transactionDirections;
        }
        if ((i & 16) != 0) {
            list3 = customisationParameters.transactionCategories;
        }
        List list4 = list3;
        List list5 = list;
        return customisationParameters.copy(locale, bVar, list5, list2, list4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Locale getDefaultLanguage() {
        return this.defaultLanguage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final b getDefaultCurrency() {
        return this.defaultCurrency;
    }

    @NotNull
    public final List<Product> component3() {
        return this.products;
    }

    @NotNull
    public final List<SelectableOption> component4() {
        return this.transactionDirections;
    }

    @NotNull
    public final List<SelectableOption> component5() {
        return this.transactionCategories;
    }

    @NotNull
    public final CustomisationParameters copy(@NotNull Locale defaultLanguage, @NotNull b defaultCurrency, @NotNull List<Product> products, @NotNull List<SelectableOption> transactionDirections, @NotNull List<SelectableOption> transactionCategories) {
        Intrinsics.checkNotNullParameter(defaultLanguage, "defaultLanguage");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(transactionDirections, "transactionDirections");
        Intrinsics.checkNotNullParameter(transactionCategories, "transactionCategories");
        return new CustomisationParameters(defaultLanguage, defaultCurrency, products, transactionDirections, transactionCategories);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomisationParameters)) {
            return false;
        }
        CustomisationParameters customisationParameters = (CustomisationParameters) other;
        return Intrinsics.f(this.defaultLanguage, customisationParameters.defaultLanguage) && Intrinsics.f(this.defaultCurrency, customisationParameters.defaultCurrency) && Intrinsics.f(this.products, customisationParameters.products) && Intrinsics.f(this.transactionDirections, customisationParameters.transactionDirections) && Intrinsics.f(this.transactionCategories, customisationParameters.transactionCategories);
    }

    @NotNull
    public final b getDefaultCurrency() {
        return this.defaultCurrency;
    }

    @NotNull
    public final Locale getDefaultLanguage() {
        return this.defaultLanguage;
    }

    @NotNull
    public final List<Product> getProducts() {
        return this.products;
    }

    @NotNull
    public final List<SelectableOption> getTransactionCategories() {
        return this.transactionCategories;
    }

    @NotNull
    public final List<SelectableOption> getTransactionDirections() {
        return this.transactionDirections;
    }

    public int hashCode() {
        return this.transactionCategories.hashCode() + p.a.d(p.a.d(l.j(this.defaultCurrency, this.defaultLanguage.hashCode() * 31, 31), 31, this.products), 31, this.transactionDirections);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.defaultLanguage);
        dest.writeSerializable(this.defaultCurrency);
        Iterator itV = p.a.v(this.products, dest);
        while (itV.hasNext()) {
            ((Product) itV.next()).writeToParcel(dest, flags);
        }
        Iterator itV2 = p.a.v(this.transactionDirections, dest);
        while (itV2.hasNext()) {
            ((SelectableOption) itV2.next()).writeToParcel(dest, flags);
        }
        Iterator itV3 = p.a.v(this.transactionCategories, dest);
        while (itV3.hasNext()) {
            ((SelectableOption) itV3.next()).writeToParcel(dest, flags);
        }
    }
}
