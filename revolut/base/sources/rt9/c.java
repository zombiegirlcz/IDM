package rt9;

import cli.n;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupQrScreenContract$InputData f257218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fkg.a f257219b;

    public c(GroupQrScreenContract$InputData inputData, fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f257218a = inputData;
        this.f257219b = qrCodeGenerator;
    }

    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, fpa.f, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 com.revolut.core.ui_kit.models.ProfileCardModel$Loaded, still in use, count: 2, list:
          (r4v1 com.revolut.core.ui_kit.models.ProfileCardModel$Loaded) from 0x0080: MOVE (r32v1 com.revolut.core.ui_kit.models.ProfileCardModel$Loaded) = (r4v1 com.revolut.core.ui_kit.models.ProfileCardModel$Loaded)
          (r4v1 com.revolut.core.ui_kit.models.ProfileCardModel$Loaded) from 0x0045: MOVE (r32v3 com.revolut.core.ui_kit.models.ProfileCardModel$Loaded) = (r4v1 com.revolut.core.ui_kit.models.ProfileCardModel$Loaded)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r32) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt9.c.c(cli.j):cli.o");
    }
}
