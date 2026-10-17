package t70;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String message, int i) {
        super(message);
        this.f268401a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f268402b = message;
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f268402b = message;
                StackTraceElement[] stackTrace = getStackTrace();
                if (getStackTrace().length > 2) {
                    String string = Integer.toString(Math.abs(message.hashCode()), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    StackTraceElement stackTraceElement = new StackTraceElement("com.revolut.core.android.localization.UnexpectedDynamicString", j6.a.q("init", string), "DynamicStringsValidator.kt", 0);
                    Intrinsics.h(stackTrace);
                    ArrayList arrayListX0 = kotlin.collections.d.x0(stackTrace);
                    arrayListX0.add(1, stackTraceElement);
                    stackTrace = (StackTraceElement[]) arrayListX0.toArray(new StackTraceElement[0]);
                }
                setStackTrace(stackTrace);
                break;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f268401a) {
        }
        return this.f268402b;
    }
}
