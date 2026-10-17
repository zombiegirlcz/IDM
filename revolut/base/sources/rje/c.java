package rje;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function1 {
    public d u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f254656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ActionsView.Item f254657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f254658y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ActionsView.Item item, d dVar, Continuation continuation) {
        super(1, continuation);
        this.f254657x = item;
        this.f254658y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f254657x, this.f254658y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r10.b3(false, r9) == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (r10 == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        if (r10 == r0) goto L65;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rje.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
