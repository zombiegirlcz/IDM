package com.fourthline.core.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String documentNumber, String totalChecksumContent, String totalChecksum) {
        super(null);
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(totalChecksumContent, "totalChecksumContent");
        Intrinsics.checkNotNullParameter(totalChecksum, "totalChecksum");
        this.f26403a = documentNumber;
        this.f26404b = totalChecksumContent;
        this.f26405c = totalChecksum;
    }

    public final String a() {
        return this.f26403a;
    }

    public final String b() {
        return this.f26405c;
    }

    public final String c() {
        return this.f26404b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f26403a, wVar.f26403a) && Intrinsics.f(this.f26404b, wVar.f26404b) && Intrinsics.f(this.f26405c, wVar.f26405c);
    }

    public int hashCode() {
        return (((this.f26403a.hashCode() * 31) + this.f26404b.hashCode()) * 31) + this.f26405c.hashCode();
    }

    public String toString() {
        return "ParsedIdlMrz(documentNumber=" + this.f26403a + ", totalChecksumContent=" + this.f26404b + ", totalChecksum=" + this.f26405c + ")";
    }
}
