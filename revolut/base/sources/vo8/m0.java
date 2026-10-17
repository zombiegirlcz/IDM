package vo8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b f290894w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(RowDelegate.Model model, com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f290894w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m0(this.v, this.f290894w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c8, code lost:
    
        if (r10 == r2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ca, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r10 == r2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b.K2(r0, r10, r9) == r2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        if (r10 == r2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
    
        if (com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b.J2(r0, r10, r9) == r2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0113, code lost:
    
        if (r10 == r2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013a, code lost:
    
        if (r10 == r2) goto L108;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0146  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vo8.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
