package ub;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f278724b;

    public o(String permission, j status) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f278723a = permission;
        this.f278724b = status;
    }

    @Override // ub.g
    public final String W0() {
        return this.f278723a;
    }

    @Override // ub.g
    public final j getStatus() {
        return this.f278724b;
    }
}
