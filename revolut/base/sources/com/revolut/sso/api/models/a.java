package com.revolut.sso.api.models;

import cjl.i;
import com.revolut.sso.api.models.OAuthUserInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OAuthUserInfo.Client f106006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OAuthUserInfo.Connection f106007b;

    public a(OAuthUserInfo.Client client, OAuthUserInfo.Connection connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f106006a = client;
        this.f106007b = connection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f106006a, aVar.f106006a) && Intrinsics.f(this.f106007b, aVar.f106007b);
    }

    public final int hashCode() {
        return this.f106007b.hashCode() + (this.f106006a.hashCode() * 31);
    }
}
