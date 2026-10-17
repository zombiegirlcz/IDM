package n4h;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigDecimal f212444b = new BigDecimal(BigInteger.ONE, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f212445a;

    public f(b accountRowBuilder) {
        Intrinsics.checkNotNullParameter(accountRowBuilder, "accountRowBuilder");
        this.f212445a = accountRowBuilder;
    }
}
