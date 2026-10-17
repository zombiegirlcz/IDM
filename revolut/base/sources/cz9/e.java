package cz9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardRecognitionResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardRecognitionResult f110167a;

    public e(SendFromClipboardRecognitionResult recognitionResult) {
        Intrinsics.checkNotNullParameter(recognitionResult, "recognitionResult");
        this.f110167a = recognitionResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f110167a, ((e) obj2).f110167a);
    }

    public final int hashCode() {
        return this.f110167a.f79691a.hashCode();
    }
}
