package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.e7;
import aw0.ga;
import aw0.s1;
import com.revolut.core.ui_kit.models.ResourceId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/models/HtmlLocalisedClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/e7;", "Law0/ga;", "Law0/s1;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HtmlLocalisedClause implements Clause, e7, ga, s1 {

    @NotNull
    public static final Parcelable.Creator<HtmlLocalisedClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceId f57782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f57784c;
    public final boolean d;
    public final Object e;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ResourceId resourceId = (ResourceId) j6.a.f(parcel, "parcel", HtmlLocalisedClause.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readValue(HtmlLocalisedClause.class.getClassLoader()));
            }
            return new HtmlLocalisedClause(resourceId, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readValue(HtmlLocalisedClause.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HtmlLocalisedClause[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HtmlLocalisedClause(int i, List list, Integer num, Object obj2, int i2) {
        List args = (i2 & 2) != 0 ? zhm.f0.f322471a : list;
        Integer num2 = (i2 & 4) != 0 ? null : num;
        Object obj3 = (i2 & 16) != 0 ? null : obj2;
        Intrinsics.checkNotNullParameter(args, "args");
        this((ResourceId) new ResourceId.IntResourceId(i), args, num2, false, obj3);
    }

    @Override // aw0.e7
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ResourceId getF57782a() {
        return this.f57782a;
    }

    @Override // aw0.s1
    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getF57783b() {
        return this.f57783b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HtmlLocalisedClause)) {
            return false;
        }
        HtmlLocalisedClause htmlLocalisedClause = (HtmlLocalisedClause) obj2;
        return Intrinsics.f(this.f57782a, htmlLocalisedClause.f57782a) && Intrinsics.f(this.f57783b, htmlLocalisedClause.f57783b) && Intrinsics.f(this.f57784c, htmlLocalisedClause.f57784c) && this.d == htmlLocalisedClause.d && Intrinsics.f(this.e, htmlLocalisedClause.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f57782a.hashCode() * 31, 31, this.f57783b);
        Integer num = this.f57784c;
        int iC = j6.a.c((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        Object obj2 = this.e;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57782a, i);
        Iterator itV = p.a.v(this.f57783b, dest);
        while (itV.hasNext()) {
            dest.writeValue(itV.next());
        }
        Integer num = this.f57784c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.d ? 1 : 0);
        dest.writeValue(this.e);
    }

    public HtmlLocalisedClause(ResourceId resId, List args, Integer num, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(resId, "resId");
        Intrinsics.checkNotNullParameter(args, "args");
        this.f57782a = resId;
        this.f57783b = args;
        this.f57784c = num;
        this.d = z;
        this.e = obj2;
    }
}
