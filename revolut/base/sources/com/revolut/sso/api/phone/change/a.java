package com.revolut.sso.api.phone.change;

import aii.e;
import cjl.o;
import com.revolut.sso.api.phone.change.RevolutSsoChangePhoneFlowDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutSsoChangePhoneFlowDestination.InputData f106020a;

    public a() {
        this(0);
    }

    public final RevolutSsoChangePhoneFlowDestination.InputData b() {
        return this.f106020a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f106020a, ((a) obj2).f106020a);
    }

    public final int hashCode() {
        return this.f106020a.hashCode();
    }

    public a(int i) {
        RevolutSsoChangePhoneFlowDestination.InputData inputData = new RevolutSsoChangePhoneFlowDestination.InputData(o.SHOT);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f106020a = inputData;
    }
}
