package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.a0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/PromptScreen;", "Lcom/revolut/feature/backend_flow/domain/models/BackendScreen;", "Lxl2/b;", "", "toString", "()Ljava/lang/String;", "xl2/a0", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromptScreen extends BackendScreen implements xl2.b {

    @NotNull
    public static final Parcelable.Creator<PromptScreen> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HtmlStringItem f63587c;
    public final ImageItem d;
    public final List e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f63588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f63589h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            HtmlStringItem htmlStringItemCreateFromParcel = HtmlStringItem.CREATOR.createFromParcel(parcel);
            ImageItem imageItem = (ImageItem) parcel.readParcelable(PromptScreen.class.getClassLoader());
            int iE = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Transition.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            a0 a0VarValueOf = parcel.readInt() == 0 ? null : a0.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(PromptScreen.class, parcel, arrayList3, iE, 1);
                }
                arrayList2 = arrayList3;
            }
            return new PromptScreen(string, string2, htmlStringItemCreateFromParcel, imageItem, arrayList, a0VarValueOf, arrayList2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromptScreen[i];
        }
    }

    public PromptScreen(String id10, String title, HtmlStringItem subtitleHtml, ImageItem imageItem, List list, a0 a0Var, List list2, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleHtml, "subtitleHtml");
        this.f63585a = id10;
        this.f63586b = title;
        this.f63587c = subtitleHtml;
        this.d = imageItem;
        this.e = list;
        this.f = a0Var;
        this.f63588g = list2;
        this.f63589h = str;
        this.i = str2;
    }

    public static PromptScreen J(PromptScreen promptScreen, ArrayList arrayList, String str, int i) {
        String id10 = promptScreen.f63585a;
        String title = promptScreen.f63586b;
        HtmlStringItem subtitleHtml = promptScreen.f63587c;
        ImageItem imageItem = promptScreen.d;
        List list = promptScreen.e;
        a0 a0Var = promptScreen.f;
        List list2 = arrayList;
        if ((i & 64) != 0) {
            list2 = promptScreen.f63588g;
        }
        List list3 = list2;
        if ((i & 128) != 0) {
            str = promptScreen.f63589h;
        }
        String str2 = promptScreen.i;
        promptScreen.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleHtml, "subtitleHtml");
        return new PromptScreen(id10, title, subtitleHtml, imageItem, list, a0Var, list3, str, str2);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63658a() {
        return this.f63585a;
    }

    @Override // xl2.g0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getAnalyticsName() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PromptScreen)) {
            return false;
        }
        PromptScreen promptScreen = (PromptScreen) obj2;
        return Intrinsics.f(this.f63585a, promptScreen.f63585a) && Intrinsics.f(this.f63586b, promptScreen.f63586b) && Intrinsics.f(this.f63587c, promptScreen.f63587c) && Intrinsics.f(this.d, promptScreen.d) && Intrinsics.f(this.e, promptScreen.e) && this.f == promptScreen.f && Intrinsics.f(this.f63588g, promptScreen.f63588g) && Intrinsics.f(this.f63589h, promptScreen.f63589h) && Intrinsics.f(this.i, promptScreen.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f63587c.hashCode() + p.a.c(this.f63585a.hashCode() * 31, 31, this.f63586b)) * 31;
        ImageItem imageItem = this.d;
        int iHashCode2 = (iHashCode + (imageItem == null ? 0 : imageItem.hashCode())) * 31;
        List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        a0 a0Var = this.f;
        int iHashCode4 = (iHashCode3 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        List list2 = this.f63588g;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f63589h;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.revolut.feature.backend_flow.domain.models.BackendScreen
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF63662h() {
        return this.f63589h;
    }

    @Override // xl2.b
    /* JADX INFO: renamed from: o, reason: from getter */
    public final List getF63330h() {
        return this.f63588g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63585a);
        dest.writeString(this.f63586b);
        this.f63587c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Transition) itQ.next()).writeToParcel(dest, i);
            }
        }
        a0 a0Var = this.f;
        if (a0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(a0Var.name());
        }
        List list2 = this.f63588g;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeParcelable((Parcelable) itQ2.next(), i);
            }
        }
        dest.writeString(this.f63589h);
        dest.writeString(this.i);
    }
}
