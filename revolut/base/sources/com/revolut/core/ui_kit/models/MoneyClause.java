package com.revolut.core.ui_kit.models;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.fa;
import aw0.j7;
import aw0.k7;
import aw0.n9;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0007\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/models/MoneyClause;", "Lcom/revolut/core/ui_kit/models/Clause;", "Law0/fa;", "Law0/n9;", "", "toString", "()Ljava/lang/String;", "aw0/k7", "aw0/j7", "Format", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyClause implements Clause, fa, n9 {

    @NotNull
    public static final Parcelable.Creator<MoneyClause> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f57821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format f57822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Style f57823c;
    public final o9 d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/models/MoneyClause$Format;", "", "Headers", "Shorts", "Editable", "Defaults", "Asset", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Asset;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Defaults;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Editable;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Headers;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Shorts;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Format implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Asset;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Asset extends Format {

            @NotNull
            public static final Parcelable.Creator<Asset> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k7 f57824a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Asset(k7.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Asset[i];
                }
            }

            public Asset() {
                this(0);
            }

            @Override // com.revolut.core.ui_kit.models.MoneyClause.Format
            /* JADX INFO: renamed from: a, reason: from getter */
            public final k7 getF57832a() {
                return this.f57824a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Asset) && this.f57824a == ((Asset) obj2).f57824a;
            }

            public final int hashCode() {
                return this.f57824a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57824a.name());
            }

            public Asset(k7 signShowingPolicy) {
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                this.f57824a = signShowingPolicy;
            }

            public /* synthetic */ Asset(int i) {
                this(k7.ONLY_NEGATIVE);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Defaults;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Defaults extends Format {

            @NotNull
            public static final Parcelable.Creator<Defaults> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k7 f57825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ScaleMode f57826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f57827c;
            public final boolean d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Defaults(k7.valueOf(parcel.readString()), (ScaleMode) parcel.readParcelable(Defaults.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Defaults[i];
                }
            }

            public Defaults() {
                this(null, null, false, false, 15);
            }

            public static Defaults b(Defaults defaults, ScaleMode scaleMode) {
                k7 signShowingPolicy = defaults.f57825a;
                boolean z = defaults.f57827c;
                boolean z3 = defaults.d;
                defaults.getClass();
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                return new Defaults(signShowingPolicy, scaleMode, z, z3);
            }

            @Override // com.revolut.core.ui_kit.models.MoneyClause.Format
            /* JADX INFO: renamed from: a, reason: from getter */
            public final k7 getF57832a() {
                return this.f57825a;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getD() {
                return this.d;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getF57827c() {
                return this.f57827c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ScaleMode getF57826b() {
                return this.f57826b;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Defaults)) {
                    return false;
                }
                Defaults defaults = (Defaults) obj2;
                return this.f57825a == defaults.f57825a && Intrinsics.f(this.f57826b, defaults.f57826b) && this.f57827c == defaults.f57827c && this.d == defaults.d;
            }

            public final int hashCode() {
                int iHashCode = this.f57825a.hashCode() * 31;
                ScaleMode scaleMode = this.f57826b;
                return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (scaleMode == null ? 0 : scaleMode.hashCode())) * 31, 31, this.f57827c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57825a.name());
                dest.writeParcelable(this.f57826b, i);
                dest.writeInt(this.f57827c ? 1 : 0);
                dest.writeInt(this.d ? 1 : 0);
            }

            public Defaults(k7 signShowingPolicy, ScaleMode scaleMode, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                this.f57825a = signShowingPolicy;
                this.f57826b = scaleMode;
                this.f57827c = z;
                this.d = z3;
            }

            public /* synthetic */ Defaults(k7 k7Var, ScaleMode scaleMode, boolean z, boolean z3, int i) {
                this((i & 1) != 0 ? k7.ONLY_NEGATIVE : k7Var, (i & 2) != 0 ? null : scaleMode, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z3);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Headers;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Headers extends Format {

            @NotNull
            public static final Parcelable.Creator<Headers> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k7 f57829a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ScaleMode f57830b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final j7 f57831c;
            public final boolean d;
            public final boolean e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    k7 k7VarValueOf = k7.valueOf(parcel.readString());
                    ScaleMode scaleMode = (ScaleMode) parcel.readParcelable(Headers.class.getClassLoader());
                    j7 j7VarValueOf = j7.valueOf(parcel.readString());
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new Headers(k7VarValueOf, scaleMode, j7VarValueOf, z3, parcel.readInt() == 0 ? z : true);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Headers[i];
                }
            }

            public Headers() {
                this(null, null, null, false, false, 31);
            }

            public static Headers b(Headers headers, ScaleMode scaleMode) {
                k7 signShowingPolicy = headers.f57829a;
                j7 fractionScalingPolicy = headers.f57831c;
                boolean z = headers.d;
                boolean z3 = headers.e;
                headers.getClass();
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                Intrinsics.checkNotNullParameter(fractionScalingPolicy, "fractionScalingPolicy");
                return new Headers(signShowingPolicy, scaleMode, fractionScalingPolicy, z, z3);
            }

            @Override // com.revolut.core.ui_kit.models.MoneyClause.Format
            /* JADX INFO: renamed from: a, reason: from getter */
            public final k7 getF57832a() {
                return this.f57829a;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getD() {
                return this.d;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final j7 getF57831c() {
                return this.f57831c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Headers)) {
                    return false;
                }
                Headers headers = (Headers) obj2;
                return this.f57829a == headers.f57829a && Intrinsics.f(this.f57830b, headers.f57830b) && this.f57831c == headers.f57831c && this.d == headers.d && this.e == headers.e;
            }

            public final int hashCode() {
                int iHashCode = this.f57829a.hashCode() * 31;
                ScaleMode scaleMode = this.f57830b;
                return Boolean.hashCode(this.e) + j6.a.c((this.f57831c.hashCode() + ((iHashCode + (scaleMode == null ? 0 : scaleMode.hashCode())) * 31)) * 31, 31, this.d);
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final ScaleMode getF57830b() {
                return this.f57830b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57829a.name());
                dest.writeParcelable(this.f57830b, i);
                dest.writeString(this.f57831c.name());
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
            }

            public Headers(k7 signShowingPolicy, ScaleMode scaleMode, j7 fractionScalingPolicy, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                Intrinsics.checkNotNullParameter(fractionScalingPolicy, "fractionScalingPolicy");
                this.f57829a = signShowingPolicy;
                this.f57830b = scaleMode;
                this.f57831c = fractionScalingPolicy;
                this.d = z;
                this.e = z3;
            }

            public /* synthetic */ Headers(k7 k7Var, ScaleMode scaleMode, j7 j7Var, boolean z, boolean z3, int i) {
                this((i & 1) != 0 ? k7.ONLY_NEGATIVE : k7Var, (i & 2) != 0 ? null : scaleMode, (i & 4) != 0 ? j7.DEFAULT : j7Var, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z3);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Shorts;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format;", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Shorts extends Format {

            @NotNull
            public static final Parcelable.Creator<Shorts> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k7 f57832a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f57833b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f57834c;
            public final boolean d;
            public final boolean e;
            public final Integer f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    boolean z4;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    k7 k7VarValueOf = k7.valueOf(parcel.readString());
                    boolean z6 = false;
                    boolean z11 = true;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z6 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z11 = z;
                    }
                    if (parcel.readInt() != 0) {
                        z4 = z3;
                    } else {
                        z4 = z3;
                        z3 = z;
                    }
                    if (parcel.readInt() == 0) {
                        z4 = z;
                    }
                    return new Shorts(k7VarValueOf, z6, z11, z3, z4, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Shorts[i];
                }
            }

            public Shorts() {
                this(false, 63);
            }

            @Override // com.revolut.core.ui_kit.models.MoneyClause.Format
            /* JADX INFO: renamed from: a, reason: from getter */
            public final k7 getF57832a() {
                return this.f57832a;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getF57833b() {
                return this.f57833b;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getD() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Integer getF() {
                return this.f;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Shorts)) {
                    return false;
                }
                Shorts shorts = (Shorts) obj2;
                return this.f57832a == shorts.f57832a && this.f57833b == shorts.f57833b && this.f57834c == shorts.f57834c && this.d == shorts.d && this.e == shorts.e && Intrinsics.f(this.f, shorts.f);
            }

            public final int hashCode() {
                int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(this.f57832a.hashCode() * 31, 31, this.f57833b), 31, this.f57834c), 31, this.d), 31, this.e);
                Integer num = this.f;
                return iC + (num == null ? 0 : num.hashCode());
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getF57834c() {
                return this.f57834c;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57832a.name());
                dest.writeInt(this.f57833b ? 1 : 0);
                dest.writeInt(this.f57834c ? 1 : 0);
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
                Integer num = this.f;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }

            public Shorts(k7 signShowingPolicy, boolean z, boolean z3, boolean z4, boolean z6, Integer num) {
                Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
                this.f57832a = signShowingPolicy;
                this.f57833b = z;
                this.f57834c = z3;
                this.d = z4;
                this.e = z6;
                this.f = num;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Shorts(boolean z, int i) {
                boolean z3;
                k7 k7Var = k7.ONLY_NEGATIVE;
                z = (i & 2) != 0 ? false : z;
                boolean z4 = true;
                if ((i & 4) != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z4 = false;
                }
                this(k7Var, z, z4, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : 2);
            }
        }

        public Format() {
            k7 k7Var = k7.ALWAYS;
        }

        /* JADX INFO: renamed from: a */
        public abstract k7 getF57832a();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/models/MoneyClause$Format$Editable;", "Lcom/revolut/core/ui_kit/models/MoneyClause$Format;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ui_kit_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Editable extends Format {

            @NotNull
            public static final Parcelable.Creator<Editable> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k7 f57828a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Editable(k7.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Editable[i];
                }
            }

            public Editable(k7 k7Var) {
                this.f57828a = k7Var;
            }

            @Override // com.revolut.core.ui_kit.models.MoneyClause.Format
            /* JADX INFO: renamed from: a, reason: from getter */
            public final k7 getF57832a() {
                return this.f57828a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Editable) && this.f57828a == ((Editable) obj2).f57828a;
            }

            public final int hashCode() {
                return this.f57828a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f57828a.name());
            }

            public Editable() {
                this(k7.NEVER);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyClause((dj0.d) parcel.readSerializable(), (Format) parcel.readParcelable(MoneyClause.class.getClassLoader()), (Style) parcel.readParcelable(MoneyClause.class.getClassLoader()), o9.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyClause[i];
        }
    }

    public MoneyClause(dj0.d money, Format format, Style style, o9 sensitivity) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        this.f57821a = money;
        this.f57822b = format;
        this.f57823c = style;
        this.d = sensitivity;
    }

    public static MoneyClause b(MoneyClause moneyClause, dj0.d money, Format format, Style style, o9 sensitivity, int i) {
        if ((i & 1) != 0) {
            money = moneyClause.f57821a;
        }
        if ((i & 2) != 0) {
            format = moneyClause.f57822b;
        }
        if ((i & 4) != 0) {
            style = moneyClause.f57823c;
        }
        if ((i & 8) != 0) {
            sensitivity = moneyClause.d;
        }
        moneyClause.getClass();
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        return new MoneyClause(money, format, style, sensitivity);
    }

    @Override // aw0.n9
    /* JADX INFO: renamed from: a, reason: from getter */
    public final o9 getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Format getF57822b() {
        return this.f57822b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final dj0.d getF57821a() {
        return this.f57821a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyClause)) {
            return false;
        }
        MoneyClause moneyClause = (MoneyClause) obj2;
        return Intrinsics.f(this.f57821a, moneyClause.f57821a) && Intrinsics.f(this.f57822b, moneyClause.f57822b) && Intrinsics.f(this.f57823c, moneyClause.f57823c) && this.d == moneyClause.d;
    }

    @Override // aw0.fa
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Style getF57837c() {
        return this.f57823c;
    }

    public final int hashCode() {
        int iHashCode = (this.f57822b.hashCode() + (this.f57821a.hashCode() * 31)) * 31;
        Style style = this.f57823c;
        return this.d.hashCode() + ((iHashCode + (style == null ? 0 : style.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f57821a);
        dest.writeParcelable(this.f57822b, i);
        dest.writeParcelable(this.f57823c, i);
        dest.writeString(this.d.name());
    }

    public /* synthetic */ MoneyClause(dj0.d dVar, Format format, Style style, o9 o9Var, int i) {
        this(dVar, format, (i & 4) != 0 ? null : style, (i & 8) != 0 ? o9.SENSITIVE : o9Var);
    }
}
