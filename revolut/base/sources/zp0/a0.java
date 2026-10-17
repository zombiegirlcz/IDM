package zp0;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 implements hm.a, kfm.g, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f324100a;

    public a0(int i, Function1 function) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f324100a = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f324100a = function;
                break;
            default:
                this.f324100a = function;
                break;
        }
    }

    @Override // hm.a
    public void a(String extractedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        LocalTime localTime = null;
        if (z) {
            try {
                String strSubstring = extractedValue.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = extractedValue.substring(2, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                localTime = LocalTime.parse(strSubstring + ":" + strSubstring2);
            } catch (DateTimeParseException unused) {
            }
        }
        this.f324100a.invoke(localTime);
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        this.f324100a.invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        return this.f324100a.invoke(obj2);
    }
}
