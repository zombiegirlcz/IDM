package q43;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 extends gim.i implements Function1 {
    public List u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f242022w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PocketWithSubaccount f242023x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h93.f0 f242024y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o0 o0Var, PocketWithSubaccount pocketWithSubaccount, h93.f0 f0Var, List list, Continuation continuation) {
        super(1, continuation);
        this.f242022w = o0Var;
        this.f242023x = pocketWithSubaccount;
        this.f242024y = f0Var;
        this.z = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j0(this.f242022w, this.f242023x, this.f242024y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r4 == r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (r2 == r3) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q43.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
