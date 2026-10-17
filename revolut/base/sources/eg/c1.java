package eg;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f125410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f125411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125412c;
    public int d;
    public r0 e;

    public c1(o1 timeProvider, q1 uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f125410a = timeProvider;
        this.f125411b = uuidGenerator;
        this.f125412c = a();
        this.d = -1;
    }

    public final String a() {
        String string = this.f125411b.a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "uuidGenerator.next().toString()");
        String lowerCase = kotlin.text.a0.D(string, "-", "", false).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
