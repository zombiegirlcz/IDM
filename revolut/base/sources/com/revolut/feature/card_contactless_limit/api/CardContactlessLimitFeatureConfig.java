package com.revolut.feature.card_contactless_limit.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_contactless_limit/api/CardContactlessLimitFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_card_contactless_limit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardContactlessLimitFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CardContactlessLimitFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f64506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64508c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64509g;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Integer num;
            boolean z4;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Mode mode = (Mode) parcel.readParcelable(CardContactlessLimitFeatureConfig.class.getClassLoader());
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
            return new CardContactlessLimitFeatureConfig(mode, i, z11, num, z4, z3, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardContactlessLimitFeatureConfig[i];
        }
    }

    public CardContactlessLimitFeatureConfig(Mode mode, int i, boolean z, Integer num, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f64506a = mode;
        this.f64507b = i;
        this.f64508c = z;
        this.d = num;
        this.e = z3;
        this.f = z4;
        this.f64509g = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardContactlessLimitFeatureConfig)) {
            return false;
        }
        CardContactlessLimitFeatureConfig cardContactlessLimitFeatureConfig = (CardContactlessLimitFeatureConfig) obj2;
        return Intrinsics.f(this.f64506a, cardContactlessLimitFeatureConfig.f64506a) && this.f64507b == cardContactlessLimitFeatureConfig.f64507b && this.f64508c == cardContactlessLimitFeatureConfig.f64508c && Intrinsics.f(this.d, cardContactlessLimitFeatureConfig.d) && this.e == cardContactlessLimitFeatureConfig.e && this.f == cardContactlessLimitFeatureConfig.f && this.f64509g == cardContactlessLimitFeatureConfig.f64509g;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.f64507b, this.f64506a.hashCode() * 31, 31), 31, this.f64508c);
        Integer num = this.d;
        return Boolean.hashCode(this.f64509g) + j6.a.c(j6.a.c((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64506a, i);
        dest.writeInt(this.f64507b);
        dest.writeInt(this.f64508c ? 1 : 0);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f64509g ? 1 : 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CardContactlessLimitFeatureConfig(com.revolut.feature.card_contactless_limit.api.Mode r9, int r10, boolean r11, java.lang.Integer r12, boolean r13, boolean r14, int r15) {
        /*
            r8 = this;
            r0 = r15 & 8
            if (r0 == 0) goto L5
            r12 = 0
        L5:
            r4 = r12
            r12 = r15 & 32
            r0 = 0
            if (r12 == 0) goto Le
            r12 = 1
            r6 = r12
            goto Lf
        Le:
            r6 = r0
        Lf:
            r12 = r15 & 64
            if (r12 == 0) goto L1a
            r7 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r0 = r8
            goto L20
        L1a:
            r7 = r14
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
        L20:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_contactless_limit.api.CardContactlessLimitFeatureConfig.<init>(com.revolut.feature.card_contactless_limit.api.Mode, int, boolean, java.lang.Integer, boolean, boolean, int):void");
    }
}
