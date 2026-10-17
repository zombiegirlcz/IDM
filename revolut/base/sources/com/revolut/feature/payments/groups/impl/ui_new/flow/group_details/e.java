package com.revolut.feature.payments.groups.impl.ui_new.flow.group_details;

import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends h implements mt9.b {
    public final GroupDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zr9.d f79472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f79473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mt9.e f79474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f79475s;

    public e(GroupDetailsFlowContract$InputData inputData, zr9.d untrustedGroupScreenProvider, f joinGroupModelExtension, mt9.e joinGroupErrorHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(untrustedGroupScreenProvider, "untrustedGroupScreenProvider");
        Intrinsics.checkNotNullParameter(joinGroupModelExtension, "joinGroupModelExtension");
        Intrinsics.checkNotNullParameter(joinGroupErrorHandler, "joinGroupErrorHandler");
        this.o = inputData;
        this.f79472p = untrustedGroupScreenProvider;
        this.f79473q = joinGroupModelExtension;
        this.f79474r = joinGroupErrorHandler;
        this.f79475s = d8l.d.a(this, new g(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I2(com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e r22, java.lang.Throwable r23) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e.I2(com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e, java.lang.Throwable):void");
    }

    @Override // yki.j
    public final void M0() {
        GroupDetailsFlowContract$InputData groupDetailsFlowContract$InputData = this.o;
        Continuation continuation = null;
        if (groupDetailsFlowContract$InputData instanceof GroupDetailsFlowContract$InputData.WithStep) {
            h.u2(this, this.f79475s, ((GroupDetailsFlowContract$InputData.WithStep) groupDetailsFlowContract$InputData).f79462a, null, 6);
        } else {
            if (!(groupDetailsFlowContract$InputData instanceof GroupDetailsFlowContract$InputData.JoinGroup)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new mci.e(this, continuation, 19), new mm7.h(1, this, e.class, "handleJoinGroupError", "handleJoinGroupError(Ljava/lang/Throwable;)Z", 0, 18));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79475s;
    }
}
