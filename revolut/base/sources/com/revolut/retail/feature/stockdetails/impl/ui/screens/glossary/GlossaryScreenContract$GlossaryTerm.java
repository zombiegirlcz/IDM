package com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryScreenContract$GlossaryTerm", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GlossaryScreenContract$GlossaryTerm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GlossaryScreenContract$GlossaryTerm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f103999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f104000b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GlossaryScreenContract$GlossaryTerm((Clause) parcel.readParcelable(GlossaryScreenContract$GlossaryTerm.class.getClassLoader()), (Clause) parcel.readParcelable(GlossaryScreenContract$GlossaryTerm.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GlossaryScreenContract$GlossaryTerm[i];
        }
    }

    public GlossaryScreenContract$GlossaryTerm(Clause term, Clause definition) {
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(definition, "definition");
        this.f103999a = term;
        this.f104000b = definition;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GlossaryScreenContract$GlossaryTerm)) {
            return false;
        }
        GlossaryScreenContract$GlossaryTerm glossaryScreenContract$GlossaryTerm = (GlossaryScreenContract$GlossaryTerm) obj2;
        return Intrinsics.f(this.f103999a, glossaryScreenContract$GlossaryTerm.f103999a) && Intrinsics.f(this.f104000b, glossaryScreenContract$GlossaryTerm.f104000b);
    }

    public final int hashCode() {
        return this.f104000b.hashCode() + (this.f103999a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103999a, i);
        dest.writeParcelable(this.f104000b, i);
    }
}
