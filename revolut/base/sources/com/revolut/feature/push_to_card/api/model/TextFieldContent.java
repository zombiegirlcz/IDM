package com.revolut.feature.push_to_card.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/api/model/TextFieldContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextFieldContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TextFieldContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81521c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextFieldContent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextFieldContent[i];
        }
    }

    public TextFieldContent(String regex, String label, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f81519a = z;
        this.f81520b = z3;
        this.f81521c = regex;
        this.d = label;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextFieldContent)) {
            return false;
        }
        TextFieldContent textFieldContent = (TextFieldContent) obj2;
        return this.f81519a == textFieldContent.f81519a && this.f81520b == textFieldContent.f81520b && Intrinsics.f(this.f81521c, textFieldContent.f81521c) && Intrinsics.f(this.d, textFieldContent.d) && Intrinsics.f(this.e, textFieldContent.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.c(Boolean.hashCode(this.f81519a) * 31, 31, this.f81520b), 31, this.f81521c), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f81519a ? 1 : 0);
        dest.writeInt(this.f81520b ? 1 : 0);
        dest.writeString(this.f81521c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
