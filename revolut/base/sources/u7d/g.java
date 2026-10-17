package u7d;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends i implements Function2 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.c f277743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f277744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f277745y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.shared.help_centre.impl.faq.c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f277743w = cVar;
        this.f277744x = str;
        this.f277745y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f277743w, this.f277744x, this.f277745y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7d.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
