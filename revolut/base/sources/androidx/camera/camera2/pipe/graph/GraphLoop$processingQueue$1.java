package androidx.camera.camera2.pipe.graph;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class GraphLoop$processingQueue$1 extends q implements Function1<List<? extends GraphCommand>, Unit> {
    public GraphLoop$processingQueue$1(Object obj2) {
        super(1, 0, GraphLoop.class, obj2, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((List<? extends GraphCommand>) obj2);
        return Unit.f186387a;
    }

    public final void invoke(List<? extends GraphCommand> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GraphLoop) this.receiver).finalizeUnprocessedCommands(p0);
    }
}
