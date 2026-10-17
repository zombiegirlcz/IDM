package com.fourthline.orca.internal;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes23.dex */
public final class sc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32968b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32969c = 8;
    private static final sc d = new sc(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f32970a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final sc a() {
            return sc.d;
        }

        private a() {
        }
    }

    public sc(byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f32970a = content;
    }

    public final byte[] b() {
        return this.f32970a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!sc.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.fourthline.networking.internal.ContentBody");
        return Arrays.equals(this.f32970a, ((sc) obj2).f32970a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f32970a);
    }

    public String toString() {
        return new String(this.f32970a, Charsets.UTF_8);
    }
}
