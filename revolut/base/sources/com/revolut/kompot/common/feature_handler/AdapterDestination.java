package com.revolut.kompot.common.feature_handler;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/common/feature_handler/AdapterDestination;", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT", "Lcom/revolut/kompot/common/InternalDestination;", "", "toString", "()Ljava/lang/String;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdapterDestination<INPUT extends IOData$Input> extends InternalDestination<INPUT> {

    @NotNull
    public static final Parcelable.Creator<AdapterDestination<?>> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InternalDestination f98331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f98332c;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdapterDestination((InternalDestination) parcel.readParcelable(AdapterDestination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(AdapterDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdapterDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterDestination(InternalDestination source, TransitionAnimation animation) {
        super(source.getF98300a());
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f98331b = source;
        this.f98332c = animation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF98332c() {
        return this.f98332c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdapterDestination)) {
            return false;
        }
        AdapterDestination adapterDestination = (AdapterDestination) obj2;
        return Intrinsics.f(this.f98331b, adapterDestination.f98331b) && Intrinsics.f(this.f98332c, adapterDestination.f98332c);
    }

    public final int hashCode() {
        return this.f98332c.hashCode() + (this.f98331b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f98331b, i);
        dest.writeParcelable(this.f98332c, i);
    }
}
