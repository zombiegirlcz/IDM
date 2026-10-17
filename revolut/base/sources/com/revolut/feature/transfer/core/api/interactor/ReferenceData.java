package com.revolut.feature.transfer.core.api.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transfer/core/api/interactor/ReferenceData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferenceData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f92121b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ReferenceData> CREATOR = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReferenceData f92119c = new ReferenceData(null, h0.f322473a);

    /* JADX INFO: renamed from: com.revolut.feature.transfer.core.api.interactor.ReferenceData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new ReferenceData(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferenceData[i];
        }
    }

    public ReferenceData(String str, Set suggestions) {
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f92120a = str;
        this.f92121b = suggestions;
    }

    public static ReferenceData a(ReferenceData referenceData) {
        Set suggestions = referenceData.f92121b;
        referenceData.getClass();
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        return new ReferenceData(null, suggestions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferenceData)) {
            return false;
        }
        ReferenceData referenceData = (ReferenceData) obj2;
        return Intrinsics.f(this.f92120a, referenceData.f92120a) && Intrinsics.f(this.f92121b, referenceData.f92121b);
    }

    public final int hashCode() {
        String str = this.f92120a;
        return this.f92121b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92120a);
        Iterator itV = n.v(this.f92121b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }
}
