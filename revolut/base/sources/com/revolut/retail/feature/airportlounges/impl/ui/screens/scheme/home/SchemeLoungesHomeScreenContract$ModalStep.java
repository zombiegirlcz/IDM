package com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/screens/scheme/home/SchemeLoungesHomeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "HowToActivate", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/scheme/home/SchemeLoungesHomeScreenContract$ModalStep$HowToActivate;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SchemeLoungesHomeScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/scheme/home/SchemeLoungesHomeScreenContract$ModalStep$HowToActivate;", "Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/scheme/home/SchemeLoungesHomeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HowToActivate extends SchemeLoungesHomeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<HowToActivate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f99151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SchemeAirportLoungesFooter f99152c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(HowToActivate.class, parcel, arrayList, iE, 1);
                }
                return new HowToActivate(string, arrayList, (SchemeAirportLoungesFooter) parcel.readParcelable(HowToActivate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HowToActivate[i];
            }
        }

        public HowToActivate(String title, ArrayList cells, SchemeAirportLoungesFooter footer) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cells, "cells");
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.f99150a = title;
            this.f99151b = cells;
            this.f99152c = footer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof HowToActivate)) {
                return false;
            }
            HowToActivate howToActivate = (HowToActivate) obj2;
            return Intrinsics.f(this.f99150a, howToActivate.f99150a) && this.f99151b.equals(howToActivate.f99151b) && Intrinsics.f(this.f99152c, howToActivate.f99152c);
        }

        public final int hashCode() {
            return this.f99152c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f99151b, this.f99150a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99150a);
            Iterator itY = j6.a.y(this.f99151b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.f99152c, i);
        }
    }

    private SchemeLoungesHomeScreenContract$ModalStep() {
    }
}
