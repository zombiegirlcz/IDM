package com.fourthline.vision.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f36645b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f36646a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final int calculateBitrate(int i, int i2, int i3) {
        Integer num = this.f36646a;
        return num != null ? num.intValue() : (int) (i3 * 0.25f * i * i2 * 0.2f);
    }

    public p(Integer num) {
        this.f36646a = num;
    }

    public /* synthetic */ p(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
