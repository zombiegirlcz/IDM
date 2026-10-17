package zyc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f326416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f326417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f326418c;
    public final Data d;

    public k(Data submissionsState, Data flowState, Data submissionStateType, boolean z) {
        Intrinsics.checkNotNullParameter(submissionsState, "submissionsState");
        Intrinsics.checkNotNullParameter(flowState, "flowState");
        Intrinsics.checkNotNullParameter(submissionStateType, "submissionStateType");
        this.f326416a = z;
        this.f326417b = submissionsState;
        this.f326418c = flowState;
        this.d = submissionStateType;
    }

    public static k a(k kVar, boolean z, Data submissionsState, Data flowState, Data submissionStateType, int i) {
        if ((i & 1) != 0) {
            z = kVar.f326416a;
        }
        if ((i & 2) != 0) {
            submissionsState = kVar.f326417b;
        }
        if ((i & 4) != 0) {
            flowState = kVar.f326418c;
        }
        if ((i & 8) != 0) {
            submissionStateType = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(submissionsState, "submissionsState");
        Intrinsics.checkNotNullParameter(flowState, "flowState");
        Intrinsics.checkNotNullParameter(submissionStateType, "submissionStateType");
        return new k(submissionsState, flowState, submissionStateType, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f326416a == kVar.f326416a && Intrinsics.f(this.f326417b, kVar.f326417b) && Intrinsics.f(this.f326418c, kVar.f326418c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f326418c, kii.e.c(this.f326417b, Boolean.hashCode(this.f326416a) * 31, 31), 31);
    }
}
