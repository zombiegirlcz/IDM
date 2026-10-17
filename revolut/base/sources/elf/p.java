package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c70.a f127392l;

    public p(c70.a clipboard) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.f127392l = clipboard;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (Intrinsics.f(str, "ID_DETAILS_ACCOUNT_COPY")) {
            CharSequence charSequence = obj2 instanceof CharSequence ? (CharSequence) obj2 : null;
            if (charSequence != null) {
                this.f127392l.c(null, charSequence, false, new e58.e(this, 16));
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
