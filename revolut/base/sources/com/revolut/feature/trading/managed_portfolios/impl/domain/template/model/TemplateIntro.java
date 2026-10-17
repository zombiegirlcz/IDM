package com.revolut.feature.trading.managed_portfolios.impl.domain.template.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/domain/template/model/TemplateIntro;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TemplateIntro implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TemplateIntro> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91246c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xdh.a f91247g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TemplateIntroItem.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TemplateIntroScreen.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new TemplateIntro(string, string2, string3, string4, arrayList, arrayList2, parcel.readInt() == 0 ? null : xdh.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TemplateIntro[i];
        }
    }

    public TemplateIntro(String title, String iconName, String subtitle, String riskScore, ArrayList items, ArrayList screens, xdh.a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(iconName, "iconName");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(riskScore, "riskScore");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(screens, "screens");
        this.f91244a = title;
        this.f91245b = iconName;
        this.f91246c = subtitle;
        this.d = riskScore;
        this.e = items;
        this.f = screens;
        this.f91247g = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TemplateIntro)) {
            return false;
        }
        TemplateIntro templateIntro = (TemplateIntro) obj2;
        return Intrinsics.f(this.f91244a, templateIntro.f91244a) && Intrinsics.f(this.f91245b, templateIntro.f91245b) && Intrinsics.f(this.f91246c, templateIntro.f91246c) && Intrinsics.f(this.d, templateIntro.d) && this.e.equals(templateIntro.e) && this.f.equals(templateIntro.f) && this.f91247g == templateIntro.f91247g;
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c(p.a.c(p.a.c(this.f91244a.hashCode() * 31, 31, this.f91245b), 31, this.f91246c), 31, this.d), 31), 31);
        xdh.a aVar = this.f91247g;
        return iB + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91244a);
        dest.writeString(this.f91245b);
        dest.writeString(this.f91246c);
        dest.writeString(this.d);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((TemplateIntroItem) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.f, dest);
        while (itY2.hasNext()) {
            ((TemplateIntroScreen) itY2.next()).writeToParcel(dest, i);
        }
        xdh.a aVar = this.f91247g;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
