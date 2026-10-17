package huh;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import xge.c0;
import zrd.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f155664a = new k();

    public k() {
        super(3, a.class, "add", "add(Lcom/revolut/feature/workflow/engine/rfi/api/interactor/DocumentUploadState;)Lcom/revolut/feature/workflow/engine/rfi/impl/interactor/RfiScreeningInteractorImpl$Accumulator;", 4);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        a aVar = (a) obj2;
        zth.a state = (zth.a) obj3;
        synchronized (aVar) {
            Intrinsics.checkNotNullParameter(state, "state");
            LinkedHashSet linkedHashSet = aVar.f155652b;
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            Intrinsics.checkNotNullParameter(state, "state");
            linkedHashSet.removeIf(new c0(4, new q(state, 6)));
            linkedHashSet.add(state);
        }
        return aVar;
    }
}
