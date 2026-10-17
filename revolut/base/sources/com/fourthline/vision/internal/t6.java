package com.fourthline.vision.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f36937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36938c;
    private int d;

    public t6(@NotNull String alias, long j2) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f36936a = alias;
        this.f36937b = j2;
    }

    public final void monitor() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f36938c == 0) {
            this.f36938c = jCurrentTimeMillis;
        }
        int i = this.d + 1;
        this.d = i;
        long j2 = jCurrentTimeMillis - this.f36938c;
        if (j2 >= this.f36937b) {
            double d = ((double) i) / (j2 / 1000.0d);
            if (t6.class.isAnonymousClass()) {
                String name = t6.class.getName();
                if (name.length() > 23) {
                    Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            }
            Intrinsics.checkNotNullExpressionValue(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), "format(...)");
            this.f36938c = jCurrentTimeMillis;
            this.d = 0;
        }
    }

    public /* synthetic */ t6(String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 1000L : j2);
    }
}
