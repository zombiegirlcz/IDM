package fo;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    @NotNull
    public static final C0798a Companion = new C0798a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136721c;
    public final Duration d;

    /* JADX INFO: renamed from: fo.a$a, reason: collision with other inner class name */
    public static final class C0798a {
        private C0798a() {
        }
    }

    public a() {
        Duration grpcDeadline = Duration.ofSeconds(270L);
        Intrinsics.checkNotNullExpressionValue(grpcDeadline, "ofSeconds(...)");
        Intrinsics.checkNotNullParameter(grpcDeadline, "grpcDeadline");
        this.f136719a = 50;
        this.f136720b = 50;
        this.f136721c = 10000;
        this.d = grpcDeadline;
    }
}
