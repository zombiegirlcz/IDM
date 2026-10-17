package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mb.d f30617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30619c;
    private final String d;
    private final String e;
    private final String f;

    public lg1(mb.d networkEnvironment, String workflowId, String str, String str2, String statusAccessToken, String onboardingAccessToken) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(statusAccessToken, "statusAccessToken");
        Intrinsics.checkNotNullParameter(onboardingAccessToken, "onboardingAccessToken");
        this.f30617a = networkEnvironment;
        this.f30618b = workflowId;
        this.f30619c = str;
        this.d = str2;
        this.e = statusAccessToken;
        this.f = onboardingAccessToken;
    }

    public final String a() {
        return this.d;
    }

    public final mb.d b() {
        return this.f30617a;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.f30619c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lg1)) {
            return false;
        }
        lg1 lg1Var = (lg1) obj2;
        return Intrinsics.f(this.f30617a, lg1Var.f30617a) && Intrinsics.f(this.f30618b, lg1Var.f30618b) && Intrinsics.f(this.f30619c, lg1Var.f30619c) && Intrinsics.f(this.d, lg1Var.d) && Intrinsics.f(this.e, lg1Var.e) && Intrinsics.f(this.f, lg1Var.f);
    }

    public final String f() {
        return this.f30618b;
    }

    public int hashCode() {
        int iHashCode = ((this.f30617a.hashCode() * 31) + this.f30618b.hashCode()) * 31;
        String str = this.f30619c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "WorkflowNetworkConfig(networkEnvironment=" + this.f30617a + ", workflowId=" + this.f30618b + ", sessionId=" + this.f30619c + ", authorizationCode=" + this.d + ", statusAccessToken=" + this.e + ", onboardingAccessToken=" + this.f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ lg1(mb.d dVar, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        str2 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            str6 = str5;
            str7 = str4;
            str8 = null;
        } else {
            str6 = str5;
            str7 = str4;
            str8 = str3;
        }
        this(dVar, str, str2, str8, str7, str6);
    }
}
