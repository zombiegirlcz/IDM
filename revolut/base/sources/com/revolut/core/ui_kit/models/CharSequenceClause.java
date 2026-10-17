package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import aw0.n9;
import aw0.o9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/CharSequenceClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/n9;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class CharSequenceClause implements Clause, n9 {

    @NotNull
    public static final Parcelable.Creator<CharSequenceClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f57741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o9 f57742b;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CharSequenceClause((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), o9.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CharSequenceClause[i];
        }
    }

    public CharSequenceClause(CharSequence text, o9 sensitivity) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        this.f57741a = text;
        this.f57742b = sensitivity;
    }

    @Override // aw0.n9
    /* JADX INFO: renamed from: a, reason: from getter */
    public final o9 getF57742b() {
        return this.f57742b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CharSequenceClause)) {
            return false;
        }
        CharSequenceClause charSequenceClause = (CharSequenceClause) obj2;
        return Intrinsics.f(this.f57741a, charSequenceClause.f57741a) && this.f57742b == charSequenceClause.f57742b;
    }

    public final int hashCode() {
        return this.f57742b.hashCode() + (this.f57741a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TextUtils.writeToParcel(this.f57741a, dest, i);
        dest.writeString(this.f57742b.name());
    }

    public /* synthetic */ CharSequenceClause(CharSequence charSequence) {
        this(charSequence, o9.NON_SENSITIVE);
    }
}
