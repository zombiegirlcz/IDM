package com.revolut.feature.bank_account_switching.impl.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m70.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/domain/CardDigits;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDigits implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CardDigits f63893c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63895b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CardDigits> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.bank_account_switching.impl.domain.CardDigits$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDigits(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDigits[i];
        }
    }

    static {
        t0 t0Var = t0.f186434a;
        a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        f63893c = new CardDigits("", "");
    }

    public CardDigits(String mainHolder, String jointPeerHolder) {
        Intrinsics.checkNotNullParameter(mainHolder, "mainHolder");
        Intrinsics.checkNotNullParameter(jointPeerHolder, "jointPeerHolder");
        this.f63894a = mainHolder;
        this.f63895b = jointPeerHolder;
    }

    public static CardDigits a(CardDigits cardDigits, String mainHolder, String jointPeerHolder, int i) {
        if ((i & 1) != 0) {
            mainHolder = cardDigits.f63894a;
        }
        if ((i & 2) != 0) {
            jointPeerHolder = cardDigits.f63895b;
        }
        cardDigits.getClass();
        Intrinsics.checkNotNullParameter(mainHolder, "mainHolder");
        Intrinsics.checkNotNullParameter(jointPeerHolder, "jointPeerHolder");
        return new CardDigits(mainHolder, jointPeerHolder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDigits)) {
            return false;
        }
        CardDigits cardDigits = (CardDigits) obj2;
        return Intrinsics.f(this.f63894a, cardDigits.f63894a) && Intrinsics.f(this.f63895b, cardDigits.f63895b);
    }

    public final int hashCode() {
        return this.f63895b.hashCode() + (this.f63894a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63894a);
        dest.writeString(this.f63895b);
    }
}
