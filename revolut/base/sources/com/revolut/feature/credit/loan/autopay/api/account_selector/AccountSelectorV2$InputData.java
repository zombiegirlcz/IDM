package com.revolut.feature.credit.loan.autopay.api.account_selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import x35.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/loan/autopay/api/account_selector/AccountSelectorV2$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_autopay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountSelectorV2$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountSelectorV2$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f70284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f70285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductArticleKey f70286c;
    public final boolean d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f70287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsContext f70288h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVar = (e) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (true) {
                if (iA == i) {
                    break;
                }
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new AccountSelectorV2$InputData(eVar, linkedHashSet, (ProductArticleKey) parcel.readParcelable(AccountSelectorV2$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (AnalyticsContext) parcel.readParcelable(AccountSelectorV2$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountSelectorV2$InputData[i];
        }
    }

    public AccountSelectorV2$InputData(e eVar, Set supportedCurrencies, ProductArticleKey productArticleKey, boolean z, String str, d dVar, Integer num, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
        this.f70284a = eVar;
        this.f70285b = supportedCurrencies;
        this.f70286c = productArticleKey;
        this.d = z;
        this.e = str;
        this.f = dVar;
        this.f70287g = num;
        this.f70288h = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountSelectorV2$InputData)) {
            return false;
        }
        AccountSelectorV2$InputData accountSelectorV2$InputData = (AccountSelectorV2$InputData) obj2;
        return Intrinsics.f(this.f70284a, accountSelectorV2$InputData.f70284a) && Intrinsics.f(this.f70285b, accountSelectorV2$InputData.f70285b) && Intrinsics.f(this.f70286c, accountSelectorV2$InputData.f70286c) && this.d == accountSelectorV2$InputData.d && Intrinsics.f(this.e, accountSelectorV2$InputData.e) && Intrinsics.f(this.f, accountSelectorV2$InputData.f) && Intrinsics.f(this.f70287g, accountSelectorV2$InputData.f70287g) && Intrinsics.f(this.f70288h, accountSelectorV2$InputData.f70288h);
    }

    public final int hashCode() {
        e eVar = this.f70284a;
        int iF = p.a.f((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f70285b);
        ProductArticleKey productArticleKey = this.f70286c;
        int iC = j6.a.c((iF + (productArticleKey == null ? 0 : productArticleKey.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.f;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.f70287g;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f70288h;
        return iHashCode3 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70284a);
        Iterator itV = n.v(this.f70285b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeParcelable(this.f70286c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        Integer num = this.f70287g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f70288h, i);
    }

    public /* synthetic */ AccountSelectorV2$InputData(e eVar, Set set, String str, d dVar, Integer num, AnalyticsContext analyticsContext, int i) {
        this(eVar, set, null, true, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : dVar, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : analyticsContext);
    }
}
