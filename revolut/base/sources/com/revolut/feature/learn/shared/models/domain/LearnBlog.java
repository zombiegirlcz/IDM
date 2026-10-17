package com.revolut.feature.learn.shared.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnBlog;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LearnBlog implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LearnBlog> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78023c;
    public final Integer d;
    public final DateTime e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f78024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f78025h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f78026j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LearnBlog(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LearnBlog[i];
        }
    }

    public LearnBlog(Integer num, String id10, String title, String str, String str2, String str3, String str4, String str5, DateTime createdDate, v productDomain) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(productDomain, "productDomain");
        this.f78021a = id10;
        this.f78022b = title;
        this.f78023c = str;
        this.d = num;
        this.e = createdDate;
        this.f = productDomain;
        this.f78024g = str2;
        this.f78025h = str3;
        this.i = str4;
        this.f78026j = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LearnBlog)) {
            return false;
        }
        LearnBlog learnBlog = (LearnBlog) obj2;
        return Intrinsics.f(this.f78021a, learnBlog.f78021a) && Intrinsics.f(this.f78022b, learnBlog.f78022b) && Intrinsics.f(this.f78023c, learnBlog.f78023c) && Intrinsics.f(this.d, learnBlog.d) && Intrinsics.f(this.e, learnBlog.e) && this.f == learnBlog.f && Intrinsics.f(this.f78024g, learnBlog.f78024g) && Intrinsics.f(this.f78025h, learnBlog.f78025h) && Intrinsics.f(this.i, learnBlog.i) && Intrinsics.f(this.f78026j, learnBlog.f78026j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f78021a.hashCode() * 31, 31, this.f78022b);
        String str = this.f78023c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (this.f.hashCode() + b.f(this.e, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31;
        String str2 = this.f78024g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f78025h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f78026j;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78021a);
        dest.writeString(this.f78022b);
        dest.writeString(this.f78023c);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeSerializable(this.e);
        dest.writeString(this.f.name());
        dest.writeString(this.f78024g);
        dest.writeString(this.f78025h);
        dest.writeString(this.i);
        dest.writeString(this.f78026j);
    }
}
