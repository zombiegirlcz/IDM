package com.revolut.feature.in_app_calls.wrapper;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/in_app_calls/wrapper/VoiceCallInvite;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_in_app_calls_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VoiceCallInvite implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VoiceCallInvite> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f74839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f74841c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Parcelable parcelableF = j6.a.f(parcel, "parcel", VoiceCallInvite.class);
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new VoiceCallInvite(parcelableF, string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VoiceCallInvite[i];
        }
    }

    public VoiceCallInvite(Parcelable src2, String str, Map customParameters) {
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(customParameters, "customParameters");
        this.f74839a = src2;
        this.f74840b = str;
        this.f74841c = customParameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VoiceCallInvite)) {
            return false;
        }
        VoiceCallInvite voiceCallInvite = (VoiceCallInvite) obj2;
        return Intrinsics.f(this.f74839a, voiceCallInvite.f74839a) && Intrinsics.f(this.f74840b, voiceCallInvite.f74840b) && Intrinsics.f(this.f74841c, voiceCallInvite.f74841c);
    }

    public final int hashCode() {
        int iHashCode = this.f74839a.hashCode() * 31;
        String str = this.f74840b;
        return this.f74841c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f74839a, i);
        dest.writeString(this.f74840b);
        Iterator itZ = j6.a.z(this.f74841c, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
