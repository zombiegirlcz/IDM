package com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/impl/ui/trophy_room/highlights_sharing/RevPointsTrophyRoomHighlightsSharingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsTrophyRoomHighlightsSharingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsTrophyRoomHighlightsSharingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f83919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83920b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(RevPointsTrophyRoomHighlightsSharingScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new RevPointsTrophyRoomHighlightsSharingScreenContract$InputData(parcel.readInt(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsTrophyRoomHighlightsSharingScreenContract$InputData[i];
        }
    }

    public RevPointsTrophyRoomHighlightsSharingScreenContract$InputData(int i, ArrayList highlights) {
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f83919a = highlights;
        this.f83920b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsTrophyRoomHighlightsSharingScreenContract$InputData)) {
            return false;
        }
        RevPointsTrophyRoomHighlightsSharingScreenContract$InputData revPointsTrophyRoomHighlightsSharingScreenContract$InputData = (RevPointsTrophyRoomHighlightsSharingScreenContract$InputData) obj2;
        return this.f83919a.equals(revPointsTrophyRoomHighlightsSharingScreenContract$InputData.f83919a) && this.f83920b == revPointsTrophyRoomHighlightsSharingScreenContract$InputData.f83920b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83920b) + (this.f83919a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f83919a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeInt(this.f83920b);
    }
}
