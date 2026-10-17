package xy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ SendFromClipboardType v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f309653w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SendFromClipboardType sendFromClipboardType, e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = sendFromClipboardType;
        this.f309653w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f309653w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r2 == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r2 == r3) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xy9.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
