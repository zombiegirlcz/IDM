package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j41 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29799b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f29800c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i41 f29801a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j41(i41 deviceMetadata) {
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        this.f29801a = deviceMetadata;
    }

    public final i41 a() {
        return this.f29801a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j41) && Intrinsics.f(this.f29801a, ((j41) obj2).f29801a);
    }

    public int hashCode() {
        return this.f29801a.hashCode();
    }

    public String toString() {
        return "StartSignatureRequest(deviceMetadata=" + this.f29801a + ")";
    }
}
