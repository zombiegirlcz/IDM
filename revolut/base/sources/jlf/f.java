package jlf;

import elf.s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5k.b f175740a;

    public f(n5k.b paymentFeesDialogExtension) {
        Intrinsics.checkNotNullParameter(paymentFeesDialogExtension, "paymentFeesDialogExtension");
        this.f175740a = paymentFeesDialogExtension;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return obj2 != null ? ((n5k.p) this.f175740a).b3(obj2, (gim.c) continuation) : Boolean.FALSE;
    }
}
