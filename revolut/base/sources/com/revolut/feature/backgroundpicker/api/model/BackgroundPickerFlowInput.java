package com.revolut.feature.backgroundpicker.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import em2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/api/model/BackgroundPickerFlowInput;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_background_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackgroundPickerFlowInput implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BackgroundPickerFlowInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackgroundKey f63739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f63740b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BackgroundKey backgroundKey = (BackgroundKey) j6.a.f(parcel, "parcel", BackgroundPickerFlowInput.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(b.valueOf(parcel.readString()));
            }
            return new BackgroundPickerFlowInput(backgroundKey, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackgroundPickerFlowInput[i];
        }
    }

    public BackgroundPickerFlowInput(BackgroundKey backgroundKey, List scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f63739a = backgroundKey;
        this.f63740b = scopes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackgroundPickerFlowInput)) {
            return false;
        }
        BackgroundPickerFlowInput backgroundPickerFlowInput = (BackgroundPickerFlowInput) obj2;
        return Intrinsics.f(this.f63739a, backgroundPickerFlowInput.f63739a) && Intrinsics.f(this.f63740b, backgroundPickerFlowInput.f63740b);
    }

    public final int hashCode() {
        BackgroundKey backgroundKey = this.f63739a;
        return this.f63740b.hashCode() + ((backgroundKey == null ? 0 : backgroundKey.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63739a, i);
        Iterator itV = p.a.v(this.f63740b, dest);
        while (itV.hasNext()) {
            dest.writeString(((b) itV.next()).name());
        }
    }
}
