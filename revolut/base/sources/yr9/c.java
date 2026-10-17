package yr9;

import com.revolut.feature.payments.groups.impl.members_picker.GroupChatQrAction;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function1 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f316159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ GroupChatQrAction f316160x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, GroupChatQrAction groupChatQrAction, Continuation continuation) {
        super(1, continuation);
        this.f316159w = dVar;
        this.f316160x = groupChatQrAction;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f316159w, this.f316160x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r2 == r4) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr9.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
