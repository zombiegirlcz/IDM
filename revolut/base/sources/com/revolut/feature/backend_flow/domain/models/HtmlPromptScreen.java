package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/HtmlPromptScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HtmlPromptScreen extends BackendScreen {

    @NotNull
    public static final Parcelable.Creator<HtmlPromptScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HtmlItem f63480c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HtmlPromptScreen(parcel.readString(), parcel.readString(), HtmlItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HtmlPromptScreen[i];
        }
    }

    public HtmlPromptScreen(String id10, String title, HtmlItem html, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(html, "html");
        this.f63478a = id10;
        this.f63479b = title;
        this.f63480c = html;
        this.d = str;
        this.e = str2;
    }

    public static HtmlPromptScreen J(HtmlPromptScreen htmlPromptScreen, String str) {
        String id10 = htmlPromptScreen.f63478a;
        String title = htmlPromptScreen.f63479b;
        HtmlItem html = htmlPromptScreen.f63480c;
        String str2 = htmlPromptScreen.e;
        htmlPromptScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(html, "html");
        return new HtmlPromptScreen(id10, title, html, str, str2);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63478a() {
        return this.f63478a;
    }

    @Override // xl2.g0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getE() {
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
        if (!(obj2 instanceof HtmlPromptScreen)) {
            return false;
        }
        HtmlPromptScreen htmlPromptScreen = (HtmlPromptScreen) obj2;
        return Intrinsics.f(this.f63478a, htmlPromptScreen.f63478a) && Intrinsics.f(this.f63479b, htmlPromptScreen.f63479b) && Intrinsics.f(this.f63480c, htmlPromptScreen.f63480c) && Intrinsics.f(this.d, htmlPromptScreen.d) && Intrinsics.f(this.e, htmlPromptScreen.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f63478a.hashCode() * 31, 31, this.f63479b), 31, this.f63480c.f63477a);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63478a);
        dest.writeString(this.f63479b);
        this.f63480c.writeToParcel(dest, i);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
