package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import aw0.n9;
import aw0.o9;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/AssetClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "Law0/n9;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssetClause implements Clause, fa, n9 {

    @NotNull
    public static final Parcelable.Creator<AssetClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f57731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetClauseType f57732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57733c;
    public final Style d;
    public final o9 e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetClause((BigDecimal) parcel.readSerializable(), (AssetClauseType) parcel.readParcelable(AssetClause.class.getClassLoader()), parcel.readString(), (Style) parcel.readParcelable(AssetClause.class.getClassLoader()), o9.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AssetClause[i];
        }
    }

    public AssetClause(BigDecimal amount, AssetClauseType assetType, String symbol, Style style, o9 sensitivity) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        this.f57731a = amount;
        this.f57732b = assetType;
        this.f57733c = symbol;
        this.d = style;
        this.e = sensitivity;
    }

    public static AssetClause b(AssetClause assetClause, Custom custom) {
        BigDecimal amount = assetClause.f57731a;
        AssetClauseType assetType = assetClause.f57732b;
        String symbol = assetClause.f57733c;
        o9 sensitivity = assetClause.e;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return new AssetClause(amount, assetType, symbol, custom, sensitivity);
    }

    @Override // aw0.n9
    /* JADX INFO: renamed from: a, reason: from getter */
    public final o9 getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getF57731a() {
        return this.f57731a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AssetClauseType getF57732b() {
        return this.f57732b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AssetClause)) {
            return false;
        }
        AssetClause assetClause = (AssetClause) obj2;
        return Intrinsics.f(this.f57731a, assetClause.f57731a) && Intrinsics.f(this.f57732b, assetClause.f57732b) && Intrinsics.f(this.f57733c, assetClause.f57733c) && Intrinsics.f(this.d, assetClause.d) && this.e == assetClause.e;
    }

    /* JADX INFO: renamed from: getSymbol, reason: from getter */
    public final String getF57733c() {
        return this.f57733c;
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getD() {
        return this.d;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f57732b.hashCode() + (this.f57731a.hashCode() * 31)) * 31, 31, this.f57733c);
        Style style = this.d;
        return this.e.hashCode() + ((iC + (style == null ? 0 : style.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f57731a);
        dest.writeParcelable(this.f57732b, i);
        dest.writeString(this.f57733c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
    }

    public /* synthetic */ AssetClause(BigDecimal bigDecimal, AssetClauseType assetClauseType, String str, Style style, o9 o9Var, int i) {
        this(bigDecimal, assetClauseType, str, (i & 8) != 0 ? null : style, (i & 16) != 0 ? o9.SENSITIVE : o9Var);
    }
}
