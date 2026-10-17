package y20;

import com.revolut.chat.data.repository.chat.ChatAgent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gim.i implements Function2 {
    public ChatAgent A;
    public ChatAgent B;
    public Collection C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ v60.g J;
    public Map u;
    public Map v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v60.g f310514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Collection f310515x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Iterator f310516y;
    public v20.n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ArrayList arrayList, boolean z, v60.g gVar, Continuation continuation) {
        super(2, continuation);
        this.H = arrayList;
        this.I = z;
        this.J = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.H, this.I, this.J, continuation);
        kVar.G = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:
    
        if (r3 == r2) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:74:0x017a, B:60:0x014d], limit reached: 105 */
    /* JADX WARN: Path cross not found for [B:84:0x01c3, B:86:0x01c7], limit reached: 105 */
    /* JADX WARN: Path cross not found for [B:86:0x01c7, B:84:0x01c3], limit reached: 105 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /* JADX WARN: Type inference failed for: r11v10, types: [v20.s0] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.revolut.chat.data.repository.chat.ChatAgent] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.revolut.chat.data.repository.chat.ChatAgent] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [com.revolut.chat.data.repository.chat.ChatAgent] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.revolut.chat.data.repository.chat.ChatAgent] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.revolut.chat.data.repository.chat.MessageAuthor] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.revolut.chat.data.repository.chat.MessageAuthor] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3, types: [v20.n] */
    /* JADX WARN: Type inference failed for: r8v4, types: [v20.n] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01b2 -> B:81:0x01b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01ba -> B:83:0x01c1). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y20.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
