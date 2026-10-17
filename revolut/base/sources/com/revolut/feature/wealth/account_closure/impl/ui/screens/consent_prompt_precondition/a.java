package com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kug.q;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f94936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f94937x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, q qVar, Continuation continuation) {
        super(2, continuation);
        this.f94936w = bVar;
        this.f94937x = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f94936w, this.f94937x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v128, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v129, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 nii.y0, still in use, count: 7, list:
          (r5v2 nii.y0) from 0x04e9: MOVE (r30v0 nii.y0) = (r5v2 nii.y0)
          (r5v2 nii.y0) from 0x0302: MOVE (r30v1 nii.y0) = (r5v2 nii.y0)
          (r5v2 nii.y0) from 0x0331: MOVE (r30v3 nii.y0) = (r5v2 nii.y0)
          (r5v2 nii.y0) from 0x038e: MOVE (r30v4 nii.y0) = (r5v2 nii.y0)
          (r5v2 nii.y0) from 0x0373: MOVE (r30v6 nii.y0) = (r5v2 nii.y0)
          (r5v2 nii.y0) from 0x031b: MOVE (r30v7 nii.y0) = (r5v2 nii.y0)
          (r5v2 nii.y0) from 0x0248: MOVE (r30v9 nii.y0) = (r5v2 nii.y0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 2251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
