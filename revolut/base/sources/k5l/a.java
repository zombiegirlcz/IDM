package k5l;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.r;
import o97.y;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements z87.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f181562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f181563b;

    public a(j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f181562a = chatFeatureToggles;
        this.f181563b = r.ASK_AIR;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 com.revolut.data.model.Data, still in use, count: 2, list:
          (r3v1 com.revolut.data.model.Data) from 0x00c5: MOVE (r33v1 com.revolut.data.model.Data) = (r3v1 com.revolut.data.model.Data)
          (r3v1 com.revolut.data.model.Data) from 0x004e: MOVE (r33v3 com.revolut.data.model.Data) = (r3v1 com.revolut.data.model.Data)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // z87.d
    public final efm.r f(java.lang.String r32, com.revolut.feature.globalsearch.models.GlobalSearchContext r33) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5l.a.f(java.lang.String, com.revolut.feature.globalsearch.models.GlobalSearchContext):efm.r");
    }

    @Override // z87.f
    public final r h() {
        return this.f181563b;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        Object obj2 = yVar.f223136b;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        return str2 == null ? o97.e.f223096a : new o97.a(str2);
    }
}
