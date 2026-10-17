package qr0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.a f248590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f248591b;

    public g(Context context) {
        j70.a aVarA = wr0.a.a(context);
        c hardwareVideoDecoderCounter = new c();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hardwareVideoDecoderCounter, "hardwareVideoDecoderCounter");
        this.f248590a = aVarA;
        this.f248591b = hardwareVideoDecoderCounter;
    }
}
