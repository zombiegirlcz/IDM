package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/DocumentsHubProduct;", "Landroid/os/Parcelable;", "Companion", "a", "value", "", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentsHubProduct implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88259a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<DocumentsHubProduct> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.statements.api.navigation.DocumentsHubProduct$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void a() {
            Companion companion = DocumentsHubProduct.INSTANCE;
        }

        public static void b() {
            Companion companion = DocumentsHubProduct.INSTANCE;
        }

        public static void c() {
            Companion companion = DocumentsHubProduct.INSTANCE;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String value = parcel.readString();
            Companion companion = DocumentsHubProduct.INSTANCE;
            Intrinsics.checkNotNullParameter(value, "value");
            return new DocumentsHubProduct(value);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentsHubProduct[i];
        }
    }

    static {
        Intrinsics.checkNotNullParameter("PERSONAL_CURRENT", "value");
        Intrinsics.checkNotNullParameter("JOINT_CURRENT", "value");
        Intrinsics.checkNotNullParameter("KIDS_AND_TEENS_CURRENT", "value");
        Intrinsics.checkNotNullParameter("PRO_CURRENT", "value");
        Intrinsics.checkNotNullParameter("SAVINGS", "value");
        Intrinsics.checkNotNullParameter("JOINT_SAVINGS", "value");
        Intrinsics.checkNotNullParameter("STOCK", "value");
        Intrinsics.checkNotNullParameter("ROBO", "value");
        Intrinsics.checkNotNullParameter("CFD", "value");
        Intrinsics.checkNotNullParameter("COMMODITIES", "value");
        Intrinsics.checkNotNullParameter("CRYPTO", "value");
        Intrinsics.checkNotNullParameter("TAX_ADVANTAGED_INVESTING", "value");
        Intrinsics.checkNotNullParameter("POCKETS", "value");
        Intrinsics.checkNotNullParameter("GENERAL_INVESTMENT", "value");
        Intrinsics.checkNotNullParameter("PRIVATE_MARKETS", "value");
    }

    public /* synthetic */ DocumentsHubProduct(String str) {
        this.f88259a = str;
    }

    public static final /* synthetic */ DocumentsHubProduct a() {
        return new DocumentsHubProduct("PERSONAL_CURRENT");
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final /* synthetic */ String getF88259a() {
        return this.f88259a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof DocumentsHubProduct) {
            return Intrinsics.f(this.f88259a, ((DocumentsHubProduct) obj2).f88259a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f88259a.hashCode();
    }

    public final String toString() {
        return a.p("DocumentsHubProduct(value=", this.f88259a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88259a);
    }
}
