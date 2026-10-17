package com.fourthline.core.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26402c;
    private final int d;

    public v(String rawDocumentNumber, String cleanedDocumentNumber, String documentNumberChecksum, int i) {
        Intrinsics.checkNotNullParameter(rawDocumentNumber, "rawDocumentNumber");
        Intrinsics.checkNotNullParameter(cleanedDocumentNumber, "cleanedDocumentNumber");
        Intrinsics.checkNotNullParameter(documentNumberChecksum, "documentNumberChecksum");
        this.f26400a = rawDocumentNumber;
        this.f26401b = cleanedDocumentNumber;
        this.f26402c = documentNumberChecksum;
        this.d = i;
    }

    public final String a() {
        return this.f26401b;
    }

    public final String b() {
        return this.f26402c;
    }

    public final int c() {
        return this.d;
    }

    public final String d() {
        return this.f26400a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f26400a, vVar.f26400a) && Intrinsics.f(this.f26401b, vVar.f26401b) && Intrinsics.f(this.f26402c, vVar.f26402c) && this.d == vVar.d;
    }

    public int hashCode() {
        return (((((this.f26400a.hashCode() * 31) + this.f26401b.hashCode()) * 31) + this.f26402c.hashCode()) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ParsedDocumentNumber(rawDocumentNumber=" + this.f26400a + ", cleanedDocumentNumber=" + this.f26401b + ", documentNumberChecksum=" + this.f26402c + ", documentNumberChecksumIndex=" + this.d + ")";
    }
}
