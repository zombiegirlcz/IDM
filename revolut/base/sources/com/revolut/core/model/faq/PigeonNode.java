package com.revolut.core.model.faq;

import android.os.Parcel;
import android.os.Parcelable;
import gj0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/model/faq/PigeonNode;", "Lcom/revolut/core/model/faq/FaqNodeBase;", "", "toString", "()Ljava/lang/String;", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PigeonNode implements FaqNodeBase {

    @NotNull
    public static final Parcelable.Creator<PigeonNode> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f51436c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f51437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f51438h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PigeonNode.CREATOR, parcel, arrayList, iA, i);
            }
            return new PigeonNode(string, string2, cVarValueOf, z, string3, string4, string5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PigeonNode[i];
        }
    }

    public PigeonNode(String key, String title, c type, boolean z, String str, String str2, String str3, List children) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f51434a = key;
        this.f51435b = title;
        this.f51436c = type;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.f51437g = str3;
        this.f51438h = children;
    }

    public static PigeonNode a(PigeonNode pigeonNode, ArrayList children) {
        String key = pigeonNode.f51434a;
        String title = pigeonNode.f51435b;
        c type = pigeonNode.f51436c;
        boolean z = pigeonNode.d;
        String str = pigeonNode.e;
        String str2 = pigeonNode.f;
        String str3 = pigeonNode.f51437g;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(children, "children");
        return new PigeonNode(key, title, type, z, str, str2, str3, children);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PigeonNode)) {
            return false;
        }
        PigeonNode pigeonNode = (PigeonNode) obj2;
        return Intrinsics.f(this.f51434a, pigeonNode.f51434a) && Intrinsics.f(this.f51435b, pigeonNode.f51435b) && this.f51436c == pigeonNode.f51436c && this.d == pigeonNode.d && Intrinsics.f(this.e, pigeonNode.e) && Intrinsics.f(this.f, pigeonNode.f) && Intrinsics.f(this.f51437g, pigeonNode.f51437g) && Intrinsics.f(this.f51438h, pigeonNode.f51438h);
    }

    @Override // com.revolut.core.model.faq.FaqNodeBase
    /* JADX INFO: renamed from: getKey, reason: from getter */
    public final String getF51434a() {
        return this.f51434a;
    }

    @Override // com.revolut.core.model.faq.FaqNodeBase
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF51435b() {
        return this.f51435b;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f51436c.hashCode() + p.a.c(this.f51434a.hashCode() * 31, 31, this.f51435b)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f51437g;
        return this.f51438h.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51434a);
        dest.writeString(this.f51435b);
        dest.writeString(this.f51436c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f51437g);
        Iterator itV = p.a.v(this.f51438h, dest);
        while (itV.hasNext()) {
            ((PigeonNode) itV.next()).writeToParcel(dest, i);
        }
    }
}
