package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import fr2.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Step implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Step> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f64196c;
    public final j d;
    public final Integer e;
    public final FincrimeHomeScreenAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f64197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fr2.a f64198h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Step(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : j.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (FincrimeHomeScreenAction) parcel.readParcelable(Step.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? fr2.a.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Step[i];
        }
    }

    public Step(String title, String str, Long l2, j jVar, Integer num, FincrimeHomeScreenAction fincrimeHomeScreenAction, String str2, fr2.a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f64194a = title;
        this.f64195b = str;
        this.f64196c = l2;
        this.d = jVar;
        this.e = num;
        this.f = fincrimeHomeScreenAction;
        this.f64197g = str2;
        this.f64198h = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Step)) {
            return false;
        }
        Step step = (Step) obj2;
        return Intrinsics.f(this.f64194a, step.f64194a) && Intrinsics.f(this.f64195b, step.f64195b) && Intrinsics.f(this.f64196c, step.f64196c) && this.d == step.d && Intrinsics.f(this.e, step.e) && Intrinsics.f(this.f, step.f) && Intrinsics.f(this.f64197g, step.f64197g) && this.f64198h == step.f64198h;
    }

    public final int hashCode() {
        int iHashCode = this.f64194a.hashCode() * 31;
        String str = this.f64195b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f64196c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        j jVar = this.d;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        FincrimeHomeScreenAction fincrimeHomeScreenAction = this.f;
        int iHashCode6 = (iHashCode5 + (fincrimeHomeScreenAction == null ? 0 : fincrimeHomeScreenAction.hashCode())) * 31;
        String str2 = this.f64197g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        fr2.a aVar = this.f64198h;
        return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64194a);
        dest.writeString(this.f64195b);
        Long l2 = this.f64196c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        j jVar = this.d;
        if (jVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(jVar.name());
        }
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f64197g);
        fr2.a aVar = this.f64198h;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
