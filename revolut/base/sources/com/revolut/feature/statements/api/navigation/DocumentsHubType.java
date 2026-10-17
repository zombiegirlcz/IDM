package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/DocumentsHubType;", "Landroid/os/Parcelable;", "Companion", "a", "value", "", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentsHubType implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88260a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<DocumentsHubType> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.statements.api.navigation.DocumentsHubType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void a() {
            Companion companion = DocumentsHubType.INSTANCE;
        }

        public static void b() {
            Companion companion = DocumentsHubType.INSTANCE;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String value = parcel.readString();
            Companion companion = DocumentsHubType.INSTANCE;
            Intrinsics.checkNotNullParameter(value, "value");
            return new DocumentsHubType(value);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentsHubType[i];
        }
    }

    static {
        Intrinsics.checkNotNullParameter("root", "value");
        Intrinsics.checkNotNullParameter("account-statements", "value");
        Intrinsics.checkNotNullParameter("tax-and-earnings", "value");
        Intrinsics.checkNotNullParameter("pnl", "value");
        Intrinsics.checkNotNullParameter("proofs", "value");
        Intrinsics.checkNotNullParameter("fees-and-legal", "value");
        Intrinsics.checkNotNullParameter("statement-of-fees", "value");
    }

    public /* synthetic */ DocumentsHubType(String str) {
        this.f88260a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof DocumentsHubType) {
            return Intrinsics.f(this.f88260a, ((DocumentsHubType) obj2).f88260a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f88260a.hashCode();
    }

    public final String toString() {
        return a.p("DocumentsHubType(value=", this.f88260a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88260a);
    }
}
