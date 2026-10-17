package com.revolut.feature.terms.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/terms/api/model/TermsServiceType;", "Landroid/os/Parcelable;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BANKING", "feature_terms_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TermsServiceType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TermsServiceType[] $VALUES;
    public static final TermsServiceType BANKING;

    @NotNull
    public static final Parcelable.Creator<TermsServiceType> CREATOR;

    @NotNull
    private final String type = "BANKING";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return TermsServiceType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TermsServiceType[i];
        }
    }

    static {
        TermsServiceType termsServiceType = new TermsServiceType();
        BANKING = termsServiceType;
        TermsServiceType[] termsServiceTypeArr = {termsServiceType};
        $VALUES = termsServiceTypeArr;
        $ENTRIES = s.n(termsServiceTypeArr);
        CREATOR = new a();
    }

    public static TermsServiceType valueOf(String str) {
        return (TermsServiceType) Enum.valueOf(TermsServiceType.class, str);
    }

    public static TermsServiceType[] values() {
        return (TermsServiceType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
