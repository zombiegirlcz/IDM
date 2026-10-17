package com.revolut.core.ui_kit.background;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "Landroid/os/Parcelable;", "DEFAULT", "SAVINGS", "CREDIT", "POCKETS", "JOINT", "PRO", "U18", "LINKED", "INVEST", "CRYPTO", "REV_POINTS", "CX", "PLAN_PLUS", "PLAN_PREMIUM", "PLAN_METAL", "PLAN_ULTRA", "PLAN_ULTRA_CX", "PLAN_PRIVATE", "REV_X", "AIR", "ONBOARDING", "Esim", "Base", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$AIR;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$Base;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$CREDIT;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$CRYPTO;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$CX;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$DEFAULT;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$Esim;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$INVEST;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$JOINT;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$LINKED;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$ONBOARDING;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_METAL;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_PLUS;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_PREMIUM;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_PRIVATE;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_ULTRA;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_ULTRA_CX;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$POCKETS;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PRO;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$REV_POINTS;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$REV_X;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$SAVINGS;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$U18;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnimatedBackgroundType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$AIR;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AIR implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AIR f51467a = new AIR();

        @NotNull
        public static final Parcelable.Creator<AIR> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AIR.f51467a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AIR[i];
            }
        }

        private AIR() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$Base;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "", "PERFORMANCE_POSITIVE", "PERFORMANCE_NEGATIVE", "PERFORMANCE_STATIC", "STATUS_WARNING", "ACCENT", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Base implements AnimatedBackgroundType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Base[] $VALUES;
        public static final Base ACCENT;

        @NotNull
        public static final Parcelable.Creator<Base> CREATOR;
        public static final Base PERFORMANCE_NEGATIVE;
        public static final Base PERFORMANCE_POSITIVE;
        public static final Base PERFORMANCE_STATIC;
        public static final Base STATUS_WARNING;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Base.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Base[i];
            }
        }

        static {
            Base base = new Base("PERFORMANCE_POSITIVE", 0);
            PERFORMANCE_POSITIVE = base;
            Base base2 = new Base("PERFORMANCE_NEGATIVE", 1);
            PERFORMANCE_NEGATIVE = base2;
            Base base3 = new Base("PERFORMANCE_STATIC", 2);
            PERFORMANCE_STATIC = base3;
            Base base4 = new Base("STATUS_WARNING", 3);
            STATUS_WARNING = base4;
            Base base5 = new Base("ACCENT", 4);
            ACCENT = base5;
            Base[] baseArr = {base, base2, base3, base4, base5};
            $VALUES = baseArr;
            $ENTRIES = s.n(baseArr);
            CREATOR = new a();
        }

        public static Base valueOf(String str) {
            return (Base) Enum.valueOf(Base.class, str);
        }

        public static Base[] values() {
            return (Base[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$CREDIT;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CREDIT implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CREDIT f51468a = new CREDIT();

        @NotNull
        public static final Parcelable.Creator<CREDIT> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CREDIT.f51468a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CREDIT[i];
            }
        }

        private CREDIT() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$CRYPTO;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CRYPTO implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CRYPTO f51469a = new CRYPTO();

        @NotNull
        public static final Parcelable.Creator<CRYPTO> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CRYPTO.f51469a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CRYPTO[i];
            }
        }

        private CRYPTO() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$CX;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CX implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CX f51470a = new CX();

        @NotNull
        public static final Parcelable.Creator<CX> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CX.f51470a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CX[i];
            }
        }

        private CX() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$DEFAULT;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DEFAULT implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DEFAULT f51471a = new DEFAULT();

        @NotNull
        public static final Parcelable.Creator<DEFAULT> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DEFAULT.f51471a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DEFAULT[i];
            }
        }

        private DEFAULT() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$Esim;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Esim implements AnimatedBackgroundType {

        @NotNull
        public static final Parcelable.Creator<Esim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51474c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Esim(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Esim[i];
            }
        }

        public Esim(int i, int i2, int i3) {
            this.f51472a = i;
            this.f51473b = i2;
            this.f51474c = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Esim)) {
                return false;
            }
            Esim esim = (Esim) obj2;
            return this.f51472a == esim.f51472a && this.f51473b == esim.f51473b && this.f51474c == esim.f51474c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f51474c) + j6.a.b(this.f51473b, Integer.hashCode(this.f51472a) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f51472a);
            dest.writeInt(this.f51473b);
            dest.writeInt(this.f51474c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$INVEST;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class INVEST implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final INVEST f51475a = new INVEST();

        @NotNull
        public static final Parcelable.Creator<INVEST> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return INVEST.f51475a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new INVEST[i];
            }
        }

        private INVEST() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$JOINT;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JOINT implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JOINT f51476a = new JOINT();

        @NotNull
        public static final Parcelable.Creator<JOINT> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JOINT.f51476a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JOINT[i];
            }
        }

        private JOINT() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$LINKED;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LINKED implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LINKED f51477a = new LINKED();

        @NotNull
        public static final Parcelable.Creator<LINKED> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LINKED.f51477a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LINKED[i];
            }
        }

        private LINKED() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$ONBOARDING;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ONBOARDING implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ONBOARDING f51478a = new ONBOARDING();

        @NotNull
        public static final Parcelable.Creator<ONBOARDING> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ONBOARDING.f51478a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ONBOARDING[i];
            }
        }

        private ONBOARDING() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_METAL;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PLAN_METAL implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PLAN_METAL f51479a = new PLAN_METAL();

        @NotNull
        public static final Parcelable.Creator<PLAN_METAL> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PLAN_METAL.f51479a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PLAN_METAL[i];
            }
        }

        private PLAN_METAL() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_PLUS;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PLAN_PLUS implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PLAN_PLUS f51480a = new PLAN_PLUS();

        @NotNull
        public static final Parcelable.Creator<PLAN_PLUS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PLAN_PLUS.f51480a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PLAN_PLUS[i];
            }
        }

        private PLAN_PLUS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_PREMIUM;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PLAN_PREMIUM implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PLAN_PREMIUM f51481a = new PLAN_PREMIUM();

        @NotNull
        public static final Parcelable.Creator<PLAN_PREMIUM> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PLAN_PREMIUM.f51481a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PLAN_PREMIUM[i];
            }
        }

        private PLAN_PREMIUM() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_PRIVATE;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PLAN_PRIVATE implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PLAN_PRIVATE f51482a = new PLAN_PRIVATE();

        @NotNull
        public static final Parcelable.Creator<PLAN_PRIVATE> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PLAN_PRIVATE.f51482a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PLAN_PRIVATE[i];
            }
        }

        private PLAN_PRIVATE() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_ULTRA;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PLAN_ULTRA implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PLAN_ULTRA f51483a = new PLAN_ULTRA();

        @NotNull
        public static final Parcelable.Creator<PLAN_ULTRA> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PLAN_ULTRA.f51483a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PLAN_ULTRA[i];
            }
        }

        private PLAN_ULTRA() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PLAN_ULTRA_CX;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PLAN_ULTRA_CX implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PLAN_ULTRA_CX f51484a = new PLAN_ULTRA_CX();

        @NotNull
        public static final Parcelable.Creator<PLAN_ULTRA_CX> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PLAN_ULTRA_CX.f51484a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PLAN_ULTRA_CX[i];
            }
        }

        private PLAN_ULTRA_CX() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$POCKETS;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class POCKETS implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final POCKETS f51485a = new POCKETS();

        @NotNull
        public static final Parcelable.Creator<POCKETS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return POCKETS.f51485a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new POCKETS[i];
            }
        }

        private POCKETS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$PRO;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PRO implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PRO f51486a = new PRO();

        @NotNull
        public static final Parcelable.Creator<PRO> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PRO.f51486a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PRO[i];
            }
        }

        private PRO() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$REV_POINTS;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class REV_POINTS implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final REV_POINTS f51487a = new REV_POINTS();

        @NotNull
        public static final Parcelable.Creator<REV_POINTS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return REV_POINTS.f51487a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new REV_POINTS[i];
            }
        }

        private REV_POINTS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$REV_X;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class REV_X implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final REV_X f51488a = new REV_X();

        @NotNull
        public static final Parcelable.Creator<REV_X> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return REV_X.f51488a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new REV_X[i];
            }
        }

        private REV_X() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$SAVINGS;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SAVINGS implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SAVINGS f51489a = new SAVINGS();

        @NotNull
        public static final Parcelable.Creator<SAVINGS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SAVINGS.f51489a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SAVINGS[i];
            }
        }

        private SAVINGS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType$U18;", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class U18 implements AnimatedBackgroundType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final U18 f51490a = new U18();

        @NotNull
        public static final Parcelable.Creator<U18> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return U18.f51490a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new U18[i];
            }
        }

        private U18() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
