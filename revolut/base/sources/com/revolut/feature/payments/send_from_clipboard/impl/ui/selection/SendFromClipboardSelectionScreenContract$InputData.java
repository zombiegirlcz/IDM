package com.revolut.feature.payments.send_from_clipboard.impl.ui.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardRecognitionResult;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/send_from_clipboard/impl/ui/selection/SendFromClipboardSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendFromClipboardSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SendFromClipboardSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardRecognitionResult f79713a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SendFromClipboardSelectionScreenContract$InputData((SendFromClipboardRecognitionResult) parcel.readParcelable(SendFromClipboardSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SendFromClipboardSelectionScreenContract$InputData[i];
        }
    }

    public SendFromClipboardSelectionScreenContract$InputData(SendFromClipboardRecognitionResult recognitionResult) {
        Intrinsics.checkNotNullParameter(recognitionResult, "recognitionResult");
        this.f79713a = recognitionResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SendFromClipboardSelectionScreenContract$InputData) && Intrinsics.f(this.f79713a, ((SendFromClipboardSelectionScreenContract$InputData) obj2).f79713a);
    }

    public final int hashCode() {
        return this.f79713a.f79691a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79713a, i);
    }
}
