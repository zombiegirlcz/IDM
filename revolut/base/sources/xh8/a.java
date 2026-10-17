package xh8;

import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public CompositeCommand A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ b D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public h0 u;
    public NaviCommand v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f13.a f305829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f305830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f305831y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.D = bVar;
        this.E = str;
        this.F = str2;
        this.G = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.D, this.E, this.F, this.G, continuation);
        aVar.C = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d4, code lost:
    
        if (r0 != r7) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xh8.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
