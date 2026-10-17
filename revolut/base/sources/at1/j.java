package at1;

import a31.m;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.registration.code.BizumRegistrationOtpData;
import com.revolut.feature.apm.core.code.ui.ApmCodeController;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$CodeDescriptor;
import com.revolut.feature.apm.core.code.ui.ApmCodeControllerContract$InputData;
import ip0.ab;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends n implements d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BizumRegistrationFlowContract$InputData f8989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ps1.b f8990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final et1.a f8991n;
    public final l80.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cji.d f8992p;

    public j(BizumRegistrationFlowContract$InputData inputData, ps1.b interactor, et1.a registrationResultMapper, l80.h systemTimeProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(registrationResultMapper, "registrationResultMapper");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f8989l = inputData;
        this.f8990m = interactor;
        this.f8991n = registrationResultMapper;
        this.o = systemTimeProvider;
        this.f8992p = new cji.d(new f(null, null, 0L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        if (r32.b3(r2, r3) == r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: all -> 0x00df, TryCatch #2 {all -> 0x00df, blocks: (B:27:0x0081, B:29:0x00a5, B:32:0x00e1, B:34:0x00e5, B:37:0x00f7, B:38:0x00fc), top: B:52:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[Catch: all -> 0x00df, TryCatch #2 {all -> 0x00df, blocks: (B:27:0x0081, B:29:0x00a5, B:32:0x00e1, B:34:0x00e5, B:37:0x00f7, B:38:0x00fc), top: B:52:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(at1.j r32, boolean r33, java.lang.String r34, kotlin.jvm.functions.Function1 r35, gim.c r36) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: at1.j.Z2(at1.j, boolean, java.lang.String, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public final Unit b3(String str, Function1 function1) {
        ab abVar = ab.DIGITS_6;
        BizumRegistrationFlowContract$InputData bizumRegistrationFlowContract$InputData = this.f8989l;
        n.P2(this, new ApmCodeController(new ApmCodeControllerContract$InputData(abVar, new ApmCodeControllerContract$CodeDescriptor.Phone(bizumRegistrationFlowContract$InputData.f61580a.getF61918a()), new BizumRegistrationOtpData(bizumRegistrationFlowContract$InputData.f61580a.getF()), null, 56)), null, new m(this, 21, str, function1), 1);
        return Unit.f186387a;
    }
}
