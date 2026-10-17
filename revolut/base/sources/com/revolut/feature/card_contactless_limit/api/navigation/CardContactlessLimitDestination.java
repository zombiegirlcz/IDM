package com.revolut.feature.card_contactless_limit.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_contactless_limit.api.Mode;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_contactless_limit/api/navigation/CardContactlessLimitDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_card_contactless_limit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardContactlessLimitDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardContactlessLimitDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f64515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64517c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64518g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Integer num;
            boolean z4;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Mode mode = (Mode) parcel.readParcelable(CardContactlessLimitDestination.class.getClassLoader());
            int i = parcel.readInt();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                z3 = true;
                num = numValueOf;
                z4 = true;
            } else {
                z3 = true;
                num = numValueOf;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z3;
            } else {
                z6 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z6 = z;
            }
            return new CardContactlessLimitDestination(mode, i, z11, num, z4, z3, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardContactlessLimitDestination[i];
        }
    }

    public CardContactlessLimitDestination(Mode mode, int i, boolean z, Integer num, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f64515a = mode;
        this.f64516b = i;
        this.f64517c = z;
        this.d = num;
        this.e = z3;
        this.f = z4;
        this.f64518g = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardContactlessLimitDestination)) {
            return false;
        }
        CardContactlessLimitDestination cardContactlessLimitDestination = (CardContactlessLimitDestination) obj2;
        return Intrinsics.f(this.f64515a, cardContactlessLimitDestination.f64515a) && this.f64516b == cardContactlessLimitDestination.f64516b && this.f64517c == cardContactlessLimitDestination.f64517c && Intrinsics.f(this.d, cardContactlessLimitDestination.d) && this.e == cardContactlessLimitDestination.e && this.f == cardContactlessLimitDestination.f && this.f64518g == cardContactlessLimitDestination.f64518g;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.f64516b, this.f64515a.hashCode() * 31, 31), 31, this.f64517c);
        Integer num = this.d;
        return Boolean.hashCode(this.f64518g) + j6.a.c(j6.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64515a, i);
        dest.writeInt(this.f64516b);
        dest.writeInt(this.f64517c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f64518g ? 1 : 0);
    }
}
