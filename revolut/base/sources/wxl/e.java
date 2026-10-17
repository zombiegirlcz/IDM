package wxl;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap.KeySetView f301016a = ConcurrentHashMap.newKeySet();

    @Override // wxl.a
    public final boolean a(String str) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-ui_kit-nudge-core-models-Nudge-Id$-nudgeId$0");
        return !this.f301016a.contains(str);
    }

    @Override // wxl.a
    public final Object b(String str, Continuation continuation) {
        this.f301016a.add(str);
        return Unit.f186387a;
    }
}
