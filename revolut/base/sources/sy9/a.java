package sy9;

import aii.e;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardRecognitionResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardRecognitionResult f266641a;

    public a(SendFromClipboardRecognitionResult recognitionResult) {
        Intrinsics.checkNotNullParameter(recognitionResult, "recognitionResult");
        this.f266641a = recognitionResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f266641a, ((a) obj2).f266641a);
    }

    public final int hashCode() {
        return this.f266641a.f79691a.hashCode();
    }
}
