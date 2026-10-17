package com.revolut.feature.chooser.external_map.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/chooser/external_map/screen/BottomChooserExternalMapAppScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "MapAppChooser", "Lcom/revolut/feature/chooser/external_map/screen/BottomChooserExternalMapAppScreenContract$ModalStep$MapAppChooser;", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BottomChooserExternalMapAppScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/chooser/external_map/screen/BottomChooserExternalMapAppScreenContract$ModalStep$MapAppChooser;", "Lcom/revolut/feature/chooser/external_map/screen/BottomChooserExternalMapAppScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_chooser_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MapAppChooser implements BottomChooserExternalMapAppScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MapAppChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f65920a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new MapAppChooser(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MapAppChooser[i];
            }
        }

        public MapAppChooser(List mapApps) {
            Intrinsics.checkNotNullParameter(mapApps, "mapApps");
            this.f65920a = mapApps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MapAppChooser) && Intrinsics.f(this.f65920a, ((MapAppChooser) obj2).f65920a);
        }

        public final int hashCode() {
            return this.f65920a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f65920a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }
}
