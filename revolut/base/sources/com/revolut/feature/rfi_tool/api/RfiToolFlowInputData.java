package com.revolut.feature.rfi_tool.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rfi_tool/api/RfiToolFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rfi_tool_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RfiToolFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RfiToolFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f84998c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new RfiToolFlowInputData(string, string2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RfiToolFlowInputData[i];
        }
    }

    public RfiToolFlowInputData(String informationRequestId, String str, LinkedHashMap introParams) {
        Intrinsics.checkNotNullParameter(informationRequestId, "informationRequestId");
        Intrinsics.checkNotNullParameter(introParams, "introParams");
        this.f84996a = informationRequestId;
        this.f84997b = str;
        this.f84998c = introParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RfiToolFlowInputData)) {
            return false;
        }
        RfiToolFlowInputData rfiToolFlowInputData = (RfiToolFlowInputData) obj2;
        return Intrinsics.f(this.f84996a, rfiToolFlowInputData.f84996a) && Intrinsics.f(this.f84997b, rfiToolFlowInputData.f84997b) && this.f84998c.equals(rfiToolFlowInputData.f84998c);
    }

    public final int hashCode() {
        int iHashCode = this.f84996a.hashCode() * 31;
        String str = this.f84997b;
        return this.f84998c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84996a);
        dest.writeString(this.f84997b);
        LinkedHashMap linkedHashMap = this.f84998c;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
