package com.revolut.feature.trading.managed_portfolios.impl.domain.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntroScreen;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TemplateIntroScreen implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TemplateIntroScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TemplateIntroScreenContent f91256c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TemplateIntroScreen(parcel.readString(), parcel.readString(), (TemplateIntroScreenContent) parcel.readParcelable(TemplateIntroScreen.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TemplateIntroScreen[i];
        }
    }

    public TemplateIntroScreen(String title, String str, TemplateIntroScreenContent content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f91254a = title;
        this.f91255b = str;
        this.f91256c = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TemplateIntroScreen)) {
            return false;
        }
        TemplateIntroScreen templateIntroScreen = (TemplateIntroScreen) obj2;
        return Intrinsics.f(this.f91254a, templateIntroScreen.f91254a) && Intrinsics.f(this.f91255b, templateIntroScreen.f91255b) && Intrinsics.f(this.f91256c, templateIntroScreen.f91256c);
    }

    public final int hashCode() {
        int iHashCode = this.f91254a.hashCode() * 31;
        String str = this.f91255b;
        return this.f91256c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91254a);
        dest.writeString(this.f91255b);
        dest.writeParcelable(this.f91256c, i);
    }
}
