package pmi;

import android.nfc.Tag;
import gim.i;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import kkk.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import net.sf.scuba.smartcards.CardFileInputStream;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends i implements Function2 {
    public Closeable A;
    public CardFileInputStream B;
    public Map C;
    public Iterator D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public short M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ g P;
    public final /* synthetic */ Tag Q;
    public final /* synthetic */ String R;
    public final /* synthetic */ String S;
    public final /* synthetic */ String T;
    public final /* synthetic */ u U;
    public g u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AutoCloseable f237590w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AutoCloseable f237591x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AutoCloseable f237592y;
    public PassportService z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Tag tag2, String str, String str2, String str3, u uVar, Continuation continuation) {
        super(2, continuation);
        this.P = gVar;
        this.Q = tag2;
        this.R = str;
        this.S = str2;
        this.T = str3;
        this.U = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.P, this.Q, this.R, this.S, this.T, this.U, continuation);
        fVar.O = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:4:0x0012, B:28:0x00f2], limit reached: 274 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028c A[Catch: all -> 0x03b8, TRY_LEAVE, TryCatch #17 {all -> 0x03b8, blocks: (B:72:0x0286, B:74:0x028c, B:79:0x02b9, B:90:0x02fd, B:78:0x02b3, B:75:0x02a6), top: B:235:0x0286, inners: #13 }] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.nfc.tech.IsoDep, java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.AutoCloseable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0356 -> B:95:0x0363). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 1473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pmi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
