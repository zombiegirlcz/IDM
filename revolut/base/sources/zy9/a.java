package zy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardRecognitionResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardRecognitionResult f326389a;

    public a(SendFromClipboardRecognitionResult recognitionResult) {
        Intrinsics.checkNotNullParameter(recognitionResult, "recognitionResult");
        this.f326389a = recognitionResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f326389a, ((a) obj2).f326389a);
    }

    public final int hashCode() {
        return this.f326389a.f79691a.hashCode();
    }
}
