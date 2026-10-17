package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/CustomContentDescriptionClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Loy0/b;", "Law0/l3;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomContentDescriptionClause implements Clause, oy0.b, l3 {

    @NotNull
    public static final Parcelable.Creator<CustomContentDescriptionClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f57773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f57774b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomContentDescriptionClause((Clause) parcel.readParcelable(CustomContentDescriptionClause.class.getClassLoader()), (Clause) parcel.readParcelable(CustomContentDescriptionClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomContentDescriptionClause[i];
        }
    }

    public CustomContentDescriptionClause(Clause delegate, Clause contentDescription) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f57773a = delegate;
        this.f57774b = contentDescription;
    }

    @Override // aw0.l3
    public final Clause a(Clause delegate) {
        Intrinsics.checkNotNullParameter(delegate, "newDelegate");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Clause contentDescription = this.f57774b;
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        return new CustomContentDescriptionClause(delegate, contentDescription);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomContentDescriptionClause)) {
            return false;
        }
        CustomContentDescriptionClause customContentDescriptionClause = (CustomContentDescriptionClause) obj2;
        return Intrinsics.f(this.f57773a, customContentDescriptionClause.f57773a) && Intrinsics.f(this.f57774b, customContentDescriptionClause.f57774b);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF57774b() {
        return this.f57774b;
    }

    @Override // aw0.l3
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public final Clause getF57773a() {
        return this.f57773a;
    }

    public final int hashCode() {
        return this.f57774b.hashCode() + (this.f57773a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57773a, i);
        dest.writeParcelable(this.f57774b, i);
    }
}
