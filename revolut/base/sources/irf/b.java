package irf;

import android.text.InputFilter;
import ehe.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u80.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168044a;

    public b(InputFilter amountInputFilter, o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(amountInputFilter, "amountInputFilter");
        this.f168044a = n.w(140);
    }
}
