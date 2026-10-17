package x6e;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.subaccount.api.models.Subaccount;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.r;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public j A;
    public Map B;
    public Map C;
    public List D;
    public do3.n E;
    public Collection F;
    public Iterator G;
    public Subaccount H;
    public Collection I;
    public LayeredImage J;
    public do3.n K;
    public Subaccount L;
    public o M;
    public int N;
    public int O;
    public int P;
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f303073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f303074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Map f303075y;
    public Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Continuation continuation, List list, o oVar) {
        super(2, continuation);
        this.f303073w = list;
        this.f303074x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(continuation, this.f303073w, this.f303074x);
        lVar.v = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:112:0x05cd, B:135:0x06c0], limit reached: 161 */
    /* JADX WARN: Path cross not found for [B:18:0x0167, B:22:0x0170], limit reached: 161 */
    /* JADX WARN: Path cross not found for [B:48:0x02bc, B:50:0x02c2], limit reached: 161 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06fa A[LOOP:0: B:137:0x06f4->B:139:0x06fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x046b  */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0136 -> B:6:0x0070). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r65) {
        /*
            Method dump skipped, instruction units count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6e.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
