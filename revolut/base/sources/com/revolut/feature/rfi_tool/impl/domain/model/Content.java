package com.revolut.feature.rfi_tool.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rfi_tool/impl/domain/model/Content;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Content implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Content> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentType f85000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentState f85001c;
    public final String d;
    public final ContentNavigation e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Content(parcel.readString(), ContentType.CREATOR.createFromParcel(parcel), ContentState.CREATOR.createFromParcel(parcel), parcel.readString(), ContentNavigation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Content[i];
        }
    }

    public Content(String contentId, ContentType type, ContentState state, String formId, ContentNavigation navigation) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f84999a = contentId;
        this.f85000b = type;
        this.f85001c = state;
        this.d = formId;
        this.e = navigation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Content)) {
            return false;
        }
        Content content = (Content) obj2;
        return Intrinsics.f(this.f84999a, content.f84999a) && this.f85000b == content.f85000b && this.f85001c == content.f85001c && Intrinsics.f(this.d, content.d) && Intrinsics.f(this.e, content.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c((this.f85001c.hashCode() + ((this.f85000b.hashCode() + (this.f84999a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84999a);
        this.f85000b.writeToParcel(dest, i);
        this.f85001c.writeToParcel(dest, i);
        dest.writeString(this.d);
        this.e.writeToParcel(dest, i);
    }
}
