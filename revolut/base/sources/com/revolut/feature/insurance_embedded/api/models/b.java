package com.revolut.feature.insurance_embedded.api.models;

import bu7.h0;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@g
public final class b {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteDocument f75848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteDocument f75849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemoteDocument f75850c;
    public final RemoteDocument d;
    public final RemoteDocument e;
    public final RemoteDocument f;

    public /* synthetic */ b(int i, RemoteDocument remoteDocument, RemoteDocument remoteDocument2, RemoteDocument remoteDocument3, RemoteDocument remoteDocument4, RemoteDocument remoteDocument5, RemoteDocument remoteDocument6) {
        if (63 != (i & 63)) {
            j1.f(a.f75847a.getDescriptor(), i, 63);
            throw null;
        }
        this.f75848a = remoteDocument;
        this.f75849b = remoteDocument2;
        this.f75850c = remoteDocument3;
        this.d = remoteDocument4;
        this.e = remoteDocument5;
        this.f = remoteDocument6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f75848a, bVar.f75848a) && Intrinsics.f(this.f75849b, bVar.f75849b) && Intrinsics.f(this.f75850c, bVar.f75850c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        RemoteDocument remoteDocument = this.f75848a;
        int iHashCode = (remoteDocument == null ? 0 : remoteDocument.hashCode()) * 31;
        RemoteDocument remoteDocument2 = this.f75849b;
        int iHashCode2 = (iHashCode + (remoteDocument2 == null ? 0 : remoteDocument2.hashCode())) * 31;
        RemoteDocument remoteDocument3 = this.f75850c;
        int iHashCode3 = (iHashCode2 + (remoteDocument3 == null ? 0 : remoteDocument3.hashCode())) * 31;
        RemoteDocument remoteDocument4 = this.d;
        int iHashCode4 = (iHashCode3 + (remoteDocument4 == null ? 0 : remoteDocument4.hashCode())) * 31;
        RemoteDocument remoteDocument5 = this.e;
        int iHashCode5 = (iHashCode4 + (remoteDocument5 == null ? 0 : remoteDocument5.hashCode())) * 31;
        RemoteDocument remoteDocument6 = this.f;
        return iHashCode5 + (remoteDocument6 != null ? remoteDocument6.hashCode() : 0);
    }

    public b(RemoteDocument remoteDocument, RemoteDocument remoteDocument2, RemoteDocument remoteDocument3, RemoteDocument remoteDocument4, RemoteDocument remoteDocument5, RemoteDocument remoteDocument6) {
        this.f75848a = remoteDocument;
        this.f75849b = remoteDocument2;
        this.f75850c = remoteDocument3;
        this.d = remoteDocument4;
        this.e = remoteDocument5;
        this.f = remoteDocument6;
    }
}
