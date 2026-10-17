package com.onfido.hosted.web.module.externallink;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import ulm.f0;
import ylm.n;
import ylm.q;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$2$2 extends u implements Function1<Throwable, Unit> {
    final /* synthetic */ HostedWebModuleExternalLinkRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostedWebModuleExternalLinkRepositoryImpl$fetchExternalLink$2$2(HostedWebModuleExternalLinkRepositoryImpl hostedWebModuleExternalLinkRepositoryImpl) {
        super(1);
        this.this$0 = hostedWebModuleExternalLinkRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((Throwable) obj2);
        return Unit.f186387a;
    }

    public final void invoke(Throwable th10) {
        f0 f0Var = this.this$0.okHttpClient.f226053a;
        synchronized (f0Var) {
            try {
                Iterator it8 = f0Var.f281086b.iterator();
                Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
                while (it8.hasNext()) {
                    ((n) it8.next()).f314776c.cancel();
                }
                Iterator it9 = f0Var.f281087c.iterator();
                Intrinsics.checkNotNullExpressionValue(it9, "iterator(...)");
                while (it9.hasNext()) {
                    ((n) it9.next()).f314776c.cancel();
                }
                Iterator it10 = f0Var.d.iterator();
                Intrinsics.checkNotNullExpressionValue(it10, "iterator(...)");
                while (it10.hasNext()) {
                    ((q) it10.next()).cancel();
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }
}
