package c30;

import com.revolut.chat.domain.model.TranscriptIdentifier;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends i implements Function2 {
    public MutableStateFlow A;
    public int B;
    public final /* synthetic */ MutableStateFlow C;
    public final /* synthetic */ TranscriptIdentifier D;
    public final /* synthetic */ h E;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TranscriptIdentifier f20843y;
    public h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MutableStateFlow mutableStateFlow, TranscriptIdentifier transcriptIdentifier, h hVar, Continuation continuation) {
        super(2, continuation);
        this.C = mutableStateFlow;
        this.D = transcriptIdentifier;
        this.E = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[Catch: Exception -> 0x0029, TRY_ENTER, TryCatch #1 {Exception -> 0x0029, blocks: (B:9:0x0021, B:29:0x0098, B:31:0x009c, B:37:0x00cc, B:39:0x00d0, B:45:0x00f9, B:47:0x0101, B:61:0x015f, B:62:0x0164), top: B:72:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:35:0x00c2, B:52:0x0125, B:54:0x012f, B:56:0x013a, B:43:0x00f6, B:51:0x0122, B:17:0x0042, B:22:0x0061, B:25:0x007c), top: B:70:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:35:0x00c2, B:52:0x0125, B:54:0x012f, B:56:0x013a, B:43:0x00f6, B:51:0x0122, B:17:0x0042, B:22:0x0061, B:25:0x007c), top: B:70:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0175  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0153 -> B:11:0x0026). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
