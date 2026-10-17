package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class wr0 extends kh0 {

    public static final class a extends wr0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34775a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34776b = 8;

        private a() {
            super(null, null, "download_failed", 3, null);
        }
    }

    public /* synthetic */ wr0(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private wr0(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ wr0(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, str2, null);
    }
}
