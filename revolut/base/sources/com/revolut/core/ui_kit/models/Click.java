package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.ga;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/models/Click;", "Lcom/revolut/core/ui_kit/models/Style;", "Law0/ga;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Click extends Style implements ga {

    @NotNull
    public static final Parcelable.Creator<Click> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f57744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57745c;
    public final boolean d;
    public final Integer e;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Object value = parcel.readValue(Click.class.getClassLoader());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new Click(string, value, z3, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Click[i];
        }
    }

    public Click(String id10, Object obj2, boolean z, boolean z3, Integer num) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f57743a = id10;
        this.f57744b = obj2;
        this.f57745c = z;
        this.d = z3;
        this.e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Click)) {
            return false;
        }
        Click click = (Click) obj2;
        return Intrinsics.f(this.f57743a, click.f57743a) && Intrinsics.f(this.f57744b, click.f57744b) && this.f57745c == click.f57745c && this.d == click.d && Intrinsics.f(this.e, click.e);
    }

    public final int hashCode() {
        int iHashCode = this.f57743a.hashCode() * 31;
        Object obj2 = this.f57744b;
        int iC = j6.a.c(j6.a.c((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f57745c), 31, this.d);
        Integer num = this.e;
        return iC + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f57743a);
        dest.writeValue(this.f57744b);
        dest.writeInt(this.f57745c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public /* synthetic */ Click(int i, Integer num, Object obj2, String str, boolean z) {
        this(str, (i & 2) != 0 ? null : obj2, (i & 4) == 0, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : num);
    }
}
