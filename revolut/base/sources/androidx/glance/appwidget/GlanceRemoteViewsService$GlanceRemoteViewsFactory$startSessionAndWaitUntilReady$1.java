package androidx.glance.appwidget;

import androidx.glance.appwidget.GlanceRemoteViewsService;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory", f = "GlanceRemoteViewsService.kt", l = {CertificateBody.profileType, 128}, m = "startSessionAndWaitUntilReady")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlanceRemoteViewsService.GlanceRemoteViewsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1(GlanceRemoteViewsService.GlanceRemoteViewsFactory glanceRemoteViewsFactory, Continuation<? super GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionAndWaitUntilReady$1> continuation) {
        super(continuation);
        this.this$0 = glanceRemoteViewsFactory;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startSessionAndWaitUntilReady(null, this);
    }
}
