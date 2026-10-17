package com.revolut.feature.esim.instructions.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/esim/instructions/domain/EsimInstructionType;", "Landroid/os/Parcelable;", "Companion", "a", "value", "", "feature_esim_instructions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimInstructionType implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72115a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<EsimInstructionType> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.esim.instructions.domain.EsimInstructionType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String value = parcel.readString();
            Companion companion = EsimInstructionType.INSTANCE;
            Intrinsics.checkNotNullParameter(value, "value");
            return new EsimInstructionType(value);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimInstructionType[i];
        }
    }

    static {
        Intrinsics.checkNotNullParameter("INSTALLATION", "value");
        Intrinsics.checkNotNullParameter("ACTIVATION", "value");
        Intrinsics.checkNotNullParameter("RESET_NETWORK_SELECTION", "value");
    }

    public /* synthetic */ EsimInstructionType(String str) {
        this.f72115a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof EsimInstructionType) {
            return Intrinsics.f(this.f72115a, ((EsimInstructionType) obj2).f72115a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f72115a.hashCode();
    }

    public final String toString() {
        return a.p("EsimInstructionType(value=", this.f72115a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72115a);
    }
}
