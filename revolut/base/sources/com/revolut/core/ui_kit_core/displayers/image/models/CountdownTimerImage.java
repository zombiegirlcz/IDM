package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ez0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CountdownTimerImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "Companion", "ProgressCycle", "ez0/d", "a", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CountdownTimerImage implements Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59900c;
    public final float d;
    public final d e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f59901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f59902h;
    public final Clause i;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    @NotNull
    public static final Parcelable.Creator<CountdownTimerImage> CREATOR = new b();

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/CountdownTimerImage$ProgressCycle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProgressCycle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ProgressCycle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f59903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59904b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProgressCycle(parcel.readFloat(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProgressCycle[i];
            }
        }

        public ProgressCycle(float f, int i) {
            this.f59903a = f;
            this.f59904b = i;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF59904b() {
            return this.f59904b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getF59903a() {
            return this.f59903a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProgressCycle)) {
                return false;
            }
            ProgressCycle progressCycle = (ProgressCycle) obj2;
            return Float.compare(this.f59903a, progressCycle.f59903a) == 0 && this.f59904b == progressCycle.f59904b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f59904b) + (Float.hashCode(this.f59903a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.f59903a);
            dest.writeInt(this.f59904b);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.displayers.image.models.CountdownTimerImage$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes20.dex */
    public static final class Companion {
        private Companion() {
        }

        public static CountdownTimerImage a(long j2, long j3, d textFormat) {
            Intrinsics.checkNotNullParameter(textFormat, "textFormat");
            return new CountdownTimerImage(j2, j3, R$attr.uikit_colorForeground, 2.0f, textFormat, R$attr.uikit_colorGroupedBackground, 4.0f, v.k(new ProgressCycle(1.0f, R$attr.uikit_colorTeal), new ProgressCycle(0.25f, R$attr.uikit_colorOrange), new ProgressCycle(0.05f, R$attr.uikit_colorRed)), null);
        }

        public Companion(int i) {
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            int i = parcel.readInt();
            float f = parcel.readFloat();
            d dVarValueOf = d.valueOf(parcel.readString());
            int i2 = parcel.readInt();
            float f4 = parcel.readFloat();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int iA = 0;
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ProgressCycle.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CountdownTimerImage(j2, j3, i, f, dVarValueOf, i2, f4, arrayList, (Clause) parcel.readParcelable(CountdownTimerImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CountdownTimerImage[i];
        }
    }

    public CountdownTimerImage(long j2, long j3, int i, float f, d textFormat, int i2, float f4, List progressCycles, Clause clause) {
        Intrinsics.checkNotNullParameter(textFormat, "textFormat");
        Intrinsics.checkNotNullParameter(progressCycles, "progressCycles");
        this.f59898a = j2;
        this.f59899b = j3;
        this.f59900c = i;
        this.d = f;
        this.e = textFormat;
        this.f = i2;
        this.f59901g = f4;
        this.f59902h = progressCycles;
        this.i = clause;
    }

    public static CountdownTimerImage a(CountdownTimerImage countdownTimerImage, int i, List list, int i2) {
        long j2 = countdownTimerImage.f59898a;
        long j3 = countdownTimerImage.f59899b;
        int i3 = countdownTimerImage.f59900c;
        float f = countdownTimerImage.d;
        d textFormat = countdownTimerImage.e;
        if ((i2 & 32) != 0) {
            i = countdownTimerImage.f;
        }
        int i5 = i;
        float f4 = countdownTimerImage.f59901g;
        if ((i2 & 128) != 0) {
            list = countdownTimerImage.f59902h;
        }
        List progressCycles = list;
        Clause clause = countdownTimerImage.i;
        Intrinsics.checkNotNullParameter(textFormat, "textFormat");
        Intrinsics.checkNotNullParameter(progressCycles, "progressCycles");
        return new CountdownTimerImage(j2, j3, i3, f, textFormat, i5, f4, progressCycles, clause);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CountdownTimerImage)) {
            return false;
        }
        CountdownTimerImage countdownTimerImage = (CountdownTimerImage) obj2;
        return this.f59898a == countdownTimerImage.f59898a && this.f59899b == countdownTimerImage.f59899b && this.f59900c == countdownTimerImage.f59900c && Float.compare(this.d, countdownTimerImage.d) == 0 && this.e == countdownTimerImage.e && this.f == countdownTimerImage.f && Float.compare(this.f59901g, countdownTimerImage.f59901g) == 0 && Intrinsics.f(this.f59902h, countdownTimerImage.f59902h) && Intrinsics.f(this.i, countdownTimerImage.i);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getI() {
        return this.i;
    }

    public final int hashCode() {
        int iD = p.a.d(m72.b.b(this.f59901g, j6.a.b(this.f, (this.e.hashCode() + m72.b.b(this.d, j6.a.b(this.f59900c, a0.d.c(Long.hashCode(this.f59898a) * 31, 31, this.f59899b), 31), 31)) * 31, 31), 31), 31, this.f59902h);
        Clause clause = this.i;
        return iD + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f59898a);
        dest.writeLong(this.f59899b);
        dest.writeInt(this.f59900c);
        dest.writeFloat(this.d);
        dest.writeString(this.e.name());
        dest.writeInt(this.f);
        dest.writeFloat(this.f59901g);
        Iterator itV = p.a.v(this.f59902h, dest);
        while (itV.hasNext()) {
            ((ProgressCycle) itV.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.i, i);
    }
}
