package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/IdentityType;", "Landroid/os/Parcelable;", "", "", "type", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "PERSONAL", "BUSINESS", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdentityType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IdentityType[] $VALUES;
    public static final IdentityType BUSINESS;

    @NotNull
    public static final Parcelable.Creator<IdentityType> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final IdentityType PERSONAL;

    @NotNull
    private final String type;

    /* JADX INFO: renamed from: com.revolut.feature.apm.core.models.recipients.IdentityType$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static IdentityType a(Companion companion, String str) {
            Object next;
            IdentityType identityType = IdentityType.PERSONAL;
            companion.getClass();
            Intrinsics.checkNotNullParameter(identityType, "default");
            if (str != null) {
                Iterator<E> it8 = IdentityType.a().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (a0.z(((IdentityType) next).getType(), str, true)) {
                        break;
                    }
                }
                IdentityType identityType2 = (IdentityType) next;
                if (identityType2 != null) {
                    return identityType2;
                }
            }
            return identityType;
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return IdentityType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IdentityType[i];
        }
    }

    static {
        IdentityType identityType = new IdentityType("PERSONAL", 0, "INDIVIDUAL");
        PERSONAL = identityType;
        IdentityType identityType2 = new IdentityType("BUSINESS", 1, "BUSINESS");
        BUSINESS = identityType2;
        IdentityType[] identityTypeArr = {identityType, identityType2};
        $VALUES = identityTypeArr;
        $ENTRIES = s.n(identityTypeArr);
        INSTANCE = new Companion();
        CREATOR = new b();
    }

    public IdentityType(String str, int i, String str2) {
        this.type = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static IdentityType valueOf(String str) {
        return (IdentityType) Enum.valueOf(IdentityType.class, str);
    }

    public static IdentityType[] values() {
        return (IdentityType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
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
