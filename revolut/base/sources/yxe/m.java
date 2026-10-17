package yxe;

import cli.y;
import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends oki.h implements g {

    @NotNull
    private static final i Companion = new i();
    public final EditStoredMethodLabelDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u51.a f317674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sve.a f317675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f317676r;

    public m(cli.n stateMapper, EditStoredMethodLabelDescriptor$InputData inputData, u51.a topupMethodsInteractor, sve.a brazilStoredMethodDetailsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        Intrinsics.checkNotNullParameter(brazilStoredMethodDetailsInteractor, "brazilStoredMethodDetailsInteractor");
        this.o = inputData;
        this.f317674p = topupMethodsInteractor;
        this.f317675q = brazilStoredMethodDetailsInteractor;
        String str = inputData.f90492c;
        this.f317676r = mra.d.b(this, new f(inputData.f90491b, str, str, inputData.e), stateMapper, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r0 == r5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(yxe.m r21, gim.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yxe.m.I2(yxe.m, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317676r;
    }
}
