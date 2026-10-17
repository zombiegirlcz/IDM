package com.revolut.domain.models.topup;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import io3.l;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/topup/AutoTopUpState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Type", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoTopUpState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoTopUpState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f60421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f60423c;
    public final Type d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f60424g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/topup/AutoTopUpState$Type;", "", "<init>", "(Ljava/lang/String;I)V", "EXTERNAL_CARD", "PAY_TO", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type EXTERNAL_CARD = new Type("EXTERNAL_CARD", 0);
        public static final Type PAY_TO = new Type("PAY_TO", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{EXTERNAL_CARD, PAY_TO};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = s.n(typeArr$values);
        }

        private Type(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoTopUpState(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), l.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoTopUpState[i];
        }
    }

    public AutoTopUpState(boolean z, String str, String str2, Type type, d dVar, d dVar2, l pocketType) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f60421a = z;
        this.f60422b = str;
        this.f60423c = str2;
        this.d = type;
        this.e = dVar;
        this.f = dVar2;
        this.f60424g = pocketType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoTopUpState)) {
            return false;
        }
        AutoTopUpState autoTopUpState = (AutoTopUpState) obj2;
        return this.f60421a == autoTopUpState.f60421a && Intrinsics.f(this.f60422b, autoTopUpState.f60422b) && Intrinsics.f(this.f60423c, autoTopUpState.f60423c) && this.d == autoTopUpState.d && Intrinsics.f(this.e, autoTopUpState.e) && Intrinsics.f(this.f, autoTopUpState.f) && this.f60424g == autoTopUpState.f60424g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f60421a) * 31;
        String str = this.f60422b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f60423c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Type type = this.d;
        int iHashCode4 = (iHashCode3 + (type == null ? 0 : type.hashCode())) * 31;
        d dVar = this.e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f;
        return this.f60424g.hashCode() + ((iHashCode5 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f60421a ? 1 : 0);
        dest.writeString(this.f60422b);
        dest.writeString(this.f60423c);
        Type type = this.d;
        if (type == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(type.name());
        }
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f60424g.name());
    }
}
