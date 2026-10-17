package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/DocumentItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentItem implements InputItem {

    @NotNull
    public static final Parcelable.Creator<DocumentItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63395c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63396g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new DocumentItem(string, string2, string3, z3, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DocumentItem[i];
        }
    }

    public DocumentItem(String id10, String title, String subtitle, boolean z, boolean z3, String buttonTitle, String url2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f63393a = id10;
        this.f63394b = title;
        this.f63395c = subtitle;
        this.d = z;
        this.e = z3;
        this.f = buttonTitle;
        this.f63396g = url2;
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63723a() {
        return this.f63393a;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF63724b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DocumentItem)) {
            return false;
        }
        DocumentItem documentItem = (DocumentItem) obj2;
        return Intrinsics.f(this.f63393a, documentItem.f63393a) && Intrinsics.f(this.f63394b, documentItem.f63394b) && Intrinsics.f(this.f63395c, documentItem.f63395c) && this.d == documentItem.d && this.e == documentItem.e && Intrinsics.f(this.f, documentItem.f) && Intrinsics.f(this.f63396g, documentItem.f63396g);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63393a;
    }

    public final int hashCode() {
        return this.f63396g.hashCode() + p.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(this.f63393a.hashCode() * 31, 31, this.f63394b), 31, this.f63395c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63393a);
        dest.writeString(this.f63394b);
        dest.writeString(this.f63395c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
        dest.writeString(this.f63396g);
    }
}
