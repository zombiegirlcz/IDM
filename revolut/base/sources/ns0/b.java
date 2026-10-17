package ns0;

import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.text.TextPaint;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f218676a;

    long a();

    default void b(List nonDigits) {
        Intrinsics.checkNotNullParameter(nonDigits, "nonDigits");
    }

    default void c(Canvas canvas, r nonDigit, TextPaint paint, float f, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(nonDigit, "nonDigit");
        Intrinsics.checkNotNullParameter(paint, "paint");
        fs0.b bVar = nonDigit.e;
        canvas.drawText(bVar, 0, bVar.length(), nonDigit.f218724a, f, paint);
    }

    void cancel();

    void d(long j2);

    void e(Canvas canvas, g gVar, TextPaint textPaint, float f, float f4, float f5);

    default boolean f(g digit) {
        Intrinsics.checkNotNullParameter(digit, "digit");
        return false;
    }

    default boolean g(r previous, char c2) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        return previous.e.length() == 1 && previous.e.charAt(0) == c2;
    }

    TimeInterpolator h();

    default void i(Canvas canvas, TextPaint paint, float f, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    default boolean j(g digit, int i, int i2, float f, float f4, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(digit, "digit");
        return false;
    }

    default void k(Canvas canvas, TextPaint paint, float f, float f4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    void l(TimeInterpolator timeInterpolator);

    default void m(Clause clause, Clause clause2, int i, int i2, boolean z) {
    }

    void n(List list);

    default boolean o(r nonDigit) {
        Intrinsics.checkNotNullParameter(nonDigit, "nonDigit");
        return false;
    }

    default boolean p(r nonDigit, float f, float f4, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(nonDigit, "nonDigit");
        return false;
    }

    void start();
}
