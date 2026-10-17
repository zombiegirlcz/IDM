package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class uw0 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34208a;

    public static final class a extends uw0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f34209b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f34210c = 8;

        private a() {
            super(null, null, "code_expired", 3, null);
        }
    }

    public /* synthetic */ uw0(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    public final String a() {
        return this.f34208a;
    }

    private uw0(String str, Throwable th10, String str2) {
        super(str, th10);
        this.f34208a = str2;
    }

    public /* synthetic */ uw0(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, str2, null);
    }
}
