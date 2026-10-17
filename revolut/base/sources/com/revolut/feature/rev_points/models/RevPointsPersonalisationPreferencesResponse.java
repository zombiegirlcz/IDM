package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsPersonalisationPreferencesResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPersonalisationPreferencesResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsPersonalisationPreferencesResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f84020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPointsTextWithLinks f84021c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RevPointsPersonalisationPreferenceOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RevPointsPersonalisationPreferencesResponse(i, arrayList, parcel.readInt() == 0 ? null : RevPointsTextWithLinks.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPersonalisationPreferencesResponse[i];
        }
    }

    public RevPointsPersonalisationPreferencesResponse(int i, ArrayList preferences, RevPointsTextWithLinks revPointsTextWithLinks) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f84019a = i;
        this.f84020b = preferences;
        this.f84021c = revPointsTextWithLinks;
    }

    public static RevPointsPersonalisationPreferencesResponse a(RevPointsPersonalisationPreferencesResponse revPointsPersonalisationPreferencesResponse, ArrayList preferences) {
        int i = revPointsPersonalisationPreferencesResponse.f84019a;
        RevPointsTextWithLinks revPointsTextWithLinks = revPointsPersonalisationPreferencesResponse.f84021c;
        revPointsPersonalisationPreferencesResponse.getClass();
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new RevPointsPersonalisationPreferencesResponse(i, preferences, revPointsTextWithLinks);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPersonalisationPreferencesResponse)) {
            return false;
        }
        RevPointsPersonalisationPreferencesResponse revPointsPersonalisationPreferencesResponse = (RevPointsPersonalisationPreferencesResponse) obj2;
        return this.f84019a == revPointsPersonalisationPreferencesResponse.f84019a && this.f84020b.equals(revPointsPersonalisationPreferencesResponse.f84020b) && Intrinsics.f(this.f84021c, revPointsPersonalisationPreferencesResponse.f84021c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f84020b, Integer.hashCode(this.f84019a) * 31, 31);
        RevPointsTextWithLinks revPointsTextWithLinks = this.f84021c;
        return iB + (revPointsTextWithLinks == null ? 0 : revPointsTextWithLinks.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84019a);
        Iterator itY = j6.a.y(this.f84020b, dest);
        while (itY.hasNext()) {
            ((RevPointsPersonalisationPreferenceOption) itY.next()).writeToParcel(dest, i);
        }
        RevPointsTextWithLinks revPointsTextWithLinks = this.f84021c;
        if (revPointsTextWithLinks == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsTextWithLinks.writeToParcel(dest, i);
        }
    }
}
